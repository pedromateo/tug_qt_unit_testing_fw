/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getProperty <em>Property</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getScript <em>Script</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getWidgetdata <em>Widgetdata</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getRow <em>Row</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getColumn <em>Column</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getItem <em>Item</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getWidget <em>Widget</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getAction <em>Action</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getActiongroup <em>Actiongroup</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getAddaction <em>Addaction</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getZorder <em>Zorder</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getClass1 <em>Class1</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getName <em>Name</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Widget#isNative <em>Native</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget()
 * @model extendedMetaData="name='Widget' kind='elementOnly'"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Class()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getClass_();

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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Property()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Property" containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getProperty();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Script()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Script" containment="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getScript();

	/**
	 * Returns the value of the '<em><b>Widgetdata</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.WidgetData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgetdata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgetdata</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Widgetdata()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.WidgetData" containment="true"
	 *        extendedMetaData="kind='element' name='widgetdata' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getWidgetdata();

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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Attribute()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Property" containment="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAttribute();

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Row()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Row" containment="true"
	 *        extendedMetaData="kind='element' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRow();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Column()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Column" containment="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getColumn();

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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Item()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Item" containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getItem();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Layout()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Layout" containment="true"
	 *        extendedMetaData="kind='element' name='layout' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getLayout();

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Widget()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Widget" containment="true"
	 *        extendedMetaData="kind='element' name='widget' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getWidget();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Action()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.Action" containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAction();

	/**
	 * Returns the value of the '<em><b>Actiongroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.ActionGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actiongroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actiongroup</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Actiongroup()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.ActionGroup" containment="true"
	 *        extendedMetaData="kind='element' name='actiongroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getActiongroup();

	/**
	 * Returns the value of the '<em><b>Addaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.ActionRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addaction</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Addaction()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.ActionRef" containment="true"
	 *        extendedMetaData="kind='element' name='addaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAddaction();

	/**
	 * Returns the value of the '<em><b>Zorder</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zorder</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zorder</em>' attribute list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Zorder()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='zorder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getZorder();

	/**
	 * Returns the value of the '<em><b>Class1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class1</em>' attribute.
	 * @see #setClass1(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Class1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass1();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getClass1 <em>Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1</em>' attribute.
	 * @see #getClass1()
	 * @generated
	 */
	void setClass1(String value);

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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Widget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see #isSetNative()
	 * @see #unsetNative()
	 * @see #setNative(boolean)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getWidget_Native()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='native' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNative();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Widget#isNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see #isSetNative()
	 * @see #unsetNative()
	 * @see #isNative()
	 * @generated
	 */
	void setNative(boolean value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Widget#isNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNative()
	 * @see #isNative()
	 * @see #setNative(boolean)
	 * @generated
	 */
	void unsetNative();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Widget#isNative <em>Native</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Native</em>' attribute is set.
	 * @see #unsetNative()
	 * @see #isNative()
	 * @see #setNative(boolean)
	 * @generated
	 */
	boolean isSetNative();

} // Widget
