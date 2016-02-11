package es.um.casa.qt_test_api.generation_app;

import java.io.File;
import java.io.IOException;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.List;

import org.casa.dsltesting.Qt48Xmlschema.util.Qt48XmlschemaResourceFactoryImpl;
import org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.util.Qt48XmlschemaQwtEnhancedResourceFactoryImpl;
import org.eclipse.acceleo.common.IAcceleoConstants;
import org.eclipse.acceleo.model.mtl.MtlPackage;
import org.eclipse.acceleo.model.mtl.resource.EMtlResourceFactoryImpl;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import es.um.casa.qt_test_api.generator.main.Generate;



public class MyGenerator extends Generate {

	final boolean QWT_SUPPORT_ENABLED = true;

	public MyGenerator(URI modelURI, File targetFolder,
			List<? extends Object> arguments) throws IOException {
		super(modelURI, targetFolder, arguments);
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

		Generate generator = new MyGenerator(modelURI, folder, arguments);

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

		generator.doGenerate(new BasicMonitor());

		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void registerPackages(ResourceSet resourceSet) {
		System.out.println("@MyGenerator::registerPackages");
		super.registerPackages(resourceSet);

		if (QWT_SUPPORT_ENABLED){
			if (!isInWorkspace(org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage.class)) {
				resourceSet.getPackageRegistry().put(
						org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage.eNS_URI,// eINSTANCE.getNsURI(), 
						org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage.eINSTANCE);
			}
		}
		else{
			if (!isInWorkspace(org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage.class)) {
				//resourceSet.getPackageRegistry().put(MyPackage.eINSTANCE.getNsURI(), MyPackage.eINSTANCE);
				resourceSet.getPackageRegistry().put(
						org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage.eNS_URI,// eINSTANCE.getNsURI(), 
						org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage.eINSTANCE);
			}
		}

		if (!isInWorkspace(org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.class)) {
			resourceSet.getPackageRegistry().put(
					org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.eNS_URI,// eINSTANCE.getNsURI(), 
					org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.eINSTANCE);
		}

		if (!isInWorkspace(org.eclipse.emf.ecore.EcorePackage.class)) {
			resourceSet.getPackageRegistry().put(
					org.eclipse.emf.ecore.EcorePackage.eNS_URI,// eINSTANCE.getNsURI(), 
					org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
		}
		//
		//		if (!isInWorkspace(org.eclipse.emf.ecore.EcorePackage.class)) {
		//			resourceSet.getPackageRegistry().put(
		//					UMLPackage.eNS_URI,// eINSTANCE.getNsURI(), 
		//					UMLPackage.eINSTANCE);

		//resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/2.1.0/UML",
		//		UMLPackage.eINSTANCE);
		//		}


		//Map uriMap = resourceSet.getURIConverter().getURIMap();
		//URI uri = URI.createURI("jar:file:/C:/eclipse/plugins/org.eclipse.uml2.uml.resources_<version>.jar!/"); // for example
		//uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
		//uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		//uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void registerResourceFactories(ResourceSet resourceSet) {
		System.out.println("@MyGenerator::registerResourceFactories");
		super.registerResourceFactories(resourceSet);

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi",
				new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());


		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"ecore", 
				new EcoreResourceFactoryImpl());

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				IAcceleoConstants.EMTL_FILE_EXTENSION, 
				new EMtlResourceFactoryImpl());


		if (QWT_SUPPORT_ENABLED){
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ui", 
					new Qt48XmlschemaQwtEnhancedResourceFactoryImpl());
		}
		else{
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ui", 
					new Qt48XmlschemaResourceFactoryImpl());
		}

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xsd", 
				new XMLResourceFactoryImpl());
	}

	public void registerLibraries() {
		System.out.println("@MyGenerator::registerLibraries");
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
	}

}
