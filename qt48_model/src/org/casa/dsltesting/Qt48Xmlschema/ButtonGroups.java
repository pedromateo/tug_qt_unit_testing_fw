/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.ButtonGroups#getButtongroup <em>Buttongroup</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getButtonGroups()
 * @model extendedMetaData="name='ButtonGroups' kind='elementOnly'"
 * @generated
 */
public interface ButtonGroups extends EObject {
	/**
	 * Returns the value of the '<em><b>Buttongroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.ButtonGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buttongroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttongroup</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getButtonGroups_Buttongroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='buttongroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ButtonGroup> getButtongroup();

} // ButtonGroups
