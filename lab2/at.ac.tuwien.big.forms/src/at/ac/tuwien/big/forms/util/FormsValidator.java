/**
 */
package at.ac.tuwien.big.forms.util;

import at.ac.tuwien.big.forms.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.forms.FormsPackage
 * @generated
 */
public class FormsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FormsValidator INSTANCE = new FormsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at.ac.tuwien.big.forms";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FormsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FormsPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case FormsPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case FormsPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case FormsPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case FormsPackage.ENTITY_MODEL:
				return validateEntityModel((EntityModel)value, diagnostics, context);
			case FormsPackage.ENTITY_MODEL_ELEMENT:
				return validateEntityModelElement((EntityModelElement)value, diagnostics, context);
			case FormsPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case FormsPackage.FORM_MODEL:
				return validateFormModel((FormModel)value, diagnostics, context);
			case FormsPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case FormsPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case FormsPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case FormsPackage.PAGE_ELEMENT:
				return validatePageElement((PageElement)value, diagnostics, context);
			case FormsPackage.TEXT_FIELD:
				return validateTextField((TextField)value, diagnostics, context);
			case FormsPackage.TEXT_AREA:
				return validateTextArea((TextArea)value, diagnostics, context);
			case FormsPackage.SELECTION_FIELD:
				return validateSelectionField((SelectionField)value, diagnostics, context);
			case FormsPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case FormsPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case FormsPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case FormsPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE_VALUE_CONDITION:
				return validateAttributeValueCondition((AttributeValueCondition)value, diagnostics, context);
			case FormsPackage.COMPOSITE_CONDITION:
				return validateCompositeCondition((CompositeCondition)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE_PAGE_ELEMENT:
				return validateAttributePageElement((AttributePageElement)value, diagnostics, context);
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT:
				return validateRelationshipPageElement((RelationshipPageElement)value, diagnostics, context);
			case FormsPackage.DATE_SELECTION_FIELD:
				return validateDateSelectionField((DateSelectionField)value, diagnostics, context);
			case FormsPackage.TIME_SELECTION_FIELD:
				return validateTimeSelectionField((TimeSelectionField)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			case FormsPackage.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case FormsPackage.COMPOSITE_CONDITION_TYPE:
				return validateCompositeConditionType((CompositeConditionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_EntityNameIsUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_FeatureInEntityIsUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_NoSelfInheritance(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EntityNameIsUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__ENTITY_NAME_IS_UNIQUE__EEXPRESSION = "Entity.allInstances() -> select(n | n.name = self.name) ->excluding(self) ->isEmpty()";

	/**
	 * Validates the EntityNameIsUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_EntityNameIsUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EntityNameIsUnique",
				 ENTITY__ENTITY_NAME_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FeatureInEntityIsUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__FEATURE_IN_ENTITY_IS_UNIQUE__EEXPRESSION = "features -> forAll(e1, e2 | e1 <> e2 implies e1.name <> e2.name)";

	/**
	 * Validates the FeatureInEntityIsUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_FeatureInEntityIsUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FeatureInEntityIsUnique",
				 ENTITY__FEATURE_IN_ENTITY_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoSelfInheritance constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NO_SELF_INHERITANCE__EEXPRESSION = "self.superType <> self";

	/**
	 * Validates the NoSelfInheritance constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_NoSelfInheritance(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoSelfInheritance",
				 ENTITY__NO_SELF_INHERITANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_AttributeTypeIsValid(attribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AttributeTypeIsValid constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__ATTRIBUTE_TYPE_IS_VALID__EEXPRESSION = "self.type <> AttributeType::None xor self.enumeration <> null";

	/**
	 * Validates the AttributeTypeIsValid constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_AttributeTypeIsValid(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributeTypeIsValid",
				 ATTRIBUTE__ATTRIBUTE_TYPE_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_RelationshipMultiplicityIsValid(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_OppositeRelationshipsReferenceEachOther(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_OppositeRelationshipTypeIsValid(relationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RelationshipMultiplicityIsValid constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__RELATIONSHIP_MULTIPLICITY_IS_VALID__EEXPRESSION = "self.lowerBound >= 0 and (self.upperBound >= lowerBound or self.upperBound = -1)";

	/**
	 * Validates the RelationshipMultiplicityIsValid constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_RelationshipMultiplicityIsValid(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RelationshipMultiplicityIsValid",
				 RELATIONSHIP__RELATIONSHIP_MULTIPLICITY_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OppositeRelationshipsReferenceEachOther constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__OPPOSITE_RELATIONSHIPS_REFERENCE_EACH_OTHER__EEXPRESSION = "self.opposite -> forAll(o | o.opposite = self)";

	/**
	 * Validates the OppositeRelationshipsReferenceEachOther constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_OppositeRelationshipsReferenceEachOther(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OppositeRelationshipsReferenceEachOther",
				 RELATIONSHIP__OPPOSITE_RELATIONSHIPS_REFERENCE_EACH_OTHER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OppositeRelationshipTypeIsValid constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__OPPOSITE_RELATIONSHIP_TYPE_IS_VALID__EEXPRESSION = "self.opposite <> null implies self.target = Entity.allInstances() -> select(e | e.features -> select(f | f.oclIsKindOf(Relationship)) -> includes(self.opposite)) -> asOrderedSet() -> first()";

	/**
	 * Validates the OppositeRelationshipTypeIsValid constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_OppositeRelationshipTypeIsValid(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OppositeRelationshipTypeIsValid",
				 RELATIONSHIP__OPPOSITE_RELATIONSHIP_TYPE_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeration_EnumerationNameIsUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeration_LiteralInEnumerationIsUnique(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EnumerationNameIsUnique constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUMERATION__ENUMERATION_NAME_IS_UNIQUE__EEXPRESSION = "Enumeration.allInstances() -> select(n | n.name = self.name) ->excluding(self) ->isEmpty()";

	/**
	 * Validates the EnumerationNameIsUnique constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration_EnumerationNameIsUnique(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENUMERATION,
				 enumeration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EnumerationNameIsUnique",
				 ENUMERATION__ENUMERATION_NAME_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LiteralInEnumerationIsUnique constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUMERATION__LITERAL_IN_ENUMERATION_IS_UNIQUE__EEXPRESSION = "literals -> forAll(e1, e2 | e1 <> e2 implies e1.name <> e2.name)";

	/**
	 * Validates the LiteralInEnumerationIsUnique constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration_LiteralInEnumerationIsUnique(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENUMERATION,
				 enumeration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LiteralInEnumerationIsUnique",
				 ENUMERATION__LITERAL_IN_ENUMERATION_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityModel(EntityModel entityModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityModelElement(EntityModelElement entityModelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityModelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormModel(FormModel formModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(form, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_FirstLetterInFormTitleIsUpperCase(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_ExactlyOneWelcomePageExists(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_PageElementsReferToFormEntityFeatures(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_AttributeOfConditionIsValid(form, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FirstLetterInFormTitleIsUpperCase constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__FIRST_LETTER_IN_FORM_TITLE_IS_UPPER_CASE__EEXPRESSION = "self.title.at(1).matches('[A-Z]')";

	/**
	 * Validates the FirstLetterInFormTitleIsUpperCase constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_FirstLetterInFormTitleIsUpperCase(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FirstLetterInFormTitleIsUpperCase",
				 FORM__FIRST_LETTER_IN_FORM_TITLE_IS_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExactlyOneWelcomePageExists constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__EXACTLY_ONE_WELCOME_PAGE_EXISTS__EEXPRESSION = "Form.allInstances() -> select(f | f.welcomeForm = true) -> size() = 1";

	/**
	 * Validates the ExactlyOneWelcomePageExists constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_ExactlyOneWelcomePageExists(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExactlyOneWelcomePageExists",
				 FORM__EXACTLY_ONE_WELCOME_PAGE_EXISTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PageElementsReferToFormEntityFeatures constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__PAGE_ELEMENTS_REFER_TO_FORM_ENTITY_FEATURES__EEXPRESSION = "self.entity.features -> union(self.entity -> closure(superType).features) -> includesAll(self.pages.pageElements -> selectByKind(AttributePageElement).attribute.oclAsType(Feature) -> union(self.pages.pageElements -> selectByKind(RelationshipPageElement).relationship.oclAsType(Feature)))";

	/**
	 * Validates the PageElementsReferToFormEntityFeatures constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_PageElementsReferToFormEntityFeatures(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PageElementsReferToFormEntityFeatures",
				 FORM__PAGE_ELEMENTS_REFER_TO_FORM_ENTITY_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AttributeOfConditionIsValid constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__ATTRIBUTE_OF_CONDITION_IS_VALID__EEXPRESSION = "\n" +
		"\t\t(self.pages.pageElements -> selectByKind(AttributePageElement).attribute)\n" +
		"\t\t-> includesAll(\n" +
		"\t\tself.pages.condition -> selectByKind(CompositeCondition) -> closure(v:CompositeCondition | v.composedConditions -> \n" +
		"\t\tselectByKind(CompositeCondition)) -> collect(v:CompositeCondition|v.composedConditions) -> \n" +
		"\t\tselectByKind(AttributeValueCondition).attribute -> union(self.pages.condition -> \n" +
		"\t\tselectByKind(AttributeValueCondition).attribute) -> union(self.pages.condition -> \n" +
		"\t\tselectByKind(CompositeCondition).composedConditions -> selectByKind(AttributeValueCondition).attribute)\n" +
		"\t\t-> union(\n" +
		"\t\tself.pages.pageElements.condition -> selectByKind(CompositeCondition) -> closure(v:CompositeCondition | v.composedConditions -> \n" +
		"\t\tselectByKind(CompositeCondition)) -> collect(v:CompositeCondition|v.composedConditions) -> \n" +
		"\t\tselectByKind(AttributeValueCondition).attribute -> union(self.pages.pageElements.condition -> \n" +
		"\t\tselectByKind(AttributeValueCondition).attribute) -> union(self.pages.pageElements.condition -> \n" +
		"\t\tselectByKind(CompositeCondition).composedConditions -> selectByKind(AttributeValueCondition).attribute)\n" +
		"\t\t))";

	/**
	 * Validates the AttributeOfConditionIsValid constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_AttributeOfConditionIsValid(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributeOfConditionIsValid",
				 FORM__ATTRIBUTE_OF_CONDITION_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_FirstLetterInPageTitleIsUpperCase(page, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FirstLetterInPageTitleIsUpperCase constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__FIRST_LETTER_IN_PAGE_TITLE_IS_UPPER_CASE__EEXPRESSION = "self.title.at(1).matches('[A-Z]')";

	/**
	 * Validates the FirstLetterInPageTitleIsUpperCase constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_FirstLetterInPageTitleIsUpperCase(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FirstLetterInPageTitleIsUpperCase",
				 PAGE__FIRST_LETTER_IN_PAGE_TITLE_IS_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(pageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ElementIDIsUnique constraint of '<em>Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE_ELEMENT__ELEMENT_ID_IS_UNIQUE__EEXPRESSION = "PageElement.allInstances() -> select(n | n.elementID = self.elementID) ->excluding(self) ->isEmpty()";

	/**
	 * Validates the ElementIDIsUnique constraint of '<em>Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement_ElementIDIsUnique(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.PAGE_ELEMENT,
				 pageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ElementIDIsUnique",
				 PAGE_ELEMENT__ELEMENT_ID_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(textField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextArea(TextArea textArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textArea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textArea, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(textArea, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionField(SelectionField selectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionField_SelectionFieldAttributeTypeIsValid(selectionField, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SelectionFieldAttributeTypeIsValid constraint of '<em>Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_FIELD__SELECTION_FIELD_ATTRIBUTE_TYPE_IS_VALID__EEXPRESSION = "self.attribute.type = AttributeType::Boolean or self.attribute.enumeration <> null";

	/**
	 * Validates the SelectionFieldAttributeTypeIsValid constraint of '<em>Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionField_SelectionFieldAttributeTypeIsValid(SelectionField selectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.SELECTION_FIELD,
				 selectionField,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SelectionFieldAttributeTypeIsValid",
				 SELECTION_FIELD__SELECTION_FIELD_ATTRIBUTE_TYPE_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(list, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_EditingFormIsNotWelcomeForm(list, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_EditingFormRefersToRelationshipTarget(list, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_EditingFormIsNotWelcomeForm(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_EditingFormRefersToRelationshipTarget(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_TableColumnRefersToTargetEntityFeature(table, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TableColumnRefersToTargetEntityFeature constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__TABLE_COLUMN_REFERS_TO_TARGET_ENTITY_FEATURE__EEXPRESSION = "self.editingForm.entity.features -> union(self.editingForm.entity -> closure(superType).features) -> includesAll(self.columns.attribute)";

	/**
	 * Validates the TableColumnRefersToTargetEntityFeature constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_TableColumnRefersToTargetEntityFeature(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.TABLE,
				 table,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TableColumnRefersToTargetEntityFeature",
				 TABLE__TABLE_COLUMN_REFERS_TO_TARGET_ENTITY_FEATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(column, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_ConditionIDIsUnique(condition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConditionIDIsUnique constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITION__CONDITION_ID_IS_UNIQUE__EEXPRESSION = "Condition.allInstances() -> select(n | n.conditionID = self.conditionID) ->excluding(self) ->isEmpty()";

	/**
	 * Validates the ConditionIDIsUnique constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_ConditionIDIsUnique(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.CONDITION,
				 condition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConditionIDIsUnique",
				 CONDITION__CONDITION_ID_IS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueCondition(AttributeValueCondition attributeValueCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_ConditionIDIsUnique(attributeValueCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition(CompositeCondition compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_ConditionIDIsUnique(compositeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeCondition_ComposedConditionTypesAreEqual(compositeCondition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ComposedConditionTypesAreEqual constraint of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_CONDITION__COMPOSED_CONDITION_TYPES_ARE_EQUAL__EEXPRESSION = "self.composedConditions -> forAll(c | c.type = self.type)";

	/**
	 * Validates the ComposedConditionTypesAreEqual constraint of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition_ComposedConditionTypesAreEqual(CompositeCondition compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.COMPOSITE_CONDITION,
				 compositeCondition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ComposedConditionTypesAreEqual",
				 COMPOSITE_CONDITION__COMPOSED_CONDITION_TYPES_ARE_EQUAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePageElement(AttributePageElement attributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributePageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(attributePageElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationshipPageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_EditingFormIsNotWelcomeForm(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_EditingFormRefersToRelationshipTarget(relationshipPageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EditingFormIsNotWelcomeForm constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM_IS_NOT_WELCOME_FORM__EEXPRESSION = "self.editingForm.welcomeForm = false";

	/**
	 * Validates the EditingFormIsNotWelcomeForm constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement_EditingFormIsNotWelcomeForm(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT,
				 relationshipPageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EditingFormIsNotWelcomeForm",
				 RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM_IS_NOT_WELCOME_FORM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the EditingFormRefersToRelationshipTarget constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM_REFERS_TO_RELATIONSHIP_TARGET__EEXPRESSION = "self.relationship.target = self.editingForm.entity";

	/**
	 * Validates the EditingFormRefersToRelationshipTarget constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement_EditingFormRefersToRelationshipTarget(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT,
				 relationshipPageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EditingFormRefersToRelationshipTarget",
				 RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM_REFERS_TO_RELATIONSHIP_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateSelectionField(DateSelectionField dateSelectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateSelectionField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(dateSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateSelectionField_DateIsValid(dateSelectionField, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DateIsValid constraint of '<em>Date Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATE_SELECTION_FIELD__DATE_IS_VALID__EEXPRESSION = "self.attribute.type = AttributeType::Date";

	/**
	 * Validates the DateIsValid constraint of '<em>Date Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateSelectionField_DateIsValid(DateSelectionField dateSelectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.DATE_SELECTION_FIELD,
				 dateSelectionField,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DateIsValid",
				 DATE_SELECTION_FIELD__DATE_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSelectionField(TimeSelectionField timeSelectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeSelectionField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_ElementIDIsUnique(timeSelectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeSelectionField_TimeIsValid(timeSelectionField, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TimeIsValid constraint of '<em>Time Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SELECTION_FIELD__TIME_IS_VALID__EEXPRESSION = "self.attribute.type = AttributeType::Time";

	/**
	 * Validates the TimeIsValid constraint of '<em>Time Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSelectionField_TimeIsValid(TimeSelectionField timeSelectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.TIME_SELECTION_FIELD,
				 timeSelectionField,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TimeIsValid",
				 TIME_SELECTION_FIELD__TIME_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeConditionType(CompositeConditionType compositeConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FormsValidator
