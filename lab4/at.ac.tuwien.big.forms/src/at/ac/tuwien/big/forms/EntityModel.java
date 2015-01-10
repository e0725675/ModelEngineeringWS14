/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.EntityModel#getEntityModelElements <em>Entity Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getEntityModel()
 * @model
 * @generated
 */
public interface EntityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.EntityModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Model Elements</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getEntityModel_EntityModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityModelElement> getEntityModelElements();

} // EntityModel
