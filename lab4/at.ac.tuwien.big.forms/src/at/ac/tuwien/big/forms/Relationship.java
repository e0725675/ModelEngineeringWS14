/**
 */
package at.ac.tuwien.big.forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.forms.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Relationship#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Relationship#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link at.ac.tuwien.big.forms.Relationship#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RelationshipMultiplicityIsValid OppositeRelationshipsReferenceEachOther OppositeRelationshipTypeIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RelationshipMultiplicityIsValid='self.lowerBound >= 0 and (self.upperBound >= lowerBound or self.upperBound = -1)' OppositeRelationshipsReferenceEachOther='self.opposite -> forAll(o | o.opposite = self)' OppositeRelationshipTypeIsValid='self.opposite <> null implies self.target = Entity.allInstances() -> select(e | e.features -> select(f | f.oclIsKindOf(Relationship)) -> includes(self.opposite)) -> asOrderedSet() -> first()'"
 * @generated
 */
public interface Relationship extends Feature {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationship_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Relationship#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationship_LowerBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Relationship#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Relationship)
	 * @see at.ac.tuwien.big.forms.FormsPackage#getRelationship_Opposite()
	 * @model
	 * @generated
	 */
	Relationship getOpposite();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.forms.Relationship#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Relationship value);

} // Relationship
