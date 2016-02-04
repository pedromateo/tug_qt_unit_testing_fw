/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.lang.String;

import java.util.Collection;


import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.TabStops;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Stops</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.TabStopsImpl#getTabstop <em>Tabstop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabStopsImpl extends EObjectImpl implements TabStops {
	/**
	 * The cached value of the '{@link #getTabstop() <em>Tabstop</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabstop()
	 * @generated
	 * @ordered
	 */
	protected EList tabstop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabStopsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.TAB_STOPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTabstop() {
		if (tabstop == null) {
			tabstop = new EDataTypeEList(String.class, this, Qt48XmlschemaPackage.TAB_STOPS__TABSTOP);
		}
		return tabstop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaPackage.TAB_STOPS__TABSTOP:
				return getTabstop();
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
			case Qt48XmlschemaPackage.TAB_STOPS__TABSTOP:
				getTabstop().clear();
				getTabstop().addAll((Collection)newValue);
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
			case Qt48XmlschemaPackage.TAB_STOPS__TABSTOP:
				getTabstop().clear();
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
			case Qt48XmlschemaPackage.TAB_STOPS__TABSTOP:
				return tabstop != null && !tabstop.isEmpty();
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
		result.append(" (tabstop: "); //$NON-NLS-1$
		result.append(tabstop);
		result.append(')');
		return result.toString();
	}

} //TabStopsImpl
