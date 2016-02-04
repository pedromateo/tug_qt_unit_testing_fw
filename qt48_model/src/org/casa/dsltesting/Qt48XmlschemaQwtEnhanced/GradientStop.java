/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getColor <em>Color</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getGradientStop()
 * @model extendedMetaData="name='GradientStop' kind='elementOnly'"
 * @generated
 */
public interface GradientStop extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Color)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getGradientStop_Color()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(double)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getGradientStop_Position()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPosition();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(double)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(double)
	 * @generated
	 */
	boolean isSetPosition();

} // GradientStop
