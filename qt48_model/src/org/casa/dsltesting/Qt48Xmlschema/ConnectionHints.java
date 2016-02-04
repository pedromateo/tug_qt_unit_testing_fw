/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Hints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.ConnectionHints#getHint <em>Hint</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getConnectionHints()
 * @model extendedMetaData="name='ConnectionHints' kind='elementOnly'"
 * @generated
 */
public interface ConnectionHints extends EObject {
	/**
	 * Returns the value of the '<em><b>Hint</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.ConnectionHint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getConnectionHints_Hint()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.ConnectionHint" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getHint();

} // ConnectionHints
