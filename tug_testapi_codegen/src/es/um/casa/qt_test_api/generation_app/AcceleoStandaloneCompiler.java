package es.um.casa.qt_test_api.generation_app;

//import java.security.CodeSource;
//
//import org.eclipse.acceleo.common.IAcceleoConstants;
//import org.eclipse.acceleo.model.mtl.MtlPackage;
//import org.eclipse.acceleo.model.mtl.resource.EMtlResourceFactoryImpl;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.URIConverter;
//import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class AcceleoStandaloneCompiler{}
/*extends AcceleoCompiler {
	public void execute() throws BuildException {
		registerResourceFactories();
		registerPackages();
		registerLibraries();

		super.execute();
	}

	public void registerResourceFactories() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(IAcceleoConstants.EMTL_FILE_EXTENSION, new EMtlResourceFactoryImpl());

		// Uncomment the following if you need to use UML models
		// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
	}

	public void registerPackages() {
		// Uncomment if you need to use UML models
		// EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		// Uncomment if you need to use UML models saved with on old version of MDT/UML (you might need to change the URI's version number)
		// EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/2.1.0/UML", UMLPackage.eINSTANCE);
	}

	public void registerLibraries() {
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
}*/