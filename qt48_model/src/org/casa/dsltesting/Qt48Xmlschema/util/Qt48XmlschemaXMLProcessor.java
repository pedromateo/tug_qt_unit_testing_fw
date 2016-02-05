/**
 */
package org.casa.dsltesting.Qt48Xmlschema.util;

import java.util.Map;

import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Qt48XmlschemaXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, Qt48XmlschemaPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Qt48XmlschemaResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Qt48XmlschemaResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Qt48XmlschemaResourceFactoryImpl());
		}
		return registrations;
	}

} //Qt48XmlschemaXMLProcessor
