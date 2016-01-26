/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl;

import java.lang.String;

import java.math.BigInteger;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Font;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#getPointsize <em>Pointsize</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#isStrikeout <em>Strikeout</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#isAntialiasing <em>Antialiasing</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#getStylestrategy <em>Stylestrategy</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.impl.FontImpl#isKerning <em>Kerning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontImpl extends MinimalEObjectImpl.Container implements Font {
	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsize() <em>Pointsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POINTSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointsize() <em>Pointsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pointsize = POINTSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean italic = ITALIC_EDEFAULT;

	/**
	 * This is true if the Italic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean italicESet;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * This is true if the Bold attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boldESet;

	/**
	 * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean underline = UNDERLINE_EDEFAULT;

	/**
	 * This is true if the Underline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean underlineESet;

	/**
	 * The default value of the '{@link #isStrikeout() <em>Strikeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrikeout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIKEOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrikeout() <em>Strikeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrikeout()
	 * @generated
	 * @ordered
	 */
	protected boolean strikeout = STRIKEOUT_EDEFAULT;

	/**
	 * This is true if the Strikeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strikeoutESet;

	/**
	 * The default value of the '{@link #isAntialiasing() <em>Antialiasing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntialiasing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANTIALIASING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAntialiasing() <em>Antialiasing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntialiasing()
	 * @generated
	 * @ordered
	 */
	protected boolean antialiasing = ANTIALIASING_EDEFAULT;

	/**
	 * This is true if the Antialiasing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean antialiasingESet;

	/**
	 * The default value of the '{@link #getStylestrategy() <em>Stylestrategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylestrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLESTRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStylestrategy() <em>Stylestrategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylestrategy()
	 * @generated
	 * @ordered
	 */
	protected String stylestrategy = STYLESTRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #isKerning() <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKerning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KERNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKerning() <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKerning()
	 * @generated
	 * @ordered
	 */
	protected boolean kerning = KERNING_EDEFAULT;

	/**
	 * This is true if the Kerning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kerningESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaQwtEnhancedPackage.Literals.FONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPointsize() {
		return pointsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsize(BigInteger newPointsize) {
		BigInteger oldPointsize = pointsize;
		pointsize = newPointsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__POINTSIZE, oldPointsize, pointsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(BigInteger newWeight) {
		BigInteger oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		boolean oldItalic = italic;
		italic = newItalic;
		boolean oldItalicESet = italicESet;
		italicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__ITALIC, oldItalic, italic, !oldItalicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItalic() {
		boolean oldItalic = italic;
		boolean oldItalicESet = italicESet;
		italic = ITALIC_EDEFAULT;
		italicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.FONT__ITALIC, oldItalic, ITALIC_EDEFAULT, oldItalicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItalic() {
		return italicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		boolean oldBoldESet = boldESet;
		boldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__BOLD, oldBold, bold, !oldBoldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBold() {
		boolean oldBold = bold;
		boolean oldBoldESet = boldESet;
		bold = BOLD_EDEFAULT;
		boldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.FONT__BOLD, oldBold, BOLD_EDEFAULT, oldBoldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBold() {
		return boldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(boolean newUnderline) {
		boolean oldUnderline = underline;
		underline = newUnderline;
		boolean oldUnderlineESet = underlineESet;
		underlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__UNDERLINE, oldUnderline, underline, !oldUnderlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnderline() {
		boolean oldUnderline = underline;
		boolean oldUnderlineESet = underlineESet;
		underline = UNDERLINE_EDEFAULT;
		underlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.FONT__UNDERLINE, oldUnderline, UNDERLINE_EDEFAULT, oldUnderlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnderline() {
		return underlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrikeout() {
		return strikeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrikeout(boolean newStrikeout) {
		boolean oldStrikeout = strikeout;
		strikeout = newStrikeout;
		boolean oldStrikeoutESet = strikeoutESet;
		strikeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__STRIKEOUT, oldStrikeout, strikeout, !oldStrikeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrikeout() {
		boolean oldStrikeout = strikeout;
		boolean oldStrikeoutESet = strikeoutESet;
		strikeout = STRIKEOUT_EDEFAULT;
		strikeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.FONT__STRIKEOUT, oldStrikeout, STRIKEOUT_EDEFAULT, oldStrikeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrikeout() {
		return strikeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAntialiasing() {
		return antialiasing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntialiasing(boolean newAntialiasing) {
		boolean oldAntialiasing = antialiasing;
		antialiasing = newAntialiasing;
		boolean oldAntialiasingESet = antialiasingESet;
		antialiasingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__ANTIALIASING, oldAntialiasing, antialiasing, !oldAntialiasingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAntialiasing() {
		boolean oldAntialiasing = antialiasing;
		boolean oldAntialiasingESet = antialiasingESet;
		antialiasing = ANTIALIASING_EDEFAULT;
		antialiasingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.FONT__ANTIALIASING, oldAntialiasing, ANTIALIASING_EDEFAULT, oldAntialiasingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAntialiasing() {
		return antialiasingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStylestrategy() {
		return stylestrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStylestrategy(String newStylestrategy) {
		String oldStylestrategy = stylestrategy;
		stylestrategy = newStylestrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__STYLESTRATEGY, oldStylestrategy, stylestrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKerning() {
		return kerning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKerning(boolean newKerning) {
		boolean oldKerning = kerning;
		kerning = newKerning;
		boolean oldKerningESet = kerningESet;
		kerningESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaQwtEnhancedPackage.FONT__KERNING, oldKerning, kerning, !oldKerningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKerning() {
		boolean oldKerning = kerning;
		boolean oldKerningESet = kerningESet;
		kerning = KERNING_EDEFAULT;
		kerningESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Qt48XmlschemaQwtEnhancedPackage.FONT__KERNING, oldKerning, KERNING_EDEFAULT, oldKerningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKerning() {
		return kerningESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaQwtEnhancedPackage.FONT__FAMILY:
				return getFamily();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__POINTSIZE:
				return getPointsize();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__WEIGHT:
				return getWeight();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ITALIC:
				return isItalic();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__BOLD:
				return isBold();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__UNDERLINE:
				return isUnderline();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STRIKEOUT:
				return isStrikeout();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ANTIALIASING:
				return isAntialiasing();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STYLESTRATEGY:
				return getStylestrategy();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__KERNING:
				return isKerning();
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
			case Qt48XmlschemaQwtEnhancedPackage.FONT__FAMILY:
				setFamily((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__POINTSIZE:
				setPointsize((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__WEIGHT:
				setWeight((BigInteger)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__BOLD:
				setBold((Boolean)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__UNDERLINE:
				setUnderline((Boolean)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STRIKEOUT:
				setStrikeout((Boolean)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ANTIALIASING:
				setAntialiasing((Boolean)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STYLESTRATEGY:
				setStylestrategy((String)newValue);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__KERNING:
				setKerning((Boolean)newValue);
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
			case Qt48XmlschemaQwtEnhancedPackage.FONT__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__POINTSIZE:
				setPointsize(POINTSIZE_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ITALIC:
				unsetItalic();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__BOLD:
				unsetBold();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__UNDERLINE:
				unsetUnderline();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STRIKEOUT:
				unsetStrikeout();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ANTIALIASING:
				unsetAntialiasing();
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STYLESTRATEGY:
				setStylestrategy(STYLESTRATEGY_EDEFAULT);
				return;
			case Qt48XmlschemaQwtEnhancedPackage.FONT__KERNING:
				unsetKerning();
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
			case Qt48XmlschemaQwtEnhancedPackage.FONT__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case Qt48XmlschemaQwtEnhancedPackage.FONT__POINTSIZE:
				return POINTSIZE_EDEFAULT == null ? pointsize != null : !POINTSIZE_EDEFAULT.equals(pointsize);
			case Qt48XmlschemaQwtEnhancedPackage.FONT__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ITALIC:
				return isSetItalic();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__BOLD:
				return isSetBold();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__UNDERLINE:
				return isSetUnderline();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STRIKEOUT:
				return isSetStrikeout();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__ANTIALIASING:
				return isSetAntialiasing();
			case Qt48XmlschemaQwtEnhancedPackage.FONT__STYLESTRATEGY:
				return STYLESTRATEGY_EDEFAULT == null ? stylestrategy != null : !STYLESTRATEGY_EDEFAULT.equals(stylestrategy);
			case Qt48XmlschemaQwtEnhancedPackage.FONT__KERNING:
				return isSetKerning();
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
		result.append(" (family: ");
		result.append(family);
		result.append(", pointsize: ");
		result.append(pointsize);
		result.append(", weight: ");
		result.append(weight);
		result.append(", italic: ");
		if (italicESet) result.append(italic); else result.append("<unset>");
		result.append(", bold: ");
		if (boldESet) result.append(bold); else result.append("<unset>");
		result.append(", underline: ");
		if (underlineESet) result.append(underline); else result.append("<unset>");
		result.append(", strikeout: ");
		if (strikeoutESet) result.append(strikeout); else result.append("<unset>");
		result.append(", antialiasing: ");
		if (antialiasingESet) result.append(antialiasing); else result.append("<unset>");
		result.append(", stylestrategy: ");
		result.append(stylestrategy);
		result.append(", kerning: ");
		if (kerningESet) result.append(kerning); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FontImpl
