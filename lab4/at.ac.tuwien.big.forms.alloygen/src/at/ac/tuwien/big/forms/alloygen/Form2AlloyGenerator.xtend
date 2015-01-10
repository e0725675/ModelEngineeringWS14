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

}'''
	}
	
	
	
	def generateCodeAttributes(Feature f) ''''''
	
	
	
	
	def dispatch generateCodeEME(Enumeration enumeration) {
'''enum «enumeration.name» {
«FOR l : enumeration.literals BEFORE '	' SEPARATOR ', ' »«l.generateCodeLiteral()»«ENDFOR»
}'''
	}
	
	
	
	
	def generateCodeLiteral(Literal l) 
'''«l.name»'''
}