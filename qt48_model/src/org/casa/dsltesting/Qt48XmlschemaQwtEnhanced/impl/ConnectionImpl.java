/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Connection;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.ConnectionHints;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.ConnectionImpl#getHints <em>Hints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected String sender = SENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected String signal = SIGNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected String receiver = RECEIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlot() <em>Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected static final String SLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected String slot = SLOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHints() <em>Hints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected ConnectionHints hints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(String newSender) {
		String oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(String newSignal) {
		String oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(String newReceiver) {
		String oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.CONNECTION__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlot() {
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlot(String newSlot) {
		String oldSlot = slot;
		slot = newSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SLOT, oldSlot, slot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionHints getHints() {
		return hints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHints(ConnectionHints newHints, NotificationChain msgs) {
		ConnectionHints oldHints = hints;
		hints = newHints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS, oldHints, newHints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHints(ConnectionHints newHints) {
		if (newHints != hints) {
			NotificationChain msgs = null;
			if (hints != null)
				msgs = ((InternalEObject)hints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS, null, msgs);
			if (newHints != null)
				msgs = ((InternalEObject)newHints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS, null, msgs);
			msgs = basicSetHints(newHints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS, newHints, newHints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS:
				return basicSetHints(null, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SENDER:
				return getSender();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SIGNAL:
				return getSignal();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__RECEIVER:
				return getReceiver();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SLOT:
				return getSlot();
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS:
				return getHints();
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
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SENDER:
				setSender((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SIGNAL:
				setSignal((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__RECEIVER:
				setReceiver((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SLOT:
				setSlot((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS:
				setHints((ConnectionHints)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SENDER:
				setSender(SENDER_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SIGNAL:
				setSignal(SIGNAL_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__RECEIVER:
				setReceiver(RECEIVER_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SLOT:
				setSlot(SLOT_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS:
				setHints((ConnectionHints)null);
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
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SENDER:
				return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SIGNAL:
				return SIGNAL_EDEFAULT == null ? signal != null : !SIGNAL_EDEFAULT.equals(signal);
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__RECEIVER:
				return RECEIVER_EDEFAULT == null ? receiver != null : !RECEIVER_EDEFAULT.equals(receiver);
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__SLOT:
				return SLOT_EDEFAULT == null ? slot != null : !SLOT_EDEFAULT.equals(slot);
			case Qt48XmlschemaQwtEnhancedPackage.CONNECTION__HINTS:
				return hints != null;
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
		result.append(" (sender: ");
		result.append(sender);
		result.append(", signal: ");
		result.append(signal);
		result.append(", receiver: ");
		result.append(receiver);
		result.append(", slot: ");
		result.append(slot);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
