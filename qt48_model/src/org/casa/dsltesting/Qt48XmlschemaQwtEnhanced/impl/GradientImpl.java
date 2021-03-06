/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.util.Collection;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Gradient;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.GradientStop;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getGradientStop <em>Gradient Stop</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getCentralx <em>Centralx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getCentraly <em>Centraly</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getCoordinatemode <em>Coordinatemode</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getEndx <em>Endx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getEndy <em>Endy</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getFocalx <em>Focalx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getFocaly <em>Focaly</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getSpread <em>Spread</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getStartx <em>Startx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getStarty <em>Starty</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.GradientImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradientImpl extends MinimalEObjectImpl.Container implements Gradient {
	/**
	 * The cached value of the '{@link #getGradientStop() <em>Gradient Stop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientStop()
	 * @generated
	 * @ordered
	 */
	protected EList<GradientStop> gradientStop;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected double angle = ANGLE_EDEFAULT;

	/**
	 * This is true if the Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angleESet;

	/**
	 * The default value of the '{@link #getCentralx() <em>Centralx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentralx()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTRALX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCentralx() <em>Centralx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentralx()
	 * @generated
	 * @ordered
	 */
	protected double centralx = CENTRALX_EDEFAULT;

	/**
	 * This is true if the Centralx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centralxESet;

	/**
	 * The default value of the '{@link #getCentraly() <em>Centraly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentraly()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTRALY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCentraly() <em>Centraly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentraly()
	 * @generated
	 * @ordered
	 */
	protected double centraly = CENTRALY_EDEFAULT;

	/**
	 * This is true if the Centraly attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centralyESet;

	/**
	 * The default value of the '{@link #getCoordinatemode() <em>Coordinatemode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatemode()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDINATEMODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinatemode() <em>Coordinatemode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatemode()
	 * @generated
	 * @ordered
	 */
	protected String coordinatemode = COORDINATEMODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndx() <em>Endx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndx()
	 * @generated
	 * @ordered
	 */
	protected static final double ENDX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndx() <em>Endx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndx()
	 * @generated
	 * @ordered
	 */
	protected double endx = ENDX_EDEFAULT;

	/**
	 * This is true if the Endx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endxESet;

	/**
	 * The default value of the '{@link #getEndy() <em>Endy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndy()
	 * @generated
	 * @ordered
	 */
	protected static final double ENDY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndy() <em>Endy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndy()
	 * @generated
	 * @ordered
	 */
	protected double endy = ENDY_EDEFAULT;

	/**
	 * This is true if the Endy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endyESet;

	/**
	 * The default value of the '{@link #getFocalx() <em>Focalx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalx()
	 * @generated
	 * @ordered
	 */
	protected static final double FOCALX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFocalx() <em>Focalx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalx()
	 * @generated
	 * @ordered
	 */
	protected double focalx = FOCALX_EDEFAULT;

	/**
	 * This is true if the Focalx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean focalxESet;

	/**
	 * The default value of the '{@link #getFocaly() <em>Focaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocaly()
	 * @generated
	 * @ordered
	 */
	protected static final double FOCALY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFocaly() <em>Focaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocaly()
	 * @generated
	 * @ordered
	 */
	protected double focaly = FOCALY_EDEFAULT;

	/**
	 * This is true if the Focaly attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean focalyESet;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * This is true if the Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiusESet;

	/**
	 * The default value of the '{@link #getSpread() <em>Spread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpread()
	 * @generated
	 * @ordered
	 */
	protected static final String SPREAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpread() <em>Spread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpread()
	 * @generated
	 * @ordered
	 */
	protected String spread = SPREAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartx() <em>Startx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartx()
	 * @generated
	 * @ordered
	 */
	protected static final double STARTX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartx() <em>Startx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartx()
	 * @generated
	 * @ordered
	 */
	protected double startx = STARTX_EDEFAULT;

	/**
	 * This is true if the Startx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startxESet;

	/**
	 * The default value of the '{@link #getStarty() <em>Starty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarty()
	 * @generated
	 * @ordered
	 */
	protected static final double STARTY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStarty() <em>Starty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarty()
	 * @generated
	 * @ordered
	 */
	protected double starty = STARTY_EDEFAULT;

	/**
	 * This is true if the Starty attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startyESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.GRADIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GradientStop> getGradientStop() {
		if (gradientStop == null) {
			gradientStop = new EObjectContainmentEList<GradientStop>(GradientStop.class, this, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__GRADIENT_STOP);
		}
		return gradientStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(double newAngle) {
		double oldAngle = angle;
		angle = newAngle;
		boolean oldAngleESet = angleESet;
		angleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ANGLE, oldAngle, angle, !oldAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAngle() {
		double oldAngle = angle;
		boolean oldAngleESet = angleESet;
		angle = ANGLE_EDEFAULT;
		angleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ANGLE, oldAngle, ANGLE_EDEFAULT, oldAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAngle() {
		return angleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCentralx() {
		return centralx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentralx(double newCentralx) {
		double oldCentralx = centralx;
		centralx = newCentralx;
		boolean oldCentralxESet = centralxESet;
		centralxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALX, oldCentralx, centralx, !oldCentralxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentralx() {
		double oldCentralx = centralx;
		boolean oldCentralxESet = centralxESet;
		centralx = CENTRALX_EDEFAULT;
		centralxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALX, oldCentralx, CENTRALX_EDEFAULT, oldCentralxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentralx() {
		return centralxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCentraly() {
		return centraly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentraly(double newCentraly) {
		double oldCentraly = centraly;
		centraly = newCentraly;
		boolean oldCentralyESet = centralyESet;
		centralyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALY, oldCentraly, centraly, !oldCentralyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentraly() {
		double oldCentraly = centraly;
		boolean oldCentralyESet = centralyESet;
		centraly = CENTRALY_EDEFAULT;
		centralyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALY, oldCentraly, CENTRALY_EDEFAULT, oldCentralyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentraly() {
		return centralyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordinatemode() {
		return coordinatemode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinatemode(String newCoordinatemode) {
		String oldCoordinatemode = coordinatemode;
		coordinatemode = newCoordinatemode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__COORDINATEMODE, oldCoordinatemode, coordinatemode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndx() {
		return endx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndx(double newEndx) {
		double oldEndx = endx;
		endx = newEndx;
		boolean oldEndxESet = endxESet;
		endxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDX, oldEndx, endx, !oldEndxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndx() {
		double oldEndx = endx;
		boolean oldEndxESet = endxESet;
		endx = ENDX_EDEFAULT;
		endxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDX, oldEndx, ENDX_EDEFAULT, oldEndxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndx() {
		return endxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndy() {
		return endy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndy(double newEndy) {
		double oldEndy = endy;
		endy = newEndy;
		boolean oldEndyESet = endyESet;
		endyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDY, oldEndy, endy, !oldEndyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndy() {
		double oldEndy = endy;
		boolean oldEndyESet = endyESet;
		endy = ENDY_EDEFAULT;
		endyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDY, oldEndy, ENDY_EDEFAULT, oldEndyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndy() {
		return endyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFocalx() {
		return focalx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalx(double newFocalx) {
		double oldFocalx = focalx;
		focalx = newFocalx;
		boolean oldFocalxESet = focalxESet;
		focalxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALX, oldFocalx, focalx, !oldFocalxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFocalx() {
		double oldFocalx = focalx;
		boolean oldFocalxESet = focalxESet;
		focalx = FOCALX_EDEFAULT;
		focalxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALX, oldFocalx, FOCALX_EDEFAULT, oldFocalxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFocalx() {
		return focalxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFocaly() {
		return focaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocaly(double newFocaly) {
		double oldFocaly = focaly;
		focaly = newFocaly;
		boolean oldFocalyESet = focalyESet;
		focalyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALY, oldFocaly, focaly, !oldFocalyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFocaly() {
		double oldFocaly = focaly;
		boolean oldFocalyESet = focalyESet;
		focaly = FOCALY_EDEFAULT;
		focalyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALY, oldFocaly, FOCALY_EDEFAULT, oldFocalyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFocaly() {
		return focalyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		boolean oldRadiusESet = radiusESet;
		radiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__RADIUS, oldRadius, radius, !oldRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		double oldRadius = radius;
		boolean oldRadiusESet = radiusESet;
		radius = RADIUS_EDEFAULT;
		radiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__RADIUS, oldRadius, RADIUS_EDEFAULT, oldRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return radiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpread() {
		return spread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpread(String newSpread) {
		String oldSpread = spread;
		spread = newSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__SPREAD, oldSpread, spread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartx() {
		return startx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartx(double newStartx) {
		double oldStartx = startx;
		startx = newStartx;
		boolean oldStartxESet = startxESet;
		startxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTX, oldStartx, startx, !oldStartxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartx() {
		double oldStartx = startx;
		boolean oldStartxESet = startxESet;
		startx = STARTX_EDEFAULT;
		startxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTX, oldStartx, STARTX_EDEFAULT, oldStartxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartx() {
		return startxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStarty() {
		return starty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarty(double newStarty) {
		double oldStarty = starty;
		starty = newStarty;
		boolean oldStartyESet = startyESet;
		startyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTY, oldStarty, starty, !oldStartyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStarty() {
		double oldStarty = starty;
		boolean oldStartyESet = startyESet;
		starty = STARTY_EDEFAULT;
		startyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTY, oldStarty, STARTY_EDEFAULT, oldStartyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStarty() {
		return startyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.GRADIENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__GRADIENT_STOP:
				return ((InternalEList<?>)getGradientStop()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__GRADIENT_STOP:
				return getGradientStop();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ANGLE:
				return getAngle();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALX:
				return getCentralx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALY:
				return getCentraly();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__COORDINATEMODE:
				return getCoordinatemode();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDX:
				return getEndx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDY:
				return getEndy();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALX:
				return getFocalx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALY:
				return getFocaly();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__RADIUS:
				return getRadius();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__SPREAD:
				return getSpread();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTX:
				return getStartx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTY:
				return getStarty();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__GRADIENT_STOP:
				getGradientStop().clear();
				getGradientStop().addAll((Collection<? extends GradientStop>)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ANGLE:
				setAngle((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALX:
				setCentralx((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALY:
				setCentraly((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__COORDINATEMODE:
				setCoordinatemode((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDX:
				setEndx((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDY:
				setEndy((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALX:
				setFocalx((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALY:
				setFocaly((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__RADIUS:
				setRadius((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__SPREAD:
				setSpread((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTX:
				setStartx((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTY:
				setStarty((Double)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__TYPE:
				setType((String)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__GRADIENT_STOP:
				getGradientStop().clear();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ANGLE:
				unsetAngle();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALX:
				unsetCentralx();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALY:
				unsetCentraly();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__COORDINATEMODE:
				setCoordinatemode(COORDINATEMODE_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDX:
				unsetEndx();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDY:
				unsetEndy();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALX:
				unsetFocalx();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALY:
				unsetFocaly();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__RADIUS:
				unsetRadius();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__SPREAD:
				setSpread(SPREAD_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTX:
				unsetStartx();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTY:
				unsetStarty();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__GRADIENT_STOP:
				return gradientStop != null && !gradientStop.isEmpty();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ANGLE:
				return isSetAngle();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALX:
				return isSetCentralx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__CENTRALY:
				return isSetCentraly();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__COORDINATEMODE:
				return COORDINATEMODE_EDEFAULT == null ? coordinatemode != null : !COORDINATEMODE_EDEFAULT.equals(coordinatemode);
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDX:
				return isSetEndx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__ENDY:
				return isSetEndy();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALX:
				return isSetFocalx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__FOCALY:
				return isSetFocaly();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__RADIUS:
				return isSetRadius();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__SPREAD:
				return SPREAD_EDEFAULT == null ? spread != null : !SPREAD_EDEFAULT.equals(spread);
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTX:
				return isSetStartx();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__STARTY:
				return isSetStarty();
			case Qt48XmlschemaQwtEnhancedPackage.GRADIENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (angle: ");
		if (angleESet) result.append(angle); else result.append("<unset>");
		result.append(", centralx: ");
		if (centralxESet) result.append(centralx); else result.append("<unset>");
		result.append(", centraly: ");
		if (centralyESet) result.append(centraly); else result.append("<unset>");
		result.append(", coordinatemode: ");
		result.append(coordinatemode);
		result.append(", endx: ");
		if (endxESet) result.append(endx); else result.append("<unset>");
		result.append(", endy: ");
		if (endyESet) result.append(endy); else result.append("<unset>");
		result.append(", focalx: ");
		if (focalxESet) result.append(focalx); else result.append("<unset>");
		result.append(", focaly: ");
		if (focalyESet) result.append(focaly); else result.append("<unset>");
		result.append(", radius: ");
		if (radiusESet) result.append(radius); else result.append("<unset>");
		result.append(", spread: ");
		result.append(spread);
		result.append(", startx: ");
		if (startxESet) result.append(startx); else result.append("<unset>");
		result.append(", starty: ");
		if (startyESet) result.append(starty); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GradientImpl
