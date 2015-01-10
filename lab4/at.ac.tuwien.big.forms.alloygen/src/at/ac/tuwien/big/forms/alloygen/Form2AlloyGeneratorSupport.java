package at.ac.tuwien.big.forms.alloygen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class Form2AlloyGeneratorSupport extends
		AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new Form2AlloyGeneratorModule();
	}
}
