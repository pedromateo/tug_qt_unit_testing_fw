/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.util.Collection;

import org.casa.dsltesting.Qt48Xmlschema.ColorGroup;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ColorGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ColorGroupImpl#getColorrole <em>Colorrole</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ColorGroupImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorGroupImpl extends EObjectImpl implements ColorGroup {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.COLOR_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Qt48XmlschemaPackage.COLOR_GROUP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColorrole() {
		return getGroup().list(Qt48XmlschemaPackage.Literals.COLOR_GROUP__COLORROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColor() {
		return getGroup().list(Qt48XmlschemaPackage.Literals.COLOR_GROUP__COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.COLOR_GROUP__GROUP:
				return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaPackage.COLOR_GROUP__COLORROLE:
				return ((InternalEList)getColorrole()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaPackage.COLOR_GROUP__COLOR:
				return ((InternalEList)getColor()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaPackage.COLOR_GROUP__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Qt48XmlschemaPackage.COLOR_GROUP__COLORROLE:
				return getColorrole();
			case Qt48XmlschemaPackage.COLOR_GROUP__COLOR:
				return getColor();
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
			case Qt48XmlschemaPackage.COLOR_GROUP__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Qt48XmlschemaPackage.COLOR_GROUP__COLORROLE:
				getColorrole().clear();
				getColorrole().addAll((Collection)newValue);
				return;
			case Qt48XmlschemaPackage.COLOR_GROUP__COLOR:
				getColor().clear();
				getColor().addAll((Collection)newValue);
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
			case Qt48XmlschemaPackage.COLOR_GROUP__GROUP:
				getGroup().clear();
				return;
			case Qt48XmlschemaPackage.COLOR_GROUP__COLORROLE:
				getColorrole().clear();
				return;
			case Qt48XmlschemaPackage.COLOR_GROUP__COLOR:
				getColor().clear();
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
			case Qt48XmlschemaPackage.COLOR_GROUP__GROUP:
				return group != null && !group.isEmpty();
			case Qt48XmlschemaPackage.COLOR_GROUP__COLORROLE:
				return !getColorrole().isEmpty();
			case Qt48XmlschemaPackage.COLOR_GROUP__COLOR:
				return !getColor().isEmpty();
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ColorGroupImpl
