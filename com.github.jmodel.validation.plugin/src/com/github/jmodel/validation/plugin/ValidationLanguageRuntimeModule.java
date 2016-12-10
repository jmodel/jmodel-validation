/*
 * generated by Xtext
 */
package com.github.jmodel.validation.plugin;

import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputer;

import com.github.jmodel.validation.plugin.jvmmodel.ValidationXbaseCompiler;
import com.github.jmodel.validation.plugin.typesystem.ValidationXbaseTypeComputer;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class ValidationLanguageRuntimeModule
		extends com.github.jmodel.validation.plugin.AbstractValidationLanguageRuntimeModule {

	public Class<? extends ITypeComputer> bindITypeComputer() {
		return ValidationXbaseTypeComputer.class;
	}

	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return ValidationXbaseCompiler.class;
	}

}