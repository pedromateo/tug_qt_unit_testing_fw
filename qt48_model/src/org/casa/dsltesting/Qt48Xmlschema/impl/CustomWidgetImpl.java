/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.lang.String;

import java.math.BigInteger;

import org.casa.dsltesting.Qt48Xmlschema.CustomWidget;
import org.casa.dsltesting.Qt48Xmlschema.Header;
import org.casa.dsltesting.Qt48Xmlschema.Properties;
import org.casa.dsltesting.Qt48Xmlschema.PropertySpecifications;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.Script;
import org.casa.dsltesting.Qt48Xmlschema.Size;
import org.casa.dsltesting.Qt48Xmlschema.SizePolicyData;
import org.casa.dsltesting.Qt48Xmlschema.Slots;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getSizehint <em>Sizehint</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getAddpagemethod <em>Addpagemethod</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getSizepolicy <em>Sizepolicy</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getPixmap <em>Pixmap</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.CustomWidgetImpl#getPropertyspecifications <em>Propertyspecifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomWidgetImpl extends EObjectImpl implements CustomWidget {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The cached value of the '{@link #getSizehint() <em>Sizehint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizehint()
	 * @generated
	 * @ordered
	 */
	protected Size sizehint;

	/**
	 * The default value of the '{@link #getAddpagemethod() <em>Addpagemethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddpagemethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDPAGEMETHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddpagemethod() <em>Addpagemethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddpagemethod()
	 * @generated
	 * @ordered
	 */
	protected String addpagemethod = ADDPAGEMETHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected BigInteger container = CONTAINER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSizepolicy() <em>Sizepolicy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizepolicy()
	 * @generated
	 * @ordered
	 */
	protected SizePolicyData sizepolicy;

	/**
	 * The default value of the '{@link #getPixmap() <em>Pixmap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixmap()
	 * @generated
	 * @ordered
	 */
	protected static final String PIXMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPixmap() <em>Pixmap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixmap()
	 * @generated
	 * @ordered
	 */
	protected String pixmap = PIXMAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Script script;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Properties properties;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected Slots slots;

	/**
	 * The cached value of the '{@link #getPropertyspecifications() <em>Propertyspecifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyspecifications()
	 * @generated
	 * @ordered
	 */
	protected PropertySpecifications propertyspecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.CUSTOM_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSizehint() {
		return sizehint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizehint(Size newSizehint, NotificationChain msgs) {
		Size oldSizehint = sizehint;
		sizehint = newSizehint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT, oldSizehint, newSizehint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizehint(Size newSizehint) {
		if (newSizehint != sizehint) {
			NotificationChain msgs = null;
			if (sizehint != null)
				msgs = ((InternalEObject)sizehint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT, null, msgs);
			if (newSizehint != null)
				msgs = ((InternalEObject)newSizehint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT, null, msgs);
			msgs = basicSetSizehint(newSizehint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT, newSizehint, newSizehint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddpagemethod() {
		return addpagemethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddpagemethod(String newAddpagemethod) {
		String oldAddpagemethod = addpagemethod;
		addpagemethod = newAddpagemethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__ADDPAGEMETHOD, oldAddpagemethod, addpagemethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(BigInteger newContainer) {
		BigInteger oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizePolicyData getSizepolicy() {
		return sizepolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizepolicy(SizePolicyData newSizepolicy, NotificationChain msgs) {
		SizePolicyData oldSizepolicy = sizepolicy;
		sizepolicy = newSizepolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY, oldSizepolicy, newSizepolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizepolicy(SizePolicyData newSizepolicy) {
		if (newSizepolicy != sizepolicy) {
			NotificationChain msgs = null;
			if (sizepolicy != null)
				msgs = ((InternalEObject)sizepolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY, null, msgs);
			if (newSizepolicy != null)
				msgs = ((InternalEObject)newSizepolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY, null, msgs);
			msgs = basicSetSizepolicy(newSizepolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY, newSizepolicy, newSizepolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPixmap() {
		return pixmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixmap(String newPixmap) {
		String oldPixmap = pixmap;
		pixmap = newPixmap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__PIXMAP, oldPixmap, pixmap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
		Script oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT, oldScript, newScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Script newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Properties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slots getSlots() {
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlots(Slots newSlots, NotificationChain msgs) {
		Slots oldSlots = slots;
		slots = newSlots;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS, oldSlots, newSlots);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlots(Slots newSlots) {
		if (newSlots != slots) {
			NotificationChain msgs = null;
			if (slots != null)
				msgs = ((InternalEObject)slots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS, null, msgs);
			if (newSlots != null)
				msgs = ((InternalEObject)newSlots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS, null, msgs);
			msgs = basicSetSlots(newSlots, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS, newSlots, newSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertySpecifications getPropertyspecifications() {
		return propertyspecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyspecifications(PropertySpecifications newPropertyspecifications, NotificationChain msgs) {
		PropertySpecifications oldPropertyspecifications = propertyspecifications;
		propertyspecifications = newPropertyspecifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS, oldPropertyspecifications, newPropertyspecifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyspecifications(PropertySpecifications newPropertyspecifications) {
		if (newPropertyspecifications != propertyspecifications) {
			NotificationChain msgs = null;
			if (propertyspecifications != null)
				msgs = ((InternalEObject)propertyspecifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS, null, msgs);
			if (newPropertyspecifications != null)
				msgs = ((InternalEObject)newPropertyspecifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS, null, msgs);
			msgs = basicSetPropertyspecifications(newPropertyspecifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS, newPropertyspecifications, newPropertyspecifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER:
				return basicSetHeader(null, msgs);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT:
				return basicSetSizehint(null, msgs);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY:
				return basicSetSizepolicy(null, msgs);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT:
				return basicSetScript(null, msgs);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES:
				return basicSetProperties(null, msgs);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS:
				return basicSetSlots(null, msgs);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS:
				return basicSetPropertyspecifications(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CLASS:
				return getClass_();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__EXTENDS:
				return getExtends();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER:
				return getHeader();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT:
				return getSizehint();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__ADDPAGEMETHOD:
				return getAddpagemethod();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CONTAINER:
				return getContainer();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY:
				return getSizepolicy();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PIXMAP:
				return getPixmap();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT:
				return getScript();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES:
				return getProperties();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS:
				return getSlots();
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS:
				return getPropertyspecifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CLASS:
				setClass((String)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__EXTENDS:
				setExtends((String)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER:
				setHeader((Header)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT:
				setSizehint((Size)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__ADDPAGEMETHOD:
				setAddpagemethod((String)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CONTAINER:
				setContainer((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY:
				setSizepolicy((SizePolicyData)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PIXMAP:
				setPixmap((String)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT:
				setScript((Script)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS:
				setSlots((Slots)newValue);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS:
				setPropertyspecifications((PropertySpecifications)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER:
				setHeader((Header)null);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT:
				setSizehint((Size)null);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__ADDPAGEMETHOD:
				setAddpagemethod(ADDPAGEMETHOD_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY:
				setSizepolicy((SizePolicyData)null);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PIXMAP:
				setPixmap(PIXMAP_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT:
				setScript((Script)null);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES:
				setProperties((Properties)null);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS:
				setSlots((Slots)null);
				return;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS:
				setPropertyspecifications((PropertySpecifications)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__HEADER:
				return header != null;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEHINT:
				return sizehint != null;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__ADDPAGEMETHOD:
				return ADDPAGEMETHOD_EDEFAULT == null ? addpagemethod != null : !ADDPAGEMETHOD_EDEFAULT.equals(addpagemethod);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SIZEPOLICY:
				return sizepolicy != null;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PIXMAP:
				return PIXMAP_EDEFAULT == null ? pixmap != null : !PIXMAP_EDEFAULT.equals(pixmap);
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SCRIPT:
				return script != null;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTIES:
				return properties != null;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__SLOTS:
				return slots != null;
			case Qt48XmlschemaPackage.CUSTOM_WIDGET__PROPERTYSPECIFICATIONS:
				return propertyspecifications != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (class: "); //$NON-NLS-1$
		result.append(class_);
		result.append(", extends: "); //$NON-NLS-1$
		result.append(extends_);
		result.append(", addpagemethod: "); //$NON-NLS-1$
		result.append(addpagemethod);
		result.append(", container: "); //$NON-NLS-1$
		result.append(container);
		result.append(", pixmap: "); //$NON-NLS-1$
		result.append(pixmap);
		result.append(')');
		return result.toString();
	}

} //CustomWidgetImpl
