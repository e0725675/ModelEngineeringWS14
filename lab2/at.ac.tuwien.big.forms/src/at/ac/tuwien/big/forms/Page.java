/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Page#getPageElements <em>Page Elements</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Page#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FirstLetterInPageTitleIsUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot FirstLetterInPageTitleIsUpperCase='self.title.at(1).matches(\'[A-Z]\')'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getPage_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Page Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.PageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Elements</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getPage_PageElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageElement> getPageElements();

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
	 * @see at.ac.tuwien.big.forms.FormsPackage#getPage_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Page#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Page
