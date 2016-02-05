/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.math.BigInteger;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.SizePolicyData;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size Policy Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.SizePolicyDataImpl#getHordata <em>Hordata</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.SizePolicyDataImpl#getVerdata <em>Verdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SizePolicyDataImpl extends MinimalEObjectImpl.Container implements SizePolicyData {
	/**
	 * The default value of the '{@link #getHordata() <em>Hordata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHordata()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HORDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHordata() <em>Hordata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHordata()
	 * @generated
	 * @ordered
	 */
	protected BigInteger hordata = HORDATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerdata() <em>Verdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdata()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerdata() <em>Verdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdata()
	 * @generated
	 * @ordered
	 */
	protected BigInteger verdata = VERDATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizePolicyDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.SIZE_POLICY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHordata() {
		return hordata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHordata(BigInteger newHordata) {
		BigInteger oldHordata = hordata;
		hordata = newHordata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.SIZE_POLICY_DATA__HORDATA, oldHordata, hordata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVerdata() {
		return verdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerdata(BigInteger newVerdata) {
		BigInteger oldVerdata = verdata;
		verdata = newVerdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.SIZE_POLICY_DATA__VERDATA, oldVerdata, verdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__HORDATA:
				return getHordata();
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__VERDATA:
				return getVerdata();
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
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__HORDATA:
				setHordata((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__VERDATA:
				setVerdata((BigInteger)newValue);
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
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__HORDATA:
				setHordata(HORDATA_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__VERDATA:
				setVerdata(VERDATA_EDEFAULT);
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
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__HORDATA:
				return HORDATA_EDEFAULT == null ? hordata != null : !HORDATA_EDEFAULT.equals(hordata);
			case Qt48XmlschemaPackage.SIZE_POLICY_DATA__VERDATA:
				return VERDATA_EDEFAULT == null ? verdata != null : !VERDATA_EDEFAULT.equals(verdata);
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
		result.append(" (hordata: ");
		result.append(hordata);
		result.append(", verdata: ");
		result.append(verdata);
		result.append(')');
		return result.toString();
	}

} //SizePolicyDataImpl
