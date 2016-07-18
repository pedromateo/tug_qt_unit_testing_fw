/**
 */
package org.casa.dsltesting.TestsuiteModel.impl;

import org.casa.dsltesting.TestsuiteModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestsuiteModelFactoryImpl extends EFactoryImpl implements TestsuiteModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestsuiteModelFactory init() {
		try {
			TestsuiteModelFactory theTestsuiteModelFactory = (TestsuiteModelFactory)EPackage.Registry.INSTANCE.getEFactory(TestsuiteModelPackage.eNS_URI);
			if (theTestsuiteModelFactory != null) {
				return theTestsuiteModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestsuiteModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestsuiteModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestsuiteModelPackage.TESTSUITE: return createTestsuite();
			case TestsuiteModelPackage.TEST: return createTest();
			case TestsuiteModelPackage.TEST_PROJECT: return createTestProject();
			case TestsuiteModelPackage.METHOD: return createMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testsuite createTestsuite() {
		TestsuiteImpl testsuite = new TestsuiteImpl();
		return testsuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestProject createTestProject() {
		TestProjectImpl testProject = new TestProjectImpl();
		return testProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestsuiteModelPackage getTestsuiteModelPackage() {
		return (TestsuiteModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestsuiteModelPackage getPackage() {
		return TestsuiteModelPackage.eINSTANCE;
	}

} //TestsuiteModelFactoryImpl
