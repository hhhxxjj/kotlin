/*
 * Copyright 2010-2012 JetBrains s.r.o.
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


package org.jetbrains.jet.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptor;
import org.jetbrains.jet.lang.BuiltinsScopeExtensionMode;
import org.jetbrains.jet.lang.resolve.java.JavaBridgeConfiguration;
import org.jetbrains.jet.lang.resolve.java.JavaSemanticServices;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.PsiClassFinderImpl;
import org.jetbrains.jet.lang.resolve.java.JavaTypeTransformer;
import org.jetbrains.jet.lang.resolve.java.resolver.ClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.CompileTimeConstResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.NamespaceResolver;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorSignatureResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.ConstructorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.ValueParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.FunctionResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.InnerClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.PropertiesResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.di.AllInjectorsGenerator. DO NOT EDIT! */
public class InjectorForJavaDescriptorResolver {

    private final Project project;
    private final BindingTrace bindingTrace;
    private final ModuleDescriptor moduleDescriptor;
    private final BuiltinsScopeExtensionMode builtinsScopeExtensionMode;
    private JavaBridgeConfiguration javaBridgeConfiguration;
    private JavaSemanticServices javaSemanticServices;
    private JavaDescriptorResolver javaDescriptorResolver;
    private PsiClassFinderImpl psiClassFinder;
    private JavaTypeTransformer javaTypeTransformer;
    private ClassResolver classResolver;
    private JavaAnnotationResolver javaAnnotationResolver;
    private CompileTimeConstResolver compileTimeConstResolver;
    private NamespaceResolver namespaceResolver;
    private JavaDescriptorSignatureResolver javaDescriptorSignatureResolver;
    private ConstructorResolver constructorResolver;
    private ValueParameterResolver valueParameterResolver;
    private FunctionResolver functionResolver;
    private InnerClassResolver innerClassResolver;
    private PropertiesResolver propertiesResolver;

    public InjectorForJavaDescriptorResolver(
        @NotNull Project project,
        @NotNull BindingTrace bindingTrace,
        @NotNull ModuleDescriptor moduleDescriptor,
        @NotNull BuiltinsScopeExtensionMode builtinsScopeExtensionMode
    ) {
        this.project = project;
        this.bindingTrace = bindingTrace;
        this.moduleDescriptor = moduleDescriptor;
        this.builtinsScopeExtensionMode = builtinsScopeExtensionMode;
        this.javaBridgeConfiguration = new JavaBridgeConfiguration();
        this.javaSemanticServices = new JavaSemanticServices();
        this.javaDescriptorResolver = new JavaDescriptorResolver();
        this.psiClassFinder = new PsiClassFinderImpl();
        this.javaTypeTransformer = new JavaTypeTransformer();
        this.classResolver = new ClassResolver();
        this.javaAnnotationResolver = new JavaAnnotationResolver();
        this.compileTimeConstResolver = new CompileTimeConstResolver();
        this.namespaceResolver = new NamespaceResolver();
        this.javaDescriptorSignatureResolver = new JavaDescriptorSignatureResolver();
        this.constructorResolver = new ConstructorResolver();
        this.valueParameterResolver = new ValueParameterResolver();
        this.functionResolver = new FunctionResolver();
        this.innerClassResolver = new InnerClassResolver();
        this.propertiesResolver = new PropertiesResolver();

        javaBridgeConfiguration.setBuiltinsScopeExtensionMode(builtinsScopeExtensionMode);
        javaBridgeConfiguration.setJavaSemanticServices(javaSemanticServices);
        javaBridgeConfiguration.setProject(project);

        this.javaSemanticServices.setDescriptorResolver(javaDescriptorResolver);
        this.javaSemanticServices.setPsiClassFinder(psiClassFinder);
        this.javaSemanticServices.setTrace(bindingTrace);
        this.javaSemanticServices.setTypeTransformer(javaTypeTransformer);

        this.javaDescriptorResolver.setClassResolver(classResolver);
        this.javaDescriptorResolver.setConstructorResolver(constructorResolver);
        this.javaDescriptorResolver.setFunctionResolver(functionResolver);
        this.javaDescriptorResolver.setInnerClassResolver(innerClassResolver);
        this.javaDescriptorResolver.setNamespaceResolver(namespaceResolver);
        this.javaDescriptorResolver.setProject(project);
        this.javaDescriptorResolver.setPropertiesResolver(propertiesResolver);
        this.javaDescriptorResolver.setSemanticServices(javaSemanticServices);
        this.javaDescriptorResolver.setTrace(bindingTrace);

        this.psiClassFinder.setProject(project);

        javaTypeTransformer.setJavaSemanticServices(javaSemanticServices);
        javaTypeTransformer.setResolver(javaDescriptorResolver);

        classResolver.setAnnotationResolver(javaAnnotationResolver);
        classResolver.setJavaDescriptorResolver(javaDescriptorResolver);
        classResolver.setNamespaceResolver(namespaceResolver);
        classResolver.setPsiClassFinder(psiClassFinder);
        classResolver.setSemanticServices(javaSemanticServices);
        classResolver.setSignatureResolver(javaDescriptorSignatureResolver);
        classResolver.setTrace(bindingTrace);
        classResolver.setTypeTransformer(javaTypeTransformer);

        javaAnnotationResolver.setClassResolver(classResolver);
        javaAnnotationResolver.setCompileTimeConstResolver(compileTimeConstResolver);

        compileTimeConstResolver.setAnnotationResolver(javaAnnotationResolver);
        compileTimeConstResolver.setClassResolver(classResolver);

        namespaceResolver.setJavaSemanticServices(javaSemanticServices);
        namespaceResolver.setPsiClassFinder(psiClassFinder);
        namespaceResolver.setTrace(bindingTrace);

        javaDescriptorSignatureResolver.setJavaSemanticServices(javaSemanticServices);

        constructorResolver.setTrace(bindingTrace);
        constructorResolver.setTypeTransformer(javaTypeTransformer);
        constructorResolver.setValueParameterResolver(valueParameterResolver);

        valueParameterResolver.setTypeTransformer(javaTypeTransformer);

        functionResolver.setAnnotationResolver(javaAnnotationResolver);
        functionResolver.setParameterResolver(valueParameterResolver);
        functionResolver.setSignatureResolver(javaDescriptorSignatureResolver);
        functionResolver.setTrace(bindingTrace);
        functionResolver.setTypeTransformer(javaTypeTransformer);

        innerClassResolver.setClassResolver(classResolver);

        propertiesResolver.setAnnotationResolver(javaAnnotationResolver);
        propertiesResolver.setClassResolver(classResolver);
        propertiesResolver.setJavaDescriptorSignatureResolver(javaDescriptorSignatureResolver);
        propertiesResolver.setSemanticServices(javaSemanticServices);
        propertiesResolver.setTrace(bindingTrace);

        javaBridgeConfiguration.init();

        psiClassFinder.initialize();

    }

    @PreDestroy
    public void destroy() {
    }

    public Project getProject() {
        return this.project;
    }

    public BindingTrace getBindingTrace() {
        return this.bindingTrace;
    }

    public ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public JavaSemanticServices getJavaSemanticServices() {
        return this.javaSemanticServices;
    }

    public JavaDescriptorResolver getJavaDescriptorResolver() {
        return this.javaDescriptorResolver;
    }

    public PsiClassFinderImpl getPsiClassFinder() {
        return this.psiClassFinder;
    }

}
