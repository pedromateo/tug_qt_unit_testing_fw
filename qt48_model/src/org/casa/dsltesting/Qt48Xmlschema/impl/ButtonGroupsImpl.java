/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.util.Collection;

import org.casa.dsltesting.Qt48Xmlschema.ButtonGroup;
import org.casa.dsltesting.Qt48Xmlschema.ButtonGroups;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ButtonGroupsImpl#getButtongroup <em>Buttongroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonGroupsImpl extends EObjectImpl implements ButtonGroups {
	/**
	 * The cached value of the '{@link #getButtongroup() <em>Buttongroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtongroup()
	 * @generated
	 * @ordered
	 */
	protected EList buttongroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonGroupsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.BUTTON_GROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getButtongroup() {
		if (buttongroup == null) {
			buttongroup = new EObjectContainmentEList(ButtonGroup.class, this, Qt48XmlschemaPackage.BUTTON_GROUPS__BUTTONGROUP);
		}
		return buttongroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.BUTTON_GROUPS__BUTTONGROUP:
				return ((InternalEList)getButtongroup()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaPackage.BUTTON_GROUPS__BUTTONGROUP:
				return getButtongroup();
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
			case Qt48XmlschemaPackage.BUTTON_GROUPS__BUTTONGROUP:
				getButtongroup().clear();
				getButtongroup().addAll((Collection)newValue);
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
			case Qt48XmlschemaPackage.BUTTON_GROUPS__BUTTONGROUP:
				getButtongroup().clear();
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
			case Qt48XmlschemaPackage.BUTTON_GROUPS__BUTTONGROUP:
				return buttongroup != null && !buttongroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ButtonGroupsImpl
