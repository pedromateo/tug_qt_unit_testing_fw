/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getGradientStop <em>Gradient Stop</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentralx <em>Centralx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentraly <em>Centraly</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCoordinatemode <em>Coordinatemode</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndx <em>Endx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndy <em>Endy</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocalx <em>Focalx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocaly <em>Focaly</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getSpread <em>Spread</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStartx <em>Startx</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStarty <em>Starty</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient()
 * @model extendedMetaData="name='Gradient' kind='elementOnly'"
 * @generated
 */
public interface Gradient extends EObject {
	/**
	 * Returns the value of the '<em><b>Gradient Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.GradientStop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Stop</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_GradientStop()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gradientStop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GradientStop> getGradientStop();

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #setAngle(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Angle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngle()
	 * @see #getAngle()
	 * @see #setAngle(double)
	 * @generated
	 */
	void unsetAngle();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getAngle <em>Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle</em>' attribute is set.
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @see #setAngle(double)
	 * @generated
	 */
	boolean isSetAngle();

	/**
	 * Returns the value of the '<em><b>Centralx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centralx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centralx</em>' attribute.
	 * @see #isSetCentralx()
	 * @see #unsetCentralx()
	 * @see #setCentralx(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Centralx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='centralx' namespace='##targetNamespace'"
	 * @generated
	 */
	double getCentralx();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentralx <em>Centralx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centralx</em>' attribute.
	 * @see #isSetCentralx()
	 * @see #unsetCentralx()
	 * @see #getCentralx()
	 * @generated
	 */
	void setCentralx(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentralx <em>Centralx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentralx()
	 * @see #getCentralx()
	 * @see #setCentralx(double)
	 * @generated
	 */
	void unsetCentralx();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentralx <em>Centralx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centralx</em>' attribute is set.
	 * @see #unsetCentralx()
	 * @see #getCentralx()
	 * @see #setCentralx(double)
	 * @generated
	 */
	boolean isSetCentralx();

	/**
	 * Returns the value of the '<em><b>Centraly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centraly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centraly</em>' attribute.
	 * @see #isSetCentraly()
	 * @see #unsetCentraly()
	 * @see #setCentraly(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Centraly()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='centraly' namespace='##targetNamespace'"
	 * @generated
	 */
	double getCentraly();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentraly <em>Centraly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centraly</em>' attribute.
	 * @see #isSetCentraly()
	 * @see #unsetCentraly()
	 * @see #getCentraly()
	 * @generated
	 */
	void setCentraly(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentraly <em>Centraly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentraly()
	 * @see #getCentraly()
	 * @see #setCentraly(double)
	 * @generated
	 */
	void unsetCentraly();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCentraly <em>Centraly</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centraly</em>' attribute is set.
	 * @see #unsetCentraly()
	 * @see #getCentraly()
	 * @see #setCentraly(double)
	 * @generated
	 */
	boolean isSetCentraly();

	/**
	 * Returns the value of the '<em><b>Coordinatemode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinatemode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinatemode</em>' attribute.
	 * @see #setCoordinatemode(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Coordinatemode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='coordinatemode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCoordinatemode();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getCoordinatemode <em>Coordinatemode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinatemode</em>' attribute.
	 * @see #getCoordinatemode()
	 * @generated
	 */
	void setCoordinatemode(String value);

	/**
	 * Returns the value of the '<em><b>Endx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endx</em>' attribute.
	 * @see #isSetEndx()
	 * @see #unsetEndx()
	 * @see #setEndx(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Endx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='endx' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEndx();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndx <em>Endx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endx</em>' attribute.
	 * @see #isSetEndx()
	 * @see #unsetEndx()
	 * @see #getEndx()
	 * @generated
	 */
	void setEndx(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndx <em>Endx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndx()
	 * @see #getEndx()
	 * @see #setEndx(double)
	 * @generated
	 */
	void unsetEndx();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndx <em>Endx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endx</em>' attribute is set.
	 * @see #unsetEndx()
	 * @see #getEndx()
	 * @see #setEndx(double)
	 * @generated
	 */
	boolean isSetEndx();

	/**
	 * Returns the value of the '<em><b>Endy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endy</em>' attribute.
	 * @see #isSetEndy()
	 * @see #unsetEndy()
	 * @see #setEndy(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Endy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='endy' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEndy();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndy <em>Endy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endy</em>' attribute.
	 * @see #isSetEndy()
	 * @see #unsetEndy()
	 * @see #getEndy()
	 * @generated
	 */
	void setEndy(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndy <em>Endy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndy()
	 * @see #getEndy()
	 * @see #setEndy(double)
	 * @generated
	 */
	void unsetEndy();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getEndy <em>Endy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endy</em>' attribute is set.
	 * @see #unsetEndy()
	 * @see #getEndy()
	 * @see #setEndy(double)
	 * @generated
	 */
	boolean isSetEndy();

	/**
	 * Returns the value of the '<em><b>Focalx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focalx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focalx</em>' attribute.
	 * @see #isSetFocalx()
	 * @see #unsetFocalx()
	 * @see #setFocalx(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Focalx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='focalx' namespace='##targetNamespace'"
	 * @generated
	 */
	double getFocalx();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocalx <em>Focalx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focalx</em>' attribute.
	 * @see #isSetFocalx()
	 * @see #unsetFocalx()
	 * @see #getFocalx()
	 * @generated
	 */
	void setFocalx(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocalx <em>Focalx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFocalx()
	 * @see #getFocalx()
	 * @see #setFocalx(double)
	 * @generated
	 */
	void unsetFocalx();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocalx <em>Focalx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Focalx</em>' attribute is set.
	 * @see #unsetFocalx()
	 * @see #getFocalx()
	 * @see #setFocalx(double)
	 * @generated
	 */
	boolean isSetFocalx();

	/**
	 * Returns the value of the '<em><b>Focaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focaly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focaly</em>' attribute.
	 * @see #isSetFocaly()
	 * @see #unsetFocaly()
	 * @see #setFocaly(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Focaly()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='focaly' namespace='##targetNamespace'"
	 * @generated
	 */
	double getFocaly();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocaly <em>Focaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focaly</em>' attribute.
	 * @see #isSetFocaly()
	 * @see #unsetFocaly()
	 * @see #getFocaly()
	 * @generated
	 */
	void setFocaly(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocaly <em>Focaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFocaly()
	 * @see #getFocaly()
	 * @see #setFocaly(double)
	 * @generated
	 */
	void unsetFocaly();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getFocaly <em>Focaly</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Focaly</em>' attribute is set.
	 * @see #unsetFocaly()
	 * @see #getFocaly()
	 * @see #setFocaly(double)
	 * @generated
	 */
	boolean isSetFocaly();

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Radius()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='radius' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(double)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(double)
	 * @generated
	 */
	boolean isSetRadius();

	/**
	 * Returns the value of the '<em><b>Spread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spread</em>' attribute.
	 * @see #setSpread(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Spread()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='spread' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpread();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getSpread <em>Spread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread</em>' attribute.
	 * @see #getSpread()
	 * @generated
	 */
	void setSpread(String value);

	/**
	 * Returns the value of the '<em><b>Startx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startx</em>' attribute.
	 * @see #isSetStartx()
	 * @see #unsetStartx()
	 * @see #setStartx(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Startx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='startx' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStartx();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStartx <em>Startx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startx</em>' attribute.
	 * @see #isSetStartx()
	 * @see #unsetStartx()
	 * @see #getStartx()
	 * @generated
	 */
	void setStartx(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStartx <em>Startx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartx()
	 * @see #getStartx()
	 * @see #setStartx(double)
	 * @generated
	 */
	void unsetStartx();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStartx <em>Startx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startx</em>' attribute is set.
	 * @see #unsetStartx()
	 * @see #getStartx()
	 * @see #setStartx(double)
	 * @generated
	 */
	boolean isSetStartx();

	/**
	 * Returns the value of the '<em><b>Starty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starty</em>' attribute.
	 * @see #isSetStarty()
	 * @see #unsetStarty()
	 * @see #setStarty(double)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Starty()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='starty' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStarty();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStarty <em>Starty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starty</em>' attribute.
	 * @see #isSetStarty()
	 * @see #unsetStarty()
	 * @see #getStarty()
	 * @generated
	 */
	void setStarty(double value);

	/**
	 * Unsets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStarty <em>Starty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStarty()
	 * @see #getStarty()
	 * @see #setStarty(double)
	 * @generated
	 */
	void unsetStarty();

	/**
	 * Returns whether the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getStarty <em>Starty</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Starty</em>' attribute is set.
	 * @see #unsetStarty()
	 * @see #getStarty()
	 * @see #setStarty(double)
	 * @generated
	 */
	boolean isSetStarty();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getGradient_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48Xmlschema.Gradient#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Gradient
