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

package org.jetbrains.jet.di;

import org.jetbrains.jet.lang.resolve.DescriptorResolver;
import org.jetbrains.jet.lang.types.expressions.ExpressionTypingServices;
import org.jetbrains.jet.lang.resolve.TypeResolver;
import org.jetbrains.jet.lang.resolve.calls.CallResolver;
import org.jetbrains.jet.lang.resolve.calls.CallResolverExtensionProvider;
import org.jetbrains.jet.storage.StorageManager;
import org.jetbrains.jet.lang.types.lang.KotlinBuiltIns;
import org.jetbrains.jet.lang.PlatformToKotlinClassMap;
import org.jetbrains.jet.context.GlobalContext;
import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptor;
import org.jetbrains.jet.lang.resolve.AnnotationResolver;
import org.jetbrains.jet.lang.resolve.DelegatedPropertyResolver;
import org.jetbrains.jet.lang.resolve.calls.CallExpressionResolver;
import org.jetbrains.jet.lang.resolve.QualifiedExpressionResolver;
import org.jetbrains.jet.lang.resolve.calls.ArgumentTypeResolver;
import org.jetbrains.jet.lang.resolve.calls.CandidateResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.generators.injectors.GenerateInjectors. DO NOT EDIT! */
@SuppressWarnings("ALL")
public class InjectorForTests {
    
    private final DescriptorResolver descriptorResolver;
    private final ExpressionTypingServices expressionTypingServices;
    private final TypeResolver typeResolver;
    private final CallResolver callResolver;
    private final CallResolverExtensionProvider callResolverExtensionProvider;
    private final StorageManager storageManager;
    private final KotlinBuiltIns kotlinBuiltIns;
    private final PlatformToKotlinClassMap platformToKotlinClassMap;
    private final GlobalContext globalContext;
    private final Project project;
    private final ModuleDescriptor moduleDescriptor;
    private final AnnotationResolver annotationResolver;
    private final DelegatedPropertyResolver delegatedPropertyResolver;
    private final CallExpressionResolver callExpressionResolver;
    private final QualifiedExpressionResolver qualifiedExpressionResolver;
    private final ArgumentTypeResolver argumentTypeResolver;
    private final CandidateResolver candidateResolver;
    
    public InjectorForTests(
        @NotNull Project project,
        @NotNull ModuleDescriptor moduleDescriptor
    ) {
        this.descriptorResolver = new DescriptorResolver();
        this.globalContext = org.jetbrains.jet.context.ContextPackage.GlobalContext();
        this.platformToKotlinClassMap = moduleDescriptor.getPlatformToKotlinClassMap();
        this.expressionTypingServices = new ExpressionTypingServices(globalContext, platformToKotlinClassMap);
        this.typeResolver = new TypeResolver();
        this.callResolver = new CallResolver();
        this.callResolverExtensionProvider = new CallResolverExtensionProvider();
        this.storageManager = globalContext.getStorageManager();
        this.kotlinBuiltIns = KotlinBuiltIns.getInstance();
        this.project = project;
        this.moduleDescriptor = moduleDescriptor;
        this.annotationResolver = new AnnotationResolver();
        this.delegatedPropertyResolver = new DelegatedPropertyResolver();
        this.callExpressionResolver = new CallExpressionResolver();
        this.qualifiedExpressionResolver = new QualifiedExpressionResolver();
        this.argumentTypeResolver = new ArgumentTypeResolver();
        this.candidateResolver = new CandidateResolver();

        this.descriptorResolver.setAnnotationResolver(annotationResolver);
        this.descriptorResolver.setDelegatedPropertyResolver(delegatedPropertyResolver);
        this.descriptorResolver.setExpressionTypingServices(expressionTypingServices);
        this.descriptorResolver.setStorageManager(storageManager);
        this.descriptorResolver.setTypeResolver(typeResolver);

        this.expressionTypingServices.setAnnotationResolver(annotationResolver);
        this.expressionTypingServices.setCallExpressionResolver(callExpressionResolver);
        this.expressionTypingServices.setCallResolver(callResolver);
        this.expressionTypingServices.setDescriptorResolver(descriptorResolver);
        this.expressionTypingServices.setExtensionProvider(callResolverExtensionProvider);
        this.expressionTypingServices.setProject(project);
        this.expressionTypingServices.setTypeResolver(typeResolver);

        this.typeResolver.setAnnotationResolver(annotationResolver);
        this.typeResolver.setModuleDescriptor(moduleDescriptor);
        this.typeResolver.setQualifiedExpressionResolver(qualifiedExpressionResolver);

        this.callResolver.setArgumentTypeResolver(argumentTypeResolver);
        this.callResolver.setCandidateResolver(candidateResolver);
        this.callResolver.setExpressionTypingServices(expressionTypingServices);
        this.callResolver.setTypeResolver(typeResolver);

        annotationResolver.setCallResolver(callResolver);
        annotationResolver.setExpressionTypingServices(expressionTypingServices);

        delegatedPropertyResolver.setExpressionTypingServices(expressionTypingServices);

        callExpressionResolver.setExpressionTypingServices(expressionTypingServices);

        argumentTypeResolver.setExpressionTypingServices(expressionTypingServices);
        argumentTypeResolver.setTypeResolver(typeResolver);

        candidateResolver.setArgumentTypeResolver(argumentTypeResolver);

    }
    
    @PreDestroy
    public void destroy() {
    }
    
    public DescriptorResolver getDescriptorResolver() {
        return this.descriptorResolver;
    }
    
    public ExpressionTypingServices getExpressionTypingServices() {
        return this.expressionTypingServices;
    }
    
    public TypeResolver getTypeResolver() {
        return this.typeResolver;
    }
    
    public CallResolver getCallResolver() {
        return this.callResolver;
    }
    
    public KotlinBuiltIns getKotlinBuiltIns() {
        return this.kotlinBuiltIns;
    }
    
    public Project getProject() {
        return this.project;
    }
    
}
