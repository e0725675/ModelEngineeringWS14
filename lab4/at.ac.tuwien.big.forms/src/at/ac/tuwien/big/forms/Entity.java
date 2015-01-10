/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Entity#getId <em>Id</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Entity#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EntityNameIsUnique FeatureInEntityIsUnique NoSelfInheritance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EntityNameIsUnique='Entity.allInstances() -> select(n | n.name = self.name) ->excluding(self) ->isEmpty()' FeatureInEntityIsUnique='features -> forAll(e1, e2 | e1 <> e2 implies e1.name <> e2.name)' NoSelfInheritance='self.superType <> self'"
 * @generated
 */
public interface Entity extends EntityModelElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getEntity_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #setId(Attribute)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getEntity_Id()
	 * @model required="true"
	 * @generated
	 */
	Attribute getId();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Entity#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Attribute value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(Entity)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getEntity_SuperType()
	 * @model
	 * @generated
	 */
	Entity getSuperType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Entity#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Entity value);

} // Entity
