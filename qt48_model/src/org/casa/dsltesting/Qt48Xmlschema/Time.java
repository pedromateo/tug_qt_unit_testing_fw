/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Time#getHour <em>Hour</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Time#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Time#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getTime()
 * @model extendedMetaData="name='Time' kind='elementOnly'"
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getTime_Hour()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='hour' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHour();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Time#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getTime_Minute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='minute' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinute();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Time#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getTime_Second()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='second' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSecond();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Time#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(BigInteger value);

} // Time
