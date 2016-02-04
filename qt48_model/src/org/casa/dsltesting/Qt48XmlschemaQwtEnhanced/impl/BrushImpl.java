/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Brush;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Color;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Property;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brush</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.BrushImpl#getBrushstyle <em>Brushstyle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrushImpl extends MinimalEObjectImpl.Container implements Brush {
	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color;

	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected Property texture;

	/**
	 * The cached value of the '{@link #getGradient() <em>Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected Gradient gradient;

	/**
	 * The default value of the '{@link #getBrushstyle() <em>Brushstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrushstyle()
	 * @generated
	 * @ordered
	 */
	protected static final String BRUSHSTYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrushstyle() <em>Brushstyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrushstyle()
	 * @generated
	 * @ordered
	 */
	protected String brushstyle = BRUSHSTYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrushImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.BRUSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Color newColor, NotificationChain msgs) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getTexture() {
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexture(Property newTexture, NotificationChain msgs) {
		Property oldTexture = texture;
		texture = newTexture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE, oldTexture, newTexture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexture(Property newTexture) {
		if (newTexture != texture) {
			NotificationChain msgs = null;
			if (texture != null)
				msgs = ((InternalEObject)texture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE, null, msgs);
			if (newTexture != null)
				msgs = ((InternalEObject)newTexture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE, null, msgs);
			msgs = basicSetTexture(newTexture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE, newTexture, newTexture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gradient getGradient() {
		return gradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradient(Gradient newGradient, NotificationChain msgs) {
		Gradient oldGradient = gradient;
		gradient = newGradient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT, oldGradient, newGradient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(Gradient newGradient) {
		if (newGradient != gradient) {
			NotificationChain msgs = null;
			if (gradient != null)
				msgs = ((InternalEObject)gradient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT, null, msgs);
			if (newGradient != null)
				msgs = ((InternalEObject)newGradient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT, null, msgs);
			msgs = basicSetGradient(newGradient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT, newGradient, newGradient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrushstyle() {
		return brushstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrushstyle(String newBrushstyle) {
		String oldBrushstyle = brushstyle;
		brushstyle = newBrushstyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.BRUSH__BRUSHSTYLE, oldBrushstyle, brushstyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR:
				return basicSetColor(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE:
				return basicSetTexture(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT:
				return basicSetGradient(null, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR:
				return getColor();
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE:
				return getTexture();
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT:
				return getGradient();
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__BRUSHSTYLE:
				return getBrushstyle();
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
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR:
				setColor((Color)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE:
				setTexture((Property)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT:
				setGradient((Gradient)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__BRUSHSTYLE:
				setBrushstyle((String)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR:
				setColor((Color)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE:
				setTexture((Property)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT:
				setGradient((Gradient)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__BRUSHSTYLE:
				setBrushstyle(BRUSHSTYLE_EDEFAULT);
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
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__COLOR:
				return color != null;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__TEXTURE:
				return texture != null;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__GRADIENT:
				return gradient != null;
			case Qt48XmlschemaQwtEnhancedPackage.BRUSH__BRUSHSTYLE:
				return BRUSHSTYLE_EDEFAULT == null ? brushstyle != null : !BRUSHSTYLE_EDEFAULT.equals(brushstyle);
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
		result.append(" (brushstyle: ");
		result.append(brushstyle);
		result.append(')');
		return result.toString();
	}

} //BrushImpl
