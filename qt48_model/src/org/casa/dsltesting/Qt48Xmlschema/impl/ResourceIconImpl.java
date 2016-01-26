/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.lang.String;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.casa.dsltesting.Qt48Xmlschema.ResourceIcon;
import org.casa.dsltesting.Qt48Xmlschema.ResourcePixmap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getNormaloff <em>Normaloff</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getNormalon <em>Normalon</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getDisabledoff <em>Disabledoff</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getDisabledon <em>Disabledon</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getActiveoff <em>Activeoff</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getActiveon <em>Activeon</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getSelectedoff <em>Selectedoff</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getSelectedon <em>Selectedon</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ResourceIconImpl#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceIconImpl extends EObjectImpl implements ResourceIcon {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final String THEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected String theme = THEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceIconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.RESOURCE_ICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Qt48XmlschemaPackage.RESOURCE_ICON__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getNormaloff() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__NORMALOFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormaloff(ResourcePixmap newNormaloff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__NORMALOFF, newNormaloff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormaloff(ResourcePixmap newNormaloff) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__NORMALOFF, newNormaloff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getNormalon() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__NORMALON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalon(ResourcePixmap newNormalon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__NORMALON, newNormalon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalon(ResourcePixmap newNormalon) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__NORMALON, newNormalon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getDisabledoff() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__DISABLEDOFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisabledoff(ResourcePixmap newDisabledoff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__DISABLEDOFF, newDisabledoff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledoff(ResourcePixmap newDisabledoff) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__DISABLEDOFF, newDisabledoff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getDisabledon() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__DISABLEDON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisabledon(ResourcePixmap newDisabledon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__DISABLEDON, newDisabledon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledon(ResourcePixmap newDisabledon) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__DISABLEDON, newDisabledon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getActiveoff() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__ACTIVEOFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveoff(ResourcePixmap newActiveoff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__ACTIVEOFF, newActiveoff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveoff(ResourcePixmap newActiveoff) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__ACTIVEOFF, newActiveoff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getActiveon() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__ACTIVEON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveon(ResourcePixmap newActiveon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__ACTIVEON, newActiveon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveon(ResourcePixmap newActiveon) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__ACTIVEON, newActiveon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getSelectedoff() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__SELECTEDOFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedoff(ResourcePixmap newSelectedoff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__SELECTEDOFF, newSelectedoff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedoff(ResourcePixmap newSelectedoff) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__SELECTEDOFF, newSelectedoff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePixmap getSelectedon() {
		return (ResourcePixmap)getMixed().get(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__SELECTEDON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedon(ResourcePixmap newSelectedon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__SELECTEDON, newSelectedon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedon(ResourcePixmap newSelectedon) {
		((FeatureMap.Internal)getMixed()).set(Qt48XmlschemaPackage.Literals.RESOURCE_ICON__SELECTEDON, newSelectedon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.RESOURCE_ICON__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(String newTheme) {
		String oldTheme = theme;
		theme = newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.RESOURCE_ICON__THEME, oldTheme, theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.RESOURCE_ICON__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALOFF:
				return basicSetNormaloff(null, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALON:
				return basicSetNormalon(null, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDOFF:
				return basicSetDisabledoff(null, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDON:
				return basicSetDisabledon(null, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEOFF:
				return basicSetActiveoff(null, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEON:
				return basicSetActiveon(null, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDOFF:
				return basicSetSelectedoff(null, msgs);
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDON:
				return basicSetSelectedon(null, msgs);
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
			case Qt48XmlschemaPackage.RESOURCE_ICON__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALOFF:
				return getNormaloff();
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALON:
				return getNormalon();
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDOFF:
				return getDisabledoff();
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDON:
				return getDisabledon();
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEOFF:
				return getActiveoff();
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEON:
				return getActiveon();
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDOFF:
				return getSelectedoff();
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDON:
				return getSelectedon();
			case Qt48XmlschemaPackage.RESOURCE_ICON__RESOURCE:
				return getResource();
			case Qt48XmlschemaPackage.RESOURCE_ICON__THEME:
				return getTheme();
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
			case Qt48XmlschemaPackage.RESOURCE_ICON__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALOFF:
				setNormaloff((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALON:
				setNormalon((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDOFF:
				setDisabledoff((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDON:
				setDisabledon((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEOFF:
				setActiveoff((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEON:
				setActiveon((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDOFF:
				setSelectedoff((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDON:
				setSelectedon((ResourcePixmap)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__RESOURCE:
				setResource((String)newValue);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__THEME:
				setTheme((String)newValue);
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
			case Qt48XmlschemaPackage.RESOURCE_ICON__MIXED:
				getMixed().clear();
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALOFF:
				setNormaloff((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALON:
				setNormalon((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDOFF:
				setDisabledoff((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDON:
				setDisabledon((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEOFF:
				setActiveoff((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEON:
				setActiveon((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDOFF:
				setSelectedoff((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDON:
				setSelectedon((ResourcePixmap)null);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.RESOURCE_ICON__THEME:
				setTheme(THEME_EDEFAULT);
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
			case Qt48XmlschemaPackage.RESOURCE_ICON__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALOFF:
				return getNormaloff() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__NORMALON:
				return getNormalon() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDOFF:
				return getDisabledoff() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__DISABLEDON:
				return getDisabledon() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEOFF:
				return getActiveoff() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__ACTIVEON:
				return getActiveon() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDOFF:
				return getSelectedoff() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__SELECTEDON:
				return getSelectedon() != null;
			case Qt48XmlschemaPackage.RESOURCE_ICON__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case Qt48XmlschemaPackage.RESOURCE_ICON__THEME:
				return THEME_EDEFAULT == null ? theme != null : !THEME_EDEFAULT.equals(theme);
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
		result.append(" (mixed: "); //$NON-NLS-1$
		result.append(mixed);
		result.append(", resource: "); //$NON-NLS-1$
		result.append(resource);
		result.append(", theme: "); //$NON-NLS-1$
		result.append(theme);
		result.append(')');
		return result.toString();
	}

} //ResourceIconImpl
