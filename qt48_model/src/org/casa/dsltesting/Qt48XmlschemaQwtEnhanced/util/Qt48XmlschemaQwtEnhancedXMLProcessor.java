/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.util;

import java.util.Map;

import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage;

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
public class Qt48XmlschemaQwtEnhancedXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qt48XmlschemaQwtEnhancedXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, Qt48XmlschemaQwtEnhancedPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Qt48XmlschemaQwtEnhancedResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Qt48XmlschemaQwtEnhancedResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Qt48XmlschemaQwtEnhancedResourceFactoryImpl());
		}
		return registrations;
	}

} //Qt48XmlschemaQwtEnhancedXMLProcessor
