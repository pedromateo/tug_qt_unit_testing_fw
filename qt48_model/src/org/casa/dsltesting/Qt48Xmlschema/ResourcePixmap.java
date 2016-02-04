/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Pixmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getResourcePixmap()
 * @model extendedMetaData="name='ResourcePixmap' kind='mixed'"
 * @generated
 */
public interface ResourcePixmap extends EObject {
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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getResourcePixmap_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getResourcePixmap_Alias()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getResourcePixmap_Resource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // ResourcePixmap
