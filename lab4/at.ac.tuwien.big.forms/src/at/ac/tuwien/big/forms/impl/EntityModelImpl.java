/**
 */
package at.ac.tuwien.big.forms.impl;

import at.ac.tuwien.big.forms.EntityModel;
import at.ac.tuwien.big.forms.EntityModelElement;
import at.ac.tuwien.big.forms.FormsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.impl.EntityModelImpl#getEntityModelElements <em>Entity Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityModelImpl extends MinimalEObjectImpl.Container implements EntityModel {
	/**
	 * The cached value of the '{@link #getEntityModelElements() <em>Entity Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityModelElement> entityModelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.ENTITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityModelElement> getEntityModelElements() {
		if (entityModelElements == null) {
			entityModelElements = new EObjectContainmentEList<EntityModelElement>(EntityModelElement.class, this, FormsPackage.ENTITY_MODEL__ENTITY_MODEL_ELEMENTS);
		}
		return entityModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.ENTITY_MODEL__ENTITY_MODEL_ELEMENTS:
				return ((InternalEList<?>)getEntityModelElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.ENTITY_MODEL__ENTITY_MODEL_ELEMENTS:
				return getEntityModelElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormsPackage.ENTITY_MODEL__ENTITY_MODEL_ELEMENTS:
				getEntityModelElements().clear();
				getEntityModelElements().addAll((Collection<? extends EntityModelElement>)newValue);
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
			case FormsPackage.ENTITY_MODEL__ENTITY_MODEL_ELEMENTS:
				getEntityModelElements().clear();
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
			case FormsPackage.ENTITY_MODEL__ENTITY_MODEL_ELEMENTS:
				return entityModelElements != null && !entityModelElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityModelImpl
