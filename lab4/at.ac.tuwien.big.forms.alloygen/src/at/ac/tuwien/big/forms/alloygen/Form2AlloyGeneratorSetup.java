package at.ac.tuwien.big.forms.alloygen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Form2AlloyGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new Form2AlloyGeneratorModule());
	}

}
