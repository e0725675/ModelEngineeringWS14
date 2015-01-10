package at.ac.tuwien.big.forms.htmlgen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ac.tuwien.big.forms.htmlgen.Form2HTMLGenerator;

public class Form2HTMLGeneratorModule extends
		AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "at.ac.tuwien.big.forms.FormsPackage";
	}

	@Override
	protected String getFileExtensions() {
		return "forms";
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return Form2HTMLGenerator.class;
	}

	public Class<? extends IEncodingProvider> bindIEncodingProvider() {
		return Utf8EncodingProvider.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
