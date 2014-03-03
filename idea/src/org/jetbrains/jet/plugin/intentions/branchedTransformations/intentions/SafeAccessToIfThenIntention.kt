/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.intentions.branchedTransformations.intentions

import org.jetbrains.jet.lang.psi.JetSafeQualifiedExpression
import org.jetbrains.jet.plugin.intentions.JetSelfTargetingIntention
import com.intellij.openapi.editor.Editor
import org.jetbrains.jet.lang.psi.JetPsiFactory
import org.jetbrains.jet.lang.psi.JetPsiUtil
import org.jetbrains.jet.lang.psi.JetBinaryExpression
import org.jetbrains.jet.plugin.intentions.branchedTransformations.convertToIfStatement
import org.jetbrains.jet.plugin.intentions.branchedTransformations.introduceValueForCondition
import org.jetbrains.jet.lang.psi.JetDotQualifiedExpression
import org.jetbrains.jet.lang.resolve.calls.autocasts.DataFlowValueFactory
import org.jetbrains.jet.lang.descriptors.VariableDescriptor
import org.jetbrains.jet.plugin.project.AnalyzerFacadeWithCache
import org.jetbrains.jet.plugin.intentions.branchedTransformations.returnValueIsChecked
import org.jetbrains.jet.lang.resolve.BindingContextUtils

public class SafeAccessToIfThenIntention : JetSelfTargetingIntention<JetSafeQualifiedExpression>("safe.access.to.if.then", javaClass()) {
    override fun isApplicableTo(element: JetSafeQualifiedExpression): Boolean = true

    override fun applyTo(element: JetSafeQualifiedExpression, editor: Editor) {
        val receiver = JetPsiUtil.deparenthesize(element.getReceiverExpression())
        val selector = JetPsiUtil.deparenthesize(element.getSelectorExpression())

        val dotQualifiedExpression = if (receiver is JetBinaryExpression)
            JetPsiFactory.createExpression(element.getProject(), "(${receiver!!.getText()}).${selector!!.getText()}")
        else
            JetPsiFactory.createExpression(element.getProject(), "${receiver!!.getText()}.${selector!!.getText()}")

        val context = AnalyzerFacadeWithCache.getContextForElement(receiver)
        val descriptor = BindingContextUtils.extractVariableDescriptorIfAny(context, receiver, false)

        val ifStatement = if (element.returnValueIsChecked(context)) {
            element.convertToIfStatement(receiver, dotQualifiedExpression, JetPsiFactory.createExpression(element.getProject(), "null"))
        }
        else {
            element.convertToIfStatement(receiver, dotQualifiedExpression, null)
        }

        if (!(descriptor is VariableDescriptor && DataFlowValueFactory.isStableVariable(descriptor))) {
            val valueToExtract = (ifStatement.getThen() as JetDotQualifiedExpression).getReceiverExpression()
            ifStatement.introduceValueForCondition(valueToExtract, element.getProject(), editor)
        }
    }
}

