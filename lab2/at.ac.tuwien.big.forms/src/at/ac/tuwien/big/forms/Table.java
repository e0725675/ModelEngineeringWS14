/**
 */
package at.ac.tuwien.big.forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Table#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TableColumnRefersToTargetEntityFeature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TableColumnRefersToTargetEntityFeature='self.editingForm.entity.features -> union(self.editingForm.entity -> closure(superType).features) -> includesAll(self.columns.attribute)'"
 * @generated
 */
public interface Table extends RelationshipPageElement {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.forms.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see at.ac.tuwien.big.forms.FormsPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // Table
