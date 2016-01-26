/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.ColorRole#getBrush <em>Brush</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.ColorRole#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getColorRole()
 * @model extendedMetaData="name='ColorRole' kind='elementOnly'"
 * @generated
 */
public interface ColorRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Brush</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brush</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brush</em>' containment reference.
	 * @see #setBrush(Brush)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getColorRole_Brush()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='brush' namespace='##targetNamespace'"
	 * @generated
	 */
	Brush getBrush();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.ColorRole#getBrush <em>Brush</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brush</em>' containment reference.
	 * @see #getBrush()
	 * @generated
	 */
	void setBrush(Brush value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getColorRole_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.ColorRole#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // ColorRole
