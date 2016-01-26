/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brush</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getColor <em>Color</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getBrushstyle <em>Brushstyle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getBrush()
 * @model extendedMetaData="name='Brush' kind='elementOnly'"
 * @generated
 */
public interface Brush extends EObject {
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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getBrush_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference.
	 * @see #setTexture(Property)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getBrush_Texture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='texture' namespace='##targetNamespace'"
	 * @generated
	 */
	Property getTexture();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getTexture <em>Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' containment reference.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(Property value);

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient</em>' containment reference.
	 * @see #setGradient(Gradient)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getBrush_Gradient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gradient' namespace='##targetNamespace'"
	 * @generated
	 */
	Gradient getGradient();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getGradient <em>Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient</em>' containment reference.
	 * @see #getGradient()
	 * @generated
	 */
	void setGradient(Gradient value);

	/**
	 * Returns the value of the '<em><b>Brushstyle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brushstyle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brushstyle</em>' attribute.
	 * @see #setBrushstyle(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getBrush_Brushstyle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='brushstyle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBrushstyle();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Brush#getBrushstyle <em>Brushstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brushstyle</em>' attribute.
	 * @see #getBrushstyle()
	 * @generated
	 */
	void setBrushstyle(String value);

} // Brush
