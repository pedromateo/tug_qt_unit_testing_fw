package org.eclipse.acceleo.qt_testsuite.run;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class TestsuiteGenProcess {

	// param names
	
	static String MODEL_URI = "";
	static String BASE_CLASS_NAME = "";
	static String BASE_CLASS_FILENAME = "";
	static String GENERATION_DIRECTORY = "";
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  
	{

		///
		/// check arguments
		///

		int index = 0;

		// OK args
		if (args.length == 4)
		{
			MODEL_URI = args[index++];
			//
			BASE_CLASS_NAME = args[index++];
			BASE_CLASS_FILENAME = args[index++];
			
			//
			GENERATION_DIRECTORY = args[index++];
		}
		// error
		else 
		{
			_log(Integer.toString(args.length));

			if (args[index] != null) _log("MODEL_URI" + ": " + args[index++]);
			if (args[index] != null) _log("BASE_CLASS_NAME" + ": " + args[index++]);
			if (args[index] != null) _log("BASE_CLASS_FILENAME" + ": " + args[index++]);
			if (args[index] != null) _log("GENERATION_DIRECTORY" + ": " + args[index++]);

			throw new IllegalArgumentException("Change arguments to call this generator.");
		}

		///
		/// register models
		///

		// http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.acceleo.doc%2Fpages%2Freference%2Fstandalone.html

		///
		/// compile
		///

		// http://wiki.eclipse.org/Acceleo/FAQ#How_can_I_compile_my_mtl_files_in_a_standalone_environment.3F

		// Maven: http://lbroudoux.wordpress.com/2012/07/24/launching-acceleo-generation-from-maven/


		///
		///
		///

		_log("Starting testsuite generation...");

		_log("");
		_log("============================================================");
		
		URI modelURI = URI.createFileURI(MODEL_URI);

		_log("");
		_log("============================================================");
		_log("Setting parameters");

		//Generate generator;
		ArrayList<String> parameters = new ArrayList<String>();
		parameters.add(BASE_CLASS_NAME);
		parameters.add(BASE_CLASS_FILENAME);


		// we need the filename later
		_log("Calling TestsuiteGenerator with:");
		_log(" - output dir: " + GENERATION_DIRECTORY);
		for (int i = 0; i < parameters.size();i++)
			_log(" - arg " + i + ": " + parameters.get(i));

		TestsuiteGenerator.main(modelURI, new File(GENERATION_DIRECTORY),parameters);

		_log("Generation finished");
	}
	
	public static void main(EObject model, String gendir, ArrayList<String> parameters) throws IOException  
	{


		// we need the filename later
		_log("Calling TestsuiteGenerator with:");
		_log(" - output dir: " + gendir);
		for (int i = 0; i < parameters.size();i++)
			_log(" - arg " + i + ": " + parameters.get(i));

		TestsuiteGenerator.GenFromObject(model, new File(gendir),parameters);

		_log("Generation finished");
	}

	/**
	 * Log method
	 * 
	 * @param s
	 */
	private static void _log(String s) {
		System.out.println(s);
	}
	
}


