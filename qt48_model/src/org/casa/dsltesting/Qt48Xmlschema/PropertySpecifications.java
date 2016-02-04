/**
 */
package org.casa.dsltesting.Qt48Xmlschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.PropertySpecifications#getGroup <em>Group</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.PropertySpecifications#getStringpropertyspecification <em>Stringpropertyspecification</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getPropertySpecifications()
 * @model extendedMetaData="name='PropertySpecifications' kind='elementOnly'"
 * @generated
 */
public interface PropertySpecifications extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getPropertySpecifications_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Stringpropertyspecification</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48Xmlschema.StringPropertySpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stringpropertyspecification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringpropertyspecification</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage#getPropertySpecifications_Stringpropertyspecification()
	 * @model type="org.casa.dsltesting.Qt48Xmlschema.StringPropertySpecification" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stringpropertyspecification' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getStringpropertyspecification();

} // PropertySpecifications
