var elementID = 1;
var selectedPage = null;
var welcomePage = null;
var editID = null;
var nestedParentPageiD = null;

var form = {

	topLevelConditions : [],
	conditions : {},
	allIDs : [],
	noConditions : [],
	userInput : [],
	headerList : [],
	pages : [],
	attrValueConditions : [],
	relationshipPageElements : [],
	regularExpressions : [],
	saveButtonIDs : [],
	editButtonIDs : [],
	deletedIDs : [],
	listIDs : [],

	init : function(){
		var self = this;		
		var currentPage = $('div.page').eq('0').attr('id');
		$('div.page').not(':eq(0)').hide();
		$('div.form').not(':eq(0)').hide();
		
		var pageSibligns = $('div.page').eq('0').siblings();
		self.showPagesWithNoCondition(self, this.noConditions, pageSibligns);
		self.showSelectionFieldInput(self, currentPage);
		
		var saveButton = $("<button class='saveButton' type='button'>Save</button>");
		saveButton.on("click", function() {
			
			var isMandatory = self.mandatoryFieldCheck(self, currentPage);
			var isRegExpValid = self.regExpCheck(self, currentPage);
			var boundsCheck = self.boundsCheck(self, currentPage);
			if(isMandatory && isRegExpValid && boundsCheck){
				self.saveUserInput(self, currentPage);
				self.showSummaryPage(self, saveButton);
			}
		});
		$("body").append(saveButton);  	
	},
	
	showSelectionFieldInput : function(self, currentPage){
		$('#' + currentPage).find("select").each(function(index, item) {
 			 $(item).change(function () { 
 			 		self.checkTopLevelConditions(self, $(item).val(), $(item).attr('id'));
 			 });
		});
	},
	
	saveUserInput : function(self, currentPage){
		$(".page").each(function(id, item){
			if(currentPage == $(item).attr('id')){
				$(item).find("input").each(function(index, item) {
					if($(item).val().length > 0){
						var input = new Object();
						input.type = 'input';
						input.elementID = self.getElementID();
						input.currentPage = currentPage;
						input.label = self.findLabelForId($(item).attr('id')).text();
						input.value = $(item).val();
						self.userInput.push(input);
					}
				});
				$(item).find("select").each(function(index, item) {
					if($(item).val() !== null){
						if($(item).val().length > 0){
							var input = new Object();
							input.type = 'select';
							input.elementID = self.getElementID();
							input.currentPage = currentPage;
							input.label = self.findLabelForId($(item).attr('id')).text();
							input.value = $("#"+$(item).attr('id')+" option[value='"+$(item).val()+"']").text();
							input.optionValue = $(item).val();
							self.userInput.push(input);
						}
					}
				});
			}
		});
	},

	showSummaryPage : function(self, saveButton) {
	
		var unselectedPages = new Array();
		for (var i = 0; i < this.noConditions.length; ++i) {
			if(this.noConditions[i] != self.getSelectedPage() && unselectedPages.indexOf(this.noConditions[i]) == -1){
				unselectedPages.push(this.noConditions[i]);
				unselectedPages.push($("#"+this.noConditions[i]).find('.page').attr('id'));
				if($("#"+this.noConditions[i]).find('.page').find('.page').length > 0){
					var childPages = $("#"+this.noConditions[i]).find('.page').find('.page');
					for (var i = 0; i < childPages.length; ++i) {
						unselectedPages.push(childPages[i].id);
					}
				}
			}
		}
	
		$(".page").hide();
		var summary = $("<div class='well'/>");
		summary.append($("<h4>Summary</h4>"));
		$('div.form').eq('0').after(summary);
		
		for (var i = 0; i < $(".page").length; ++i) {
			self.summaryPageHelper(self, i, summary, unselectedPages);
		}
		
		var allHeaders = summary.find('h3');
		var dd = summary.find('h3').siblings('dd');
		var allElements = new Array();
		for (var i = 0; i < dd.length; ++i) {
			allElements.push(dd[i].id);
		}
		for (var i = 0; i < allHeaders.length; ++i) {
			if(allElements.indexOf(allHeaders[i].id) == -1){
				summary.find('h5#'+allHeaders[i].id).remove();
			}
			
		}
		
		summary.append($("<h5></h5>"));
		$('div.form').eq('0').find('h2').after(summary);
		saveButton.hide();
	},
	
	summaryPageHelper : function(self, page, summary, unselectedPages) {

		var currentPageID = null;
		var myRe = new RegExp("d(b+)d", "g");
		for (var i = 0; i < self.userInput.length; ++i) {
		if(unselectedPages.indexOf($('.page').eq(page).attr('id')) == -1){
			if($('.page').eq(page).attr('id') == self.userInput[i].currentPage){				
			if(self.userInput[i].value.length > 0){
				if(self.userInput[i].label.indexOf('*') > 0){
					self.userInput[i].label = self.userInput[i].label.substring(0, self.userInput[i].label.indexOf('*'));
				}
				
				if($('div.form').eq('0').attr('id') !== $("#" + self.userInput[i].parentPage).parent('.form').attr('id')){
					if(summary.find('h5#' + self.userInput[i].currentPage).length == 0){						
						summary.append($('<h5 id='+ self.userInput[i].currentPage +'>' + self.userInput[i].currentPage + '</h5>'));
						currentPageID = self.userInput[i].currentPage;
					}
				} 
				
			    if(this.deletedIDs.indexOf(self.userInput[i].elementID+'') == -1){
				 if(self.userInput[i].value.trim().length != 0){
					summary.append($('<dd id='+currentPageID+'>' + self.userInput[i].label.trim().bold() + ': ' + self.userInput[i].value + '</dd>'));
				}
				
			}
			}
			}
		}
		}
	},

	showPagesWithNoCondition : function(self, pagesWithConditions, pageSiblings) {
		var page = null;
		for (var i = 0; i < pagesWithConditions.length; ++i) {
			for (var j = 0; j < pageSiblings.length; ++j) {
				if(pageSiblings[i] !== undefined){
				if(pagesWithConditions.indexOf(pageSiblings[i].id) == -1){
					$("#" + pageSiblings[i].id).show();
					page = pageSiblings[i].id;
					self.pages.push(page);
					self.addAddButton(self, page, null, null, null);
				}
				}
			} 
		}
	},
	
	addAddButton : function(self, page, type, form, id){
		var addButton = $("<button class='addButton' type='button'>Add</button>");
		addButton.on("click", function() {
			if(type == 'list'){
				self.clearInput(self, $('#'+page).find('div.page').attr('id'));
				$('#'+page).show();
				$('#'+page).find('div.page').show();
				$('#'+page).find('.addButton').show();
				$('#'+page).find('div.page').find('.addButton').hide();
				$('#'+page).find('div.page').find('.saveE').hide();
				$('#'+page).find('div.page').find('.saveB').hide();
				$('#'+form).hide();

				self.addSaveButton(self, form, type, $('#'+page).find('div.page').attr('id'));
				
				self.showSelectionFieldInput(self, $('#'+page).find('div.page').attr('id'));
				$("body").find('.saveButton').hide();  
				
				if($('#'+page).find('div.page').find('.saveB').length > 1){
					for (var i = 0; i < $('#'+page).find('div.page').find('.saveB').length; ++i) {
						var id = $('#'+page).find('div.page').find('.saveB')[i].id;
						var button = $('#'+page).find('div.page').find('.saveB')[i];
						if(id == type+"_"+$('#'+page).find('div.page').attr('id')){
							$('#'+id).show();
						} 
					}
				}
				if($('#'+page).find('div.page').find('.saveB').length == 1){
					$('#'+page).find('div.page').find('.saveB').show();
				}		
			} else {
				var currentPage = null;
				for (var i = 0; i < self.relationshipPageElements.length; ++i) {
					if(page == self.relationshipPageElements[i].page){
						var nextForm = self.relationshipPageElements[i].nextForm;
						currentPage = $('#'+nextForm).find('div.page').attr('id');
					}
				}
				self.clearInput(self, currentPage);
				$('div.form').hide();
				$("body").find('.saveButton').hide();  	
				$('#'+page).show();
				$('#'+currentPage).find('.saveE').hide();
				$('#'+currentPage).find('.saveB').hide();
				self.handleAddButtonFunction(self, page);
				$("body").find('.saveButton').hide();  	
				
				if($('#'+currentPage).find('.saveB').length > 0){
					for (var i = 0; i < $('#'+currentPage).find('.saveB').length; ++i) {
						var id = $('#'+currentPage).find('.saveB')[i].id;
						var button = $('#'+currentPage).find('.saveB')[i];
						var nextForm = self.getRelationshipObject(self, page).nextForm;
						var nextPage = $('#'+nextForm).find('.page').attr('id');
						if(id == page+"_"+nextPage){
							$('#'+id).show();
						}
					}
				}
			}
		
		});
		
		if($("#" + page).find('.addButton').length == 0){
			if($("#" + page).find("ul").length == 1){
				$("#" + page).find("ul").first().after(addButton);
			}
			if($("#" + page).find('table').length == 1){
				$("#" + page).find("table").first().after(addButton);
				$("#" + page).find('table').hide();
			}
		}
		if(type == 'list'){
			if($("#" + id).find('.addButton').length == 0){
				$("#" + id).find("ul").first().after(addButton);
			}
		} 
	},
	
	handleAddButtonFunction : function(self, page){
		for (var i = 0; i < self.relationshipPageElements.length; ++i) {
			if(page == self.relationshipPageElements[i].page){
				var nextForm =  self.relationshipPageElements[i].nextForm;
				$("#" + nextForm).show();
				$("#" + nextForm).find('.page').show();
				self.addSaveButton(self, nextForm, page, $('#'+nextForm).find('.page').attr('id'));
				self.showSelectionFieldInput(self, $('#'+nextForm).find('.page').attr('id'));
				
				for (var i = 0; i < self.relationshipPageElements.length; ++i) {
					if($('#'+nextForm).find('.page').attr('id') == self.relationshipPageElements[i].page){
						self.addAddButton(self, self.relationshipPageElements[i].nextForm ,$('#'+nextForm).find('div.list').attr('class'), nextForm, self.relationshipPageElements[i].elementID);
					}
				}
			}
		}
	},
	
	getRelationshipObject : function(self, page){
		for (var i = 0; i < self.relationshipPageElements.length; ++i) {
			if(page == self.relationshipPageElements[i].page){
				return self.relationshipPageElements[i];
			}
		}
	},
	
	addSaveButton : function(self, form, parentPage, currentPage){
		var saveButton = $("<button class='saveB' id='"+parentPage+"_"+currentPage+"' type='button'>Save</button>");
		saveButton.on("click", function() {
			var isMandatory = self.mandatoryFieldCheck(self, currentPage);
			var isRegExpValid = self.regExpCheck(self, currentPage);
			var boundsCheck = self.boundsCheck(self, currentPage);
			var boundsCheck = self.boundsCheck(self, currentPage);
			if(boundsCheck === undefined) { boundsCheck = true};
			if(isMandatory && isRegExpValid && boundsCheck){
				self.saveUserInput(self, currentPage);
				self.showConditionlessPages(self);	
				if(parentPage == 'list'){
				 	self.relAttrCheck(self, currentPage, parentPage);
				 	
				 	$("#" + currentPage).parents('div.form').hide();
					$("#" + currentPage).hide();
					$("#" + form).show();
				 	
				 	var upperBound, elementID = null;
				 	for (var i = 0; i < self.relationshipPageElements.length; ++i) {
				 		if($("#" + currentPage).parents('div.form').attr('id') == self.relationshipPageElements[i].nextForm){
							elementID = self.relationshipPageElements[i].elementID;
							upperBound = self.relationshipPageElements[i].upperBound;
						}
				 	}
					if(upperBound == 1){
						$("#"+elementID).find('.addButton').hide();
					}
				} else {
					self.relAttrCheck(self, currentPage, parentPage);
					$("#" + form).hide();
					$("#" + form).find('.page').hide();
					$('div.form').eq('0').show();
					$("body").find('.saveButton').show();
					if(self.getRelationshipObject(self, parentPage).upperBound == 1){
						$("#" + parentPage).find('.addButton').hide();
					}
				}
				self.clearInput(self, currentPage);
			}
		});
		
		if(self.saveButtonIDs.indexOf(parentPage+"_"+currentPage) == -1){
			self.saveButtonIDs.push(parentPage+"_"+currentPage);
			$("#" + currentPage).append(saveButton);
		}

	},
	
	boundsCheck : function(self, page){
		var welcomePage = $('div.page').eq('0').attr('id');
		if(welcomePage == page){
			for (var i = 0; i < $("#" + page).siblings('.page').length; ++i) {
				if($("#" + page).siblings('.page').attr('id') == self.relationshipPageElements[i].page){
					lowerBound = self.relationshipPageElements[i].lowerBound;
					upperBound = self.relationshipPageElements[i].upperBound;
					elementID =  self.relationshipPageElements[i].elementID;
					var tablePage = $("#" + page).siblings('.page').attr('id');
					if(lowerBound == 1){
						if($("#" + tablePage).find('table tr').length == 1){
							alert($("#" + page).siblings('.page').attr('id') + ' table must have at least one element');
							return false;
						} else {
							return true;
						}
					}
				}
			}
		} /*else {
		var childForms = new Array();
		for (var i = 0; i < self.relationshipPageElements.length; ++i) {
			if(page == self.relationshipPageElements[i].page){
				childForms.push(self.relationshipPageElements[i].nextForm);
			}
		}
		for (var i = 0; i < childForms.length; ++i) {
			for (var j = 0; j < self.relationshipPageElements.length; ++j) {
				if(childForms[i] == self.relationshipPageElements[j].nextForm){
					nextForm = self.relationshipPageElements[j].nextForm;
					elementID = self.relationshipPageElements[j].elementID;
					lowerBound = self.relationshipPageElements[j].lowerBound;
					upperBound = self.relationshipPageElements[j].upperBound;
					if(lowerBound == 1 && upperBound == 1){
						/*if($("#" + elementID).find('ul li').length == 0){
							var listName = nextForm.substring(0, nextForm.length - 4);
							alert(listName + ' list must have exactly one element');
							return false;
						} else {
							return true;
						}
					} 
				}
			}
		}
		}*/
		
	},
	
	showConditionlessPages : function(self){
		for (var i = 0; i < self.pages.length; ++i) {
			$("#" + self.pages[i]).show();
			$("#" + self.pages[i]).find('.addButton').show();
		}
	},
	
	relAttrCheck : function(self, currentPage, parentPage){	
		var type = null;
		if(parentPage == 'list'){
			type = 'list';
		} else {
			type = self.getRelationshipObject(self, parentPage).type;
		}
		if($('div.form').eq('0').attr('id') == $("#" + parentPage).parent('.form').attr('id')){
			if(type == 'table'){
				self.showTable(self, currentPage, parentPage);
			} 
			if(type == 'list'){
				self.showList(self, currentPage, parentPage, parentPage);
			}
		} else {
			if(type == 'table'){
				self.showTable(self, currentPage, parentPage);
			} 
			if(type == 'list'){
				self.showList(self, currentPage, parentPage, parentPage);
			}
		}
	},
	
	showList : function(self, currentPage, parentPage, settingPage){
		if(parentPage == 'list'){
			for (var i = 0; i < self.relationshipPageElements.length; ++i) {
				if($("#"+currentPage).parents('div.form').attr('id') == self.relationshipPageElements[i].nextForm){
					settingPage = self.relationshipPageElements[i].elementID;
					parentPage = settingPage;
				}
			}
		} else {		
			for (var i = 0; i < self.relationshipPageElements.length; ++i) {
				if($("#"+currentPage).parents('div.form').attr('id') == self.relationshipPageElements[i].nextForm){
					settingPage = self.relationshipPageElements[i].page;
					parentPage = settingPage;
				}
			}
		}
		
		var listElements = $("#" + settingPage).find('ul li');
		var listElementIDs = new Array();
		for (var i = 0; i < listElements.length; ++i) {
			listElementIDs.push(listElements[i].id);
		}
		
		
		var listElement = '';
		var counter = 0;
		for (var i = 0; i < this.userInput.length; ++i) {
			if(this.getElementID() == this.userInput[i].elementID){
			if(currentPage == this.userInput[i].currentPage){
				if($.inArray(this.userInput[i].elementID + '', listElementIDs) == -1){
					if($('div.form').eq('0').attr('id') == $("#" + parentPage).parents('div.form').attr('id')){
						if(counter != 1){
							listElement = this.userInput[i].value;
							counter++;
						}
					} else {
						if(counter != 2){
							listElement += this.userInput[i].value + " ";
							counter++;
						}
					}
				}
			}
			}
		}
		
		var listID = self.getElementID();
		this.listIDs.push(listID);
		if($('div.form').eq('0').attr('id') == $("#" + parentPage).parent('.form').attr('id') && $("#" + parentPage).find('.page').length > 1){
				self.setNestedParentPageID(listID);
		}
		var deleteLink = '&nbsp;<a href="javascript:void(0)" onclick="form.deleteEvent('+"'" + parentPage + "'" + "," + "'" + listID + "'" + "," + "'list'" + ')">delete</a>';
		$("#" + settingPage).find("ul").first().append('<li id='+ listID +'>' + listElement + ' ' + deleteLink +'</li>');
		self.increaseElementID();
		
	},
	
	trimOffStar : function(self, userInput){
		if(userInput.indexOf('*') > 0){
			return userInput.substring(0, userInput.indexOf('*'));
		}
	},
	
	showTable : function(self, currentPage, parentPage){
		$("#" + parentPage).find('table ').show();

		var tableRows = $("#" + parentPage).find('.table tr');
		var tableRowIDs = new Array();
		for (var i = 0; i < tableRows.length; ++i) {
			tableRowIDs.push(tableRows[i].id);
		}
		
		var parentForm = $("#" + currentPage).parents('div.form').attr('id');
		var listID = new Array();

		for (var i = 0; i < self.relationshipPageElements.length; ++i) {
			if(parentForm == self.relationshipPageElements[i].nextForm){
				if('list' == self.relationshipPageElements[i].type){
					listID.push(self.relationshipPageElements[i].elementID);
				}
			}
		}
		var listElements = $("#" + listID).find('ul li');
		var listElementIDs = new Array();
		for (var i = 0; i < listElements.length; ++i) {
			listElementIDs.push(listElements[i].id);
		}

		var tableRow = '';
		var counter = 0;
		for (var i = 0; i < self.userInput.length; ++i) {
			if(currentPage == self.userInput[i].currentPage){
				if($.inArray(self.userInput[i].elementID + '', tableRowIDs) == -1){
					if(listElementIDs.indexOf(self.userInput[i].elementID+'') == -1){
						if(this.deletedIDs.indexOf(self.userInput[i].elementID+'') == -1){
						if(counter != 3){
							tableRow += '<td>' + self.userInput[i].value + '</td>';
							counter++;
						}
						}
					}
					
				}
			}
		}

		var rowID = self.getElementID();
		var deleteLink = '&nbsp;<a href="javascript:void(0)" onclick="form.deleteEvent('+"'" + parentPage + "'" + "," + "'" + rowID + "'" + "," + "'table'" + ')">delete</a>';
		
		if($("#" + parentPage).find("table").find("th").length == 3){
			$("#" + parentPage).find("table").find("tr").first().append("<th></th>");
		}
		
		$("#" + parentPage).find("table").first().append('<tr id='+ rowID +'>' + tableRow + '<td>' + deleteLink +'</td></tr>');
		self.increaseElementID();
	},
	
	deleteEvent : function(parentPage, id, type){ 
		if(type == 'table'){ 
			$("#" + parentPage).find('table tr#' + id).remove();
			this.deletedIDs.push(id);
			if($("#" + parentPage).find('table tr').length == 1){
				$("#" + parentPage).find('table').hide();
				$("#" + parentPage).find('.addButton').show();
			}
		}
		
		if(type == 'list'){
			$("#" + parentPage).find('ul li#' + id).remove();
			this.deletedIDs.push(id);
			if($("#" + parentPage).find('ul li').first().length == 0){
				$("#" + parentPage).find('.addButton').show();
			}
			if(this.getRelationshipObject(this, parentPage).nextForm !== undefined){
			var nextForm = this.getRelationshipObject(this, parentPage).nextForm;
			for (var i = 0; i < $("#" + nextForm).find('div.list').length; ++i) {
				var listID = $("#" + nextForm).find('div.list')[i].id;
				var listElements = $("#" + listID).find('li');
				for (var j = 0; j < listElements.length; ++j) {
					$("#" + nextForm).find('div.list').find('ul li#' + listElements[j].id).remove();
					this.deletedIDs.push(listElements[j].id);
				}
				$("#" + listID).find('.addButton').show();
			}
			}
		}
	},

	regExpCheck : function(self, currentPage){ 
		var inputs = document.getElementsByTagName('input');
		var booleans = new Array();
		for (var i = 0; i < inputs.length; ++i) {
			var page = self.findPageForElement(inputs[i].id);
			if(page == currentPage){
				if (inputs[i].type == "text" && inputs[i].value.length > 0){		
					var inputVal = inputs[i].value;
					var regExp =  new RegExp(self.getRegExp(self, inputs[i].id));
					if(regExp == "/^w+@[a-zA-Z_]+.[a-zA-Z]{2,3}$/"){
						regExp = /^\w+@[a-zA-Z_]+\.[a-zA-Z]{2,3}$/;
					}
					if(regExp.test(inputVal)){
						self.findLabelForId(inputs[i].id).removeClass("missing");
						booleans.push(true);
					} else {
						self.findLabelForId(inputs[i].id).addClass("missing");
						booleans.push(false);
					}
       			}
            }
		}
		
		var returnValue = true;
		for (var i = 0; i < booleans.length; ++i) {
			returnValue = returnValue && booleans[i];
		}
		
		return returnValue;
	},
	
	getRegExp : function(self, id){
		for (var i = 0; i < self.regularExpressions.length; ++i) {
			if(id == self.regularExpressions[i].id){
				return self.regularExpressions[i].expression;
			}
		}
	},
	
	mandatoryFieldCheck : function(self, currentPage) { 
		var returnValue = false;
		var mandatoryFields = document.getElementsByClassName('mandatory');
		for (var i = 0; i < mandatoryFields.length; ++i) {
			var page = self.findPageForElement(mandatoryFields[i].id);
			if(page == currentPage){
				if(mandatoryFields[i].value.length > 0 && mandatoryFields[i].value != 'default'){
					self.findLabelForId(mandatoryFields[i].id).removeClass("missing");
					returnValue = true;
				} else {
					
					self.findLabelForId(mandatoryFields[i].id).addClass("missing");
					returnValue = false;
				}
			}
		}
		return returnValue;
	},
	
	findLabelForId : function(id) {
		return $("label").filter("[for='" + id + "'], [id='label_for_" + id + "']").first();
	},
	
	findPageForElement : function(id) {
		return $("#" +id).parents(".page").attr('id');
	},
	
	increaseElementID : function() {
		return window.elementID++;
	},
	
	getElementID : function() {
		return window.elementID;
	},
	
	getEditID : function() {
		return window.editID;
	},
	
	setEditID : function(id) {
		window.editID = id;
	},
	
	getNestedParentPageID : function() {
		return window.nestedParentPageiD;
	},
	
	setNestedParentPageID : function(id) {
		window.nestedParentPageiD = id;
	},
	
	getSelectedPage : function() {
		return window.selectedPage;
	},
	
	setSelectedPage : function(page) {
		window.selectedPage = page;
	},
	
	addWelcomeForm : function(page){
		window.welcomePage = page;
	},
	
	clearInput : function(self, currentPage){ 
		var inputs = document.getElementsByTagName('input');
		for (var i = 0; i < inputs.length; ++i) {
			var page = self.findPageForElement(inputs[i].id);
			if(page == currentPage){
				 inputs[i].value = '';
			}
		}
		var selects = document.getElementsByTagName('select');
		for (var i = 0; i < selects.length; ++i) {
			var page = self.findPageForElement(selects[i].id);
			if(page == currentPage){
				 $('#' +  selects[i].id).val(' ');
				 $("#"+ selects[i].id).show(); 
   				 $("label").filter("[for='" + selects[i].id + "']").show();
			}
		}
		if($("#" + currentPage).find('.page').length > 1){
			$("#" + currentPage).find('ol').remove();
			$("#" + currentPage).find('.page').find('ol').remove();
		}
	},
	
	addCompositeCondition : function(id, parentid, operator) {
		var compositeCondition = new Object();
		compositeCondition.composite = true;
		compositeCondition.id = id;
		compositeCondition.parentId = parentid;
		compositeCondition.operator = operator;
		compositeCondition.left = null;
		compositeCondition.right = null;
		this.addCondition(compositeCondition);
	},

	addAttributeValueCondition : function(id, parentid, fieldID, value, type) {
		var attributeCondition = new Object();
		attributeCondition.composite = false;
		attributeCondition.id = id;
		attributeCondition.parentId = parentid;
		attributeCondition.fieldID = fieldID;
		attributeCondition.value = value;
		attributeCondition.type = type;
		this.addCondition(attributeCondition);
		this.attrValueConditions.push(attributeCondition);
		
		var regExp = /^[a-zA-Z -]+$/;
		if(regExp.test(fieldID)){
			this.noConditions.push(fieldID);
		}
	},
	
	addCondition : function(condition) {
		this.conditions[condition.id] = condition;
		if(condition.parentId != null) {
			var parentCondition = this.conditions[condition.parentId];
			if(parentCondition.left == null) {
				parentCondition.left = condition.id;
			}
			else {
				parentCondition.right = condition.id;
			}
		} else {
			this.topLevelConditions.push(condition);
		}
	},
	
	evaluateCondition : function(condition, inputValue, self) { 
		if(condition.composite == false) {
			var field = document.getElementById(condition.fieldID);
			if (inputValue == condition.value){
				return true;}
			else{
				return false;}
		}	
		else {
			var leftCondition = this.conditions[condition.left];
			var rightCondition = this.conditions[condition.right];
			var leftConditionEval = this.evaluateCondition(leftCondition,inputValue);
			var rightConditionEval = this.evaluateCondition(rightCondition,inputValue);
			if(condition.operator == 'And'){
				return leftConditionEval && rightConditionEval;
				}
			else{
				if(leftConditionEval || rightConditionEval){
					if(leftConditionEval){
						id = leftCondition.fieldID;
						self.setSelectedPage(id);
						self.showPageHideSiblings(self, id);
						self.addAddButton(self, id);
					}
					else{
						id = rightCondition.fieldID;
						self.setSelectedPage(id);
						self.showPageHideSiblings(self, id);
						self.addAddButton(self, id);
					}
				}
				return leftConditionEval || rightConditionEval;
				}
		}
	},
	
	checkTopLevelConditions : function(self, inputValue, inputFieldID) {
		for(var index = 0;index < this.topLevelConditions.length;++index) {
			var condition = this.topLevelConditions[index];			
			var evaluationResult = this.evaluateCondition(condition, inputValue, self);	
			if(evaluationResult){
				 var id = condition.fieldID;
				 if(condition.type == 'Show'){
				 	self.setSelectedPage(id);
				 	self.showPageHideSiblings(self, id);
				 	self.addAddButton(self, id);
				 }
				 if(condition.type == 'Hide'){
   					$("#"+ id).hide(); 
   					$("label").filter("[for='" + id + "']").hide();
   				}
			} else {
				var id = condition.fieldID;
				if(condition.type == 'Hide'){
   					$("#"+ id).show(); 
   					$("label").filter("[for='" + id + "']").show();
   				}
   			}
		}
	},
	
	showPageHideSiblings : function(self, id){
		for (var i = 0; i < self.noConditions.length; ++i){
	 		if(self.noConditions[i] == id){
	 			$("#" + id).show();
	 		} else {
	 			$("#" + self.noConditions[i]).hide();
	 		}
	 	}
	},

	addRelationshipPageElement : function(page, elementID, nextForm, type, lowerBound, upperBound){
		var relationshipPageElement = new Object();
		relationshipPageElement.page = page;
		relationshipPageElement.elementID = elementID;
		relationshipPageElement.nextForm = nextForm;
		relationshipPageElement.type = type;
		relationshipPageElement.lowerBound = lowerBound;
		relationshipPageElement.upperBound = upperBound;
		this.relationshipPageElements.push(relationshipPageElement);
	
	}, 
	
	addRegularExpression : function(id, expression){
		var regExp = new Object();
		regExp.id = id;
		regExp.expression = expression;
		this.regularExpressions.push(regExp);
	}

}
