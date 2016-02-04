/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Include#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Include#getImpldecl <em>Impldecl</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Include#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getInclude()
 * @model extendedMetaData="name='Include' kind='mixed'"
 * @generated
 */
public interface Include extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getInclude_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Impldecl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impldecl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impldecl</em>' attribute.
	 * @see #setImpldecl(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getInclude_Impldecl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='impldecl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImpldecl();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Include#getImpldecl <em>Impldecl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impldecl</em>' attribute.
	 * @see #getImpldecl()
	 * @generated
	 */
	void setImpldecl(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getInclude_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Include#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // Include
