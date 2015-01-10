/**
 */
package at.ac.tuwien.big.forms.impl;

import at.ac.tuwien.big.forms.Attribute;
import at.ac.tuwien.big.forms.AttributePageElement;
import at.ac.tuwien.big.forms.AttributeType;
import at.ac.tuwien.big.forms.AttributeValueCondition;
import at.ac.tuwien.big.forms.Column;
import at.ac.tuwien.big.forms.CompositeCondition;
import at.ac.tuwien.big.forms.CompositeConditionType;
import at.ac.tuwien.big.forms.Condition;
import at.ac.tuwien.big.forms.ConditionType;
import at.ac.tuwien.big.forms.DateSelectionField;
import at.ac.tuwien.big.forms.Entity;
import at.ac.tuwien.big.forms.EntityModel;
import at.ac.tuwien.big.forms.EntityModelElement;
import at.ac.tuwien.big.forms.Enumeration;
import at.ac.tuwien.big.forms.Feature;
import at.ac.tuwien.big.forms.Form;
import at.ac.tuwien.big.forms.FormModel;
import at.ac.tuwien.big.forms.FormsFactory;
import at.ac.tuwien.big.forms.FormsPackage;
import at.ac.tuwien.big.forms.List;
import at.ac.tuwien.big.forms.Literal;
import at.ac.tuwien.big.forms.NamedElement;
import at.ac.tuwien.big.forms.Page;
import at.ac.tuwien.big.forms.PageElement;
import at.ac.tuwien.big.forms.Relationship;
import at.ac.tuwien.big.forms.RelationshipPageElement;
import at.ac.tuwien.big.forms.SelectionField;
import at.ac.tuwien.big.forms.Table;
import at.ac.tuwien.big.forms.TextArea;
import at.ac.tuwien.big.forms.TextField;
import at.ac.tuwien.big.forms.TimeSelectionField;

import at.ac.tuwien.big.forms.util.FormsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormsPackageImpl extends EPackageImpl implements FormsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributePageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipPageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateSelectionFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSelectionFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeConditionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.big.forms.FormsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormsPackageImpl() {
		super(eNS_URI, FormsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FormsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormsPackage init() {
		if (isInited) return (FormsPackage)EPackage.Registry.INSTANCE.getEPackage(FormsPackage.eNS_URI);

		// Obtain or create and register package
		FormsPackageImpl theFormsPackage = (FormsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFormsPackage.createPackageContents();

		// Initialize created meta-data
		theFormsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFormsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FormsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFormsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormsPackage.eNS_URI, theFormsPackage);
		return theFormsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Features() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Id() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SuperType() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Mandatory() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Enumeration() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_UpperBound() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_LowerBound() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Opposite() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityModel() {
		return entityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityModel_EntityModelElements() {
		return (EReference)entityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityModelElement() {
		return entityModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormModel() {
		return formModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormModel_Forms() {
		return (EReference)formModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Entity() {
		return (EReference)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Title() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Description() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Pages() {
		return (EReference)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_WelcomeForm() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PageElements() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Condition() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageElement() {
		return pageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageElement_Label() {
		return (EAttribute)pageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageElement_Condition() {
		return (EReference)pageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageElement_ElementID() {
		return (EAttribute)pageElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_Format() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionField() {
		return selectionFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Type() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_ConditionID() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueCondition() {
		return attributeValueConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueCondition_Value() {
		return (EAttribute)attributeValueConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueCondition_Attribute() {
		return (EReference)attributeValueConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCondition() {
		return compositeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCondition_CompositionType() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_ComposedConditions() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributePageElement() {
		return attributePageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributePageElement_Attribute() {
		return (EReference)attributePageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipPageElement() {
		return relationshipPageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipPageElement_Relationship() {
		return (EReference)relationshipPageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipPageElement_EditingForm() {
		return (EReference)relationshipPageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateSelectionField() {
		return dateSelectionFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSelectionField() {
		return timeSelectionFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionType() {
		return conditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositeConditionType() {
		return compositeConditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsFactory getFormsFactory() {
		return (FormsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__FEATURES);
		createEReference(entityEClass, ENTITY__ID);
		createEReference(entityEClass, ENTITY__SUPER_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__MANDATORY);
		createEReference(attributeEClass, ATTRIBUTE__ENUMERATION);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEAttribute(relationshipEClass, RELATIONSHIP__UPPER_BOUND);
		createEAttribute(relationshipEClass, RELATIONSHIP__LOWER_BOUND);
		createEReference(relationshipEClass, RELATIONSHIP__OPPOSITE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__VALUE);

		entityModelEClass = createEClass(ENTITY_MODEL);
		createEReference(entityModelEClass, ENTITY_MODEL__ENTITY_MODEL_ELEMENTS);

		entityModelElementEClass = createEClass(ENTITY_MODEL_ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		formModelEClass = createEClass(FORM_MODEL);
		createEReference(formModelEClass, FORM_MODEL__FORMS);

		formEClass = createEClass(FORM);
		createEReference(formEClass, FORM__ENTITY);
		createEAttribute(formEClass, FORM__TITLE);
		createEAttribute(formEClass, FORM__DESCRIPTION);
		createEReference(formEClass, FORM__PAGES);
		createEAttribute(formEClass, FORM__WELCOME_FORM);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEReference(pageEClass, PAGE__PAGE_ELEMENTS);
		createEReference(pageEClass, PAGE__CONDITION);

		featureEClass = createEClass(FEATURE);

		pageElementEClass = createEClass(PAGE_ELEMENT);
		createEAttribute(pageElementEClass, PAGE_ELEMENT__LABEL);
		createEReference(pageElementEClass, PAGE_ELEMENT__CONDITION);
		createEAttribute(pageElementEClass, PAGE_ELEMENT__ELEMENT_ID);

		textFieldEClass = createEClass(TEXT_FIELD);
		createEAttribute(textFieldEClass, TEXT_FIELD__FORMAT);

		textAreaEClass = createEClass(TEXT_AREA);

		selectionFieldEClass = createEClass(SELECTION_FIELD);

		listEClass = createEClass(LIST);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);

		columnEClass = createEClass(COLUMN);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__TYPE);
		createEAttribute(conditionEClass, CONDITION__CONDITION_ID);

		attributeValueConditionEClass = createEClass(ATTRIBUTE_VALUE_CONDITION);
		createEAttribute(attributeValueConditionEClass, ATTRIBUTE_VALUE_CONDITION__VALUE);
		createEReference(attributeValueConditionEClass, ATTRIBUTE_VALUE_CONDITION__ATTRIBUTE);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__COMPOSITION_TYPE);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__COMPOSED_CONDITIONS);

		attributePageElementEClass = createEClass(ATTRIBUTE_PAGE_ELEMENT);
		createEReference(attributePageElementEClass, ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE);

		relationshipPageElementEClass = createEClass(RELATIONSHIP_PAGE_ELEMENT);
		createEReference(relationshipPageElementEClass, RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP);
		createEReference(relationshipPageElementEClass, RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM);

		dateSelectionFieldEClass = createEClass(DATE_SELECTION_FIELD);

		timeSelectionFieldEClass = createEClass(TIME_SELECTION_FIELD);

		// Create enums
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		conditionTypeEEnum = createEEnum(CONDITION_TYPE);
		compositeConditionTypeEEnum = createEEnum(COMPOSITE_CONDITION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getEntityModelElement());
		entityEClass.getESuperTypes().add(this.getNamedElement());
		attributeEClass.getESuperTypes().add(this.getFeature());
		relationshipEClass.getESuperTypes().add(this.getFeature());
		enumerationEClass.getESuperTypes().add(this.getEntityModelElement());
		enumerationEClass.getESuperTypes().add(this.getNamedElement());
		literalEClass.getESuperTypes().add(this.getNamedElement());
		formEClass.getESuperTypes().add(this.getNamedElement());
		featureEClass.getESuperTypes().add(this.getNamedElement());
		textFieldEClass.getESuperTypes().add(this.getAttributePageElement());
		textAreaEClass.getESuperTypes().add(this.getAttributePageElement());
		selectionFieldEClass.getESuperTypes().add(this.getAttributePageElement());
		listEClass.getESuperTypes().add(this.getRelationshipPageElement());
		tableEClass.getESuperTypes().add(this.getRelationshipPageElement());
		columnEClass.getESuperTypes().add(this.getAttributePageElement());
		attributeValueConditionEClass.getESuperTypes().add(this.getCondition());
		compositeConditionEClass.getESuperTypes().add(this.getCondition());
		attributePageElementEClass.getESuperTypes().add(this.getPageElement());
		relationshipPageElementEClass.getESuperTypes().add(this.getPageElement());
		dateSelectionFieldEClass.getESuperTypes().add(this.getAttributePageElement());
		timeSelectionFieldEClass.getESuperTypes().add(this.getAttributePageElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Id(), this.getAttribute(), null, "id", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SuperType(), this.getEntity(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Type(), this.getAttributeType(), "type", "None", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Enumeration(), this.getEnumeration(), null, "enumeration", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Target(), this.getEntity(), null, "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_LowerBound(), ecorePackage.getEInt(), "lowerBound", "1", 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Opposite(), this.getRelationship(), null, "opposite", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getLiteral(), null, "literals", null, 1, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityModelEClass, EntityModel.class, "EntityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityModel_EntityModelElements(), this.getEntityModelElement(), null, "entityModelElements", null, 0, -1, EntityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityModelElementEClass, EntityModelElement.class, "EntityModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formModelEClass, FormModel.class, "FormModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormModel_Forms(), this.getForm(), null, "forms", null, 0, -1, FormModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForm_Entity(), this.getEntity(), null, "entity", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Title(), ecorePackage.getEString(), "title", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Description(), ecorePackage.getEString(), "description", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Pages(), this.getPage(), null, "pages", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_WelcomeForm(), ecorePackage.getEBoolean(), "welcomeForm", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_PageElements(), this.getPageElement(), null, "pageElements", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Condition(), this.getCondition(), null, "condition", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageElementEClass, PageElement.class, "PageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPageElement_Label(), ecorePackage.getEString(), "label", null, 1, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageElement_Condition(), this.getCondition(), null, "condition", null, 0, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageElement_ElementID(), ecorePackage.getEString(), "elementID", null, 1, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextField_Format(), ecorePackage.getEString(), "format", null, 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionFieldEClass, SelectionField.class, "SelectionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Type(), this.getConditionType(), "type", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_ConditionID(), ecorePackage.getEString(), "conditionID", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueConditionEClass, AttributeValueCondition.class, "AttributeValueCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueCondition_Value(), ecorePackage.getEString(), "value", null, 1, 1, AttributeValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueCondition_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, AttributeValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeCondition_CompositionType(), this.getCompositeConditionType(), "compositionType", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCondition_ComposedConditions(), this.getCondition(), null, "composedConditions", null, 2, 2, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributePageElementEClass, AttributePageElement.class, "AttributePageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributePageElement_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, AttributePageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipPageElementEClass, RelationshipPageElement.class, "RelationshipPageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipPageElement_Relationship(), this.getRelationship(), null, "relationship", null, 1, 1, RelationshipPageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipPageElement_EditingForm(), this.getForm(), null, "editingForm", null, 1, 1, RelationshipPageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateSelectionFieldEClass, DateSelectionField.class, "DateSelectionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeSelectionFieldEClass, TimeSelectionField.class, "TimeSelectionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.INTEGER);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.TEXT);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.DATE);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.TIME);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.EMAIL);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.BOOLEAN);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.YEAR);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.NONE);

		initEEnum(conditionTypeEEnum, ConditionType.class, "ConditionType");
		addEEnumLiteral(conditionTypeEEnum, ConditionType.HIDE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.SHOW);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.ENABLE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.DISABLE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.NONE);

		initEEnum(compositeConditionTypeEEnum, CompositeConditionType.class, "CompositeConditionType");
		addEEnumLiteral(compositeConditionTypeEEnum, CompositeConditionType.AND);
		addEEnumLiteral(compositeConditionTypeEEnum, CompositeConditionType.OR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "constraints", "EntityNameIsUnique FeatureInEntityIsUnique NoSelfInheritance"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "AttributeTypeIsValid"
		   });	
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "RelationshipMultiplicityIsValid OppositeRelationshipsReferenceEachOther OppositeRelationshipTypeIsValid"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "constraints", "EnumerationNameIsUnique LiteralInEnumerationIsUnique"
		   });	
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "constraints", "FirstLetterInFormTitleIsUpperCase ExactlyOneWelcomePageExists PageElementsReferToFormEntityFeatures AttributeOfConditionIsValid"
		   });	
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "constraints", "FirstLetterInPageTitleIsUpperCase"
		   });	
		addAnnotation
		  (pageElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ElementIDIsUnique"
		   });	
		addAnnotation
		  (selectionFieldEClass, 
		   source, 
		   new String[] {
			 "constraints", "SelectionFieldAttributeTypeIsValid"
		   });	
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "constraints", "TableColumnRefersToTargetEntityFeature"
		   });	
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConditionIDIsUnique"
		   });	
		addAnnotation
		  (compositeConditionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ComposedConditionTypesAreEqual"
		   });	
		addAnnotation
		  (relationshipPageElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "EditingFormIsNotWelcomeForm EditingFormRefersToRelationshipTarget"
		   });	
		addAnnotation
		  (dateSelectionFieldEClass, 
		   source, 
		   new String[] {
			 "constraints", "DateIsValid"
		   });	
		addAnnotation
		  (timeSelectionFieldEClass, 
		   source, 
		   new String[] {
			 "constraints", "TimeIsValid"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "EntityNameIsUnique", "Entity.allInstances() -> select(n | n.name = self.name) ->excluding(self) ->isEmpty()",
			 "FeatureInEntityIsUnique", "features -> forAll(e1, e2 | e1 <> e2 implies e1.name <> e2.name)",
			 "NoSelfInheritance", "self.superType <> self"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "AttributeTypeIsValid", "self.type <> AttributeType::None xor self.enumeration <> null"
		   });	
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "RelationshipMultiplicityIsValid", "self.lowerBound >= 0 and (self.upperBound >= lowerBound or self.upperBound = -1)",
			 "OppositeRelationshipsReferenceEachOther", "self.opposite -> forAll(o | o.opposite = self)",
			 "OppositeRelationshipTypeIsValid", "self.opposite <> null implies self.target = Entity.allInstances() -> select(e | e.features -> select(f | f.oclIsKindOf(Relationship)) -> includes(self.opposite)) -> asOrderedSet() -> first()"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "EnumerationNameIsUnique", "Enumeration.allInstances() -> select(n | n.name = self.name) ->excluding(self) ->isEmpty()",
			 "LiteralInEnumerationIsUnique", "literals -> forAll(e1, e2 | e1 <> e2 implies e1.name <> e2.name)"
		   });	
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "FirstLetterInFormTitleIsUpperCase", "self.title.at(1).matches(\'[A-Z]\')",
			 "ExactlyOneWelcomePageExists", "Form.allInstances() -> select(f | f.welcomeForm = true) -> size() = 1",
			 "PageElementsReferToFormEntityFeatures", "self.entity.features -> union(self.entity -> closure(superType).features) -> includesAll(self.pages.pageElements -> selectByKind(AttributePageElement).attribute.oclAsType(Feature) -> union(self.pages.pageElements -> selectByKind(RelationshipPageElement).relationship.oclAsType(Feature)))",
			 "AttributeOfConditionIsValid", "\n\t\t(self.pages.pageElements -> selectByKind(AttributePageElement).attribute)\n\t\t-> includesAll(\n\t\tself.pages.condition -> selectByKind(CompositeCondition) -> closure(v:CompositeCondition | v.composedConditions -> \n\t\tselectByKind(CompositeCondition)) -> collect(v:CompositeCondition|v.composedConditions) -> \n\t\tselectByKind(AttributeValueCondition).attribute -> union(self.pages.condition -> \n\t\tselectByKind(AttributeValueCondition).attribute) -> union(self.pages.condition -> \n\t\tselectByKind(CompositeCondition).composedConditions -> selectByKind(AttributeValueCondition).attribute)\n\t\t-> union(\n\t\tself.pages.pageElements.condition -> selectByKind(CompositeCondition) -> closure(v:CompositeCondition | v.composedConditions -> \n\t\tselectByKind(CompositeCondition)) -> collect(v:CompositeCondition|v.composedConditions) -> \n\t\tselectByKind(AttributeValueCondition).attribute -> union(self.pages.pageElements.condition -> \n\t\tselectByKind(AttributeValueCondition).attribute) -> union(self.pages.pageElements.condition -> \n\t\tselectByKind(CompositeCondition).composedConditions -> selectByKind(AttributeValueCondition).attribute)\n\t\t))"
		   });	
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "FirstLetterInPageTitleIsUpperCase", "self.title.at(1).matches(\'[A-Z]\')"
		   });	
		addAnnotation
		  (pageElementEClass, 
		   source, 
		   new String[] {
			 "ElementIDIsUnique", "PageElement.allInstances() -> select(n | n.elementID = self.elementID) ->excluding(self) ->isEmpty()"
		   });	
		addAnnotation
		  (selectionFieldEClass, 
		   source, 
		   new String[] {
			 "SelectionFieldAttributeTypeIsValid", "self.attribute.type = AttributeType::Boolean or self.attribute.enumeration <> null"
		   });	
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "TableColumnRefersToTargetEntityFeature", "self.editingForm.entity.features -> union(self.editingForm.entity -> closure(superType).features) -> includesAll(self.columns.attribute)"
		   });	
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "ConditionIDIsUnique", "Condition.allInstances() -> select(n | n.conditionID = self.conditionID) ->excluding(self) ->isEmpty()"
		   });	
		addAnnotation
		  (compositeConditionEClass, 
		   source, 
		   new String[] {
			 "ComposedConditionTypesAreEqual", "self.composedConditions -> forAll(c | c.type = self.type)"
		   });	
		addAnnotation
		  (relationshipPageElementEClass, 
		   source, 
		   new String[] {
			 "EditingFormIsNotWelcomeForm", "self.editingForm.welcomeForm = false",
			 "EditingFormRefersToRelationshipTarget", "self.relationship.target = self.editingForm.entity"
		   });	
		addAnnotation
		  (dateSelectionFieldEClass, 
		   source, 
		   new String[] {
			 "DateIsValid", "self.attribute.type = AttributeType::Date"
		   });	
		addAnnotation
		  (timeSelectionFieldEClass, 
		   source, 
		   new String[] {
			 "TimeIsValid", "self.attribute.type = AttributeType::Time"
		   });
	}

} //FormsPackageImpl
