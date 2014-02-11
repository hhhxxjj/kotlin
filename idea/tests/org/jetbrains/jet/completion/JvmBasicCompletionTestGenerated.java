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

package org.jetbrains.jet.completion;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.completion.AbstractJvmBasicCompletionTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({JvmBasicCompletionTestGenerated.Common.class, JvmBasicCompletionTestGenerated.Java.class})
public class JvmBasicCompletionTestGenerated extends AbstractJvmBasicCompletionTest {
    @TestMetadata("idea/testData/completion/basic/common")
    @InnerTestClasses({Common.Extensions.class})
    public static class Common extends AbstractJvmBasicCompletionTest {
        @TestMetadata("AfterFloatOnNewLine.kt")
        public void testAfterFloatOnNewLine() throws Exception {
            doTest("idea/testData/completion/basic/common/AfterFloatOnNewLine.kt");
        }
        
        @TestMetadata("AfterIntSeparatedWithComments.kt")
        public void testAfterIntSeparatedWithComments() throws Exception {
            doTest("idea/testData/completion/basic/common/AfterIntSeparatedWithComments.kt");
        }
        
        public void testAllFilesPresentInCommon() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/completion/basic/common"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("AutoCastAfterIf.kt")
        public void testAutoCastAfterIf() throws Exception {
            doTest("idea/testData/completion/basic/common/AutoCastAfterIf.kt");
        }
        
        @TestMetadata("AutoCastAfterIfMethod.kt")
        public void testAutoCastAfterIfMethod() throws Exception {
            doTest("idea/testData/completion/basic/common/AutoCastAfterIfMethod.kt");
        }
        
        @TestMetadata("AutoCastForThis.kt")
        public void testAutoCastForThis() throws Exception {
            doTest("idea/testData/completion/basic/common/AutoCastForThis.kt");
        }
        
        @TestMetadata("AutoCastInWhen.kt")
        public void testAutoCastInWhen() throws Exception {
            doTest("idea/testData/completion/basic/common/AutoCastInWhen.kt");
        }
        
        @TestMetadata("BasicAny.kt")
        public void testBasicAny() throws Exception {
            doTest("idea/testData/completion/basic/common/BasicAny.kt");
        }
        
        @TestMetadata("BasicInt.kt")
        public void testBasicInt() throws Exception {
            doTest("idea/testData/completion/basic/common/BasicInt.kt");
        }
        
        @TestMetadata("BeforeDotInCall.kt")
        public void testBeforeDotInCall() throws Exception {
            doTest("idea/testData/completion/basic/common/BeforeDotInCall.kt");
        }
        
        @TestMetadata("CallLocalLambda.kt")
        public void testCallLocalLambda() throws Exception {
            doTest("idea/testData/completion/basic/common/CallLocalLambda.kt");
        }
        
        @TestMetadata("classObjectElementsInClass.kt")
        public void testClassObjectElementsInClass() throws Exception {
            doTest("idea/testData/completion/basic/common/classObjectElementsInClass.kt");
        }
        
        @TestMetadata("ClassRedeclaration1.kt")
        public void testClassRedeclaration1() throws Exception {
            doTest("idea/testData/completion/basic/common/ClassRedeclaration1.kt");
        }
        
        @TestMetadata("ClassRedeclaration2.kt")
        public void testClassRedeclaration2() throws Exception {
            doTest("idea/testData/completion/basic/common/ClassRedeclaration2.kt");
        }
        
        @TestMetadata("CompletionInSetter.kt")
        public void testCompletionInSetter() throws Exception {
            doTest("idea/testData/completion/basic/common/CompletionInSetter.kt");
        }
        
        @TestMetadata("DoNotCompleteForErrorReceivers.kt")
        public void testDoNotCompleteForErrorReceivers() throws Exception {
            doTest("idea/testData/completion/basic/common/DoNotCompleteForErrorReceivers.kt");
        }
        
        @TestMetadata("DoNotCompleteForErrorReceiversForce.kt")
        public void testDoNotCompleteForErrorReceiversForce() throws Exception {
            doTest("idea/testData/completion/basic/common/DoNotCompleteForErrorReceiversForce.kt");
        }
        
        @TestMetadata("ExtendClassName.kt")
        public void testExtendClassName() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtendClassName.kt");
        }
        
        @TestMetadata("ExtendQualifiedClassName.kt")
        public void testExtendQualifiedClassName() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtendQualifiedClassName.kt");
        }
        
        @TestMetadata("ExtensionForProperty.kt")
        public void testExtensionForProperty() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionForProperty.kt");
        }
        
        @TestMetadata("ExtensionFunReceiver.kt")
        public void testExtensionFunReceiver() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionFunReceiver.kt");
        }
        
        @TestMetadata("ExtensionFunReceiverForce.kt")
        public void testExtensionFunReceiverForce() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionFunReceiverForce.kt");
        }
        
        @TestMetadata("ExtensionInsideFunction.kt")
        public void testExtensionInsideFunction() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionInsideFunction.kt");
        }
        
        @TestMetadata("ExtensionToIntInFloatStyle.kt")
        public void testExtensionToIntInFloatStyle() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionToIntInFloatStyle.kt");
        }
        
        @TestMetadata("ExtensionWithAdditionalTypeParameters.kt")
        public void testExtensionWithAdditionalTypeParameters() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionWithAdditionalTypeParameters.kt");
        }
        
        @TestMetadata("ExtensionWithGenericParamInReceiver.kt")
        public void testExtensionWithGenericParamInReceiver() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionWithGenericParamInReceiver.kt");
        }
        
        @TestMetadata("ExtensionWithGenericReceiver.kt")
        public void testExtensionWithGenericReceiver() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionWithGenericReceiver.kt");
        }
        
        @TestMetadata("ExtensionWithInternalGenericParameters.kt")
        public void testExtensionWithInternalGenericParameters() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionWithInternalGenericParameters.kt");
        }
        
        @TestMetadata("ExtensionWithManyTypeParamsInReceiver.kt")
        public void testExtensionWithManyTypeParamsInReceiver() throws Exception {
            doTest("idea/testData/completion/basic/common/ExtensionWithManyTypeParamsInReceiver.kt");
        }
        
        @TestMetadata("FromImports.kt")
        public void testFromImports() throws Exception {
            doTest("idea/testData/completion/basic/common/FromImports.kt");
        }
        
        @TestMetadata("FunctionCompletionFormatting.kt")
        public void testFunctionCompletionFormatting() throws Exception {
            doTest("idea/testData/completion/basic/common/FunctionCompletionFormatting.kt");
        }
        
        @TestMetadata("InCallExpression.kt")
        public void testInCallExpression() throws Exception {
            doTest("idea/testData/completion/basic/common/InCallExpression.kt");
        }
        
        @TestMetadata("InClassInitializer.kt")
        public void testInClassInitializer() throws Exception {
            doTest("idea/testData/completion/basic/common/InClassInitializer.kt");
        }
        
        @TestMetadata("InClassPropertyAccessor.kt")
        public void testInClassPropertyAccessor() throws Exception {
            doTest("idea/testData/completion/basic/common/InClassPropertyAccessor.kt");
        }
        
        @TestMetadata("InEmptyImport.kt")
        public void testInEmptyImport() throws Exception {
            doTest("idea/testData/completion/basic/common/InEmptyImport.kt");
        }
        
        @TestMetadata("InExpressionNoPrefix.kt")
        public void testInExpressionNoPrefix() throws Exception {
            doTest("idea/testData/completion/basic/common/InExpressionNoPrefix.kt");
        }
        
        @TestMetadata("InExtendTypeAnnotation.kt")
        public void testInExtendTypeAnnotation() throws Exception {
            doTest("idea/testData/completion/basic/common/InExtendTypeAnnotation.kt");
        }
        
        @TestMetadata("InFileWithMultiDeclaration.kt")
        public void testInFileWithMultiDeclaration() throws Exception {
            doTest("idea/testData/completion/basic/common/InFileWithMultiDeclaration.kt");
        }
        
        @TestMetadata("InFileWithTypedef.kt")
        public void testInFileWithTypedef() throws Exception {
            doTest("idea/testData/completion/basic/common/InFileWithTypedef.kt");
        }
        
        @TestMetadata("InFunInClassInitializer.kt")
        public void testInFunInClassInitializer() throws Exception {
            doTest("idea/testData/completion/basic/common/InFunInClassInitializer.kt");
        }
        
        @TestMetadata("InGlobalPropertyInitializer.kt")
        public void testInGlobalPropertyInitializer() throws Exception {
            doTest("idea/testData/completion/basic/common/InGlobalPropertyInitializer.kt");
        }
        
        @TestMetadata("InImport.kt")
        public void testInImport() throws Exception {
            doTest("idea/testData/completion/basic/common/InImport.kt");
        }
        
        @TestMetadata("InInitializerInPropertyAccessor.kt")
        public void testInInitializerInPropertyAccessor() throws Exception {
            doTest("idea/testData/completion/basic/common/InInitializerInPropertyAccessor.kt");
        }
        
        @TestMetadata("InLocalObjectDeclaration.kt")
        public void testInLocalObjectDeclaration() throws Exception {
            doTest("idea/testData/completion/basic/common/InLocalObjectDeclaration.kt");
        }
        
        @TestMetadata("InLongDotQualifiedExpression.kt")
        public void testInLongDotQualifiedExpression() throws Exception {
            doTest("idea/testData/completion/basic/common/InLongDotQualifiedExpression.kt");
        }
        
        @TestMetadata("InMiddleOfPackage.kt")
        public void testInMiddleOfPackage() throws Exception {
            doTest("idea/testData/completion/basic/common/InMiddleOfPackage.kt");
        }
        
        @TestMetadata("InMiddleOfPackageDirective.kt")
        public void testInMiddleOfPackageDirective() throws Exception {
            doTest("idea/testData/completion/basic/common/InMiddleOfPackageDirective.kt");
        }
        
        @TestMetadata("InObjectInDelegationSpecifier.kt")
        public void testInObjectInDelegationSpecifier() throws Exception {
            doTest("idea/testData/completion/basic/common/InObjectInDelegationSpecifier.kt");
        }
        
        @TestMetadata("InPackageBegin.kt")
        public void testInPackageBegin() throws Exception {
            doTest("idea/testData/completion/basic/common/InPackageBegin.kt");
        }
        
        @TestMetadata("InParametersTypes.kt")
        public void testInParametersTypes() throws Exception {
            doTest("idea/testData/completion/basic/common/InParametersTypes.kt");
        }
        
        @TestMetadata("InParametersTypesForce.kt")
        public void testInParametersTypesForce() throws Exception {
            doTest("idea/testData/completion/basic/common/InParametersTypesForce.kt");
        }
        
        @TestMetadata("InTypeAnnotation.kt")
        public void testInTypeAnnotation() throws Exception {
            doTest("idea/testData/completion/basic/common/InTypeAnnotation.kt");
        }
        
        @TestMetadata("JavaPackage.kt")
        public void testJavaPackage() throws Exception {
            doTest("idea/testData/completion/basic/common/JavaPackage.kt");
        }
        
        @TestMetadata("LocalMultideclarationValues.kt")
        public void testLocalMultideclarationValues() throws Exception {
            doTest("idea/testData/completion/basic/common/LocalMultideclarationValues.kt");
        }
        
        @TestMetadata("NamedObject.kt")
        public void testNamedObject() throws Exception {
            doTest("idea/testData/completion/basic/common/NamedObject.kt");
        }
        
        @TestMetadata("NoClassNameDuplication.kt")
        public void testNoClassNameDuplication() throws Exception {
            doTest("idea/testData/completion/basic/common/NoClassNameDuplication.kt");
        }
        
        @TestMetadata("NoCompletionAfterBigFloat.kt")
        public void testNoCompletionAfterBigFloat() throws Exception {
            doTest("idea/testData/completion/basic/common/NoCompletionAfterBigFloat.kt");
        }
        
        @TestMetadata("NoCompletionAfterFloat.kt")
        public void testNoCompletionAfterFloat() throws Exception {
            doTest("idea/testData/completion/basic/common/NoCompletionAfterFloat.kt");
        }
        
        @TestMetadata("NoCompletionAfterInt.kt")
        public void testNoCompletionAfterInt() throws Exception {
            doTest("idea/testData/completion/basic/common/NoCompletionAfterInt.kt");
        }
        
        @TestMetadata("NoCompletionAfterLong.kt")
        public void testNoCompletionAfterLong() throws Exception {
            doTest("idea/testData/completion/basic/common/NoCompletionAfterLong.kt");
        }
        
        @TestMetadata("NoEmptyPackage.kt")
        public void testNoEmptyPackage() throws Exception {
            doTest("idea/testData/completion/basic/common/NoEmptyPackage.kt");
        }
        
        @TestMetadata("NoObjectInTypePosition.kt")
        public void testNoObjectInTypePosition() throws Exception {
            doTest("idea/testData/completion/basic/common/NoObjectInTypePosition.kt");
        }
        
        @TestMetadata("NoTopLevelCompletionInQualifiedUserTypes.kt")
        public void testNoTopLevelCompletionInQualifiedUserTypes() throws Exception {
            doTest("idea/testData/completion/basic/common/NoTopLevelCompletionInQualifiedUserTypes.kt");
        }
        
        @TestMetadata("ObjectRedeclaration1.kt")
        public void testObjectRedeclaration1() throws Exception {
            doTest("idea/testData/completion/basic/common/ObjectRedeclaration1.kt");
        }
        
        @TestMetadata("ObjectRedeclaration2.kt")
        public void testObjectRedeclaration2() throws Exception {
            doTest("idea/testData/completion/basic/common/ObjectRedeclaration2.kt");
        }
        
        @TestMetadata("OnlyScopedClassesWithoutExplicit.kt")
        public void testOnlyScopedClassesWithoutExplicit() throws Exception {
            doTest("idea/testData/completion/basic/common/OnlyScopedClassesWithoutExplicit.kt");
        }
        
        @TestMetadata("OverloadFunctions.kt")
        public void testOverloadFunctions() throws Exception {
            doTest("idea/testData/completion/basic/common/OverloadFunctions.kt");
        }
        
        @TestMetadata("ShortClassNamesInTypePosition.kt")
        public void testShortClassNamesInTypePosition() throws Exception {
            doTest("idea/testData/completion/basic/common/ShortClassNamesInTypePosition.kt");
        }
        
        @TestMetadata("StandardJetArrayFirst.kt")
        public void testStandardJetArrayFirst() throws Exception {
            doTest("idea/testData/completion/basic/common/StandardJetArrayFirst.kt");
        }
        
        @TestMetadata("StandardJetDoubleFirst.kt")
        public void testStandardJetDoubleFirst() throws Exception {
            doTest("idea/testData/completion/basic/common/StandardJetDoubleFirst.kt");
        }
        
        @TestMetadata("SubpackageInFun.kt")
        public void testSubpackageInFun() throws Exception {
            doTest("idea/testData/completion/basic/common/SubpackageInFun.kt");
        }
        
        @TestMetadata("TopLevelClassCompletionInQualifiedCall.kt")
        public void testTopLevelClassCompletionInQualifiedCall() throws Exception {
            doTest("idea/testData/completion/basic/common/TopLevelClassCompletionInQualifiedCall.kt");
        }
        
        @TestMetadata("VariableClassName.kt")
        public void testVariableClassName() throws Exception {
            doTest("idea/testData/completion/basic/common/VariableClassName.kt");
        }
        
        @TestMetadata("VisibilityClassMembersFromExternal.kt")
        public void testVisibilityClassMembersFromExternal() throws Exception {
            doTest("idea/testData/completion/basic/common/VisibilityClassMembersFromExternal.kt");
        }
        
        @TestMetadata("VisibilityClassMembersFromExternalForce.kt")
        public void testVisibilityClassMembersFromExternalForce() throws Exception {
            doTest("idea/testData/completion/basic/common/VisibilityClassMembersFromExternalForce.kt");
        }
        
        @TestMetadata("VisibilityInSubclass.kt")
        public void testVisibilityInSubclass() throws Exception {
            doTest("idea/testData/completion/basic/common/VisibilityInSubclass.kt");
        }
        
        @TestMetadata("VisibilityInSubclassForce.kt")
        public void testVisibilityInSubclassForce() throws Exception {
            doTest("idea/testData/completion/basic/common/VisibilityInSubclassForce.kt");
        }
        
        @TestMetadata("idea/testData/completion/basic/common/extensions")
        public static class Extensions extends AbstractJvmBasicCompletionTest {
            public void testAllFilesPresentInExtensions() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/completion/basic/common/extensions"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("ExtensionInExtendedClass.kt")
            public void testExtensionInExtendedClass() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/ExtensionInExtendedClass.kt");
            }
            
            @TestMetadata("ExtensionInExtendedClassThis.kt")
            public void testExtensionInExtendedClassThis() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/ExtensionInExtendedClassThis.kt");
            }
            
            @TestMetadata("ExtensionInExtension.kt")
            public void testExtensionInExtension() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/ExtensionInExtension.kt");
            }
            
            @TestMetadata("ExtensionInExtensionThis.kt")
            public void testExtensionInExtensionThis() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/ExtensionInExtensionThis.kt");
            }
            
            @TestMetadata("InvalidTypeParameters.kt")
            public void testInvalidTypeParameters() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/InvalidTypeParameters.kt");
            }
            
            @TestMetadata("IrrelevantExtension.kt")
            public void testIrrelevantExtension() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/IrrelevantExtension.kt");
            }
            
            @TestMetadata("JavaTypeExtension.kt")
            public void testJavaTypeExtension() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/JavaTypeExtension.kt");
            }
            
            @TestMetadata("KotlinGenericTypeExtension.kt")
            public void testKotlinGenericTypeExtension() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/KotlinGenericTypeExtension.kt");
            }
            
            @TestMetadata("KotlinTypeExtension.kt")
            public void testKotlinTypeExtension() throws Exception {
                doTest("idea/testData/completion/basic/common/extensions/KotlinTypeExtension.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Common");
            suite.addTestSuite(Common.class);
            suite.addTestSuite(Extensions.class);
            return suite;
        }
    }
    
    @TestMetadata("idea/testData/completion/basic/java")
    public static class Java extends AbstractJvmBasicCompletionTest {
        public void testAllFilesPresentInJava() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/completion/basic/java"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("AutoForceCompletion.kt")
        public void testAutoForceCompletion() throws Exception {
            doTest("idea/testData/completion/basic/java/AutoForceCompletion.kt");
        }
        
        @TestMetadata("ExtensionFromStandardLibrary.kt")
        public void testExtensionFromStandardLibrary() throws Exception {
            doTest("idea/testData/completion/basic/java/ExtensionFromStandardLibrary.kt");
        }
        
        @TestMetadata("InPackage.kt")
        public void testInPackage() throws Exception {
            doTest("idea/testData/completion/basic/java/InPackage.kt");
        }
        
        @TestMetadata("JavaClassNames.kt")
        public void testJavaClassNames() throws Exception {
            doTest("idea/testData/completion/basic/java/JavaClassNames.kt");
        }
        
        @TestMetadata("NoClassNameDuplicationForRuntimeClass.kt")
        public void testNoClassNameDuplicationForRuntimeClass() throws Exception {
            doTest("idea/testData/completion/basic/java/NoClassNameDuplicationForRuntimeClass.kt");
        }
        
        @TestMetadata("NoImportedJavaClassDuplication.kt")
        public void testNoImportedJavaClassDuplication() throws Exception {
            doTest("idea/testData/completion/basic/java/NoImportedJavaClassDuplication.kt");
        }
        
        @TestMetadata("PropertyMetadata.kt")
        public void testPropertyMetadata() throws Exception {
            doTest("idea/testData/completion/basic/java/PropertyMetadata.kt");
        }
        
        @TestMetadata("TopLevelFromStandardLibrary.kt")
        public void testTopLevelFromStandardLibrary() throws Exception {
            doTest("idea/testData/completion/basic/java/TopLevelFromStandardLibrary.kt");
        }
        
        @TestMetadata("TopLevelFromStandardLibraryWithoutParam.kt")
        public void testTopLevelFromStandardLibraryWithoutParam() throws Exception {
            doTest("idea/testData/completion/basic/java/TopLevelFromStandardLibraryWithoutParam.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JvmBasicCompletionTestGenerated");
        suite.addTest(Common.innerSuite());
        suite.addTestSuite(Java.class);
        return suite;
    }
}
