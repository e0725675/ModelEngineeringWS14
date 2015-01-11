/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.PageElement#getLabel <em>Label</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.PageElement#getCondition <em>Condition</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.PageElement#getElementID <em>Element ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getPageElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ElementIDIsUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ElementIDIsUnique='PageElement.allInstances() -> select(n | n.elementID = self.elementID) ->excluding(self) ->isEmpty()'"
 * @generated
 */
public interface PageElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getPageElement_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.PageElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getPageElement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.PageElement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(String)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getPageElement_ElementID()
	 * @model required="true"
	 * @generated
	 */
	String getElementID();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.PageElement#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(String value);


} // PageElement
