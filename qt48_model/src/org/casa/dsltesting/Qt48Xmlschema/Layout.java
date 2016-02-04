/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getGroup <em>Group</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getProperty <em>Property</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getItem <em>Item</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getColumnminimumwidth <em>Columnminimumwidth</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getColumnstretch <em>Columnstretch</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getName <em>Name</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getRowminimumheight <em>Rowminimumheight</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getRowstretch <em>Rowstretch</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getStretch <em>Stretch</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout()
 * @model extendedMetaData="name='Layout' kind='elementOnly'"
 * @generated
 */
public interface Layout extends EObject {
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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Group()
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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Property()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Property" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getProperty();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Attribute()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Property" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getAttribute();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.LayoutItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Item()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.LayoutItem" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getItem();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Columnminimumwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnminimumwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnminimumwidth</em>' attribute.
	 * @see #setColumnminimumwidth(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Columnminimumwidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='columnminimumwidth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColumnminimumwidth();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getColumnminimumwidth <em>Columnminimumwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnminimumwidth</em>' attribute.
	 * @see #getColumnminimumwidth()
	 * @generated
	 */
	void setColumnminimumwidth(String value);

	/**
	 * Returns the value of the '<em><b>Columnstretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnstretch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnstretch</em>' attribute.
	 * @see #setColumnstretch(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Columnstretch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='columnstretch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColumnstretch();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getColumnstretch <em>Columnstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnstretch</em>' attribute.
	 * @see #getColumnstretch()
	 * @generated
	 */
	void setColumnstretch(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rowminimumheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowminimumheight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowminimumheight</em>' attribute.
	 * @see #setRowminimumheight(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Rowminimumheight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rowminimumheight' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRowminimumheight();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getRowminimumheight <em>Rowminimumheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowminimumheight</em>' attribute.
	 * @see #getRowminimumheight()
	 * @generated
	 */
	void setRowminimumheight(String value);

	/**
	 * Returns the value of the '<em><b>Rowstretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowstretch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowstretch</em>' attribute.
	 * @see #setRowstretch(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Rowstretch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rowstretch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRowstretch();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getRowstretch <em>Rowstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowstretch</em>' attribute.
	 * @see #getRowstretch()
	 * @generated
	 */
	void setRowstretch(String value);

	/**
	 * Returns the value of the '<em><b>Stretch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stretch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stretch</em>' attribute.
	 * @see #setStretch(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getLayout_Stretch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stretch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStretch();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Layout#getStretch <em>Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stretch</em>' attribute.
	 * @see #getStretch()
	 * @generated
	 */
	void setStretch(String value);

} // Layout
