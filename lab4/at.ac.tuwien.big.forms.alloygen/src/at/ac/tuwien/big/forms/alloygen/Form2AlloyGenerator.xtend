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
import at.ac.tuwien.big.forms.Relationship
import java.util.ArrayList

class Form2AlloyGenerator implements IGenerator {
	private static class EntityRelationship {
		public Relationship relationship;
		public Entity parentEntity;
		override String toString() {
			return "["+this.relationship+","+this.parentEntity+"]";
		}
	}
	var bounds = new ArrayList<EntityRelationship>();
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		var entityModel = resource.contents.get(0) as EntityModel
		var name = new File(resource.URI.toFileString).name.replace(".forms", ".als");
		entityModel.generateFile(fsa, name); // the first argument is the entityModel
		//System.out.println("bounds: "+bounds);
	}
	
	
	
	def generateFile(EntityModel em, IFileSystemAccess fsa, String fileName) {
		
		fsa.generateFile(fileName,
'''module ME14
«FOR e : em.entityModelElements»
«e.generateCodeEME()»
«ENDFOR»
«bounds.generateRelationFactConstraints()»
'''
)
	}
	
	
	
	def dispatch generateCodeEME(EntityModelElement eme) 
'''EntityModelElement;''' // fallback
	
	
	
	def dispatch generateCodeEME(Entity entity) {
'''sig «entity.name» {
«entity.features.generateCodeFeatures(entity)»
}'''
	}
	
	
	
	def generateCodeFeatures(List<Feature> features, Entity parentEntity)  {
		var out = "";
		var first = 1;
		for (Feature f : features) {
			if (first == 1) {
				first = 0;
			} else {
				out+=",\n"
			}
			if (f instanceof Attribute) {
				
				//System.out.println("Attribute");
				out+= (f as Attribute).generateCodeAttribute();
			} else if (f instanceof Relationship){
				//System.out.println("Not a Attribute");
				out+= (f as Relationship).generateCodeRelationship(parentEntity);
			} else {
				out+="unknown";
			}
		}
		return out;
	}
	
	def generateCodeAttribute(Attribute att) {
		if (att.type == AttributeType.NONE) {
			return att.generateCodeAttributeEnumeration();
		} else {
			return att.generateCodeAttributePrimitive();
		}
	}
	def generateCodeAttributeEnumeration(Attribute att)
'''	«att.name»: «IF att.mandatory == true»one «ELSE»lone «ENDIF»«att.enumeration.name»'''

	def generateCodeAttributePrimitive(Attribute att)
'''	«att.name»: «IF att.mandatory == true»one «ELSE»lone «ENDIF»Int'''
	
	
	def dispatch generateCodeEME(Enumeration enumeration) {
'''enum «enumeration.name» {
«FOR l : enumeration.literals BEFORE '	' SEPARATOR ', ' »«l.generateCodeLiteral()»«ENDFOR»
}'''
	}
	
	def generateCodeRelationship(Relationship rel, Entity parentEntity) {
'''	«rel.name»: «
IF rel.lowerBound == 0 && rel.upperBound == 1»lone «
ELSEIF rel.lowerBound == 1 && rel.upperBound == 1»one «
ELSEIF rel.lowerBound == 1 && rel.upperBound == -1»some «
ELSEIF rel.lowerBound == 0 && 
rel.upperBound == -1»set «
ELSE»set «rel.noteSetFact(parentEntity)»« // TODO: add fact constraints for this case!!!
ENDIF»«rel.target.name»'''
	}
	
	def noteSetFact(Relationship relationship, Entity parentEntity) {
		var b = new EntityRelationship();
		b.relationship = relationship;
		b.parentEntity = parentEntity;
		bounds.add(b);
		return ""
	}
	
	def generateCodeLiteral(Literal l) 
'''«l.name»'''

	def generateRelationFactConstraints(ArrayList<EntityRelationship> missingBounds) {
		''''''
	}
}