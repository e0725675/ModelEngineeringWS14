package at.ac.tuwien.big.forms.htmlgen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class Form2HTMLGeneratorSupport extends
		AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new Form2HTMLGeneratorModule();
	}
}
