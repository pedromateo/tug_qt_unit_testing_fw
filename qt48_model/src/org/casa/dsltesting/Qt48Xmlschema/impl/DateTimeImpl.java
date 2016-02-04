/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.math.BigInteger;

import org.casa.dsltesting.Qt48Xmlschema.DateTime;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.DateTimeImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.DateTimeImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.DateTimeImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.DateTimeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.DateTimeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.DateTimeImpl#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTimeImpl extends EObjectImpl implements DateTime {
	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected BigInteger hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected BigInteger second = SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected BigInteger year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger day = DAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.DATE_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(BigInteger newHour) {
		BigInteger oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.DATE_TIME__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(BigInteger newMinute) {
		BigInteger oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.DATE_TIME__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(BigInteger newSecond) {
		BigInteger oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.DATE_TIME__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(BigInteger newYear) {
		BigInteger oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.DATE_TIME__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(BigInteger newMonth) {
		BigInteger oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.DATE_TIME__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(BigInteger newDay) {
		BigInteger oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.DATE_TIME__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaPackage.DATE_TIME__HOUR:
				return getHour();
			case Qt48XmlschemaPackage.DATE_TIME__MINUTE:
				return getMinute();
			case Qt48XmlschemaPackage.DATE_TIME__SECOND:
				return getSecond();
			case Qt48XmlschemaPackage.DATE_TIME__YEAR:
				return getYear();
			case Qt48XmlschemaPackage.DATE_TIME__MONTH:
				return getMonth();
			case Qt48XmlschemaPackage.DATE_TIME__DAY:
				return getDay();
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
			case Qt48XmlschemaPackage.DATE_TIME__HOUR:
				setHour((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__MINUTE:
				setMinute((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__SECOND:
				setSecond((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__YEAR:
				setYear((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__MONTH:
				setMonth((BigInteger)newValue);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__DAY:
				setDay((BigInteger)newValue);
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
			case Qt48XmlschemaPackage.DATE_TIME__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__SECOND:
				setSecond(SECOND_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.DATE_TIME__DAY:
				setDay(DAY_EDEFAULT);
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
			case Qt48XmlschemaPackage.DATE_TIME__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case Qt48XmlschemaPackage.DATE_TIME__MINUTE:
				return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
			case Qt48XmlschemaPackage.DATE_TIME__SECOND:
				return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
			case Qt48XmlschemaPackage.DATE_TIME__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case Qt48XmlschemaPackage.DATE_TIME__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case Qt48XmlschemaPackage.DATE_TIME__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
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
		result.append(" (hour: "); //$NON-NLS-1$
		result.append(hour);
		result.append(", minute: "); //$NON-NLS-1$
		result.append(minute);
		result.append(", second: "); //$NON-NLS-1$
		result.append(second);
		result.append(", year: "); //$NON-NLS-1$
		result.append(year);
		result.append(", month: "); //$NON-NLS-1$
		result.append(month);
		result.append(", day: "); //$NON-NLS-1$
		result.append(day);
		result.append(')');
		return result.toString();
	}

} //DateTimeImpl
