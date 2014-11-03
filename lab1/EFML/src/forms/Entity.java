/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.Entity#getEntityAttribute <em>Entity Attribute</em>}</li>
 *   <li>{@link forms.Entity#getEntityID <em>Entity ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Attribute</em>' containment reference list.
	 * @see forms.FormsPackage#getEntity_EntityAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getEntityAttribute();

	/**
	 * Returns the value of the '<em><b>Entity ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity ID</em>' reference.
	 * @see #setEntityID(Id)
	 * @see forms.FormsPackage#getEntity_EntityID()
	 * @model required="true"
	 * @generated
	 */
	Id getEntityID();

	/**
	 * Sets the value of the '{@link forms.Entity#getEntityID <em>Entity ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity ID</em>' reference.
	 * @see #getEntityID()
	 * @generated
	 */
	void setEntityID(Id value);

} // Entity
