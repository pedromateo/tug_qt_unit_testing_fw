/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.math.BigInteger;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Char;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Date;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.DateTime;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Locale;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Palette;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Point;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.PointF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Rect;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.RectF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourceIcon;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ResourcePixmap;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Size;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizeF;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.StringList;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Time;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Url;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getCstring <em>Cstring</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getCursor <em>Cursor</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getCursorshape <em>Cursorshape</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getIconset <em>Iconset</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getPixmap <em>Pixmap</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getSizepolicy <em>Sizepolicy</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getString <em>String</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getStringlist <em>Stringlist</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getDatetime <em>Datetime</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getPointf <em>Pointf</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getRectf <em>Rectf</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getSizef <em>Sizef</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getLonglong <em>Longlong</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getUint <em>Uint</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getUInt1 <em>UInt1</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getUlonglong <em>Ulonglong</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getBrush <em>Brush</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.PropertyImpl#getStdset <em>Stdset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #getBool() <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBool()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBool() <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBool()
	 * @generated
	 * @ordered
	 */
	protected String bool = BOOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color;

	/**
	 * The default value of the '{@link #getCstring() <em>Cstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCstring()
	 * @generated
	 * @ordered
	 */
	protected static final String CSTRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCstring() <em>Cstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCstring()
	 * @generated
	 * @ordered
	 */
	protected String cstring = CSTRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CURSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cursor = CURSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCursorshape() <em>Cursorshape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorshape()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSORSHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursorshape() <em>Cursorshape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorshape()
	 * @generated
	 * @ordered
	 */
	protected String cursorshape = CURSORSHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected String enum_ = ENUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * The cached value of the '{@link #getIconset() <em>Iconset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconset()
	 * @generated
	 * @ordered
	 */
	protected ResourceIcon iconset;

	/**
	 * The cached value of the '{@link #getPixmap() <em>Pixmap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixmap()
	 * @generated
	 * @ordered
	 */
	protected ResourcePixmap pixmap;

	/**
	 * The cached value of the '{@link #getPalette() <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalette()
	 * @generated
	 * @ordered
	 */
	protected Palette palette;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected Point point;

	/**
	 * The cached value of the '{@link #getRect() <em>Rect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRect()
	 * @generated
	 * @ordered
	 */
	protected Rect rect;

	/**
	 * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected String set = SET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected Locale locale;

	/**
	 * The cached value of the '{@link #getSizepolicy() <em>Sizepolicy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizepolicy()
	 * @generated
	 * @ordered
	 */
	protected SizePolicy sizepolicy;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String string;

	/**
	 * The cached value of the '{@link #getStringlist() <em>Stringlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringlist()
	 * @generated
	 * @ordered
	 */
	protected StringList stringlist;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected float float_ = FLOAT_EDEFAULT;

	/**
	 * This is true if the Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean floatESet;

	/**
	 * The default value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected double double_ = DOUBLE_EDEFAULT;

	/**
	 * This is true if the Double attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doubleESet;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Time time;

	/**
	 * The cached value of the '{@link #getDatetime() <em>Datetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected DateTime datetime;

	/**
	 * The cached value of the '{@link #getPointf() <em>Pointf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointf()
	 * @generated
	 * @ordered
	 */
	protected PointF pointf;

	/**
	 * The cached value of the '{@link #getRectf() <em>Rectf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectf()
	 * @generated
	 * @ordered
	 */
	protected RectF rectf;

	/**
	 * The cached value of the '{@link #getSizef() <em>Sizef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizef()
	 * @generated
	 * @ordered
	 */
	protected SizeF sizef;

	/**
	 * The default value of the '{@link #getLonglong() <em>Longlong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLonglong()
	 * @generated
	 * @ordered
	 */
	protected static final long LONGLONG_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLonglong() <em>Longlong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLonglong()
	 * @generated
	 * @ordered
	 */
	protected long longlong = LONGLONG_EDEFAULT;

	/**
	 * This is true if the Longlong attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longlongESet;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected Char char_;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Url url;

	/**
	 * The default value of the '{@link #getUint() <em>Uint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUint()
	 * @generated
	 * @ordered
	 */
	protected static final long UINT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUint() <em>Uint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUint()
	 * @generated
	 * @ordered
	 */
	protected long uint = UINT_EDEFAULT;

	/**
	 * This is true if the Uint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uintESet;

	/**
	 * The default value of the '{@link #getUInt1() <em>UInt1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUInt1()
	 * @generated
	 * @ordered
	 */
	protected static final long UINT1_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUInt1() <em>UInt1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUInt1()
	 * @generated
	 * @ordered
	 */
	protected long uInt1 = UINT1_EDEFAULT;

	/**
	 * This is true if the UInt1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uInt1ESet;

	/**
	 * The default value of the '{@link #getUlonglong() <em>Ulonglong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlonglong()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ULONGLONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUlonglong() <em>Ulonglong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlonglong()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ulonglong = ULONGLONG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBrush() <em>Brush</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrush()
	 * @generated
	 * @ordered
	 */
	protected Brush brush;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdset() <em>Stdset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdset()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STDSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdset() <em>Stdset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdset()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stdset = STDSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBool() {
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBool(String newBool) {
		String oldBool = bool;
		bool = newBool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BOOL, oldBool, bool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Color newColor, NotificationChain msgs) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCstring() {
		return cstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCstring(String newCstring) {
		String oldCstring = cstring;
		cstring = newCstring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CSTRING, oldCstring, cstring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCursor() {
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursor(BigInteger newCursor) {
		BigInteger oldCursor = cursor;
		cursor = newCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSOR, oldCursor, cursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursorshape() {
		return cursorshape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorshape(String newCursorshape) {
		String oldCursorshape = cursorshape;
		cursorshape = newCursorshape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSORSHAPE, oldCursorshape, cursorshape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum(String newEnum) {
		String oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceIcon getIconset() {
		return iconset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIconset(ResourceIcon newIconset, NotificationChain msgs) {
		ResourceIcon oldIconset = iconset;
		iconset = newIconset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET, oldIconset, newIconset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconset(ResourceIcon newIconset) {
		if (newIconset != iconset) {
			NotificationChain msgs = null;
			if (iconset != null)
				msgs = ((InternalEObject)iconset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET, null, msgs);
			if (newIconset != null)
				msgs = ((InternalEObject)newIconset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET, null, msgs);
			msgs = basicSetIconset(newIconset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET, newIconset, newIconset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getPixmap() {
		return pixmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixmap(ResourcePixmap newPixmap, NotificationChain msgs) {
		ResourcePixmap oldPixmap = pixmap;
		pixmap = newPixmap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP, oldPixmap, newPixmap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixmap(ResourcePixmap newPixmap) {
		if (newPixmap != pixmap) {
			NotificationChain msgs = null;
			if (pixmap != null)
				msgs = ((InternalEObject)pixmap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP, null, msgs);
			if (newPixmap != null)
				msgs = ((InternalEObject)newPixmap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP, null, msgs);
			msgs = basicSetPixmap(newPixmap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP, newPixmap, newPixmap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPalette() {
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPalette(Palette newPalette, NotificationChain msgs) {
		Palette oldPalette = palette;
		palette = newPalette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE, oldPalette, newPalette);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette(Palette newPalette) {
		if (newPalette != palette) {
			NotificationChain msgs = null;
			if (palette != null)
				msgs = ((InternalEObject)palette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE, null, msgs);
			if (newPalette != null)
				msgs = ((InternalEObject)newPalette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE, null, msgs);
			msgs = basicSetPalette(newPalette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE, newPalette, newPalette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(Point newPoint, NotificationChain msgs) {
		Point oldPoint = point;
		point = newPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT, oldPoint, newPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(Point newPoint) {
		if (newPoint != point) {
			NotificationChain msgs = null;
			if (point != null)
				msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT, null, msgs);
			if (newPoint != null)
				msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT, null, msgs);
			msgs = basicSetPoint(newPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT, newPoint, newPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rect getRect() {
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRect(Rect newRect, NotificationChain msgs) {
		Rect oldRect = rect;
		rect = newRect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT, oldRect, newRect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRect(Rect newRect) {
		if (newRect != rect) {
			NotificationChain msgs = null;
			if (rect != null)
				msgs = ((InternalEObject)rect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT, null, msgs);
			if (newRect != null)
				msgs = ((InternalEObject)newRect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT, null, msgs);
			msgs = basicSetRect(newRect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT, newRect, newRect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(String newSet) {
		String oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocale(Locale newLocale, NotificationChain msgs) {
		Locale oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE, oldLocale, newLocale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocale(Locale newLocale) {
		if (newLocale != locale) {
			NotificationChain msgs = null;
			if (locale != null)
				msgs = ((InternalEObject)locale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE, null, msgs);
			if (newLocale != null)
				msgs = ((InternalEObject)newLocale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE, null, msgs);
			msgs = basicSetLocale(newLocale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE, newLocale, newLocale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizePolicy getSizepolicy() {
		return sizepolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizepolicy(SizePolicy newSizepolicy, NotificationChain msgs) {
		SizePolicy oldSizepolicy = sizepolicy;
		sizepolicy = newSizepolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY, oldSizepolicy, newSizepolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizepolicy(SizePolicy newSizepolicy) {
		if (newSizepolicy != sizepolicy) {
			NotificationChain msgs = null;
			if (sizepolicy != null)
				msgs = ((InternalEObject)sizepolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY, null, msgs);
			if (newSizepolicy != null)
				msgs = ((InternalEObject)newSizepolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY, null, msgs);
			msgs = basicSetSizepolicy(newSizepolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY, newSizepolicy, newSizepolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Size newSize, NotificationChain msgs) {
		Size oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String newString, NotificationChain msgs) {
		org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringList getStringlist() {
		return stringlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringlist(StringList newStringlist, NotificationChain msgs) {
		StringList oldStringlist = stringlist;
		stringlist = newStringlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST, oldStringlist, newStringlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringlist(StringList newStringlist) {
		if (newStringlist != stringlist) {
			NotificationChain msgs = null;
			if (stringlist != null)
				msgs = ((InternalEObject)stringlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST, null, msgs);
			if (newStringlist != null)
				msgs = ((InternalEObject)newStringlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST, null, msgs);
			msgs = basicSetStringlist(newStringlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST, newStringlist, newStringlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(BigInteger newNumber) {
		BigInteger oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(float newFloat) {
		float oldFloat = float_;
		float_ = newFloat;
		boolean oldFloatESet = floatESet;
		floatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FLOAT, oldFloat, float_, !oldFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFloat() {
		float oldFloat = float_;
		boolean oldFloatESet = floatESet;
		float_ = FLOAT_EDEFAULT;
		floatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFloat() {
		return floatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(double newDouble) {
		double oldDouble = double_;
		double_ = newDouble;
		boolean oldDoubleESet = doubleESet;
		doubleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DOUBLE, oldDouble, double_, !oldDoubleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDouble() {
		double oldDouble = double_;
		boolean oldDoubleESet = doubleESet;
		double_ = DOUBLE_EDEFAULT;
		doubleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DOUBLE, oldDouble, DOUBLE_EDEFAULT, oldDoubleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDouble() {
		return doubleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(Time newTime, NotificationChain msgs) {
		Time oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Time newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDatetime() {
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatetime(DateTime newDatetime, NotificationChain msgs) {
		DateTime oldDatetime = datetime;
		datetime = newDatetime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME, oldDatetime, newDatetime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatetime(DateTime newDatetime) {
		if (newDatetime != datetime) {
			NotificationChain msgs = null;
			if (datetime != null)
				msgs = ((InternalEObject)datetime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME, null, msgs);
			if (newDatetime != null)
				msgs = ((InternalEObject)newDatetime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME, null, msgs);
			msgs = basicSetDatetime(newDatetime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME, newDatetime, newDatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointF getPointf() {
		return pointf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointf(PointF newPointf, NotificationChain msgs) {
		PointF oldPointf = pointf;
		pointf = newPointf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF, oldPointf, newPointf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointf(PointF newPointf) {
		if (newPointf != pointf) {
			NotificationChain msgs = null;
			if (pointf != null)
				msgs = ((InternalEObject)pointf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF, null, msgs);
			if (newPointf != null)
				msgs = ((InternalEObject)newPointf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF, null, msgs);
			msgs = basicSetPointf(newPointf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF, newPointf, newPointf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectF getRectf() {
		return rectf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectf(RectF newRectf, NotificationChain msgs) {
		RectF oldRectf = rectf;
		rectf = newRectf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF, oldRectf, newRectf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectf(RectF newRectf) {
		if (newRectf != rectf) {
			NotificationChain msgs = null;
			if (rectf != null)
				msgs = ((InternalEObject)rectf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF, null, msgs);
			if (newRectf != null)
				msgs = ((InternalEObject)newRectf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF, null, msgs);
			msgs = basicSetRectf(newRectf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF, newRectf, newRectf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeF getSizef() {
		return sizef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizef(SizeF newSizef, NotificationChain msgs) {
		SizeF oldSizef = sizef;
		sizef = newSizef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF, oldSizef, newSizef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizef(SizeF newSizef) {
		if (newSizef != sizef) {
			NotificationChain msgs = null;
			if (sizef != null)
				msgs = ((InternalEObject)sizef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF, null, msgs);
			if (newSizef != null)
				msgs = ((InternalEObject)newSizef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF, null, msgs);
			msgs = basicSetSizef(newSizef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF, newSizef, newSizef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLonglong() {
		return longlong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLonglong(long newLonglong) {
		long oldLonglong = longlong;
		longlong = newLonglong;
		boolean oldLonglongESet = longlongESet;
		longlongESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LONGLONG, oldLonglong, longlong, !oldLonglongESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLonglong() {
		long oldLonglong = longlong;
		boolean oldLonglongESet = longlongESet;
		longlong = LONGLONG_EDEFAULT;
		longlongESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LONGLONG, oldLonglong, LONGLONG_EDEFAULT, oldLonglongESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLonglong() {
		return longlongESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChar(Char newChar, NotificationChain msgs) {
		Char oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR, oldChar, newChar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(Char newChar) {
		if (newChar != char_) {
			NotificationChain msgs = null;
			if (char_ != null)
				msgs = ((InternalEObject)char_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR, null, msgs);
			if (newChar != null)
				msgs = ((InternalEObject)newChar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR, null, msgs);
			msgs = basicSetChar(newChar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR, newChar, newChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Url newUrl, NotificationChain msgs) {
		Url oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Url newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUint() {
		return uint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUint(long newUint) {
		long oldUint = uint;
		uint = newUint;
		boolean oldUintESet = uintESet;
		uintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT, oldUint, uint, !oldUintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUint() {
		long oldUint = uint;
		boolean oldUintESet = uintESet;
		uint = UINT_EDEFAULT;
		uintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT, oldUint, UINT_EDEFAULT, oldUintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUint() {
		return uintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUInt1() {
		return uInt1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUInt1(long newUInt1) {
		long oldUInt1 = uInt1;
		uInt1 = newUInt1;
		boolean oldUInt1ESet = uInt1ESet;
		uInt1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT1, oldUInt1, uInt1, !oldUInt1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUInt1() {
		long oldUInt1 = uInt1;
		boolean oldUInt1ESet = uInt1ESet;
		uInt1 = UINT1_EDEFAULT;
		uInt1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT1, oldUInt1, UINT1_EDEFAULT, oldUInt1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUInt1() {
		return uInt1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUlonglong() {
		return ulonglong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUlonglong(BigInteger newUlonglong) {
		BigInteger oldUlonglong = ulonglong;
		ulonglong = newUlonglong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ULONGLONG, oldUlonglong, ulonglong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brush getBrush() {
		return brush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrush(Brush newBrush, NotificationChain msgs) {
		Brush oldBrush = brush;
		brush = newBrush;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH, oldBrush, newBrush);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrush(Brush newBrush) {
		if (newBrush != brush) {
			NotificationChain msgs = null;
			if (brush != null)
				msgs = ((InternalEObject)brush).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH, null, msgs);
			if (newBrush != null)
				msgs = ((InternalEObject)newBrush).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH, null, msgs);
			msgs = basicSetBrush(newBrush, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH, newBrush, newBrush));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStdset() {
		return stdset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdset(BigInteger newStdset) {
		BigInteger oldStdset = stdset;
		stdset = newStdset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STDSET, oldStdset, stdset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR:
				return basicSetColor(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT:
				return basicSetFont(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET:
				return basicSetIconset(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP:
				return basicSetPixmap(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE:
				return basicSetPalette(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT:
				return basicSetPoint(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT:
				return basicSetRect(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE:
				return basicSetLocale(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY:
				return basicSetSizepolicy(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE:
				return basicSetSize(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING:
				return basicSetString(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST:
				return basicSetStringlist(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE:
				return basicSetDate(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME:
				return basicSetTime(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME:
				return basicSetDatetime(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF:
				return basicSetPointf(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF:
				return basicSetRectf(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF:
				return basicSetSizef(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR:
				return basicSetChar(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL:
				return basicSetUrl(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH:
				return basicSetBrush(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BOOL:
				return getBool();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR:
				return getColor();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CSTRING:
				return getCstring();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSOR:
				return getCursor();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSORSHAPE:
				return getCursorshape();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ENUM:
				return getEnum();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT:
				return getFont();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET:
				return getIconset();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP:
				return getPixmap();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE:
				return getPalette();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT:
				return getPoint();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT:
				return getRect();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SET:
				return getSet();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE:
				return getLocale();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY:
				return getSizepolicy();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE:
				return getSize();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING:
				return getString();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST:
				return getStringlist();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NUMBER:
				return getNumber();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FLOAT:
				return getFloat();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DOUBLE:
				return getDouble();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE:
				return getDate();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME:
				return getTime();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME:
				return getDatetime();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF:
				return getPointf();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF:
				return getRectf();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF:
				return getSizef();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LONGLONG:
				return getLonglong();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR:
				return getChar();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL:
				return getUrl();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT:
				return getUint();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT1:
				return getUInt1();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ULONGLONG:
				return getUlonglong();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH:
				return getBrush();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NAME:
				return getName();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STDSET:
				return getStdset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BOOL:
				setBool((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR:
				setColor((Color)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CSTRING:
				setCstring((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSOR:
				setCursor((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSORSHAPE:
				setCursorshape((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ENUM:
				setEnum((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT:
				setFont((Font)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET:
				setIconset((ResourceIcon)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP:
				setPixmap((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE:
				setPalette((Palette)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT:
				setPoint((Point)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT:
				setRect((Rect)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SET:
				setSet((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE:
				setLocale((Locale)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY:
				setSizepolicy((SizePolicy)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE:
				setSize((Size)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING:
				setString((org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST:
				setStringlist((StringList)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NUMBER:
				setNumber((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FLOAT:
				setFloat((Float)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DOUBLE:
				setDouble((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE:
				setDate((Date)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME:
				setTime((Time)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME:
				setDatetime((DateTime)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF:
				setPointf((PointF)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF:
				setRectf((RectF)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF:
				setSizef((SizeF)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LONGLONG:
				setLonglong((Long)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR:
				setChar((Char)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL:
				setUrl((Url)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT:
				setUint((Long)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT1:
				setUInt1((Long)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ULONGLONG:
				setUlonglong((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH:
				setBrush((Brush)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STDSET:
				setStdset((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BOOL:
				setBool(BOOL_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR:
				setColor((Color)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CSTRING:
				setCstring(CSTRING_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSOR:
				setCursor(CURSOR_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSORSHAPE:
				setCursorshape(CURSORSHAPE_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ENUM:
				setEnum(ENUM_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT:
				setFont((Font)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET:
				setIconset((ResourceIcon)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP:
				setPixmap((ResourcePixmap)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE:
				setPalette((Palette)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT:
				setPoint((Point)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT:
				setRect((Rect)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SET:
				setSet(SET_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE:
				setLocale((Locale)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY:
				setSizepolicy((SizePolicy)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE:
				setSize((Size)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING:
				setString((org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.String)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST:
				setStringlist((StringList)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FLOAT:
				unsetFloat();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DOUBLE:
				unsetDouble();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE:
				setDate((Date)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME:
				setTime((Time)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME:
				setDatetime((DateTime)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF:
				setPointf((PointF)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF:
				setRectf((RectF)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF:
				setSizef((SizeF)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LONGLONG:
				unsetLonglong();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR:
				setChar((Char)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL:
				setUrl((Url)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT:
				unsetUint();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT1:
				unsetUInt1();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ULONGLONG:
				setUlonglong(ULONGLONG_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH:
				setBrush((Brush)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STDSET:
				setStdset(STDSET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BOOL:
				return BOOL_EDEFAULT == null ? bool != null : !BOOL_EDEFAULT.equals(bool);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__COLOR:
				return color != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CSTRING:
				return CSTRING_EDEFAULT == null ? cstring != null : !CSTRING_EDEFAULT.equals(cstring);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSOR:
				return CURSOR_EDEFAULT == null ? cursor != null : !CURSOR_EDEFAULT.equals(cursor);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CURSORSHAPE:
				return CURSORSHAPE_EDEFAULT == null ? cursorshape != null : !CURSORSHAPE_EDEFAULT.equals(cursorshape);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ENUM:
				return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FONT:
				return font != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ICONSET:
				return iconset != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PIXMAP:
				return pixmap != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__PALETTE:
				return palette != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINT:
				return point != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECT:
				return rect != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SET:
				return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LOCALE:
				return locale != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEPOLICY:
				return sizepolicy != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZE:
				return size != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRING:
				return string != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STRINGLIST:
				return stringlist != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__FLOAT:
				return isSetFloat();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DOUBLE:
				return isSetDouble();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATE:
				return date != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__TIME:
				return time != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__DATETIME:
				return datetime != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__POINTF:
				return pointf != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__RECTF:
				return rectf != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__SIZEF:
				return sizef != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__LONGLONG:
				return isSetLonglong();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__CHAR:
				return char_ != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__URL:
				return url != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT:
				return isSetUint();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__UINT1:
				return isSetUInt1();
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__ULONGLONG:
				return ULONGLONG_EDEFAULT == null ? ulonglong != null : !ULONGLONG_EDEFAULT.equals(ulonglong);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__BRUSH:
				return brush != null;
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Qt48XmlschemaQwtEnhancedPackage.PROPERTY__STDSET:
				return STDSET_EDEFAULT == null ? stdset != null : !STDSET_EDEFAULT.equals(stdset);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bool: ");
		result.append(bool);
		result.append(", cstring: ");
		result.append(cstring);
		result.append(", cursor: ");
		result.append(cursor);
		result.append(", cursorshape: ");
		result.append(cursorshape);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", set: ");
		result.append(set);
		result.append(", number: ");
		result.append(number);
		result.append(", float: ");
		if (floatESet) result.append(float_); else result.append("<unset>");
		result.append(", double: ");
		if (doubleESet) result.append(double_); else result.append("<unset>");
		result.append(", longlong: ");
		if (longlongESet) result.append(longlong); else result.append("<unset>");
		result.append(", uint: ");
		if (uintESet) result.append(uint); else result.append("<unset>");
		result.append(", uInt1: ");
		if (uInt1ESet) result.append(uInt1); else result.append("<unset>");
		result.append(", ulonglong: ");
		result.append(ulonglong);
		result.append(", name: ");
		result.append(name);
		result.append(", stdset: ");
		result.append(stdset);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
