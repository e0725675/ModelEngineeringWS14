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
	
	private static class OppositeRelationships {
		public Relationship relationship1=null;
		public Relationship relationship2=null;
		public Entity parentRelationship1=null;
		public Entity parentRelationship2=null;
		
		/*
		 * Returns 0 if not contains;
		 * returns 1 if == relationship1;
		 * returns 2 if == relationship2;
		 */
		def contains(Relationship relationship) {
			if (relationship == this.relationship1) {
				return 1;
			}
			if (relationship == this.relationship2) {
				return 2;
			}
			return 0;
		}
		
		def isComplete() {
			if (relationship1 != null && relationship2 != null && parentRelationship1 != null && parentRelationship2 != null) {
				return true;
			} else {
				return false;
			}
		}
		
		def isValid() {
			if (this.isComplete() && relationship1.opposite == relationship2 && relationship2.opposite == relationship1) {
				return true;
			} else {
				return false;
			}
		}
		override String toString() {
			return "["+this.relationship1.name+","+this.relationship2.name+"]";
		}
	}
	
	var opposites = new ArrayList<OppositeRelationships>();
	var bounds = new ArrayList<EntityRelationship>();
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		bounds = new ArrayList<EntityRelationship>();
		opposites = new ArrayList<OppositeRelationships>();
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
«generateRelationBidirectionalFactConstraints()»
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
ELSE»set «rel.noteSetFactBounds(parentEntity)»«
ENDIF»«rel.target.name»«
IF rel.opposite != null»«rel.noteSetFactOpposite(parentEntity)»«ENDIF»'''
	}
	
	def noteSetFactOpposite(Relationship relationship, Entity parentEntity) {
		for (OppositeRelationships o : opposites) {
			var contains = o.contains(relationship.opposite);
			if (contains == 1) {
				o.relationship2 = relationship
				o.parentRelationship2 = parentEntity;
				return "";
			} else if (contains == 2) {
				o.relationship1 = relationship
				o.parentRelationship1 = parentEntity;
				return "";
			}
		}
		var o = new OppositeRelationships()
		o.relationship1 = relationship;
		o.parentRelationship1 = parentEntity;
		opposites.add(o);
		return "";
	}
	
	def noteSetFactBounds(Relationship relationship, Entity parentEntity) {
		var b = new EntityRelationship();
		b.relationship = relationship;
		b.parentEntity = parentEntity;
		bounds.add(b);
		return ""
	}
	
	def generateCodeLiteral(Literal l) 
'''«l.name»'''

	def generateRelationFactConstraints(ArrayList<EntityRelationship> missingBounds) {
'''«IF missingBounds.size() > 0»fact {
«FOR er : missingBounds BEFORE '	' SEPARATOR '
	' »«er.generateCodeEntityRelationship()»«ENDFOR»
}«ENDIF»'''
	}
	
	def generateCodeEntityRelationship(EntityRelationship er) {
		var output = "";
		if (er.relationship.lowerBound != 1) {
			output += "all v: "+er.parentEntity.name+" | #v."+er.relationship.name+" >= "+er.relationship.lowerBound;
		}
		if (er.relationship.upperBound != -1) {
			if (er.relationship.lowerBound != 1)
				output +="\n\t";
			
			output += "all v: "+er.parentEntity.name+" | #v."+er.relationship.name+" =< "+er.relationship.upperBound;
		}
		return output;
	}
	
	def generateRelationBidirectionalFactConstraints() {
'''fact {
«validateOpposites()»«
	FOR op : opposites BEFORE '	' SEPARATOR '
	' »«op.generateCodeOppositeRelationship()»«ENDFOR»
}'''
	}
	def validateOpposites() { //TODO: adapt
		for (OppositeRelationships o : opposites) {
			if (!o.isValid()) {
				System.out.println("Invalid opposite: "+o);
			} else {
				System.out.println("valid opposite: "+o);
			}
		}
		return "";
	}
	def generateCodeOppositeRelationship(OppositeRelationships opp) {
		if (!opp.isValid()) return "";
		
		return "all e1:"+opp.parentRelationship1.name+", e2:"+opp.parentRelationship2.name+" | (e1."+opp.relationship1.name+" in e2 implies e2."+opp.relationship2.name+" in e1) and (e2."+opp.relationship2.name+" in e1 implies e1."+opp.relationship1.name+" in e2)";
	}
}