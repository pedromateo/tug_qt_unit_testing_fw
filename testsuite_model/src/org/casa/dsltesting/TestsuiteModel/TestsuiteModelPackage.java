/**
 */
package org.casa.dsltesting.TestsuiteModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.casa.dsltesting.TestsuiteModel.TestsuiteModelFactory
 * @model kind="package"
 * @generated
 */
public interface TestsuiteModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestsuiteModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.casa.dsl_testing.TestsuiteModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TestsuiteModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestsuiteModelPackage eINSTANCE = org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.TestsuiteModel.impl.TestsuiteImpl <em>Testsuite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteImpl
	 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getTestsuite()
	 * @generated
	 */
	int TESTSUITE = 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTSUITE__TESTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTSUITE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTSUITE__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTSUITE__CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Testsuite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTSUITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Testsuite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTSUITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.TestsuiteModel.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.TestsuiteModel.impl.MethodImpl
	 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CODE = 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.casa.dsltesting.TestsuiteModel.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.TestsuiteModel.impl.TestImpl
	 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CODE = METHOD__CODE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SIGNATURE = METHOD__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PARENT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.casa.dsltesting.TestsuiteModel.impl.TestProjectImpl <em>Test Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.casa.dsltesting.TestsuiteModel.impl.TestProjectImpl
	 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getTestProject()
	 * @generated
	 */
	int TEST_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Testsuites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROJECT__TESTSUITES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROJECT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Test Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROJECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.TestsuiteModel.Testsuite <em>Testsuite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testsuite</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Testsuite
	 * @generated
	 */
	EClass getTestsuite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Testsuite#getTests()
	 * @see #getTestsuite()
	 * @generated
	 */
	EReference getTestsuite_Tests();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Testsuite#getName()
	 * @see #getTestsuite()
	 * @generated
	 */
	EAttribute getTestsuite_Name();

	/**
	 * Returns the meta object for the reference '{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Testsuite#getParent()
	 * @see #getTestsuite()
	 * @generated
	 */
	EReference getTestsuite_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.casa.dsltesting.TestsuiteModel.Testsuite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Testsuite#getChildren()
	 * @see #getTestsuite()
	 * @generated
	 */
	EReference getTestsuite_Children();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.TestsuiteModel.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the reference '{@link org.casa.dsltesting.TestsuiteModel.Test#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Test#getParent()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Parent();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.TestsuiteModel.TestProject <em>Test Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Project</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.TestProject
	 * @generated
	 */
	EClass getTestProject();

	/**
	 * Returns the meta object for the reference list '{@link org.casa.dsltesting.TestsuiteModel.TestProject#getTestsuites <em>Testsuites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Testsuites</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.TestProject#getTestsuites()
	 * @see #getTestProject()
	 * @generated
	 */
	EReference getTestProject_Testsuites();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.TestsuiteModel.TestProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.TestProject#getName()
	 * @see #getTestProject()
	 * @generated
	 */
	EAttribute getTestProject_Name();

	/**
	 * Returns the meta object for class '{@link org.casa.dsltesting.TestsuiteModel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.TestsuiteModel.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.TestsuiteModel.Method#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Method#getCode()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.casa.dsltesting.TestsuiteModel.Method#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.casa.dsltesting.TestsuiteModel.Method#getSignature()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Signature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestsuiteModelFactory getTestsuiteModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.TestsuiteModel.impl.TestsuiteImpl <em>Testsuite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteImpl
		 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getTestsuite()
		 * @generated
		 */
		EClass TESTSUITE = eINSTANCE.getTestsuite();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTSUITE__TESTS = eINSTANCE.getTestsuite_Tests();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTSUITE__NAME = eINSTANCE.getTestsuite_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTSUITE__PARENT = eINSTANCE.getTestsuite_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTSUITE__CHILDREN = eINSTANCE.getTestsuite_Children();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.TestsuiteModel.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.TestsuiteModel.impl.TestImpl
		 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__PARENT = eINSTANCE.getTest_Parent();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.TestsuiteModel.impl.TestProjectImpl <em>Test Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.TestsuiteModel.impl.TestProjectImpl
		 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getTestProject()
		 * @generated
		 */
		EClass TEST_PROJECT = eINSTANCE.getTestProject();

		/**
		 * The meta object literal for the '<em><b>Testsuites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_PROJECT__TESTSUITES = eINSTANCE.getTestProject_Testsuites();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PROJECT__NAME = eINSTANCE.getTestProject_Name();

		/**
		 * The meta object literal for the '{@link org.casa.dsltesting.TestsuiteModel.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.casa.dsltesting.TestsuiteModel.impl.MethodImpl
		 * @see org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CODE = eINSTANCE.getMethod_Code();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SIGNATURE = eINSTANCE.getMethod_Signature();

	}

} //TestsuiteModelPackage
