/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Item#getGroup <em>Group</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Item#getProperty <em>Property</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Item#getItem <em>Item</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Item#getColumn <em>Column</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Item#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getItem()
 * @model extendedMetaData="name='Item' kind='elementOnly'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getItem_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getItem_Property()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Property" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getProperty();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getItem_Item()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Item" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getItem();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getItem_Column()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getColumn();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Item#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getItem_Row()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRow();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Item#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(BigInteger value);

} // Item
