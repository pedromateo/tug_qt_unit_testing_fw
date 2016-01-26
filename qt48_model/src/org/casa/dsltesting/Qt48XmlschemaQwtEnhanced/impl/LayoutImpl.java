/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.util.Collection;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getColumnminimumwidth <em>Columnminimumwidth</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getColumnstretch <em>Columnstretch</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getRowminimumheight <em>Rowminimumheight</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getRowstretch <em>Rowstretch</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutImpl#getStretch <em>Stretch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getColumnminimumwidth() <em>Columnminimumwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnminimumwidth()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNMINIMUMWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnminimumwidth() <em>Columnminimumwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnminimumwidth()
	 * @generated
	 * @ordered
	 */
	protected String columnminimumwidth = COLUMNMINIMUMWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnstretch() <em>Columnstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnstretch()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNSTRETCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnstretch() <em>Columnstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnstretch()
	 * @generated
	 * @ordered
	 */
	protected String columnstretch = COLUMNSTRETCH_EDEFAULT;

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
	 * The default value of the '{@link #getRowminimumheight() <em>Rowminimumheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowminimumheight()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWMINIMUMHEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowminimumheight() <em>Rowminimumheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowminimumheight()
	 * @generated
	 * @ordered
	 */
	protected String rowminimumheight = ROWMINIMUMHEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowstretch() <em>Rowstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowstretch()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWSTRETCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowstretch() <em>Rowstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowstretch()
	 * @generated
	 * @ordered
	 */
	protected String rowstretch = ROWSTRETCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStretch() <em>Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretch()
	 * @generated
	 * @ordered
	 */
	protected static final String STRETCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStretch() <em>Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStretch()
	 * @generated
	 * @ordered
	 */
	protected String stretch = STRETCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Qt48XmlschemaQwtEnhancedPackage.Literals.LAYOUT__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		return getGroup().list(Qt48XmlschemaQwtEnhancedPackage.Literals.LAYOUT__ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LayoutItem> getItem() {
		return getGroup().list(Qt48XmlschemaQwtEnhancedPackage.Literals.LAYOUT__ITEM);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnminimumwidth() {
		return columnminimumwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnminimumwidth(String newColumnminimumwidth) {
		String oldColumnminimumwidth = columnminimumwidth;
		columnminimumwidth = newColumnminimumwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNMINIMUMWIDTH, oldColumnminimumwidth, columnminimumwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnstretch() {
		return columnstretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnstretch(String newColumnstretch) {
		String oldColumnstretch = columnstretch;
		columnstretch = newColumnstretch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNSTRETCH, oldColumnstretch, columnstretch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowminimumheight() {
		return rowminimumheight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowminimumheight(String newRowminimumheight) {
		String oldRowminimumheight = rowminimumheight;
		rowminimumheight = newRowminimumheight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWMINIMUMHEIGHT, oldRowminimumheight, rowminimumheight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowstretch() {
		return rowstretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowstretch(String newRowstretch) {
		String oldRowstretch = rowstretch;
		rowstretch = newRowstretch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWSTRETCH, oldRowstretch, rowstretch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStretch() {
		return stretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStretch(String newStretch) {
		String oldStretch = stretch;
		stretch = newStretch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT__STRETCH, oldStretch, stretch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__PROPERTY:
				return getProperty();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ATTRIBUTE:
				return getAttribute();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ITEM:
				return getItem();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__CLASS:
				return getClass_();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNMINIMUMWIDTH:
				return getColumnminimumwidth();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNSTRETCH:
				return getColumnstretch();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__NAME:
				return getName();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWMINIMUMHEIGHT:
				return getRowminimumheight();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWSTRETCH:
				return getRowstretch();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__STRETCH:
				return getStretch();
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends LayoutItem>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__CLASS:
				setClass((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNMINIMUMWIDTH:
				setColumnminimumwidth((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNSTRETCH:
				setColumnstretch((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__NAME:
				setName((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWMINIMUMHEIGHT:
				setRowminimumheight((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWSTRETCH:
				setRowstretch((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__STRETCH:
				setStretch((String)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__GROUP:
				getGroup().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__PROPERTY:
				getProperty().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ITEM:
				getItem().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNMINIMUMWIDTH:
				setColumnminimumwidth(COLUMNMINIMUMWIDTH_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNSTRETCH:
				setColumnstretch(COLUMNSTRETCH_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWMINIMUMHEIGHT:
				setRowminimumheight(ROWMINIMUMHEIGHT_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWSTRETCH:
				setRowstretch(ROWSTRETCH_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__STRETCH:
				setStretch(STRETCH_EDEFAULT);
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__GROUP:
				return group != null && !group.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__PROPERTY:
				return !getProperty().isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ATTRIBUTE:
				return !getAttribute().isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ITEM:
				return !getItem().isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNMINIMUMWIDTH:
				return COLUMNMINIMUMWIDTH_EDEFAULT == null ? columnminimumwidth != null : !COLUMNMINIMUMWIDTH_EDEFAULT.equals(columnminimumwidth);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__COLUMNSTRETCH:
				return COLUMNSTRETCH_EDEFAULT == null ? columnstretch != null : !COLUMNSTRETCH_EDEFAULT.equals(columnstretch);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWMINIMUMHEIGHT:
				return ROWMINIMUMHEIGHT_EDEFAULT == null ? rowminimumheight != null : !ROWMINIMUMHEIGHT_EDEFAULT.equals(rowminimumheight);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__ROWSTRETCH:
				return ROWSTRETCH_EDEFAULT == null ? rowstretch != null : !ROWSTRETCH_EDEFAULT.equals(rowstretch);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT__STRETCH:
				return STRETCH_EDEFAULT == null ? stretch != null : !STRETCH_EDEFAULT.equals(stretch);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", class: ");
		result.append(class_);
		result.append(", columnminimumwidth: ");
		result.append(columnminimumwidth);
		result.append(", columnstretch: ");
		result.append(columnstretch);
		result.append(", name: ");
		result.append(name);
		result.append(", rowminimumheight: ");
		result.append(rowminimumheight);
		result.append(", rowstretch: ");
		result.append(rowstretch);
		result.append(", stretch: ");
		result.append(stretch);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
