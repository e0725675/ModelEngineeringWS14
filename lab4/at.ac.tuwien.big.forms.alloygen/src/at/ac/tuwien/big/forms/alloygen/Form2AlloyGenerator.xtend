package at.ac.tuwien.big.forms.alloygen

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import java.io.File
import at.ac.tuwien.big.forms.EntityModel
import at.ac.tuwien.big.forms.Entity
import at.ac.tuwien.big.forms.EntityModelElement
import at.ac.tuwien.big.forms.Enumeration
import at.ac.tuwien.big.forms.Feature
import at.ac.tuwien.big.forms.Literal
import java.util.List
import at.ac.tuwien.big.forms.Attribute
import at.ac.tuwien.big.forms.AttributeType

class Form2AlloyGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		var entityModel = resource.contents.get(0) as EntityModel
		var name = new File(resource.URI.toFileString).name.replace(".forms", ".als");
		entityModel.generateFile(fsa, name); // the first argument is the entityModel
	}
	
	
	
	def generateFile(EntityModel em, IFileSystemAccess fsa, String fileName) {
		
		fsa.generateFile(fileName,
'''module ME14
«FOR e : em.entityModelElements»
«e.generateCodeEME()»
«ENDFOR»
'''
)
	}
	
	
	
	def dispatch generateCodeEME(EntityModelElement eme) 
'''EntityModelElement;''' // fallback
	
	
	
	def dispatch generateCodeEME(Entity entity) {
'''sig «entity.name» {
«entity.features.generateCodeFeatures()»
}'''
	}
	
	
	
	def generateCodeFeatures(List<Feature> features)  {
		for (Feature f : features) {
			if (f instanceof Attribute) {
				//System.out.println("Attribute");
				return f.generateCodeAttribute();
			} else {
				//System.out.println("Not a Attribute");
			}
		}
	}
	
	def generateCodeAttribute(Attribute att) {
		if (att.type == AttributeType.NONE) {
			//System.out.println("NONE");
		} else {
			
			//System.out.println("OTHER");
			return att.generateCodeAttributePrimitive();
		}
	}
	def generateCodeAttributePrimitive(Attribute att)
'''	«att.name»: «IF att.mandatory == true»one «ELSE»lone «ENDIF»Int'''
	
	
	def dispatch generateCodeEME(Enumeration enumeration) {
'''enum «enumeration.name» {
«FOR l : enumeration.literals BEFORE '	' SEPARATOR ', ' »«l.generateCodeLiteral()»«ENDFOR»
}'''
	}
	
	
	
	
	def generateCodeLiteral(Literal l) 
'''«l.name»'''
}