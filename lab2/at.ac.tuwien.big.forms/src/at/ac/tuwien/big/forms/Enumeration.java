/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getEnumeration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EnumerationNameIsUnique LiteralInEnumerationIsUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EnumerationNameIsUnique='Enumeration.allInstances() -> select(n | n.name = self.name) ->excluding(self) ->isEmpty()' LiteralInEnumerationIsUnique='literals -> forAll(e1, e2 | e1 <> e2 implies e1.name <> e2.name)'"
 * @generated
 */
public interface Enumeration extends EntityModelElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getEnumeration_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getLiterals();

} // Enumeration
