/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import org.casa.dsltesting.Qt48Xmlschema.ColorGroup;
import org.casa.dsltesting.Qt48Xmlschema.Palette;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.PaletteImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.PaletteImpl#getInactive <em>Inactive</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.PaletteImpl#getDisabled <em>Disabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaletteImpl extends EObjectImpl implements Palette {
	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected ColorGroup active;

	/**
	 * The cached value of the '{@link #getInactive() <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive()
	 * @generated
	 * @ordered
	 */
	protected ColorGroup inactive;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected ColorGroup disabled;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.PALETTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorGroup getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(ColorGroup newActive, NotificationChain msgs) {
		ColorGroup oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.PALETTE__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(ColorGroup newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.PALETTE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.PALETTE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.PALETTE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorGroup getInactive() {
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInactive(ColorGroup newInactive, NotificationChain msgs) {
		ColorGroup oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.PALETTE__INACTIVE, oldInactive, newInactive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive(ColorGroup newInactive) {
		if (newInactive != inactive) {
			NotificationChain msgs = null;
			if (inactive != null)
				msgs = ((InternalEObject)inactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.PALETTE__INACTIVE, null, msgs);
			if (newInactive != null)
				msgs = ((InternalEObject)newInactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.PALETTE__INACTIVE, null, msgs);
			msgs = basicSetInactive(newInactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.PALETTE__INACTIVE, newInactive, newInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorGroup getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisabled(ColorGroup newDisabled, NotificationChain msgs) {
		ColorGroup oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.PALETTE__DISABLED, oldDisabled, newDisabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(ColorGroup newDisabled) {
		if (newDisabled != disabled) {
			NotificationChain msgs = null;
			if (disabled != null)
				msgs = ((InternalEObject)disabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.PALETTE__DISABLED, null, msgs);
			if (newDisabled != null)
				msgs = ((InternalEObject)newDisabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaPackage.PALETTE__DISABLED, null, msgs);
			msgs = basicSetDisabled(newDisabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.PALETTE__DISABLED, newDisabled, newDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.PALETTE__ACTIVE:
				return basicSetActive(null, msgs);
			case Qt48XmlschemaPackage.PALETTE__INACTIVE:
				return basicSetInactive(null, msgs);
			case Qt48XmlschemaPackage.PALETTE__DISABLED:
				return basicSetDisabled(null, msgs);
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
			case Qt48XmlschemaPackage.PALETTE__ACTIVE:
				return getActive();
			case Qt48XmlschemaPackage.PALETTE__INACTIVE:
				return getInactive();
			case Qt48XmlschemaPackage.PALETTE__DISABLED:
				return getDisabled();
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
			case Qt48XmlschemaPackage.PALETTE__ACTIVE:
				setActive((ColorGroup)newValue);
				return;
			case Qt48XmlschemaPackage.PALETTE__INACTIVE:
				setInactive((ColorGroup)newValue);
				return;
			case Qt48XmlschemaPackage.PALETTE__DISABLED:
				setDisabled((ColorGroup)newValue);
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
			case Qt48XmlschemaPackage.PALETTE__ACTIVE:
				setActive((ColorGroup)null);
				return;
			case Qt48XmlschemaPackage.PALETTE__INACTIVE:
				setInactive((ColorGroup)null);
				return;
			case Qt48XmlschemaPackage.PALETTE__DISABLED:
				setDisabled((ColorGroup)null);
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
			case Qt48XmlschemaPackage.PALETTE__ACTIVE:
				return active != null;
			case Qt48XmlschemaPackage.PALETTE__INACTIVE:
				return inactive != null;
			case Qt48XmlschemaPackage.PALETTE__DISABLED:
				return disabled != null;
		}
		return super.eIsSet(featureID);
	}

} //PaletteImpl
