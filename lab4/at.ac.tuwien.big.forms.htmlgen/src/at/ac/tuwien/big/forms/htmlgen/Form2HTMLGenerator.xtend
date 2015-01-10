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
	
	//  «»

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
	«««             register HTML elements here
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
					«generatePage(page)»
					«ENDFOR»
				</form>
			</div>
			«ENDFOR»'''
	}
	
	def generatePage(Page zeePage) {
		'''
						<div class="page" id="«zeePage.title»">
							<fieldset class="row1">
								<h3>«zeePage.title»</h3>
								«FOR pageElement : zeePage.pageElements»
								«generateElement(pageElement)»
								«ENDFOR»
							</fieldset>
						</div>'''
	}
	
	def dispatch generateElement(RelationshipPageElement rpe) {
		generateRelPageElement(rpe);		
	}
	
	def dispatch generateRelPageElement(Table table) {
		'''
						<div class="table" id="«table.elementID»">
						<fieldset class="row1">
							<legend class="legend">«table.label» Table</legend>
							<table>
								<tr id="«table.elementID»_header">
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
						<div class="list" id="«list.elementID»"><fieldset class="row1"><legend class="legend">«list.label» List</legend><ul></ul></fieldset></div>'''
	}
	
	def dispatch generateElement(AttributePageElement ape) {
		generateField(ape);
	}
	
	def boolean isAttributeMandatory(Attribute attr) {
		return (attr.mandatory == true)
	}
	
	/*
	 * dAttributePageElements
	 */
	def dispatch generateField(TextField field) {
		var mandatory = isAttributeMandatory(field.attribute);
		
		'''
									<p><label for="«field.elementID»">«field.label»«IF mandatory == true» <span>*</span>«ENDIF»</label><input type="text" id="«field.elementID»" «IF mandatory == true»class="mandatory"«ENDIF»/></p>'''
	}
	
	def dispatch generateField(TextArea field) {
		'''
							<p><label for="«field.elementID»">Abstract</label><textarea id="«field.elementID»"></textarea></p>'''
	}

	def dispatch generateField(SelectionField field) {
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
							<p><label for="«field.elementID»" >«field.label» «IF mandatory == true»<span>*</span>«ENDIF»</label>
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

	def dispatch generateField(DateSelectionField field) {
		// @TODO?
	}

	def dispatch generateField(TimeSelectionField field) {
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