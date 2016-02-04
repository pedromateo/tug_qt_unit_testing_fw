/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.util.Collection;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Action;
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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ActionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getMenu() <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected static final String MENU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected String menu = MENU_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Qt48XmlschemaQwtEnhancedPackage.ACTION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Qt48XmlschemaQwtEnhancedPackage.Literals.ACTION__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		return getGroup().list(Qt48XmlschemaQwtEnhancedPackage.Literals.ACTION__ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(String newMenu) {
		String oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.ACTION__MENU, oldMenu, menu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__PROPERTY:
				return getProperty();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__ATTRIBUTE:
				return getAttribute();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__MENU:
				return getMenu();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__NAME:
				return getName();
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
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__MENU:
				setMenu((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__NAME:
				setName((String)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__GROUP:
				getGroup().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__PROPERTY:
				getProperty().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__MENU:
				setMenu(MENU_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
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
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__GROUP:
				return group != null && !group.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__PROPERTY:
				return !getProperty().isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__ATTRIBUTE:
				return !getAttribute().isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__MENU:
				return MENU_EDEFAULT == null ? menu != null : !MENU_EDEFAULT.equals(menu);
			case Qt48XmlschemaQwtEnhancedPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", menu: ");
		result.append(menu);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
