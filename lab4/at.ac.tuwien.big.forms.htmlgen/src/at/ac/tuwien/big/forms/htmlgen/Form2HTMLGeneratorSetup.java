package at.ac.tuwien.big.forms.htmlgen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Form2HTMLGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new Form2HTMLGeneratorModule());
	}

}
