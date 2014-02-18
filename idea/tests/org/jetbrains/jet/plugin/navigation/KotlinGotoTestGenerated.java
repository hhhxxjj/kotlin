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

package org.jetbrains.jet.plugin.navigation;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.navigation.AbstractKotlinGotoTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({KotlinGotoTestGenerated.GotoClass.class, KotlinGotoTestGenerated.GotoSymbol.class})
public class KotlinGotoTestGenerated extends AbstractKotlinGotoTest {
    @TestMetadata("idea/testData/navigation/gotoClass")
    public static class GotoClass extends AbstractKotlinGotoTest {
        public void testAllFilesPresentInGotoClass() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/navigation/gotoClass"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("enumEntries.kt")
        public void testEnumEntries() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/enumEntries.kt");
        }
        
        @TestMetadata("inClassObject.kt")
        public void testInClassObject() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/inClassObject.kt");
        }
        
        @TestMetadata("innerClass.kt")
        public void testInnerClass() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/innerClass.kt");
        }
        
        @TestMetadata("localDeclarations.kt")
        public void testLocalDeclarations() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/localDeclarations.kt");
        }
        
        @TestMetadata("noImplementationTrait.kt")
        public void testNoImplementationTrait() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/noImplementationTrait.kt");
        }
        
        @TestMetadata("simpleClass.kt")
        public void testSimpleClass() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/simpleClass.kt");
        }
        
        @TestMetadata("simpleObject.kt")
        public void testSimpleObject() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/simpleObject.kt");
        }
        
        @TestMetadata("traitWithFunImplement.kt")
        public void testTraitWithFunImplement() throws Exception {
            doClassTest("idea/testData/navigation/gotoClass/traitWithFunImplement.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/navigation/gotoSymbol")
    public static class GotoSymbol extends AbstractKotlinGotoTest {
        public void testAllFilesPresentInGotoSymbol() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/navigation/gotoSymbol"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("functions.kt")
        public void testFunctions() throws Exception {
            doSymbolTest("idea/testData/navigation/gotoSymbol/functions.kt");
        }
        
        @TestMetadata("javaMethods.kt")
        public void testJavaMethods() throws Exception {
            doSymbolTest("idea/testData/navigation/gotoSymbol/javaMethods.kt");
        }
        
        @TestMetadata("properties.kt")
        public void testProperties() throws Exception {
            doSymbolTest("idea/testData/navigation/gotoSymbol/properties.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("KotlinGotoTestGenerated");
        suite.addTestSuite(GotoClass.class);
        suite.addTestSuite(GotoSymbol.class);
        return suite;
    }
}
