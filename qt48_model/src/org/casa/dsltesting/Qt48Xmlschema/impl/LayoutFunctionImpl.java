/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.lang.String;

import org.casa.dsltesting.Qt48Xmlschema.LayoutFunction;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.LayoutFunctionImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.LayoutFunctionImpl#getSpacing <em>Spacing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayoutFunctionImpl extends EObjectImpl implements LayoutFunction {
	/**
	 * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected String margin = MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected String spacing = SPACING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.LAYOUT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(String newMargin) {
		String oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.LAYOUT_FUNCTION__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(String newSpacing) {
		String oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.LAYOUT_FUNCTION__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__MARGIN:
				return getMargin();
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__SPACING:
				return getSpacing();
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
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__MARGIN:
				setMargin((String)newValue);
				return;
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__SPACING:
				setSpacing((String)newValue);
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
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__SPACING:
				setSpacing(SPACING_EDEFAULT);
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
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__MARGIN:
				return MARGIN_EDEFAULT == null ? margin != null : !MARGIN_EDEFAULT.equals(margin);
			case Qt48XmlschemaPackage.LAYOUT_FUNCTION__SPACING:
				return SPACING_EDEFAULT == null ? spacing != null : !SPACING_EDEFAULT.equals(spacing);
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
		result.append(" (margin: "); //$NON-NLS-1$
		result.append(margin);
		result.append(", spacing: "); //$NON-NLS-1$
		result.append(spacing);
		result.append(')');
		return result.toString();
	}

} //LayoutFunctionImpl
