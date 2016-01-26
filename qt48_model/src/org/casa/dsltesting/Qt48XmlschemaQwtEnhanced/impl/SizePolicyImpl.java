/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.math.BigInteger;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.SizePolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl#getHsizetype <em>Hsizetype</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl#getVsizetype <em>Vsizetype</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl#getHorstretch <em>Horstretch</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl#getVerstretch <em>Verstretch</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl#getHsizetype1 <em>Hsizetype1</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.SizePolicyImpl#getVsizetype1 <em>Vsizetype1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizePolicyImpl extends MinimalEObjectImpl.Container implements SizePolicy {
	/**
	 * The default value of the '{@link #getHsizetype() <em>Hsizetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHsizetype()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HSIZETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHsizetype() <em>Hsizetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHsizetype()
	 * @generated
	 * @ordered
	 */
	protected BigInteger hsizetype = HSIZETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVsizetype() <em>Vsizetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsizetype()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VSIZETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVsizetype() <em>Vsizetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsizetype()
	 * @generated
	 * @ordered
	 */
	protected BigInteger vsizetype = VSIZETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorstretch() <em>Horstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorstretch()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HORSTRETCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorstretch() <em>Horstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorstretch()
	 * @generated
	 * @ordered
	 */
	protected BigInteger horstretch = HORSTRETCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerstretch() <em>Verstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerstretch()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERSTRETCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerstretch() <em>Verstretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerstretch()
	 * @generated
	 * @ordered
	 */
	protected BigInteger verstretch = VERSTRETCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHsizetype1() <em>Hsizetype1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHsizetype1()
	 * @generated
	 * @ordered
	 */
	protected static final String HSIZETYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHsizetype1() <em>Hsizetype1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHsizetype1()
	 * @generated
	 * @ordered
	 */
	protected String hsizetype1 = HSIZETYPE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getVsizetype1() <em>Vsizetype1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsizetype1()
	 * @generated
	 * @ordered
	 */
	protected static final String VSIZETYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVsizetype1() <em>Vsizetype1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsizetype1()
	 * @generated
	 * @ordered
	 */
	protected String vsizetype1 = VSIZETYPE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizePolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.SIZE_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHsizetype() {
		return hsizetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHsizetype(BigInteger newHsizetype) {
		BigInteger oldHsizetype = hsizetype;
		hsizetype = newHsizetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE, oldHsizetype, hsizetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVsizetype() {
		return vsizetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsizetype(BigInteger newVsizetype) {
		BigInteger oldVsizetype = vsizetype;
		vsizetype = newVsizetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE, oldVsizetype, vsizetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHorstretch() {
		return horstretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorstretch(BigInteger newHorstretch) {
		BigInteger oldHorstretch = horstretch;
		horstretch = newHorstretch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HORSTRETCH, oldHorstretch, horstretch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVerstretch() {
		return verstretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerstretch(BigInteger newVerstretch) {
		BigInteger oldVerstretch = verstretch;
		verstretch = newVerstretch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VERSTRETCH, oldVerstretch, verstretch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHsizetype1() {
		return hsizetype1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHsizetype1(String newHsizetype1) {
		String oldHsizetype1 = hsizetype1;
		hsizetype1 = newHsizetype1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE1, oldHsizetype1, hsizetype1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVsizetype1() {
		return vsizetype1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsizetype1(String newVsizetype1) {
		String oldVsizetype1 = vsizetype1;
		vsizetype1 = newVsizetype1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE1, oldVsizetype1, vsizetype1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE:
				return getHsizetype();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE:
				return getVsizetype();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HORSTRETCH:
				return getHorstretch();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VERSTRETCH:
				return getVerstretch();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE1:
				return getHsizetype1();
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE1:
				return getVsizetype1();
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
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE:
				setHsizetype((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE:
				setVsizetype((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HORSTRETCH:
				setHorstretch((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VERSTRETCH:
				setVerstretch((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE1:
				setHsizetype1((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE1:
				setVsizetype1((String)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE:
				setHsizetype(HSIZETYPE_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE:
				setVsizetype(VSIZETYPE_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HORSTRETCH:
				setHorstretch(HORSTRETCH_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VERSTRETCH:
				setVerstretch(VERSTRETCH_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE1:
				setHsizetype1(HSIZETYPE1_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE1:
				setVsizetype1(VSIZETYPE1_EDEFAULT);
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
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE:
				return HSIZETYPE_EDEFAULT == null ? hsizetype != null : !HSIZETYPE_EDEFAULT.equals(hsizetype);
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE:
				return VSIZETYPE_EDEFAULT == null ? vsizetype != null : !VSIZETYPE_EDEFAULT.equals(vsizetype);
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HORSTRETCH:
				return HORSTRETCH_EDEFAULT == null ? horstretch != null : !HORSTRETCH_EDEFAULT.equals(horstretch);
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VERSTRETCH:
				return VERSTRETCH_EDEFAULT == null ? verstretch != null : !VERSTRETCH_EDEFAULT.equals(verstretch);
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__HSIZETYPE1:
				return HSIZETYPE1_EDEFAULT == null ? hsizetype1 != null : !HSIZETYPE1_EDEFAULT.equals(hsizetype1);
			case Qt48XmlschemaQwtEnhancedPackage.SIZE_POLICY__VSIZETYPE1:
				return VSIZETYPE1_EDEFAULT == null ? vsizetype1 != null : !VSIZETYPE1_EDEFAULT.equals(vsizetype1);
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
		result.append(" (hsizetype: ");
		result.append(hsizetype);
		result.append(", vsizetype: ");
		result.append(vsizetype);
		result.append(", horstretch: ");
		result.append(horstretch);
		result.append(", verstretch: ");
		result.append(verstretch);
		result.append(", hsizetype1: ");
		result.append(hsizetype1);
		result.append(", vsizetype1: ");
		result.append(vsizetype1);
		result.append(')');
		return result.toString();
	}

} //SizePolicyImpl
