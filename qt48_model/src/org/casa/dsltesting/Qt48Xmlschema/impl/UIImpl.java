/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.lang.String;

import java.math.BigInteger;

import org.casa.dsltesting.Qt48Xmlschema.ButtonGroups;
import org.casa.dsltesting.Qt48Xmlschema.Connections;
import org.casa.dsltesting.Qt48Xmlschema.CustomWidgets;
import org.casa.dsltesting.Qt48Xmlschema.DesignerData;
import org.casa.dsltesting.Qt48Xmlschema.Images;
import org.casa.dsltesting.Qt48Xmlschema.Includes;
import org.casa.dsltesting.Qt48Xmlschema.LayoutDefault;
import org.casa.dsltesting.Qt48Xmlschema.LayoutFunction;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.Resources;
import org.casa.dsltesting.Qt48Xmlschema.Slots;
import org.casa.dsltesting.Qt48Xmlschema.TabStops;
import org.casa.dsltesting.Qt48Xmlschema.UI;
import org.casa.dsltesting.Qt48Xmlschema.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getExportmacro <em>Exportmacro</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getWidget <em>Widget</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getLayoutdefault <em>Layoutdefault</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getLayoutfunction <em>Layoutfunction</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getPixmapfunction <em>Pixmapfunction</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getCustomwidgets <em>Customwidgets</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getTabstops <em>Tabstops</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getImages <em>Images</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getDesignerdata <em>Designerdata</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getButtongroups <em>Buttongroups</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getDisplayname <em>Displayname</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getStdsetdef <em>Stdsetdef</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getStdSetDef1 <em>Std Set Def1</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.UIImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIImpl extends EObjectImpl implements UI {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExportmacro() <em>Exportmacro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportmacro()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTMACRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportmacro() <em>Exportmacro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportmacro()
	 * @generated
	 * @ordered
	 */
	protected String exportmacro = EXPORTMACRO_EDEFAULT;

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
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget widget;

	/**
	 * The cached value of the '{@link #getLayoutdefault() <em>Layoutdefault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutdefault()
	 * @generated
	 * @ordered
	 */
	protected LayoutDefault layoutdefault;

	/**
	 * The cached value of the '{@link #getLayoutfunction() <em>Layoutfunction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutfunction()
	 * @generated
	 * @ordered
	 */
	protected LayoutFunction layoutfunction;

	/**
	 * The default value of the '{@link #getPixmapfunction() <em>Pixmapfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixmapfunction()
	 * @generated
	 * @ordered
	 */
	protected static final String PIXMAPFUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPixmapfunction() <em>Pixmapfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixmapfunction()
	 * @generated
	 * @ordered
	 */
	protected String pixmapfunction = PIXMAPFUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomwidgets() <em>Customwidgets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomwidgets()
	 * @generated
	 * @ordered
	 */
	protected CustomWidgets customwidgets;

	/**
	 * The cached value of the '{@link #getTabstops() <em>Tabstops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabstops()
	 * @generated
	 * @ordered
	 */
	protected TabStops tabstops;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected Images images;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected Includes includes;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected Resources resources;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected Connections connections;

	/**
	 * The cached value of the '{@link #getDesignerdata() <em>Designerdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignerdata()
	 * @generated
	 * @ordered
	 */
	protected DesignerData designerdata;

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
	 * The cached value of the '{@link #getButtongroups() <em>Buttongroups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtongroups()
	 * @generated
	 * @ordered
	 */
	protected ButtonGroups buttongroups;

	/**
	 * The default value of the '{@link #getDisplayname() <em>Displayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayname()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayname() <em>Displayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayname()
	 * @generated
	 * @ordered
	 */
	protected String displayname = DISPLAYNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdsetdef() <em>Stdsetdef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdsetdef()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STDSETDEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdsetdef() <em>Stdsetdef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdsetdef()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stdsetdef = STDSETDEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdSetDef1() <em>Std Set Def1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdSetDef1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STD_SET_DEF1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdSetDef1() <em>Std Set Def1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdSetDef1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stdSetDef1 = STD_SET_DEF1_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExportmacro() {
		return exportmacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportmacro(String newExportmacro) {
		String oldExportmacro = exportmacro;
		exportmacro = newExportmacro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__EXPORTMACRO, oldExportmacro, exportmacro));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget getWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidget(Widget newWidget, NotificationChain msgs) {
		Widget oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__WIDGET, oldWidget, newWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidget(Widget newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null)
				msgs = ((InternalEObject)widget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__WIDGET, null, msgs);
			if (newWidget != null)
				msgs = ((InternalEObject)newWidget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__WIDGET, null, msgs);
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__WIDGET, newWidget, newWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDefault getLayoutdefault() {
		return layoutdefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutdefault(LayoutDefault newLayoutdefault, NotificationChain msgs) {
		LayoutDefault oldLayoutdefault = layoutdefault;
		layoutdefault = newLayoutdefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__LAYOUTDEFAULT, oldLayoutdefault, newLayoutdefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutdefault(LayoutDefault newLayoutdefault) {
		if (newLayoutdefault != layoutdefault) {
			NotificationChain msgs = null;
			if (layoutdefault != null)
				msgs = ((InternalEObject)layoutdefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__LAYOUTDEFAULT, null, msgs);
			if (newLayoutdefault != null)
				msgs = ((InternalEObject)newLayoutdefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__LAYOUTDEFAULT, null, msgs);
			msgs = basicSetLayoutdefault(newLayoutdefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__LAYOUTDEFAULT, newLayoutdefault, newLayoutdefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFunction getLayoutfunction() {
		return layoutfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutfunction(LayoutFunction newLayoutfunction, NotificationChain msgs) {
		LayoutFunction oldLayoutfunction = layoutfunction;
		layoutfunction = newLayoutfunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__LAYOUTFUNCTION, oldLayoutfunction, newLayoutfunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutfunction(LayoutFunction newLayoutfunction) {
		if (newLayoutfunction != layoutfunction) {
			NotificationChain msgs = null;
			if (layoutfunction != null)
				msgs = ((InternalEObject)layoutfunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__LAYOUTFUNCTION, null, msgs);
			if (newLayoutfunction != null)
				msgs = ((InternalEObject)newLayoutfunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__LAYOUTFUNCTION, null, msgs);
			msgs = basicSetLayoutfunction(newLayoutfunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__LAYOUTFUNCTION, newLayoutfunction, newLayoutfunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPixmapfunction() {
		return pixmapfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixmapfunction(String newPixmapfunction) {
		String oldPixmapfunction = pixmapfunction;
		pixmapfunction = newPixmapfunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__PIXMAPFUNCTION, oldPixmapfunction, pixmapfunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomWidgets getCustomwidgets() {
		return customwidgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomwidgets(CustomWidgets newCustomwidgets, NotificationChain msgs) {
		CustomWidgets oldCustomwidgets = customwidgets;
		customwidgets = newCustomwidgets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__CUSTOMWIDGETS, oldCustomwidgets, newCustomwidgets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomwidgets(CustomWidgets newCustomwidgets) {
		if (newCustomwidgets != customwidgets) {
			NotificationChain msgs = null;
			if (customwidgets != null)
				msgs = ((InternalEObject)customwidgets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__CUSTOMWIDGETS, null, msgs);
			if (newCustomwidgets != null)
				msgs = ((InternalEObject)newCustomwidgets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__CUSTOMWIDGETS, null, msgs);
			msgs = basicSetCustomwidgets(newCustomwidgets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__CUSTOMWIDGETS, newCustomwidgets, newCustomwidgets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabStops getTabstops() {
		return tabstops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabstops(TabStops newTabstops, NotificationChain msgs) {
		TabStops oldTabstops = tabstops;
		tabstops = newTabstops;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__TABSTOPS, oldTabstops, newTabstops);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabstops(TabStops newTabstops) {
		if (newTabstops != tabstops) {
			NotificationChain msgs = null;
			if (tabstops != null)
				msgs = ((InternalEObject)tabstops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__TABSTOPS, null, msgs);
			if (newTabstops != null)
				msgs = ((InternalEObject)newTabstops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__TABSTOPS, null, msgs);
			msgs = basicSetTabstops(newTabstops, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__TABSTOPS, newTabstops, newTabstops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Images getImages() {
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImages(Images newImages, NotificationChain msgs) {
		Images oldImages = images;
		images = newImages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__IMAGES, oldImages, newImages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImages(Images newImages) {
		if (newImages != images) {
			NotificationChain msgs = null;
			if (images != null)
				msgs = ((InternalEObject)images).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__IMAGES, null, msgs);
			if (newImages != null)
				msgs = ((InternalEObject)newImages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__IMAGES, null, msgs);
			msgs = basicSetImages(newImages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__IMAGES, newImages, newImages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Includes getIncludes() {
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludes(Includes newIncludes, NotificationChain msgs) {
		Includes oldIncludes = includes;
		includes = newIncludes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__INCLUDES, oldIncludes, newIncludes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludes(Includes newIncludes) {
		if (newIncludes != includes) {
			NotificationChain msgs = null;
			if (includes != null)
				msgs = ((InternalEObject)includes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__INCLUDES, null, msgs);
			if (newIncludes != null)
				msgs = ((InternalEObject)newIncludes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__INCLUDES, null, msgs);
			msgs = basicSetIncludes(newIncludes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__INCLUDES, newIncludes, newIncludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(Resources newResources, NotificationChain msgs) {
		Resources oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(Resources newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connections getConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnections(Connections newConnections, NotificationChain msgs) {
		Connections oldConnections = connections;
		connections = newConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__CONNECTIONS, oldConnections, newConnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnections(Connections newConnections) {
		if (newConnections != connections) {
			NotificationChain msgs = null;
			if (connections != null)
				msgs = ((InternalEObject)connections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__CONNECTIONS, null, msgs);
			if (newConnections != null)
				msgs = ((InternalEObject)newConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__CONNECTIONS, null, msgs);
			msgs = basicSetConnections(newConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__CONNECTIONS, newConnections, newConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignerData getDesignerdata() {
		return designerdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignerdata(DesignerData newDesignerdata, NotificationChain msgs) {
		DesignerData oldDesignerdata = designerdata;
		designerdata = newDesignerdata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__DESIGNERDATA, oldDesignerdata, newDesignerdata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignerdata(DesignerData newDesignerdata) {
		if (newDesignerdata != designerdata) {
			NotificationChain msgs = null;
			if (designerdata != null)
				msgs = ((InternalEObject)designerdata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__DESIGNERDATA, null, msgs);
			if (newDesignerdata != null)
				msgs = ((InternalEObject)newDesignerdata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__DESIGNERDATA, null, msgs);
			msgs = basicSetDesignerdata(newDesignerdata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__DESIGNERDATA, newDesignerdata, newDesignerdata));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__SLOTS, oldSlots, newSlots);
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
				msgs = ((InternalEObject)slots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__SLOTS, null, msgs);
			if (newSlots != null)
				msgs = ((InternalEObject)newSlots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__SLOTS, null, msgs);
			msgs = basicSetSlots(newSlots, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__SLOTS, newSlots, newSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonGroups getButtongroups() {
		return buttongroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetButtongroups(ButtonGroups newButtongroups, NotificationChain msgs) {
		ButtonGroups oldButtongroups = buttongroups;
		buttongroups = newButtongroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__BUTTONGROUPS, oldButtongroups, newButtongroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtongroups(ButtonGroups newButtongroups) {
		if (newButtongroups != buttongroups) {
			NotificationChain msgs = null;
			if (buttongroups != null)
				msgs = ((InternalEObject)buttongroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__BUTTONGROUPS, null, msgs);
			if (newButtongroups != null)
				msgs = ((InternalEObject)newButtongroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.UI__BUTTONGROUPS, null, msgs);
			msgs = basicSetButtongroups(newButtongroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__BUTTONGROUPS, newButtongroups, newButtongroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayname() {
		return displayname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayname(String newDisplayname) {
		String oldDisplayname = displayname;
		displayname = newDisplayname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__DISPLAYNAME, oldDisplayname, displayname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStdsetdef() {
		return stdsetdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdsetdef(BigInteger newStdsetdef) {
		BigInteger oldStdsetdef = stdsetdef;
		stdsetdef = newStdsetdef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__STDSETDEF, oldStdsetdef, stdsetdef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStdSetDef1() {
		return stdSetDef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdSetDef1(BigInteger newStdSetDef1) {
		BigInteger oldStdSetDef1 = stdSetDef1;
		stdSetDef1 = newStdSetDef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__STD_SET_DEF1, oldStdSetDef1, stdSetDef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.UI__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.UI__WIDGET:
				return basicSetWidget(null, msgs);
			case Qt48XmlschemaPackage.UI__LAYOUTDEFAULT:
				return basicSetLayoutdefault(null, msgs);
			case Qt48XmlschemaPackage.UI__LAYOUTFUNCTION:
				return basicSetLayoutfunction(null, msgs);
			case Qt48XmlschemaPackage.UI__CUSTOMWIDGETS:
				return basicSetCustomwidgets(null, msgs);
			case Qt48XmlschemaPackage.UI__TABSTOPS:
				return basicSetTabstops(null, msgs);
			case Qt48XmlschemaPackage.UI__IMAGES:
				return basicSetImages(null, msgs);
			case Qt48XmlschemaPackage.UI__INCLUDES:
				return basicSetIncludes(null, msgs);
			case Qt48XmlschemaPackage.UI__RESOURCES:
				return basicSetResources(null, msgs);
			case Qt48XmlschemaPackage.UI__CONNECTIONS:
				return basicSetConnections(null, msgs);
			case Qt48XmlschemaPackage.UI__DESIGNERDATA:
				return basicSetDesignerdata(null, msgs);
			case Qt48XmlschemaPackage.UI__SLOTS:
				return basicSetSlots(null, msgs);
			case Qt48XmlschemaPackage.UI__BUTTONGROUPS:
				return basicSetButtongroups(null, msgs);
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
			case Qt48XmlschemaPackage.UI__AUTHOR:
				return getAuthor();
			case Qt48XmlschemaPackage.UI__COMMENT:
				return getComment();
			case Qt48XmlschemaPackage.UI__EXPORTMACRO:
				return getExportmacro();
			case Qt48XmlschemaPackage.UI__CLASS:
				return getClass_();
			case Qt48XmlschemaPackage.UI__WIDGET:
				return getWidget();
			case Qt48XmlschemaPackage.UI__LAYOUTDEFAULT:
				return getLayoutdefault();
			case Qt48XmlschemaPackage.UI__LAYOUTFUNCTION:
				return getLayoutfunction();
			case Qt48XmlschemaPackage.UI__PIXMAPFUNCTION:
				return getPixmapfunction();
			case Qt48XmlschemaPackage.UI__CUSTOMWIDGETS:
				return getCustomwidgets();
			case Qt48XmlschemaPackage.UI__TABSTOPS:
				return getTabstops();
			case Qt48XmlschemaPackage.UI__IMAGES:
				return getImages();
			case Qt48XmlschemaPackage.UI__INCLUDES:
				return getIncludes();
			case Qt48XmlschemaPackage.UI__RESOURCES:
				return getResources();
			case Qt48XmlschemaPackage.UI__CONNECTIONS:
				return getConnections();
			case Qt48XmlschemaPackage.UI__DESIGNERDATA:
				return getDesignerdata();
			case Qt48XmlschemaPackage.UI__SLOTS:
				return getSlots();
			case Qt48XmlschemaPackage.UI__BUTTONGROUPS:
				return getButtongroups();
			case Qt48XmlschemaPackage.UI__DISPLAYNAME:
				return getDisplayname();
			case Qt48XmlschemaPackage.UI__LANGUAGE:
				return getLanguage();
			case Qt48XmlschemaPackage.UI__STDSETDEF:
				return getStdsetdef();
			case Qt48XmlschemaPackage.UI__STD_SET_DEF1:
				return getStdSetDef1();
			case Qt48XmlschemaPackage.UI__VERSION:
				return getVersion();
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
			case Qt48XmlschemaPackage.UI__AUTHOR:
				setAuthor((String)newValue);
				return;
			case Qt48XmlschemaPackage.UI__COMMENT:
				setComment((String)newValue);
				return;
			case Qt48XmlschemaPackage.UI__EXPORTMACRO:
				setExportmacro((String)newValue);
				return;
			case Qt48XmlschemaPackage.UI__CLASS:
				setClass((String)newValue);
				return;
			case Qt48XmlschemaPackage.UI__WIDGET:
				setWidget((Widget)newValue);
				return;
			case Qt48XmlschemaPackage.UI__LAYOUTDEFAULT:
				setLayoutdefault((LayoutDefault)newValue);
				return;
			case Qt48XmlschemaPackage.UI__LAYOUTFUNCTION:
				setLayoutfunction((LayoutFunction)newValue);
				return;
			case Qt48XmlschemaPackage.UI__PIXMAPFUNCTION:
				setPixmapfunction((String)newValue);
				return;
			case Qt48XmlschemaPackage.UI__CUSTOMWIDGETS:
				setCustomwidgets((CustomWidgets)newValue);
				return;
			case Qt48XmlschemaPackage.UI__TABSTOPS:
				setTabstops((TabStops)newValue);
				return;
			case Qt48XmlschemaPackage.UI__IMAGES:
				setImages((Images)newValue);
				return;
			case Qt48XmlschemaPackage.UI__INCLUDES:
				setIncludes((Includes)newValue);
				return;
			case Qt48XmlschemaPackage.UI__RESOURCES:
				setResources((Resources)newValue);
				return;
			case Qt48XmlschemaPackage.UI__CONNECTIONS:
				setConnections((Connections)newValue);
				return;
			case Qt48XmlschemaPackage.UI__DESIGNERDATA:
				setDesignerdata((DesignerData)newValue);
				return;
			case Qt48XmlschemaPackage.UI__SLOTS:
				setSlots((Slots)newValue);
				return;
			case Qt48XmlschemaPackage.UI__BUTTONGROUPS:
				setButtongroups((ButtonGroups)newValue);
				return;
			case Qt48XmlschemaPackage.UI__DISPLAYNAME:
				setDisplayname((String)newValue);
				return;
			case Qt48XmlschemaPackage.UI__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case Qt48XmlschemaPackage.UI__STDSETDEF:
				setStdsetdef((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.UI__STD_SET_DEF1:
				setStdSetDef1((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.UI__VERSION:
				setVersion((String)newValue);
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
			case Qt48XmlschemaPackage.UI__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__EXPORTMACRO:
				setExportmacro(EXPORTMACRO_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__WIDGET:
				setWidget((Widget)null);
				return;
			case Qt48XmlschemaPackage.UI__LAYOUTDEFAULT:
				setLayoutdefault((LayoutDefault)null);
				return;
			case Qt48XmlschemaPackage.UI__LAYOUTFUNCTION:
				setLayoutfunction((LayoutFunction)null);
				return;
			case Qt48XmlschemaPackage.UI__PIXMAPFUNCTION:
				setPixmapfunction(PIXMAPFUNCTION_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__CUSTOMWIDGETS:
				setCustomwidgets((CustomWidgets)null);
				return;
			case Qt48XmlschemaPackage.UI__TABSTOPS:
				setTabstops((TabStops)null);
				return;
			case Qt48XmlschemaPackage.UI__IMAGES:
				setImages((Images)null);
				return;
			case Qt48XmlschemaPackage.UI__INCLUDES:
				setIncludes((Includes)null);
				return;
			case Qt48XmlschemaPackage.UI__RESOURCES:
				setResources((Resources)null);
				return;
			case Qt48XmlschemaPackage.UI__CONNECTIONS:
				setConnections((Connections)null);
				return;
			case Qt48XmlschemaPackage.UI__DESIGNERDATA:
				setDesignerdata((DesignerData)null);
				return;
			case Qt48XmlschemaPackage.UI__SLOTS:
				setSlots((Slots)null);
				return;
			case Qt48XmlschemaPackage.UI__BUTTONGROUPS:
				setButtongroups((ButtonGroups)null);
				return;
			case Qt48XmlschemaPackage.UI__DISPLAYNAME:
				setDisplayname(DISPLAYNAME_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__STDSETDEF:
				setStdsetdef(STDSETDEF_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__STD_SET_DEF1:
				setStdSetDef1(STD_SET_DEF1_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.UI__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case Qt48XmlschemaPackage.UI__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case Qt48XmlschemaPackage.UI__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Qt48XmlschemaPackage.UI__EXPORTMACRO:
				return EXPORTMACRO_EDEFAULT == null ? exportmacro != null : !EXPORTMACRO_EDEFAULT.equals(exportmacro);
			case Qt48XmlschemaPackage.UI__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Qt48XmlschemaPackage.UI__WIDGET:
				return widget != null;
			case Qt48XmlschemaPackage.UI__LAYOUTDEFAULT:
				return layoutdefault != null;
			case Qt48XmlschemaPackage.UI__LAYOUTFUNCTION:
				return layoutfunction != null;
			case Qt48XmlschemaPackage.UI__PIXMAPFUNCTION:
				return PIXMAPFUNCTION_EDEFAULT == null ? pixmapfunction != null : !PIXMAPFUNCTION_EDEFAULT.equals(pixmapfunction);
			case Qt48XmlschemaPackage.UI__CUSTOMWIDGETS:
				return customwidgets != null;
			case Qt48XmlschemaPackage.UI__TABSTOPS:
				return tabstops != null;
			case Qt48XmlschemaPackage.UI__IMAGES:
				return images != null;
			case Qt48XmlschemaPackage.UI__INCLUDES:
				return includes != null;
			case Qt48XmlschemaPackage.UI__RESOURCES:
				return resources != null;
			case Qt48XmlschemaPackage.UI__CONNECTIONS:
				return connections != null;
			case Qt48XmlschemaPackage.UI__DESIGNERDATA:
				return designerdata != null;
			case Qt48XmlschemaPackage.UI__SLOTS:
				return slots != null;
			case Qt48XmlschemaPackage.UI__BUTTONGROUPS:
				return buttongroups != null;
			case Qt48XmlschemaPackage.UI__DISPLAYNAME:
				return DISPLAYNAME_EDEFAULT == null ? displayname != null : !DISPLAYNAME_EDEFAULT.equals(displayname);
			case Qt48XmlschemaPackage.UI__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Qt48XmlschemaPackage.UI__STDSETDEF:
				return STDSETDEF_EDEFAULT == null ? stdsetdef != null : !STDSETDEF_EDEFAULT.equals(stdsetdef);
			case Qt48XmlschemaPackage.UI__STD_SET_DEF1:
				return STD_SET_DEF1_EDEFAULT == null ? stdSetDef1 != null : !STD_SET_DEF1_EDEFAULT.equals(stdSetDef1);
			case Qt48XmlschemaPackage.UI__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (author: "); //$NON-NLS-1$
		result.append(author);
		result.append(", comment: "); //$NON-NLS-1$
		result.append(comment);
		result.append(", exportmacro: "); //$NON-NLS-1$
		result.append(exportmacro);
		result.append(", class: "); //$NON-NLS-1$
		result.append(class_);
		result.append(", pixmapfunction: "); //$NON-NLS-1$
		result.append(pixmapfunction);
		result.append(", displayname: "); //$NON-NLS-1$
		result.append(displayname);
		result.append(", language: "); //$NON-NLS-1$
		result.append(language);
		result.append(", stdsetdef: "); //$NON-NLS-1$
		result.append(stdsetdef);
		result.append(", stdSetDef1: "); //$NON-NLS-1$
		result.append(stdSetDef1);
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //UIImpl
