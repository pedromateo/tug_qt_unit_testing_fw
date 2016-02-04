/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getX <em>X</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getY <em>Y</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getWidth <em>Width</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getRect()
 * @model extendedMetaData="name='Rect' kind='elementOnly'"
 * @generated
 */
public interface Rect extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getRect_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getX();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getRect_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getY();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getRect_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWidth();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getRect_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHeight();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Rect#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BigInteger value);

} // Rect
