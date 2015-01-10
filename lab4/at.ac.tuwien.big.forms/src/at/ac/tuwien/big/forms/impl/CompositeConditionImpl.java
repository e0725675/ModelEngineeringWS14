/**
 */
package at.ac.tuwien.big.forms.impl;

import at.ac.tuwien.big.forms.CompositeCondition;
import at.ac.tuwien.big.forms.CompositeConditionType;
import at.ac.tuwien.big.forms.Condition;
import at.ac.tuwien.big.forms.FormsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.impl.CompositeConditionImpl#getCompositionType <em>Composition Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.impl.CompositeConditionImpl#getComposedConditions <em>Composed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeConditionImpl extends ConditionImpl implements CompositeCondition {
	/**
	 * The default value of the '{@link #getCompositionType() <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionType()
	 * @generated
	 * @ordered
	 */
	protected static final CompositeConditionType COMPOSITION_TYPE_EDEFAULT = CompositeConditionType.AND;

	/**
	 * The cached value of the '{@link #getCompositionType() <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionType()
	 * @generated
	 * @ordered
	 */
	protected CompositeConditionType compositionType = COMPOSITION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposedConditions() <em>Composed Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> composedConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.COMPOSITE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditionType getCompositionType() {
		return compositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionType(CompositeConditionType newCompositionType) {
		CompositeConditionType oldCompositionType = compositionType;
		compositionType = newCompositionType == null ? COMPOSITION_TYPE_EDEFAULT : newCompositionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.COMPOSITE_CONDITION__COMPOSITION_TYPE, oldCompositionType, compositionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getComposedConditions() {
		if (composedConditions == null) {
			composedConditions = new EObjectContainmentEList<Condition>(Condition.class, this, FormsPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS);
		}
		return composedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				return ((InternalEList<?>)getComposedConditions()).basicRemove(otherEnd, msgs);
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
			case FormsPackage.COMPOSITE_CONDITION__COMPOSITION_TYPE:
				return getCompositionType();
			case FormsPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				return getComposedConditions();
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
			case FormsPackage.COMPOSITE_CONDITION__COMPOSITION_TYPE:
				setCompositionType((CompositeConditionType)newValue);
				return;
			case FormsPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				getComposedConditions().clear();
				getComposedConditions().addAll((Collection<? extends Condition>)newValue);
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
			case FormsPackage.COMPOSITE_CONDITION__COMPOSITION_TYPE:
				setCompositionType(COMPOSITION_TYPE_EDEFAULT);
				return;
			case FormsPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				getComposedConditions().clear();
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
			case FormsPackage.COMPOSITE_CONDITION__COMPOSITION_TYPE:
				return compositionType != COMPOSITION_TYPE_EDEFAULT;
			case FormsPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				return composedConditions != null && !composedConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (compositionType: ");
		result.append(compositionType);
		result.append(')');
		return result.toString();
	}

} //CompositeConditionImpl
