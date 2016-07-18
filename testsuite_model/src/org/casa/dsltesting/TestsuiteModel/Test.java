/**
 */
package org.casa.dsltesting.TestsuiteModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.TestsuiteModel.Test#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends Method {
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
	 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage#getTest_Parent()
	 * @model required="true"
	 * @generated
	 */
	Testsuite getParent();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.TestsuiteModel.Test#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Testsuite value);

} // Test
