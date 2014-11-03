/**
 */
package forms.impl;

import forms.Attribute;
import forms.Entity;
import forms.FormsPackage;
import forms.Id;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.impl.EntityImpl#getEntityAttribute <em>Entity Attribute</em>}</li>
 *   <li>{@link forms.impl.EntityImpl#getEntityID <em>Entity ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getEntityAttribute() <em>Entity Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> entityAttribute;

	/**
	 * The cached value of the '{@link #getEntityID() <em>Entity ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityID()
	 * @generated
	 * @ordered
	 */
	protected Id entityID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getEntityAttribute() {
		if (entityAttribute == null) {
			entityAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, FormsPackage.ENTITY__ENTITY_ATTRIBUTE);
		}
		return entityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getEntityID() {
		if (entityID != null && entityID.eIsProxy()) {
			InternalEObject oldEntityID = (InternalEObject)entityID;
			entityID = (Id)eResolveProxy(oldEntityID);
			if (entityID != oldEntityID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormsPackage.ENTITY__ENTITY_ID, oldEntityID, entityID));
			}
		}
		return entityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetEntityID() {
		return entityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityID(Id newEntityID) {
		Id oldEntityID = entityID;
		entityID = newEntityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.ENTITY__ENTITY_ID, oldEntityID, entityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.ENTITY__ENTITY_ATTRIBUTE:
				return ((InternalEList<?>)getEntityAttribute()).basicRemove(otherEnd, msgs);
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
			case FormsPackage.ENTITY__ENTITY_ATTRIBUTE:
				return getEntityAttribute();
			case FormsPackage.ENTITY__ENTITY_ID:
				if (resolve) return getEntityID();
				return basicGetEntityID();
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
			case FormsPackage.ENTITY__ENTITY_ATTRIBUTE:
				getEntityAttribute().clear();
				getEntityAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case FormsPackage.ENTITY__ENTITY_ID:
				setEntityID((Id)newValue);
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
			case FormsPackage.ENTITY__ENTITY_ATTRIBUTE:
				getEntityAttribute().clear();
				return;
			case FormsPackage.ENTITY__ENTITY_ID:
				setEntityID((Id)null);
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
			case FormsPackage.ENTITY__ENTITY_ATTRIBUTE:
				return entityAttribute != null && !entityAttribute.isEmpty();
			case FormsPackage.ENTITY__ENTITY_ID:
				return entityID != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
