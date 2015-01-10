/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.forms.FormsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FormsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.big.tuwien.ac.at/forms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsPackage eINSTANCE = at.ac.tuwien.big.forms.impl.FormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.EntityModelElementImpl <em>Entity Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.EntityModelElementImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEntityModelElement()
	 * @generated
	 */
	int ENTITY_MODEL_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Entity Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.EntityImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FEATURES = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_TYPE = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ENTITY_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.NamedElementImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.FeatureImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.AttributeImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MANDATORY = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENUMERATION = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.RelationshipImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UPPER_BOUND = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LOWER_BOUND = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OPPOSITE = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.EnumerationImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = ENTITY_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = ENTITY_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.LiteralImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.EntityModelImpl <em>Entity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.EntityModelImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEntityModel()
	 * @generated
	 */
	int ENTITY_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Entity Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__ENTITY_MODEL_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Entity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.FormModelImpl <em>Form Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.FormModelImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getFormModel()
	 * @generated
	 */
	int FORM_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL__FORMS = 0;

	/**
	 * The number of structural features of the '<em>Form Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.FormImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PAGES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Welcome Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__WELCOME_FORM = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.PageImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Page Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.PageElementImpl <em>Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.PageElementImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getPageElement()
	 * @generated
	 */
	int PAGE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__ELEMENT_ID = 2;

	/**
	 * The number of structural features of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.AttributePageElementImpl <em>Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.AttributePageElementImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttributePageElement()
	 * @generated
	 */
	int ATTRIBUTE_PAGE_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__LABEL = PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__CONDITION = PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.TextFieldImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__FORMAT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.TextAreaImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.SelectionFieldImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getSelectionField()
	 * @generated
	 */
	int SELECTION_FIELD = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.RelationshipPageElementImpl <em>Relationship Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.RelationshipPageElementImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getRelationshipPageElement()
	 * @generated
	 */
	int RELATIONSHIP_PAGE_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__LABEL = PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__CONDITION = PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.ListImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LABEL = RELATIONSHIP_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONDITION = RELATIONSHIP_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT_ID = RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__RELATIONSHIP = RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__EDITING_FORM = RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.TableImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LABEL = RELATIONSHIP_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONDITION = RELATIONSHIP_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ELEMENT_ID = RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RELATIONSHIP = RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__EDITING_FORM = RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.ColumnImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.ConditionImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_ID = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.AttributeValueConditionImpl <em>Attribute Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.AttributeValueConditionImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttributeValueCondition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_CONDITION = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__TYPE = CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__ATTRIBUTE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.CompositeConditionImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__TYPE = CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Composition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__COMPOSITION_TYPE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__COMPOSED_CONDITIONS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.DateSelectionFieldImpl <em>Date Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.DateSelectionFieldImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getDateSelectionField()
	 * @generated
	 */
	int DATE_SELECTION_FIELD = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Date Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.impl.TimeSelectionFieldImpl <em>Time Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.impl.TimeSelectionFieldImpl
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTimeSelectionField()
	 * @generated
	 */
	int TIME_SELECTION_FIELD = 25;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Time Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.AttributeType
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 26;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.ConditionType <em>Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.ConditionType
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 27;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.forms.CompositeConditionType <em>Composite Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.forms.CompositeConditionType
	 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getCompositeConditionType()
	 * @generated
	 */
	int COMPOSITE_CONDITION_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see at.ac.tuwien.big.forms.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.Entity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see at.ac.tuwien.big.forms.Entity#getFeatures()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Features();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see at.ac.tuwien.big.forms.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Id();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.Entity#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see at.ac.tuwien.big.forms.Entity#getSuperType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see at.ac.tuwien.big.forms.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.ac.tuwien.big.forms.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Attribute#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see at.ac.tuwien.big.forms.Attribute#isMandatory()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mandatory();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.Attribute#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see at.ac.tuwien.big.forms.Attribute#getEnumeration()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Enumeration();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see at.ac.tuwien.big.forms.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see at.ac.tuwien.big.forms.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Relationship#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see at.ac.tuwien.big.forms.Relationship#getUpperBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Relationship#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see at.ac.tuwien.big.forms.Relationship#getLowerBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_LowerBound();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.Relationship#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see at.ac.tuwien.big.forms.Relationship#getOpposite()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Opposite();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see at.ac.tuwien.big.forms.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see at.ac.tuwien.big.forms.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see at.ac.tuwien.big.forms.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.tuwien.big.forms.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.EntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Model</em>'.
	 * @see at.ac.tuwien.big.forms.EntityModel
	 * @generated
	 */
	EClass getEntityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.EntityModel#getEntityModelElements <em>Entity Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Model Elements</em>'.
	 * @see at.ac.tuwien.big.forms.EntityModel#getEntityModelElements()
	 * @see #getEntityModel()
	 * @generated
	 */
	EReference getEntityModel_EntityModelElements();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.EntityModelElement <em>Entity Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Model Element</em>'.
	 * @see at.ac.tuwien.big.forms.EntityModelElement
	 * @generated
	 */
	EClass getEntityModelElement();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see at.ac.tuwien.big.forms.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.forms.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.FormModel <em>Form Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Model</em>'.
	 * @see at.ac.tuwien.big.forms.FormModel
	 * @generated
	 */
	EClass getFormModel();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.FormModel#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see at.ac.tuwien.big.forms.FormModel#getForms()
	 * @see #getFormModel()
	 * @generated
	 */
	EReference getFormModel_Forms();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see at.ac.tuwien.big.forms.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.Form#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see at.ac.tuwien.big.forms.Form#getEntity()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Entity();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Form#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.ac.tuwien.big.forms.Form#getTitle()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Title();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Form#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see at.ac.tuwien.big.forms.Form#getDescription()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.Form#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see at.ac.tuwien.big.forms.Form#getPages()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Pages();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Form#isWelcomeForm <em>Welcome Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcome Form</em>'.
	 * @see at.ac.tuwien.big.forms.Form#isWelcomeForm()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_WelcomeForm();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see at.ac.tuwien.big.forms.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.ac.tuwien.big.forms.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.Page#getPageElements <em>Page Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Elements</em>'.
	 * @see at.ac.tuwien.big.forms.Page#getPageElements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PageElements();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.forms.Page#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see at.ac.tuwien.big.forms.Page#getCondition()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Condition();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see at.ac.tuwien.big.forms.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Element</em>'.
	 * @see at.ac.tuwien.big.forms.PageElement
	 * @generated
	 */
	EClass getPageElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.PageElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see at.ac.tuwien.big.forms.PageElement#getLabel()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_Label();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.forms.PageElement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see at.ac.tuwien.big.forms.PageElement#getCondition()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_Condition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.PageElement#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see at.ac.tuwien.big.forms.PageElement#getElementID()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_ElementID();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see at.ac.tuwien.big.forms.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.TextField#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see at.ac.tuwien.big.forms.TextField#getFormat()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Format();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see at.ac.tuwien.big.forms.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.SelectionField <em>Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Field</em>'.
	 * @see at.ac.tuwien.big.forms.SelectionField
	 * @generated
	 */
	EClass getSelectionField();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see at.ac.tuwien.big.forms.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see at.ac.tuwien.big.forms.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see at.ac.tuwien.big.forms.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see at.ac.tuwien.big.forms.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see at.ac.tuwien.big.forms.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Condition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.ac.tuwien.big.forms.Condition#getType()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Type();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.Condition#getConditionID <em>Condition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition ID</em>'.
	 * @see at.ac.tuwien.big.forms.Condition#getConditionID()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ConditionID();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.AttributeValueCondition <em>Attribute Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Condition</em>'.
	 * @see at.ac.tuwien.big.forms.AttributeValueCondition
	 * @generated
	 */
	EClass getAttributeValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.AttributeValueCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.tuwien.big.forms.AttributeValueCondition#getValue()
	 * @see #getAttributeValueCondition()
	 * @generated
	 */
	EAttribute getAttributeValueCondition_Value();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.AttributeValueCondition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see at.ac.tuwien.big.forms.AttributeValueCondition#getAttribute()
	 * @see #getAttributeValueCondition()
	 * @generated
	 */
	EReference getAttributeValueCondition_Attribute();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see at.ac.tuwien.big.forms.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.forms.CompositeCondition#getCompositionType <em>Composition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition Type</em>'.
	 * @see at.ac.tuwien.big.forms.CompositeCondition#getCompositionType()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_CompositionType();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.forms.CompositeCondition#getComposedConditions <em>Composed Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Conditions</em>'.
	 * @see at.ac.tuwien.big.forms.CompositeCondition#getComposedConditions()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_ComposedConditions();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.AttributePageElement <em>Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Page Element</em>'.
	 * @see at.ac.tuwien.big.forms.AttributePageElement
	 * @generated
	 */
	EClass getAttributePageElement();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.AttributePageElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see at.ac.tuwien.big.forms.AttributePageElement#getAttribute()
	 * @see #getAttributePageElement()
	 * @generated
	 */
	EReference getAttributePageElement_Attribute();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.RelationshipPageElement <em>Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Page Element</em>'.
	 * @see at.ac.tuwien.big.forms.RelationshipPageElement
	 * @generated
	 */
	EClass getRelationshipPageElement();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.RelationshipPageElement#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see at.ac.tuwien.big.forms.RelationshipPageElement#getRelationship()
	 * @see #getRelationshipPageElement()
	 * @generated
	 */
	EReference getRelationshipPageElement_Relationship();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.forms.RelationshipPageElement#getEditingForm <em>Editing Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Editing Form</em>'.
	 * @see at.ac.tuwien.big.forms.RelationshipPageElement#getEditingForm()
	 * @see #getRelationshipPageElement()
	 * @generated
	 */
	EReference getRelationshipPageElement_EditingForm();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.DateSelectionField <em>Date Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Selection Field</em>'.
	 * @see at.ac.tuwien.big.forms.DateSelectionField
	 * @generated
	 */
	EClass getDateSelectionField();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.forms.TimeSelectionField <em>Time Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Selection Field</em>'.
	 * @see at.ac.tuwien.big.forms.TimeSelectionField
	 * @generated
	 */
	EClass getTimeSelectionField();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.forms.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see at.ac.tuwien.big.forms.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.forms.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Type</em>'.
	 * @see at.ac.tuwien.big.forms.ConditionType
	 * @generated
	 */
	EEnum getConditionType();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.forms.CompositeConditionType <em>Composite Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Condition Type</em>'.
	 * @see at.ac.tuwien.big.forms.CompositeConditionType
	 * @generated
	 */
	EEnum getCompositeConditionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormsFactory getFormsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.EntityImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.AttributeImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MANDATORY = eINSTANCE.getAttribute_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ENUMERATION = eINSTANCE.getAttribute_Enumeration();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.RelationshipImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__UPPER_BOUND = eINSTANCE.getRelationship_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__LOWER_BOUND = eINSTANCE.getRelationship_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__OPPOSITE = eINSTANCE.getRelationship_Opposite();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.EnumerationImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.LiteralImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.EntityModelImpl <em>Entity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.EntityModelImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEntityModel()
		 * @generated
		 */
		EClass ENTITY_MODEL = eINSTANCE.getEntityModel();

		/**
		 * The meta object literal for the '<em><b>Entity Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MODEL__ENTITY_MODEL_ELEMENTS = eINSTANCE.getEntityModel_EntityModelElements();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.EntityModelElementImpl <em>Entity Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.EntityModelElementImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getEntityModelElement()
		 * @generated
		 */
		EClass ENTITY_MODEL_ELEMENT = eINSTANCE.getEntityModelElement();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.NamedElementImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.FormModelImpl <em>Form Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.FormModelImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getFormModel()
		 * @generated
		 */
		EClass FORM_MODEL = eINSTANCE.getFormModel();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_MODEL__FORMS = eINSTANCE.getFormModel_Forms();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.FormImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ENTITY = eINSTANCE.getForm_Entity();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__TITLE = eINSTANCE.getForm_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__DESCRIPTION = eINSTANCE.getForm_Description();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__PAGES = eINSTANCE.getForm_Pages();

		/**
		 * The meta object literal for the '<em><b>Welcome Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__WELCOME_FORM = eINSTANCE.getForm_WelcomeForm();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.PageImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Page Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_ELEMENTS = eINSTANCE.getPage_PageElements();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONDITION = eINSTANCE.getPage_Condition();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.FeatureImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.PageElementImpl <em>Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.PageElementImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getPageElement()
		 * @generated
		 */
		EClass PAGE_ELEMENT = eINSTANCE.getPageElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__LABEL = eINSTANCE.getPageElement_Label();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__CONDITION = eINSTANCE.getPageElement_Condition();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__ELEMENT_ID = eINSTANCE.getPageElement_ElementID();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.TextFieldImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__FORMAT = eINSTANCE.getTextField_Format();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.TextAreaImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.SelectionFieldImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getSelectionField()
		 * @generated
		 */
		EClass SELECTION_FIELD = eINSTANCE.getSelectionField();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.ListImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.TableImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.ColumnImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.ConditionImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TYPE = eINSTANCE.getCondition_Type();

		/**
		 * The meta object literal for the '<em><b>Condition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION_ID = eINSTANCE.getCondition_ConditionID();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.AttributeValueConditionImpl <em>Attribute Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.AttributeValueConditionImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttributeValueCondition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_CONDITION = eINSTANCE.getAttributeValueCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_CONDITION__VALUE = eINSTANCE.getAttributeValueCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CONDITION__ATTRIBUTE = eINSTANCE.getAttributeValueCondition_Attribute();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.CompositeConditionImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Composition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__COMPOSITION_TYPE = eINSTANCE.getCompositeCondition_CompositionType();

		/**
		 * The meta object literal for the '<em><b>Composed Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__COMPOSED_CONDITIONS = eINSTANCE.getCompositeCondition_ComposedConditions();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.AttributePageElementImpl <em>Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.AttributePageElementImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttributePageElement()
		 * @generated
		 */
		EClass ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getAttributePageElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = eINSTANCE.getAttributePageElement_Attribute();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.RelationshipPageElementImpl <em>Relationship Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.RelationshipPageElementImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getRelationshipPageElement()
		 * @generated
		 */
		EClass RELATIONSHIP_PAGE_ELEMENT = eINSTANCE.getRelationshipPageElement();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP = eINSTANCE.getRelationshipPageElement_Relationship();

		/**
		 * The meta object literal for the '<em><b>Editing Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = eINSTANCE.getRelationshipPageElement_EditingForm();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.DateSelectionFieldImpl <em>Date Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.DateSelectionFieldImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getDateSelectionField()
		 * @generated
		 */
		EClass DATE_SELECTION_FIELD = eINSTANCE.getDateSelectionField();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.impl.TimeSelectionFieldImpl <em>Time Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.impl.TimeSelectionFieldImpl
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getTimeSelectionField()
		 * @generated
		 */
		EClass TIME_SELECTION_FIELD = eINSTANCE.getTimeSelectionField();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.AttributeType
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.ConditionType <em>Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.ConditionType
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getConditionType()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.forms.CompositeConditionType <em>Composite Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.forms.CompositeConditionType
		 * @see at.ac.tuwien.big.forms.impl.FormsPackageImpl#getCompositeConditionType()
		 * @generated
		 */
		EEnum COMPOSITE_CONDITION_TYPE = eINSTANCE.getCompositeConditionType();

	}

} //FormsPackage
