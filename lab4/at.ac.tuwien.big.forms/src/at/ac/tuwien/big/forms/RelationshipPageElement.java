/**
 */
package at.ac.tuwien.big.forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.RelationshipPageElement#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.RelationshipPageElement#getEditingForm <em>Editing Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationshipPageElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EditingFormIsNotWelcomeForm EditingFormRefersToRelationshipTarget'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EditingFormIsNotWelcomeForm='self.editingForm.welcomeForm = false' EditingFormRefersToRelationshipTarget='self.relationship.target = self.editingForm.entity'"
 * @generated
 */
public interface RelationshipPageElement extends PageElement {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(Relationship)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationshipPageElement_Relationship()
	 * @model required="true"
	 * @generated
	 */
	Relationship getRelationship();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.RelationshipPageElement#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Form</em>' reference.
	 * @see #setEditingForm(Form)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationshipPageElement_EditingForm()
	 * @model required="true"
	 * @generated
	 */
	Form getEditingForm();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.RelationshipPageElement#getEditingForm <em>Editing Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Form</em>' reference.
	 * @see #getEditingForm()
	 * @generated
	 */
	void setEditingForm(Form value);

} // RelationshipPageElement
