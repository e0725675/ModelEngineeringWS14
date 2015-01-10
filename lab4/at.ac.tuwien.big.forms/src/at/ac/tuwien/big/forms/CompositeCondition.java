/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.CompositeCondition#getCompositionType <em>Composition Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.CompositeCondition#getComposedConditions <em>Composed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getCompositeCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ComposedConditionTypesAreEqual'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ComposedConditionTypesAreEqual='self.composedConditions -> forAll(c | c.type = self.type)'"
 * @generated
 */
public interface CompositeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Composition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.forms.CompositeConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Type</em>' attribute.
	 * @see at.ac.tuwien.big.forms.CompositeConditionType
	 * @see #setCompositionType(CompositeConditionType)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getCompositeCondition_CompositionType()
	 * @model required="true"
	 * @generated
	 */
	CompositeConditionType getCompositionType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.CompositeCondition#getCompositionType <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Type</em>' attribute.
	 * @see at.ac.tuwien.big.forms.CompositeConditionType
	 * @see #getCompositionType()
	 * @generated
	 */
	void setCompositionType(CompositeConditionType value);

	/**
	 * Returns the value of the '<em><b>Composed Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Conditions</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getCompositeCondition_ComposedConditions()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Condition> getComposedConditions();

} // CompositeCondition
