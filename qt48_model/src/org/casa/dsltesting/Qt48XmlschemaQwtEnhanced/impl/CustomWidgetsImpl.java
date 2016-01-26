/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.util.Collection;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Widgets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.CustomWidgetsImpl#getCustomwidget <em>Customwidget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomWidgetsImpl extends MinimalEObjectImpl.Container implements CustomWidgets {
	/**
	 * The cached value of the '{@link #getCustomwidget() <em>Customwidget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomwidget()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomWidget> customwidget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomWidgetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.CUSTOM_WIDGETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomWidget> getCustomwidget() {
		if (customwidget == null) {
			customwidget = new EObjectContainmentEList<CustomWidget>(CustomWidget.class, this, Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS__CUSTOMWIDGET);
		}
		return customwidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS__CUSTOMWIDGET:
				return ((InternalEList<?>)getCustomwidget()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS__CUSTOMWIDGET:
				return getCustomwidget();
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
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS__CUSTOMWIDGET:
				getCustomwidget().clear();
				getCustomwidget().addAll((Collection<? extends CustomWidget>)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS__CUSTOMWIDGET:
				getCustomwidget().clear();
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
			case Qt48XmlschemaQwtEnhancedPackage.CUSTOM_WIDGETS__CUSTOMWIDGET:
				return customwidget != null && !customwidget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomWidgetsImpl
