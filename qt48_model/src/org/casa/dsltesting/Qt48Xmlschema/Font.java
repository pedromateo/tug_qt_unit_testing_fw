/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#getFamily <em>Family</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#getPointsize <em>Pointsize</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#isBold <em>Bold</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#isStrikeout <em>Strikeout</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#isAntialiasing <em>Antialiasing</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#getStylestrategy <em>Stylestrategy</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Font#isKerning <em>Kerning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont()
 * @model extendedMetaData="name='Font' kind='elementOnly'"
 * @generated
 */
public interface Font extends EObject {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Family()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='family' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Pointsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointsize</em>' attribute.
	 * @see #setPointsize(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Pointsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='pointsize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPointsize();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#getPointsize <em>Pointsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointsize</em>' attribute.
	 * @see #getPointsize()
	 * @generated
	 */
	void setPointsize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Weight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='weight' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWeight();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #isSetItalic()
	 * @see #unsetItalic()
	 * @see #setItalic(boolean)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Italic()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='italic' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isItalic();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #isSetItalic()
	 * @see #unsetItalic()
	 * @see #isItalic()
	 * @generated
	 */
	void setItalic(boolean value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItalic()
	 * @see #isItalic()
	 * @see #setItalic(boolean)
	 * @generated
	 */
	void unsetItalic();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isItalic <em>Italic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Italic</em>' attribute is set.
	 * @see #unsetItalic()
	 * @see #isItalic()
	 * @see #setItalic(boolean)
	 * @generated
	 */
	boolean isSetItalic();

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #isSetBold()
	 * @see #unsetBold()
	 * @see #setBold(boolean)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Bold()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bold' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBold();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #isSetBold()
	 * @see #unsetBold()
	 * @see #isBold()
	 * @generated
	 */
	void setBold(boolean value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBold()
	 * @see #isBold()
	 * @see #setBold(boolean)
	 * @generated
	 */
	void unsetBold();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isBold <em>Bold</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bold</em>' attribute is set.
	 * @see #unsetBold()
	 * @see #isBold()
	 * @see #setBold(boolean)
	 * @generated
	 */
	boolean isSetBold();

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #isSetUnderline()
	 * @see #unsetUnderline()
	 * @see #setUnderline(boolean)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Underline()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='underline' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUnderline();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #isSetUnderline()
	 * @see #unsetUnderline()
	 * @see #isUnderline()
	 * @generated
	 */
	void setUnderline(boolean value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnderline()
	 * @see #isUnderline()
	 * @see #setUnderline(boolean)
	 * @generated
	 */
	void unsetUnderline();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isUnderline <em>Underline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Underline</em>' attribute is set.
	 * @see #unsetUnderline()
	 * @see #isUnderline()
	 * @see #setUnderline(boolean)
	 * @generated
	 */
	boolean isSetUnderline();

	/**
	 * Returns the value of the '<em><b>Strikeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strikeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strikeout</em>' attribute.
	 * @see #isSetStrikeout()
	 * @see #unsetStrikeout()
	 * @see #setStrikeout(boolean)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Strikeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='strikeout' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isStrikeout();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isStrikeout <em>Strikeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strikeout</em>' attribute.
	 * @see #isSetStrikeout()
	 * @see #unsetStrikeout()
	 * @see #isStrikeout()
	 * @generated
	 */
	void setStrikeout(boolean value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isStrikeout <em>Strikeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrikeout()
	 * @see #isStrikeout()
	 * @see #setStrikeout(boolean)
	 * @generated
	 */
	void unsetStrikeout();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isStrikeout <em>Strikeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strikeout</em>' attribute is set.
	 * @see #unsetStrikeout()
	 * @see #isStrikeout()
	 * @see #setStrikeout(boolean)
	 * @generated
	 */
	boolean isSetStrikeout();

	/**
	 * Returns the value of the '<em><b>Antialiasing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antialiasing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antialiasing</em>' attribute.
	 * @see #isSetAntialiasing()
	 * @see #unsetAntialiasing()
	 * @see #setAntialiasing(boolean)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Antialiasing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='antialiasing' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAntialiasing();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isAntialiasing <em>Antialiasing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antialiasing</em>' attribute.
	 * @see #isSetAntialiasing()
	 * @see #unsetAntialiasing()
	 * @see #isAntialiasing()
	 * @generated
	 */
	void setAntialiasing(boolean value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isAntialiasing <em>Antialiasing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAntialiasing()
	 * @see #isAntialiasing()
	 * @see #setAntialiasing(boolean)
	 * @generated
	 */
	void unsetAntialiasing();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isAntialiasing <em>Antialiasing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Antialiasing</em>' attribute is set.
	 * @see #unsetAntialiasing()
	 * @see #isAntialiasing()
	 * @see #setAntialiasing(boolean)
	 * @generated
	 */
	boolean isSetAntialiasing();

	/**
	 * Returns the value of the '<em><b>Stylestrategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stylestrategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stylestrategy</em>' attribute.
	 * @see #setStylestrategy(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Stylestrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='stylestrategy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStylestrategy();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#getStylestrategy <em>Stylestrategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stylestrategy</em>' attribute.
	 * @see #getStylestrategy()
	 * @generated
	 */
	void setStylestrategy(String value);

	/**
	 * Returns the value of the '<em><b>Kerning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kerning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kerning</em>' attribute.
	 * @see #isSetKerning()
	 * @see #unsetKerning()
	 * @see #setKerning(boolean)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getFont_Kerning()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kerning' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKerning();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isKerning <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kerning</em>' attribute.
	 * @see #isSetKerning()
	 * @see #unsetKerning()
	 * @see #isKerning()
	 * @generated
	 */
	void setKerning(boolean value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isKerning <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKerning()
	 * @see #isKerning()
	 * @see #setKerning(boolean)
	 * @generated
	 */
	void unsetKerning();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Font#isKerning <em>Kerning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kerning</em>' attribute is set.
	 * @see #unsetKerning()
	 * @see #isKerning()
	 * @see #setKerning(boolean)
	 * @generated
	 */
	boolean isSetKerning();

} // Font
