package at.ac.tuwien.big.forms.htmlgen

import java.io.File
import java.util.logging.*;
import at.ac.tuwien.big.forms.FormModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.forms.*

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
					«form.generateForm»
					bleh bleh formaldjflkdaj
					«ENDFOR»
«««				register HTML elements here
				form.init();
				});
				</script>
			</head>'''
	}
	
	def generateForm(Form zeeForm) {
		logger.log(Level.INFO, "generateForm Form");
		logger.log(Level.INFO, zeeForm.entity.name)
	}
	
//	def dispatch generateForm(Enumeration zeeEnum) {
//		logger.log(Level.INFO, "generateForm Enumeration");				
//	}
	
}