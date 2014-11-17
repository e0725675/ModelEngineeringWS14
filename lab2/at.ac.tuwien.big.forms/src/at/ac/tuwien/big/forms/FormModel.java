/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.FormModel#getForms <em>Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getFormModel()
 * @model
 * @generated
 */
public interface FormModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getFormModel_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

} // FormModel
