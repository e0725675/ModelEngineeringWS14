/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Form#getEntity <em>Entity</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Form#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Form#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Form#getPages <em>Pages</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Form#isWelcomeForm <em>Welcome Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FirstLetterInFormTitleIsUpperCase ExactlyOneWelcomePageExists PageElementsReferToFormEntityFeatures AttributeOfConditionIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot FirstLetterInFormTitleIsUpperCase='self.title.at(1).matches(\'[A-Z]\')' ExactlyOneWelcomePageExists='Form.allInstances() -> select(f | f.welcomeForm = true) -> size() = 1' PageElementsReferToFormEntityFeatures='self.entity.features -> union(self.entity -> closure(superType).features) -> includesAll(self.pages.pageElements -> selectByKind(AttributePageElement).attribute.oclAsType(Feature) -> union(self.pages.pageElements -> selectByKind(RelationshipPageElement).relationship.oclAsType(Feature)))' AttributeOfConditionIsValid='\n\t\t(self.pages.pageElements -> selectByKind(AttributePageElement).attribute)\n\t\t-> includesAll(\n\t\tself.pages.condition -> selectByKind(CompositeCondition) -> closure(v:CompositeCondition | v.composedConditions -> \n\t\tselectByKind(CompositeCondition)) -> collect(v:CompositeCondition|v.composedConditions) -> \n\t\tselectByKind(AttributeValueCondition).attribute -> union(self.pages.condition -> \n\t\tselectByKind(AttributeValueCondition).attribute) -> union(self.pages.condition -> \n\t\tselectByKind(CompositeCondition).composedConditions -> selectByKind(AttributeValueCondition).attribute)\n\t\t-> union(\n\t\tself.pages.pageElements.condition -> selectByKind(CompositeCondition) -> closure(v:CompositeCondition | v.composedConditions -> \n\t\tselectByKind(CompositeCondition)) -> collect(v:CompositeCondition|v.composedConditions) -> \n\t\tselectByKind(AttributeValueCondition).attribute -> union(self.pages.pageElements.condition -> \n\t\tselectByKind(AttributeValueCondition).attribute) -> union(self.pages.pageElements.condition -> \n\t\tselectByKind(CompositeCondition).composedConditions -> selectByKind(AttributeValueCondition).attribute)\n\t\t))'"
 * @generated
 */
public interface Form extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getForm_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Form#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

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
	 * @see at.ac.tuwien.big.forms.FormsPackage#getForm_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Form#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getForm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Form#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getForm_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Welcome Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome Form</em>' attribute.
	 * @see #setWelcomeForm(boolean)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getForm_WelcomeForm()
	 * @model required="true"
	 * @generated
	 */
	boolean isWelcomeForm();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Form#isWelcomeForm <em>Welcome Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome Form</em>' attribute.
	 * @see #isWelcomeForm()
	 * @generated
	 */
	void setWelcomeForm(boolean value);

} // Form
