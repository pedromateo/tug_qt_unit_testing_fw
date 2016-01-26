/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Widgets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidgets#getCustomwidget <em>Customwidget</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getCustomWidgets()
 * @model extendedMetaData="name='CustomWidgets' kind='elementOnly'"
 * @generated
 */
public interface CustomWidgets extends EObject {
	/**
	 * Returns the value of the '<em><b>Customwidget</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.CustomWidget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customwidget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customwidget</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getCustomWidgets_Customwidget()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='customwidget' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CustomWidget> getCustomwidget();

} // CustomWidgets
