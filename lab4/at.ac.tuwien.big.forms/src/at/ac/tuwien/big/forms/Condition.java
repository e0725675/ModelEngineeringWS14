/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Condition#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Condition#getConditionID <em>Condition ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getCondition()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConditionIDIsUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConditionIDIsUnique='Condition.allInstances() -> select(n | n.conditionID = self.conditionID) ->excluding(self) ->isEmpty()'"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.forms.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see at.ac.tuwien.big.forms.ConditionType
	 * @see #setType(ConditionType)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getCondition_Type()
	 * @model required="true"
	 * @generated
	 */
	ConditionType getType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Condition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see at.ac.tuwien.big.forms.ConditionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition ID</em>' attribute.
	 * @see #setConditionID(String)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getCondition_ConditionID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getConditionID();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Condition#getConditionID <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition ID</em>' attribute.
	 * @see #getConditionID()
	 * @generated
	 */
	void setConditionID(String value);

} // Condition
