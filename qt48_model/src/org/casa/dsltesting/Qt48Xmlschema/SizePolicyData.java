/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Policy Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.SizePolicyData#getHordata <em>Hordata</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.SizePolicyData#getVerdata <em>Verdata</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getSizePolicyData()
 * @model extendedMetaData="name='SizePolicyData' kind='elementOnly'"
 * @generated
 */
public interface SizePolicyData extends EObject {
	/**
	 * Returns the value of the '<em><b>Hordata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hordata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hordata</em>' attribute.
	 * @see #setHordata(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getSizePolicyData_Hordata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='hordata' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHordata();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.SizePolicyData#getHordata <em>Hordata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hordata</em>' attribute.
	 * @see #getHordata()
	 * @generated
	 */
	void setHordata(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Verdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verdata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verdata</em>' attribute.
	 * @see #setVerdata(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getSizePolicyData_Verdata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='verdata' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVerdata();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.SizePolicyData#getVerdata <em>Verdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verdata</em>' attribute.
	 * @see #getVerdata()
	 * @generated
	 */
	void setVerdata(BigInteger value);

} // SizePolicyData
