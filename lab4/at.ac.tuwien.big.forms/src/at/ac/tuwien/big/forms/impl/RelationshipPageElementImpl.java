/**
 */
package at.ac.tuwien.big.forms.impl;

import at.ac.tuwien.big.forms.Form;
import at.ac.tuwien.big.forms.FormsPackage;
import at.ac.tuwien.big.forms.Relationship;
import at.ac.tuwien.big.forms.RelationshipPageElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Page Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.impl.RelationshipPageElementImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.impl.RelationshipPageElementImpl#getEditingForm <em>Editing Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipPageElementImpl extends PageElementImpl implements RelationshipPageElement {
	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship relationship;

	/**
	 * The cached value of the '{@link #getEditingForm() <em>Editing Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingForm()
	 * @generated
	 * @ordered
	 */
	protected Form editingForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipPageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (Relationship)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormsPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Relationship newRelationship) {
		Relationship oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getEditingForm() {
		if (editingForm != null && editingForm.eIsProxy()) {
			InternalEObject oldEditingForm = (InternalEObject)editingForm;
			editingForm = (Form)eResolveProxy(oldEditingForm);
			if (editingForm != oldEditingForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormsPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM, oldEditingForm, editingForm));
			}
		}
		return editingForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetEditingForm() {
		return editingForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingForm(Form newEditingForm) {
		Form oldEditingForm = editingForm;
		editingForm = newEditingForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM, oldEditingForm, editingForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				if (resolve) return getEditingForm();
				return basicGetEditingForm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP:
				setRelationship((Relationship)newValue);
				return;
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				setEditingForm((Form)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP:
				setRelationship((Relationship)null);
				return;
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				setEditingForm((Form)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP:
				return relationship != null;
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				return editingForm != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipPageElementImpl
