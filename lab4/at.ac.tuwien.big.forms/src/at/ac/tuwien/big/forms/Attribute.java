/**
 */
package at.ac.tuwien.big.forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Attribute#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Attribute#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AttributeTypeIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AttributeTypeIsValid='self.type <> AttributeType::None xor self.enumeration <> null'"
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.forms.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see at.ac.tuwien.big.forms.AttributeType
	 * @see #setType(AttributeType)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getAttribute_Type()
	 * @model default="None" required="true"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see at.ac.tuwien.big.forms.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getAttribute_Mandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Attribute#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' reference.
	 * @see #setEnumeration(Enumeration)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getAttribute_Enumeration()
	 * @model
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Attribute#getEnumeration <em>Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

} // Attribute
