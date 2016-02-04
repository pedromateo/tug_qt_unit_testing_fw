/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char#getUnicode <em>Unicode</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getChar()
 * @model extendedMetaData="name='Char' kind='elementOnly'"
 * @generated
 */
public interface Char extends EObject {
	/**
	 * Returns the value of the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unicode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unicode</em>' attribute.
	 * @see #setUnicode(BigInteger)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getChar_Unicode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='unicode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUnicode();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char#getUnicode <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unicode</em>' attribute.
	 * @see #getUnicode()
	 * @generated
	 */
	void setUnicode(BigInteger value);

} // Char
