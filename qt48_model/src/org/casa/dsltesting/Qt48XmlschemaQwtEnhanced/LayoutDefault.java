/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getSpacing <em>Spacing</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getLayoutDefault()
 * @model extendedMetaData="name='LayoutDefault' kind='empty'"
 * @generated
 */
public interface LayoutDefault extends EObject {
	/**
	 * Returns the value of the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' attribute.
	 * @see #setMargin(BigInteger)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getLayoutDefault_Margin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='margin' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMargin();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getMargin <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' attribute.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(BigInteger)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getLayoutDefault_Spacing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSpacing();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutDefault#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(BigInteger value);

} // LayoutDefault
