/**
 */
package org.casa.dsltesting.TestsuiteModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testsuite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getTests <em>Tests</em>}</li>
 *   <li>{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getName <em>Name</em>}</li>
 *   <li>{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getParent <em>Parent</em>}</li>
 *   <li>{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestsuite()
 * @model
 * @generated
 */
public interface Testsuite extends EObject {
	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.TestsuiteModel.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestsuite_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

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
	 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestsuite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Testsuite)
	 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestsuite_Parent()
	 * @model required="true"
	 * @generated
	 */
	Testsuite getParent();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Testsuite value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.TestsuiteModel.Testsuite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTestsuite_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Testsuite> getChildren();

} // Testsuite
