/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getUrl()
 * @model extendedMetaData="name='Url' kind='elementOnly'"
 * @generated
 */
public interface Url extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getUrl_String()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
	org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String getString();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String value);

} // Url
