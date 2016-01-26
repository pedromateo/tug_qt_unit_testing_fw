/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.util.Collection;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionGroup;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ActionRef;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Column;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Item;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Row;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Script;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.WidgetData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getWidgetdata <em>Widgetdata</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getWidget <em>Widget</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getActiongroup <em>Actiongroup</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getAddaction <em>Addaction</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getZorder <em>Zorder</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getClass1 <em>Class1</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.WidgetImpl#isNative <em>Native</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends MinimalEObjectImpl.Container implements Widget {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<String> class_;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> script;

	/**
	 * The cached value of the '{@link #getWidgetdata() <em>Widgetdata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetdata()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetData> widgetdata;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> attribute;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> row;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> layout;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widget;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getActiongroup() <em>Actiongroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiongroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionGroup> actiongroup;

	/**
	 * The cached value of the '{@link #getAddaction() <em>Addaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddaction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionRef> addaction;

	/**
	 * The cached value of the '{@link #getZorder() <em>Zorder</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZorder()
	 * @generated
	 * @ordered
	 */
	protected EList<String> zorder;

	/**
	 * The default value of the '{@link #getClass1() <em>Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass1() <em>Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1()
	 * @generated
	 * @ordered
	 */
	protected String class1 = CLASS1_EDEFAULT;

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
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected boolean native_ = NATIVE_EDEFAULT;

	/**
	 * This is true if the Native attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nativeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClass_() {
		if (class_ == null) {
			class_ = new EDataTypeEList<String>(String.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<Script>(Script.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetData> getWidgetdata() {
		if (widgetdata == null) {
			widgetdata = new EObjectContainmentEList<WidgetData>(WidgetData.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGETDATA);
		}
		return widgetdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Property>(Property.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRow() {
		if (row == null) {
			row = new EObjectContainmentEList<Row>(Row.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__ROW);
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column>(Column.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<Item>(Item.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getLayout() {
		if (layout == null) {
			layout = new EObjectContainmentEList<Layout>(Layout.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__LAYOUT);
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidget() {
		if (widget == null) {
			widget = new EObjectContainmentEList<Widget>(Widget.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGET);
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionGroup> getActiongroup() {
		if (actiongroup == null) {
			actiongroup = new EObjectContainmentEList<ActionGroup>(ActionGroup.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTIONGROUP);
		}
		return actiongroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionRef> getAddaction() {
		if (addaction == null) {
			addaction = new EObjectContainmentEList<ActionRef>(ActionRef.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__ADDACTION);
		}
		return addaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getZorder() {
		if (zorder == null) {
			zorder = new EDataTypeEList<String>(String.class, this, Qt48XmlschemaQwtEnhancedPackage.WIDGET__ZORDER);
		}
		return zorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass1() {
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass1(String newClass1) {
		String oldClass1 = class1;
		class1 = newClass1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS1, oldClass1, class1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNative() {
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative(boolean newNative) {
		boolean oldNative = native_;
		native_ = newNative;
		boolean oldNativeESet = nativeESet;
		nativeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.WIDGET__NATIVE, oldNative, native_, !oldNativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNative() {
		boolean oldNative = native_;
		boolean oldNativeESet = nativeESet;
		native_ = NATIVE_EDEFAULT;
		nativeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.WIDGET__NATIVE, oldNative, NATIVE_EDEFAULT, oldNativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNative() {
		return nativeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGETDATA:
				return ((InternalEList<?>)getWidgetdata()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ROW:
				return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__LAYOUT:
				return ((InternalEList<?>)getLayout()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGET:
				return ((InternalEList<?>)getWidget()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTIONGROUP:
				return ((InternalEList<?>)getActiongroup()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ADDACTION:
				return ((InternalEList<?>)getAddaction()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS:
				return getClass_();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__PROPERTY:
				return getProperty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__SCRIPT:
				return getScript();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGETDATA:
				return getWidgetdata();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ATTRIBUTE:
				return getAttribute();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ROW:
				return getRow();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__COLUMN:
				return getColumn();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ITEM:
				return getItem();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__LAYOUT:
				return getLayout();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGET:
				return getWidget();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTION:
				return getAction();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTIONGROUP:
				return getActiongroup();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ADDACTION:
				return getAddaction();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ZORDER:
				return getZorder();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS1:
				return getClass1();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NAME:
				return getName();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NATIVE:
				return isNative();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends String>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends Script>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGETDATA:
				getWidgetdata().clear();
				getWidgetdata().addAll((Collection<? extends WidgetData>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ROW:
				getRow().clear();
				getRow().addAll((Collection<? extends Row>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__LAYOUT:
				getLayout().clear();
				getLayout().addAll((Collection<? extends Layout>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGET:
				getWidget().clear();
				getWidget().addAll((Collection<? extends Widget>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTIONGROUP:
				getActiongroup().clear();
				getActiongroup().addAll((Collection<? extends ActionGroup>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ADDACTION:
				getAddaction().clear();
				getAddaction().addAll((Collection<? extends ActionRef>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ZORDER:
				getZorder().clear();
				getZorder().addAll((Collection<? extends String>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS1:
				setClass1((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NAME:
				setName((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NATIVE:
				setNative((Boolean)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS:
				getClass_().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__PROPERTY:
				getProperty().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__SCRIPT:
				getScript().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGETDATA:
				getWidgetdata().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ATTRIBUTE:
				getAttribute().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ROW:
				getRow().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__COLUMN:
				getColumn().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ITEM:
				getItem().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__LAYOUT:
				getLayout().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGET:
				getWidget().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTION:
				getAction().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTIONGROUP:
				getActiongroup().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ADDACTION:
				getAddaction().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ZORDER:
				getZorder().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS1:
				setClass1(CLASS1_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NATIVE:
				unsetNative();
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
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS:
				return class_ != null && !class_.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__PROPERTY:
				return property != null && !property.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__SCRIPT:
				return script != null && !script.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGETDATA:
				return widgetdata != null && !widgetdata.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ROW:
				return row != null && !row.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__COLUMN:
				return column != null && !column.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ITEM:
				return item != null && !item.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__LAYOUT:
				return layout != null && !layout.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__WIDGET:
				return widget != null && !widget.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTION:
				return action != null && !action.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ACTIONGROUP:
				return actiongroup != null && !actiongroup.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ADDACTION:
				return addaction != null && !addaction.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__ZORDER:
				return zorder != null && !zorder.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__CLASS1:
				return CLASS1_EDEFAULT == null ? class1 != null : !CLASS1_EDEFAULT.equals(class1);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Qt48XmlschemaQwtEnhancedPackage.WIDGET__NATIVE:
				return isSetNative();
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", zorder: ");
		result.append(zorder);
		result.append(", class1: ");
		result.append(class1);
		result.append(", name: ");
		result.append(name);
		result.append(", native: ");
		if (nativeESet) result.append(native_); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
