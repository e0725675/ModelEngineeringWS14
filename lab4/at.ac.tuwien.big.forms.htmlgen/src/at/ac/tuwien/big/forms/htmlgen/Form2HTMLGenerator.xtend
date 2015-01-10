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
					<!-- htmlelements -->
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
					«FOR form : formModel.forms»
					«form.generateJSForm»
					«ENDFOR»
«««				register HTML elements here
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
					<h2>«form.description»</h2>
					<div class="page" id="«form.name»">
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
						</div>
		'''
	}
	
	def dispatch generateElement(Form zeeForm, RelationshipPageElement rpe) {
		
	}
	
	def dispatch generateElement(Form zeeForm, AttributePageElement ape) {
		generateField(zeeForm, ape);
	}
	
	/*
	 * dAttributePageElements
	 */
	def dispatch generateField(Form zeeForm, TextField field) {
		'''
									<p><label for="«field.elementID»">«field.label»<span>*TODO</span></label><input type="text" id="«field.elementID»" class="mandatoryTODO"/></p>'''
		
	}
	
	def dispatch generateField(Form zeeForm, TextArea field) {
		
		
	}

	def dispatch generateField(Form zeeForm, SelectionField field) {
		var boolean mandatory = false;
		var Attribute attr = field.attribute;
		if(attr.mandatory == true) {
			mandatory = true;
		}
		'''
							<p><label for="«field.elementID»" >«field.label»<span>*TODO</span></label>
							<select id="«field.elementID»" name="«field.label»TODO" class="mandatoryTODO">
«««								<option value="default"> </option>
«««								<option value="JA">Journal Article</option>
«««								<option value="BC">Book Chapter</option>
«««								<option value="CP">Conference Paper</option>
«««								<option value="WP">Workshop Paper</option>
							</select></p>
		'''


	}

	def dispatch generateField(Form zeeForm, DateSelectionField field) {
		
		
	}

	def dispatch generateField(Form zeeForm, TimeSelectionField field) {
		
		
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