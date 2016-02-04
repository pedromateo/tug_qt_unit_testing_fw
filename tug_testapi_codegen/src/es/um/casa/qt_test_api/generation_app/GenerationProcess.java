package es.um.casa.qt_test_api.generation_app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;

/*
// COMPILATION

import org.eclipse.acceleo.parser.*;
import org.eclipse.acceleo.model.*;
import org.eclipse.acceleo.common.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.emf.codegen.*;
import org.eclipse.emf.common.*;
import org.eclipse.ocl.*;
import org.eclipse.ocl.ecore.*;
import org.eclipse.core.runtime.*;
import org.eclipse.equinox.common.*;
import org.eclipse.core.jobs.*;
import runtime_registry_compatibility.*;
import org.eclipse.equinox.preferences.*;
import org.eclipse.core.contenttype.*;
import org.eclipse.equinox.app.*;
import ant.*;


// LAUNCH

import org.eclipse.acceleo.engine.*;
import org.eclipse.acceleo.profiler.*;
import org.eclipse.acceleo.model.*;
import org.eclipse.acceleo.common.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.emf.codegen.*;
import org.eclipse.emf.common.*;
import org.eclipse.ocl.*;
import org.eclipse.ocl.ecore.*;
import lpg.runtime.java.*;
 */

// Qt 4.8 MODEL

public class GenerationProcess {

	final static String UI_EXTENSION = "ui";
	static String UI_FILE_NOT_PRESENT = "";
	static String UI_FILE = "";
	static String REL_UI_FILE = "";
	static String UI_CLASSNAME = "";
	static String UI_REFERENCE = "";
	static String UI_REFERENCE_INCLUDE = "";
	static String GW_ENABLED = "";
	static String GW_LIB = "";
	static String GW_FILE = "";
	static String GW_CLASSNAME = "";
	static String GW_PANEL_PARAMETERS = "";
	static String GW_PARAMETERS = "";
	static String GW_BUILDDIR = "";
	static String GW_EXTRAS = "";
	static String MODEL_ENABLED = "";
	static String MODEL_LIB = "";
	static String MODEL_FILE = "";
	static String MODEL_CLASSNAME = "";
	static String MODEL_BUILDDIR = "";
	static String MODEL_EXTRAS = "";
	static String SIGNALS_ENABLED = "";
	static String SIGNALS_LIB = "";
	static String SIGNALS_FILE = "";
	static String SIGNALS_CLASSNAME = "";
	static String SIGNALS_BUILDDIR = "";
	static String SIGNALS_EXTRAS = "";
	static String SIGNALS_INCLUDES = "";
	static String GCOV_ENABLED = "";
	static String GCOV_INCLUDES = "";
	static String GPROF_ENABLED = "";
	static String GPROF_INCLUDES = "";
	static String QWT_ENABLED = "";
	static String QWT_INCLUDES = "";
	static String EXTRA_INCLUDES = "";
	static String TESTSUITES_INCLUDES = "";
	static String TUGLIB_INCLUDES = "";
	static String RT_INCLUDES_H = "";
	static String RT_CODE_H = "";
	static String RT_INCLUDES_CPP = "";
	static String RT_CODE_CPP = "";
	static String PROJECT_NAME = "";
	static String GEN_ONLY_PRO = "";
	static String TESTPANEL_GENDIR = "";
	static String TESTSUITES_GENDIR = "";
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
		if (args.length == 45
				/*&& args[0] != "" && args[1] != "" && args[2] != "" && args[3] != "" 
				&& args[4] != "" && args[5] != "" && args[6] != "" && args[7] != "" && args[8] != "" 
				&& args[9] != "" && args[10] != "" && args[11] != "" && args[12] != "" && args[13] != "" 
				&& args[14] != "" && args[15] != "" && args[16] != "" && args[17] != "" 
				&& args[18] != "" && args[19] != "" && args[20] != ""*/)
		{
			UI_FILE_NOT_PRESENT = args[index++];
			UI_FILE = args[index++];
			REL_UI_FILE = args[index++];
			UI_CLASSNAME = args[index++];
			UI_REFERENCE = args[index++];
			UI_REFERENCE_INCLUDE = args[index++];
			GW_ENABLED = args[index++];
			GW_LIB = args[index++];
			GW_FILE = args[index++];
			GW_CLASSNAME = args[index++];
			GW_PANEL_PARAMETERS = args[index++];
			GW_PARAMETERS = args[index++];
			GW_BUILDDIR = args[index++];
			GW_EXTRAS = args[index++];
			MODEL_ENABLED = args[index++];
			MODEL_LIB = args[index++];
			MODEL_FILE = args[index++];
			MODEL_CLASSNAME = args[index++];
			MODEL_BUILDDIR = args[index++];
			MODEL_EXTRAS = args[index++];
			SIGNALS_ENABLED = args[index++];
			SIGNALS_LIB = args[index++];
			SIGNALS_FILE = args[index++];
			SIGNALS_CLASSNAME = args[index++];
			SIGNALS_BUILDDIR = args[index++];
			SIGNALS_EXTRAS = args[index++];
			SIGNALS_INCLUDES = args[index++];
			GCOV_ENABLED = args[index++];
			GCOV_INCLUDES = args[index++];
			GPROF_ENABLED = args[index++];
			GPROF_INCLUDES = args[index++];
			QWT_ENABLED = args[index++];
			QWT_INCLUDES = args[index++];
			EXTRA_INCLUDES = args[index++];
			TESTSUITES_INCLUDES = args[index++];
			TUGLIB_INCLUDES = args[index++];
			RT_INCLUDES_H = args[index++];
			RT_CODE_H = args[index++];
			RT_INCLUDES_CPP = args[index++];
			RT_CODE_CPP = args[index++];
			PROJECT_NAME = args[index++];
			GEN_ONLY_PRO = args[index++];
			TESTPANEL_GENDIR = args[index++];
			TESTSUITES_GENDIR = args[index++];
			GENERATION_DIRECTORY = args[index++];
		}
		// error
		else 
		{
			_log(Integer.toString(args.length));

			if (args[index] != null) _log("UI_FILE_NOT_PRESENT" + ": " + args[index++]);
			if (args[index] != null) _log("UI_FILE" + ": " + args[index++]);
			if (args[index] != null) _log("REL_UI_FILE" + ": " + args[index++]);
			if (args[index] != null) _log("UI_CLASSNAME" + ": " + args[index++]);
			if (args[index] != null) _log("UI_REFERENCE" + ": " + args[index++]);
			if (args[index] != null) _log("UI_REFERENCE_INCLUDE" + ": " + args[index++]);
			if (args[index] != null) _log("GW_ENABLED" + ": " + args[index++]);
			if (args[index] != null) _log("GW_LIB" + ": " + args[index++]);
			if (args[index] != null) _log("GW_FILE" + ": " + args[index++]);
			if (args[index] != null) _log("GW_CLASSNAME" + ": " + args[index++]);
			if (args[index] != null) _log("GW_PANEL_PARAMETERS" + ": " + args[index++]);
			if (args[index] != null) _log("GW_PARAMETERS" + ": " + args[index++]);
			if (args[index] != null) _log("GW_BUILDDIR" + ": " + args[index++]);
			if (args[index] != null) _log("GW_EXTRAS" + ": " + args[index++]);
			if (args[index] != null) _log("MODEL_ENABLED" + ": " + args[index++]);
			if (args[index] != null) _log("MODEL_LIB" + ": " + args[index++]);
			if (args[index] != null) _log("MODEL_FILE" + ": " + args[index++]);
			if (args[index] != null) _log("MODEL_CLASSNAME" + ": " + args[index++]);
			if (args[index] != null) _log("MODEL_BUILDDIR" + ": " + args[index++]);
			if (args[index] != null) _log("MODEL_EXTRAS" + ": " + args[index++]);
			if (args[index] != null) _log("SIGNALS_ENABLED" + ": " + args[index++]);
			if (args[index] != null) _log("SIGNALS_LIB" + ": " + args[index++]);
			if (args[index] != null) _log("SIGNALS_FILE" + ": " + args[index++]);
			if (args[index] != null) _log("SIGNALS_CLASSNAME" + ": " + args[index++]);
			if (args[index] != null) _log("SIGNALS_BUILDDIR" + ": " + args[index++]);
			if (args[index] != null) _log("SIGNALS_EXTRAS" + ": " + args[index++]);
			if (args[index] != null) _log("SIGNALS_INCLUDES" + ": " + args[index++]);
			if (args[index] != null) _log("GCOV_ENABLED" + ": " + args[index++]);
			if (args[index] != null) _log("GCOV_INCLUDES" + ": " + args[index++]);
			if (args[index] != null) _log("GPROF_ENABLED" + ": " + args[index++]);
			if (args[index] != null) _log("GPROF_INCLUDES" + ": " + args[index++]);
			if (args[index] != null) _log("QWT_ENABLED" + ": " + args[index++]);
			if (args[index] != null) _log("QWT_INCLUDES" + ": " + args[index++]);
			if (args[index] != null) _log("EXTRA_INCLUDES" + ": " + args[index++]);
			if (args[index] != null) _log("TESTSUITES_INCLUDES" + ": " + args[index++]);
			if (args[index] != null) _log("TUGLIB_INCLUDES" + ": " + args[index++]);
			if (args[index] != null) _log("RT_INCLUDES_H" + ": " + args[index++]);
			if (args[index] != null) _log("RT_CODE_H" + ": " + args[index++]);
			if (args[index] != null) _log("RT_INCLUDES_CPP" + ": " + args[index++]);
			if (args[index] != null) _log("RT_CODE_CPP" + ": " + args[index++]);
			if (args[index] != null) _log("PROJECT_NAME" + ": " + args[index++]);
			if (args[index] != null) _log("GEN_ONLY_PRO" + ": " + args[index++]);
			if (args[index] != null) _log("TESTPANEL_GENDIR" + ": " + args[index++]);
			if (args[index] != null) _log("TESTSUITES_GENDIR" + ": " + args[index++]);
			if (args[index] != null) _log("GENERATION_DIRECTORY" + ": " + args[index++]);

			throw new IllegalArgumentException("FIXME Usage: TestAPIGenerator <input_file.ui> <destination_directory>");
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

		_log("Starting generation...");

		_log("");
		_log("============================================================");
		if (UI_FILE_NOT_PRESENT == "true") _log("(No *.ui file selected)");
		_log("Loading *.ui file: " + UI_FILE);
		
		URI modelURI = URI.createFileURI(UI_FILE);

		_log("============================================================");
		_log("Setting parameters");

		//Generate generator;
		ArrayList<String> parameters = new ArrayList<String>();
		//String filename = UI_FILE.substring(UI_FILE.lastIndexOf('/')+1,UI_FILE.length());
		//filename = filename.substring(0,filename.lastIndexOf('.'));
		parameters.add(UI_FILE_NOT_PRESENT);
		parameters.add(UI_FILE);
		parameters.add(REL_UI_FILE);
		parameters.add(UI_CLASSNAME);
		parameters.add(UI_REFERENCE);
		parameters.add(UI_REFERENCE_INCLUDE);
		parameters.add(GW_ENABLED);
		parameters.add(GW_LIB);
		parameters.add(GW_FILE);
		parameters.add(GW_CLASSNAME);
		parameters.add(GW_PANEL_PARAMETERS);
		parameters.add(GW_PARAMETERS);
		parameters.add(GW_BUILDDIR);
		parameters.add(GW_EXTRAS);
		parameters.add(MODEL_ENABLED);
		parameters.add(MODEL_LIB);
		parameters.add(MODEL_FILE);
		parameters.add(MODEL_CLASSNAME);
		parameters.add(MODEL_BUILDDIR);
		parameters.add(MODEL_EXTRAS);
		parameters.add(SIGNALS_ENABLED);
		parameters.add(SIGNALS_LIB);
		parameters.add(SIGNALS_FILE);
		parameters.add(SIGNALS_CLASSNAME);
		parameters.add(SIGNALS_BUILDDIR);
		parameters.add(SIGNALS_EXTRAS);
		parameters.add(SIGNALS_INCLUDES);
		parameters.add(GCOV_ENABLED);
		parameters.add(GCOV_INCLUDES);
		parameters.add(GPROF_ENABLED);
		parameters.add(GPROF_INCLUDES);
		parameters.add(QWT_ENABLED);
		parameters.add(QWT_INCLUDES);
		parameters.add(EXTRA_INCLUDES);
		parameters.add(TESTSUITES_INCLUDES);
		parameters.add(TUGLIB_INCLUDES);
		parameters.add(RT_INCLUDES_H);
		parameters.add(RT_CODE_H);
		parameters.add(RT_INCLUDES_CPP);
		parameters.add(RT_CODE_CPP);
		parameters.add(PROJECT_NAME);
		parameters.add(GEN_ONLY_PRO);
		parameters.add(TESTPANEL_GENDIR);
		parameters.add(TESTSUITES_GENDIR);
		//_log("...to class: " + UI_CLASSNAME);


		// we need the filename later
		_log("Calling MyGenerator with:");
		_log(" - output dir: " + GENERATION_DIRECTORY);
		for (int i = 0; i < parameters.size();i++)
			_log(" - arg " + i + ": " + parameters.get(i));

		_log("============================================================");
		_log("Generation process...");

		MyGenerator.main(modelURI, new File(GENERATION_DIRECTORY),parameters);

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
