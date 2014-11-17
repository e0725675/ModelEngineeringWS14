/**
 */
package at.ac.tuwien.big.forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.AttributeValueCondition#getValue <em>Value</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.AttributeValueCondition#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getAttributeValueCondition()
 * @model
 * @generated
 */
public interface AttributeValueCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getAttributeValueCondition_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.AttributeValueCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getAttributeValueCondition_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.AttributeValueCondition#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // AttributeValueCondition
