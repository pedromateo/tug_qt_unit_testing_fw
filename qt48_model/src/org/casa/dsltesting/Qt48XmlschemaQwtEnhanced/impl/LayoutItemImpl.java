/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.math.BigInteger;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Layout;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.LayoutItem;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Spacer;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getWidget <em>Widget</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getSpacer <em>Spacer</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.LayoutItemImpl#getRowspan <em>Rowspan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutItemImpl extends MinimalEObjectImpl.Container implements LayoutItem {
	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget widget;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The cached value of the '{@link #getSpacer() <em>Spacer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacer()
	 * @generated
	 * @ordered
	 */
	protected Spacer spacer;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected String alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected BigInteger colspan = COLSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROWSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rowspan = ROWSPAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.LAYOUT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget getWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidget(Widget newWidget, NotificationChain msgs) {
		Widget oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET, oldWidget, newWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidget(Widget newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null)
				msgs = ((InternalEObject)widget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET, null, msgs);
			if (newWidget != null)
				msgs = ((InternalEObject)newWidget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET, null, msgs);
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET, newWidget, newWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spacer getSpacer() {
		return spacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpacer(Spacer newSpacer, NotificationChain msgs) {
		Spacer oldSpacer = spacer;
		spacer = newSpacer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER, oldSpacer, newSpacer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacer(Spacer newSpacer) {
		if (newSpacer != spacer) {
			NotificationChain msgs = null;
			if (spacer != null)
				msgs = ((InternalEObject)spacer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER, null, msgs);
			if (newSpacer != null)
				msgs = ((InternalEObject)newSpacer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER, null, msgs);
			msgs = basicSetSpacer(newSpacer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER, newSpacer, newSpacer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(String newAlignment) {
		String oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(BigInteger newColspan) {
		BigInteger oldColspan = colspan;
		colspan = newColspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLSPAN, oldColspan, colspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(BigInteger newColumn) {
		BigInteger oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(BigInteger newRow) {
		BigInteger oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(BigInteger newRowspan) {
		BigInteger oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROWSPAN, oldRowspan, rowspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET:
				return basicSetWidget(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT:
				return basicSetLayout(null, msgs);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER:
				return basicSetSpacer(null, msgs);
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET:
				return getWidget();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT:
				return getLayout();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER:
				return getSpacer();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ALIGNMENT:
				return getAlignment();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLSPAN:
				return getColspan();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLUMN:
				return getColumn();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROW:
				return getRow();
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROWSPAN:
				return getRowspan();
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET:
				setWidget((Widget)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER:
				setSpacer((Spacer)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ALIGNMENT:
				setAlignment((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLSPAN:
				setColspan((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLUMN:
				setColumn((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROW:
				setRow((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROWSPAN:
				setRowspan((BigInteger)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET:
				setWidget((Widget)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT:
				setLayout((Layout)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER:
				setSpacer((Spacer)null);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLSPAN:
				setColspan(COLSPAN_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
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
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__WIDGET:
				return widget != null;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__LAYOUT:
				return layout != null;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__SPACER:
				return spacer != null;
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ALIGNMENT:
				return ALIGNMENT_EDEFAULT == null ? alignment != null : !ALIGNMENT_EDEFAULT.equals(alignment);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLSPAN:
				return COLSPAN_EDEFAULT == null ? colspan != null : !COLSPAN_EDEFAULT.equals(colspan);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case Qt48XmlschemaQwtEnhancedPackage.LAYOUT_ITEM__ROWSPAN:
				return ROWSPAN_EDEFAULT == null ? rowspan != null : !ROWSPAN_EDEFAULT.equals(rowspan);
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(", colspan: ");
		result.append(colspan);
		result.append(", column: ");
		result.append(column);
		result.append(", row: ");
		result.append(row);
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(')');
		return result.toString();
	}

} //LayoutItemImpl
