/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getActive <em>Active</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getInactive <em>Inactive</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getDisabled <em>Disabled</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getPalette()
 * @model extendedMetaData="name='Palette' kind='elementOnly'"
 * @generated
 */
public interface Palette extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(ColorGroup)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getPalette_Active()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorGroup getActive();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(ColorGroup value);

	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive</em>' containment reference.
	 * @see #setInactive(ColorGroup)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getPalette_Inactive()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inactive' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorGroup getInactive();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getInactive <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' containment reference.
	 * @see #getInactive()
	 * @generated
	 */
	void setInactive(ColorGroup value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' containment reference.
	 * @see #setDisabled(ColorGroup)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getPalette_Disabled()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='disabled' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorGroup getDisabled();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette#getDisabled <em>Disabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' containment reference.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(ColorGroup value);

} // Palette
