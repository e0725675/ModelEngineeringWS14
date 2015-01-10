package at.ac.tuwien.big.forms.htmlgen

import java.io.File
import java.util.logging.*;
import at.ac.tuwien.big.forms.FormModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.forms.*
import org.eclipse.emf.common.util.EList
import java.util.EventObject
import org.eclipse.emf.ecore.EObject

class Form2HTMLGenerator implements IGenerator {
	
	private Logger logger = null;
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		if(logger == null) {
			logger = Logger.getLogger("logger");			
		}
		
		logger.log(Level.INFO, "starting doGenerate");
		val listOfModels = resource.resourceSet.resources
		var formModel = null as FormModel
		for(model : listOfModels){
			if(model.contents.get(0) instanceof FormModel)
				formModel = model.contents.get(0) as FormModel
		}
		val name = new File('output.html');
	
		fsa.generateFile(
			name.toString,
			'''<!DOCTYPE html>
				<html lang="en">
				«generateHead(formModel)»
					<body>					
					«generateBody(formModel)»
«««					add HTML elements here
					</body>
				</html>'''	
		)
	}
	
	// 	«»

	def generateHead(FormModel formModel) {
		'''<head>
				<title>Form</title>
				<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
				<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
				<link rel="stylesheet" type="text/css" href="../assets/form.css"/>
				<script src="../assets/jquery-1.10.2.min.js" type="text/javascript"></script>
				<script src="../assets/form.js" type="text/javascript"></script>
				<script type="text/javascript">
				$(document).ready(
				function(){				 
					form.addWelcomeForm(' PublicationForm');
					form.addRegularExpression('01', '^[a-zA-Z -]+$');
					form.addRegularExpression('02', '^([a-zA-Z]+, )+[a-zA-Z]+$');
					form.addRegularExpression('05', '^[0-9]+$');
					form.addRegularExpression('06', '^[0-9]+$');
					form.addRegularExpression('07', '^[0-9]+$');
					form.addRelationshipPageElement('Authors', '11', 'PersonForm', 'table', '1', '-1');
					form.addCompositeCondition('1',null,'Or');
					form.addAttributeValueCondition('2',1,'Proceedings','CP','Show');  
					form.addAttributeValueCondition('3',1,'Proceedings','WP','Show'); 
					form.addRelationshipPageElement('Proceedings', '15', 'ProceedingsForm', 'list', '0', '1');
					form.addAttributeValueCondition('4',null,'Journal','JA','Show');
					form.addRelationshipPageElement('Journal', '16', 'JournalForm', 'list', '0', '1');
					form.addAttributeValueCondition('5',null,'Book','BC','Show');
					form.addRelationshipPageElement('Book', '17', 'BookForm', 'list', '0', '1');
					form.addRegularExpression('18', '^[a-zA-Z -]+$');
					form.addRegularExpression('19', '^[a-zA-Z -]+$');
					form.addRegularExpression('20', '^\w+@[a-zA-Z_]+\.[a-zA-Z]{2,3}$');
					form.addAttributeValueCondition('6',null,'22','true','Hide');
					form.addRegularExpression('23', '^[a-zA-Z -]+$');
					form.addRegularExpression('25', '^[0-9]+$');
					form.addRelationshipPageElement('ProceedingsDetails', '27', 'PersonForm', 'list', '0', '-1');
					form.addRelationshipPageElement('ProceedingsDetails', '28', 'EventForm', 'list', '1', '1');
					form.addRegularExpression('29', '^[a-zA-Z -]+$');
					form.addRegularExpression('30', '^[0-9]+$');
					form.addRegularExpression('31', '^[0-9]+$');
					form.addRegularExpression('32', '^[a-zA-Z -]+$');
					form.addRegularExpression('35', '^[a-zA-Z -]+$');
					form.init();
				});
				</script>
			</head>'''
	}
	
	def generateBody(FormModel zeeForms) {
		'''«FOR form : zeeForms.forms»
			<div class="form" id="«form.name»">
				<form action="#" class="register">
					<h1>«form.name»</h1>
					«IF form.description != null»<h2>«form.description»</h2>«ENDIF»
					«FOR page : form.pages»
					«generatePage(form, page)»
					«ENDFOR»
				</form>
			</div>
			«ENDFOR»'''
	}
	
	def generatePage(Form zeeForm, Page zeePage) {
		'''
						<div class="page" id="«zeePage.title»">
							<fieldset class="row1">
								<h3>«zeePage.title»</h3>
								«FOR pageElement : zeePage.pageElements»
								«generateElement(zeeForm, pageElement)»
								«ENDFOR»
							</fieldset>
						</div>'''
	}
	
	def dispatch generateElement(Form zeeForm, RelationshipPageElement rpe) {
		generateRelPageElement(rpe);		
	}
	
	def dispatch generateRelPageElement(Table table) {
		'''
						<div class="table" id="«table.elementID»">
						<fieldset class="row1">
							<legend class="legend">«table.label»</legend>
							<table>
								<tr id=«table.elementID»_header>
								«FOR column : table.columns»
									<th class="mandatory">«column.label»</th>
								«ENDFOR»
								</tr>
							</table>
						</fieldset>
						</div>'''
	}
	
	def dispatch generateRelPageElement(List list) {
		'''
						<div class="list" id="«list.elementID»"><fieldset class="row1"><legend class="legend">Proceedings List</legend><ul></ul></fieldset></div>'''
	}
	
	def dispatch generateElement(Form zeeForm, AttributePageElement ape) {
		generateField(zeeForm, ape);
	}
	
	def boolean isAttributeMandatory(Attribute attr) {
		return (attr.mandatory == true)
	}
	
	/*
	 * dAttributePageElements
	 */
	def dispatch generateField(Form zeeForm, TextField field) {
		var mandatory = isAttributeMandatory(field.attribute);
		
		'''
									<p><label for="«field.elementID»">«field.label»«IF mandatory == true» <span>*</span>«ENDIF»</label><input type="text" id="«field.elementID»" «IF mandatory == true»class="mandatory"«ENDIF» /></p>'''
	}
	
	def dispatch generateField(Form zeeForm, TextArea field) {
		'''
							<p><label for="«field.elementID»">Abstract</label><textarea id="«field.elementID»"></textarea></p>'''
	}

	def dispatch generateField(Form zeeForm, SelectionField field) {
		var mandatory = isAttributeMandatory(field.attribute);
		var Attribute attr = field.attribute;
		var Enumeration penum = attr.enumeration;
		var EList<Literal> literals = null;
		var boolean selectFieldIsBoolean = false; 
		if(attr.type.literal != "Boolean" && penum.literals != null) {
			literals = penum.literals; 			
		} else {
			selectFieldIsBoolean = true;
		}
		'''
							<p><label for="«field.elementID»" >«field.label» <span>«IF mandatory == true»*«ENDIF»</span></label>
							<select id="«field.elementID»" name="«attr.name»" «IF mandatory == true»class="mandatory"«ENDIF»>
								<option value="default"> </option>
							«IF selectFieldIsBoolean == true »
									<option value="true">Yes</option>
									<option value="false">No</option>
							«ELSE»
								«FOR optionSelect : literals»
										<option value="«optionSelect.name»">«optionSelect.value»</option>
								«ENDFOR»
							«ENDIF»
							</select>
							</p>'''
	}

	def dispatch generateField(Form zeeForm, DateSelectionField field) {
		// @TODO?
	}

	def dispatch generateField(Form zeeForm, TimeSelectionField field) {
		// @TODO?
	}
		
	def generateJSForm(Form zeeForm) {
		if(zeeForm.isWelcomeForm) {
			'''form.addWelcomeForm('«zeeForm.name»')'''
		} 
		else {
			'''form.addRelationshipPageElement('«zeeForm.name»')'''
//			'Proceedings', '15', 'ProceedingsForm', 'list', '0', '1'
		}
	}
	
}