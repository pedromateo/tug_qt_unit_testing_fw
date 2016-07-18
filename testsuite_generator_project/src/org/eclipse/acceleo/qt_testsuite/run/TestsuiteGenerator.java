package org.eclipse.acceleo.qt_testsuite.run;


import java.io.File;
import java.io.IOException;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.List;

import org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelFactoryImpl;
//import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.util.Qt48XmlschemaQwtEnhancedResourceFactoryImpl;
import org.casa.dsltesting.TestsuiteModel.util.*;

import org.eclipse.acceleo.common.IAcceleoConstants;
import org.eclipse.acceleo.model.mtl.MtlPackage;
import org.eclipse.acceleo.model.mtl.resource.EMtlResourceFactoryImpl;
import org.eclipse.acceleo.qt_testsuite.generator.main.GenerateTestsuite;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;


public class TestsuiteGenerator extends GenerateTestsuite {

	public TestsuiteGenerator(URI modelURI, File targetFolder,
			List<? extends Object> arguments) throws IOException {
		super(modelURI, targetFolder, arguments);
	}
	

	public TestsuiteGenerator(EObject model, File targetFolder,
			List<? extends Object> arguments) throws IOException {
		super(model, targetFolder, arguments);
	}

	/**
	 * This is an adapted copy of main method in Generate class.
	 * 
	 * @param args
	 *            Arguments of the generation.
	 * @throws IOException 
	 */
	public static void main(URI modelURI, File folder, ArrayList<String> arguments) throws IOException {
		//try {

		/*
		 * If you want to change the content of this method, do NOT forget to change the "@generated"
		 * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
		 * of the Acceleo module with the main template that has caused the creation of this class will
		 * revert your modifications.
		 */

		/*
		 * Add in this list all the arguments used by the starting point of the generation
		 * If your main template is called on an element of your model and a String, you can
		 * add in "arguments" this "String" attribute.
		 */

//GenerateTestsuite generator = new TestsuiteGenerator(modelURI, folder, arguments);

		/*
		 * Add the properties from the launch arguments.
		 * If you want to programmatically add new properties, add them in "propertiesFiles"
		 * You can add the absolute path of a properties files, or even a project relative path.
		 * If you want to add another "protocol" for your properties files, please override 
		 * "getPropertiesLoaderService(AcceleoService)" in order to return a new property loader.
		 * The behavior of the properties loader service is explained in the Acceleo documentation
		 * (Help -> Help Contents).
		 */

		//for (int i = 2; i < args.length; i++) {
		//    generator.addPropertiesFile(args[i]);
		//}

//generator.doGenerate(new BasicMonitor());

		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
	}
	
	public static void GenFromObject(EObject model, File folder, ArrayList<String> arguments) throws IOException {
		GenerateTestsuite generator = 
				new TestsuiteGenerator(model, folder, arguments);
		
		generator.doGenerate(new BasicMonitor());
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void registerPackages(ResourceSet resourceSet) {
		System.out.println("@TestsuiteGenerator::registerPackages");
		super.registerPackages(resourceSet);

		if (!isInWorkspace(org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage.class)) {
			resourceSet.getPackageRegistry().put(
					org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage.eNS_URI, 
					org.casa.dsltesting.TestsuiteModel.TestsuiteModelPackage.eINSTANCE);
		}

		/*if (!isInWorkspace(org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.class)) {
			resourceSet.getPackageRegistry().put(
					org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.eNS_URI,
					org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.eINSTANCE);
		}
		

		if (!isInWorkspace(org.eclipse.emf.ecore.EcorePackage.class)) {
			resourceSet.getPackageRegistry().put(
					org.eclipse.emf.ecore.EcorePackage.eNS_URI,
					org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
		}*/
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void registerResourceFactories(ResourceSet resourceSet) {
		System.out.println("@TestsuiteGenerator::registerResourceFactories");
		super.registerResourceFactories(resourceSet);

		/*resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi",
				new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());


		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"ecore", 
				new EcoreResourceFactoryImpl());

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				IAcceleoConstants.EMTL_FILE_EXTENSION, 
				new EMtlResourceFactoryImpl());

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xsd", 
				new XMLResourceFactoryImpl());*/
	}


	/*public void registerLibraries() {
		System.out.println("@TestsuiteGenerator::registerLibraries");
		CodeSource acceleoModel = MtlPackage.class.getProtectionDomain().getCodeSource();
		if (acceleoModel != null) {
			String libraryLocation = acceleoModel.getLocation().toString();
			if (libraryLocation.endsWith(".jar")) {
				libraryLocation = "jar:" + libraryLocation + '!';
			}

			URIConverter.URI_MAP.put(URI.createURI("http://www.eclipse.org/acceleo/mtl/3.0/mtlstdlib.ecore"),
					URI.createURI(libraryLocation + "/model/mtlstdlib.ecore"));
			URIConverter.URI_MAP.put(URI.createURI("http://www.eclipse.org/acceleo/mtl/3.0/mtlnonstdlib.ecore"),
					URI.createURI(libraryLocation + "/model/mtlnonstdlib.ecore"));
		} else {
			System.err.println("Coudln't retrieve location of plugin 'org.eclipse.acceleo.model'.");
		}
	}*/

}