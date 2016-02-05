/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.lang.String;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.StringImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.StringImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.StringImpl#getExtracomment <em>Extracomment</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.StringImpl#getNotr <em>Notr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringImpl extends MinimalEObjectImpl.Container implements org.casa.dsltesting.Qt48Xmlschema.String {
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtracomment() <em>Extracomment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtracomment()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRACOMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtracomment() <em>Extracomment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtracomment()
	 * @generated
	 * @ordered
	 */
	protected String extracomment = EXTRACOMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotr() <em>Notr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotr()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotr() <em>Notr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotr()
	 * @generated
	 * @ordered
	 */
	protected String notr = NOTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Qt48XmlschemaPackage.STRING__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.STRING__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtracomment() {
		return extracomment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtracomment(String newExtracomment) {
		String oldExtracomment = extracomment;
		extracomment = newExtracomment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.STRING__EXTRACOMMENT, oldExtracomment, extracomment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotr() {
		return notr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotr(String newNotr) {
		String oldNotr = notr;
		notr = newNotr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.STRING__NOTR, oldNotr, notr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.STRING__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case Qt48XmlschemaPackage.STRING__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Qt48XmlschemaPackage.STRING__COMMENT:
				return getComment();
			case Qt48XmlschemaPackage.STRING__EXTRACOMMENT:
				return getExtracomment();
			case Qt48XmlschemaPackage.STRING__NOTR:
				return getNotr();
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
			case Qt48XmlschemaPackage.STRING__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Qt48XmlschemaPackage.STRING__COMMENT:
				setComment((String)newValue);
				return;
			case Qt48XmlschemaPackage.STRING__EXTRACOMMENT:
				setExtracomment((String)newValue);
				return;
			case Qt48XmlschemaPackage.STRING__NOTR:
				setNotr((String)newValue);
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
			case Qt48XmlschemaPackage.STRING__MIXED:
				getMixed().clear();
				return;
			case Qt48XmlschemaPackage.STRING__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.STRING__EXTRACOMMENT:
				setExtracomment(EXTRACOMMENT_EDEFAULT);
				return;
			case Qt48XmlschemaPackage.STRING__NOTR:
				setNotr(NOTR_EDEFAULT);
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
			case Qt48XmlschemaPackage.STRING__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Qt48XmlschemaPackage.STRING__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Qt48XmlschemaPackage.STRING__EXTRACOMMENT:
				return EXTRACOMMENT_EDEFAULT == null ? extracomment != null : !EXTRACOMMENT_EDEFAULT.equals(extracomment);
			case Qt48XmlschemaPackage.STRING__NOTR:
				return NOTR_EDEFAULT == null ? notr != null : !NOTR_EDEFAULT.equals(notr);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", comment: ");
		result.append(comment);
		result.append(", extracomment: ");
		result.append(extracomment);
		result.append(", notr: ");
		result.append(notr);
		result.append(')');
		return result.toString();
	}

} //StringImpl
