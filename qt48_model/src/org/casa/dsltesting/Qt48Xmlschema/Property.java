/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getBool <em>Bool</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getColor <em>Color</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getCstring <em>Cstring</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getCursor <em>Cursor</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getCursorshape <em>Cursorshape</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getFont <em>Font</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getIconset <em>Iconset</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPixmap <em>Pixmap</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPoint <em>Point</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getRect <em>Rect</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSet <em>Set</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSizepolicy <em>Sizepolicy</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSize <em>Size</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getString <em>String</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getStringlist <em>Stringlist</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getNumber <em>Number</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getFloat <em>Float</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDouble <em>Double</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDate <em>Date</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getTime <em>Time</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDatetime <em>Datetime</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPointf <em>Pointf</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getRectf <em>Rectf</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSizef <em>Sizef</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getLonglong <em>Longlong</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getChar <em>Char</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUrl <em>Url</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUint <em>Uint</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUlonglong <em>Ulonglong</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getBrush <em>Brush</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Property#getStdset <em>Stdset</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty()
 * @model extendedMetaData="name='Property' kind='elementOnly'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' attribute.
	 * @see #setBool(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Bool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBool();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getBool <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' attribute.
	 * @see #getBool()
	 * @generated
	 */
	void setBool(String value);

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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Cstring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cstring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cstring</em>' attribute.
	 * @see #setCstring(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Cstring()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cstring' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCstring();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getCstring <em>Cstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cstring</em>' attribute.
	 * @see #getCstring()
	 * @generated
	 */
	void setCstring(String value);

	/**
	 * Returns the value of the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor</em>' attribute.
	 * @see #setCursor(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Cursor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='cursor' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCursor();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getCursor <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor</em>' attribute.
	 * @see #getCursor()
	 * @generated
	 */
	void setCursor(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cursorshape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursorshape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursorshape</em>' attribute.
	 * @see #setCursorshape(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Cursorshape()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cursorshape' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCursorshape();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getCursorshape <em>Cursorshape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursorshape</em>' attribute.
	 * @see #getCursorshape()
	 * @generated
	 */
	void setCursorshape(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Enum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnum();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Font()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace'"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

	/**
	 * Returns the value of the '<em><b>Iconset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iconset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iconset</em>' containment reference.
	 * @see #setIconset(ResourceIcon)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Iconset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iconset' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceIcon getIconset();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getIconset <em>Iconset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iconset</em>' containment reference.
	 * @see #getIconset()
	 * @generated
	 */
	void setIconset(ResourceIcon value);

	/**
	 * Returns the value of the '<em><b>Pixmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixmap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixmap</em>' containment reference.
	 * @see #setPixmap(ResourcePixmap)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Pixmap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pixmap' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourcePixmap getPixmap();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPixmap <em>Pixmap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixmap</em>' containment reference.
	 * @see #getPixmap()
	 * @generated
	 */
	void setPixmap(ResourcePixmap value);

	/**
	 * Returns the value of the '<em><b>Palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette</em>' containment reference.
	 * @see #setPalette(Palette)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Palette()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='palette' namespace='##targetNamespace'"
	 * @generated
	 */
	Palette getPalette();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPalette <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette</em>' containment reference.
	 * @see #getPalette()
	 * @generated
	 */
	void setPalette(Palette value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(Point)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Point()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='point' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getPoint();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Rect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rect</em>' containment reference.
	 * @see #setRect(Rect)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Rect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='##targetNamespace'"
	 * @generated
	 */
	Rect getRect();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getRect <em>Rect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rect</em>' containment reference.
	 * @see #getRect()
	 * @generated
	 */
	void setRect(Rect value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' attribute.
	 * @see #setSet(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Set()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSet();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(String value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' containment reference.
	 * @see #setLocale(Locale)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Locale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locale' namespace='##targetNamespace'"
	 * @generated
	 */
	Locale getLocale();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getLocale <em>Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' containment reference.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(Locale value);

	/**
	 * Returns the value of the '<em><b>Sizepolicy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sizepolicy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizepolicy</em>' containment reference.
	 * @see #setSizepolicy(SizePolicy)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Sizepolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sizepolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	SizePolicy getSizepolicy();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSizepolicy <em>Sizepolicy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizepolicy</em>' containment reference.
	 * @see #getSizepolicy()
	 * @generated
	 */
	void setSizepolicy(SizePolicy value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Size)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(org.casa.dsltesting.Qt48Xmlschema.String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
	org.casa.dsltesting.Qt48Xmlschema.String getString();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(org.casa.dsltesting.Qt48Xmlschema.String value);

	/**
	 * Returns the value of the '<em><b>Stringlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stringlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringlist</em>' containment reference.
	 * @see #setStringlist(StringList)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Stringlist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stringlist' namespace='##targetNamespace'"
	 * @generated
	 */
	StringList getStringlist();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getStringlist <em>Stringlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringlist</em>' containment reference.
	 * @see #getStringlist()
	 * @generated
	 */
	void setStringlist(StringList value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' attribute.
	 * @see #isSetFloat()
	 * @see #unsetFloat()
	 * @see #setFloat(float)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Float()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
	 * @generated
	 */
	float getFloat();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' attribute.
	 * @see #isSetFloat()
	 * @see #unsetFloat()
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(float value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFloat()
	 * @see #getFloat()
	 * @see #setFloat(float)
	 * @generated
	 */
	void unsetFloat();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getFloat <em>Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Float</em>' attribute is set.
	 * @see #unsetFloat()
	 * @see #getFloat()
	 * @see #setFloat(float)
	 * @generated
	 */
	boolean isSetFloat();

	/**
	 * Returns the value of the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' attribute.
	 * @see #isSetDouble()
	 * @see #unsetDouble()
	 * @see #setDouble(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Double()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='double' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDouble();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDouble <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' attribute.
	 * @see #isSetDouble()
	 * @see #unsetDouble()
	 * @see #getDouble()
	 * @generated
	 */
	void setDouble(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDouble <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDouble()
	 * @see #getDouble()
	 * @see #setDouble(double)
	 * @generated
	 */
	void unsetDouble();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDouble <em>Double</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Double</em>' attribute is set.
	 * @see #unsetDouble()
	 * @see #getDouble()
	 * @see #setDouble(double)
	 * @generated
	 */
	boolean isSetDouble();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

	/**
	 * Returns the value of the '<em><b>Datetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime</em>' containment reference.
	 * @see #setDatetime(DateTime)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Datetime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datetime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDatetime();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getDatetime <em>Datetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime</em>' containment reference.
	 * @see #getDatetime()
	 * @generated
	 */
	void setDatetime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Pointf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointf</em>' containment reference.
	 * @see #setPointf(PointF)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Pointf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointf' namespace='##targetNamespace'"
	 * @generated
	 */
	PointF getPointf();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getPointf <em>Pointf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointf</em>' containment reference.
	 * @see #getPointf()
	 * @generated
	 */
	void setPointf(PointF value);

	/**
	 * Returns the value of the '<em><b>Rectf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectf</em>' containment reference.
	 * @see #setRectf(RectF)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Rectf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rectf' namespace='##targetNamespace'"
	 * @generated
	 */
	RectF getRectf();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getRectf <em>Rectf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectf</em>' containment reference.
	 * @see #getRectf()
	 * @generated
	 */
	void setRectf(RectF value);

	/**
	 * Returns the value of the '<em><b>Sizef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sizef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizef</em>' containment reference.
	 * @see #setSizef(SizeF)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Sizef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sizef' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeF getSizef();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getSizef <em>Sizef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizef</em>' containment reference.
	 * @see #getSizef()
	 * @generated
	 */
	void setSizef(SizeF value);

	/**
	 * Returns the value of the '<em><b>Longlong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longlong</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longlong</em>' attribute.
	 * @see #isSetLonglong()
	 * @see #unsetLonglong()
	 * @see #setLonglong(long)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Longlong()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='longlong' namespace='##targetNamespace'"
	 * @generated
	 */
	long getLonglong();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getLonglong <em>Longlong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longlong</em>' attribute.
	 * @see #isSetLonglong()
	 * @see #unsetLonglong()
	 * @see #getLonglong()
	 * @generated
	 */
	void setLonglong(long value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getLonglong <em>Longlong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLonglong()
	 * @see #getLonglong()
	 * @see #setLonglong(long)
	 * @generated
	 */
	void unsetLonglong();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getLonglong <em>Longlong</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longlong</em>' attribute is set.
	 * @see #unsetLonglong()
	 * @see #getLonglong()
	 * @see #setLonglong(long)
	 * @generated
	 */
	boolean isSetLonglong();

	/**
	 * Returns the value of the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' containment reference.
	 * @see #setChar(Char)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Char()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='char' namespace='##targetNamespace'"
	 * @generated
	 */
	Char getChar();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getChar <em>Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' containment reference.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(Char value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Url)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getUrl();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Uint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uint</em>' attribute.
	 * @see #isSetUint()
	 * @see #unsetUint()
	 * @see #setUint(long)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Uint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='uint' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUint();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUint <em>Uint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uint</em>' attribute.
	 * @see #isSetUint()
	 * @see #unsetUint()
	 * @see #getUint()
	 * @generated
	 */
	void setUint(long value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUint <em>Uint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUint()
	 * @see #getUint()
	 * @see #setUint(long)
	 * @generated
	 */
	void unsetUint();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUint <em>Uint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uint</em>' attribute is set.
	 * @see #unsetUint()
	 * @see #getUint()
	 * @see #setUint(long)
	 * @generated
	 */
	boolean isSetUint();

	/**
	 * Returns the value of the '<em><b>Ulonglong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ulonglong</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ulonglong</em>' attribute.
	 * @see #setUlonglong(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Ulonglong()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='ulonglong' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUlonglong();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getUlonglong <em>Ulonglong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ulonglong</em>' attribute.
	 * @see #getUlonglong()
	 * @generated
	 */
	void setUlonglong(BigInteger value);

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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Brush()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='brush' namespace='##targetNamespace'"
	 * @generated
	 */
	Brush getBrush();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getBrush <em>Brush</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brush</em>' containment reference.
	 * @see #getBrush()
	 * @generated
	 */
	void setBrush(Brush value);

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
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stdset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stdset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdset</em>' attribute.
	 * @see #setStdset(BigInteger)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getProperty_Stdset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='stdset' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStdset();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Property#getStdset <em>Stdset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stdset</em>' attribute.
	 * @see #getStdset()
	 * @generated
	 */
	void setStdset(BigInteger value);

} // Property
