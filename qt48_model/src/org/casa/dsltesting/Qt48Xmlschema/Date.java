/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Date#getYear <em>Year</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Date#getMonth <em>Month</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Date#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getDate()
 * @model extendedMetaData="name='Date' kind='elementOnly'"
 * @generated
 */
public interface Date extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getDate_Year()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getYear();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Date#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getDate_Month()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMonth();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Date#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getDate_Day()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='day' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDay();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Date#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(BigInteger value);

} // Date
