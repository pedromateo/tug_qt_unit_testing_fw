/**
 */
package org.casa.dsltesting.Qt48Xmlschema.util;

import java.util.Map;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlSchemaPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Qt48XmlSchemaXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlSchemaXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, Qt48XmlSchemaPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Qt48XmlSchemaResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Qt48XmlSchemaResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Qt48XmlSchemaResourceFactoryImpl());
		}
		return registrations;
	}

} //Qt48XmlSchemaXMLProcessor
