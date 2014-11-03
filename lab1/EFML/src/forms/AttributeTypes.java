/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.AttributeTypes#isString <em>String</em>}</li>
 *   <li>{@link forms.AttributeTypes#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getAttributeTypes()
 * @model
 * @generated
 */
public interface AttributeTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(boolean)
	 * @see forms.FormsPackage#getAttributeTypes_String()
	 * @model required="true"
	 * @generated
	 */
	boolean isString();

	/**
	 * Sets the value of the '{@link forms.AttributeTypes#isString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #isString()
	 * @generated
	 */
	void setString(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see forms.FormsPackage#getAttributeTypes_Type()
	 * @model
	 * @generated
	 */
	EList<String> getType();

} // AttributeTypes
