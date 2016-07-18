/**
 */
package org.casa.dsltesting.TestsuiteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.TestsuiteModel.TestProject#getTestsuites <em>Testsuites</em>}</li>
 *   <li>{@link org.casa.dsltesting.TestsuiteModel.TestProject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestProject()
 * @model
 * @generated
 */
public interface TestProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Testsuites</b></em>' reference list.
	 * The list contents are of type {@link org.casa.dsltesting.TestsuiteModel.Testsuite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testsuites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testsuites</em>' reference list.
	 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestProject_Testsuites()
	 * @model
	 * @generated
	 */
	EList<Testsuite> getTestsuites();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.TestsuiteModel.TestProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TestProject
