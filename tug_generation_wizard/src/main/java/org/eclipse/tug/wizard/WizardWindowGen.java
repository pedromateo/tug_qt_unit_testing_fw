package org.eclipse.tug.wizard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.tug.utils.DialogsUtils;
import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.utils.StringTextUtils;
import org.eclipse.tug.wizard.Defines;
import org.eclipse.tug.wizard.TestsuiteGenerationProcess;
import org.eclipse.tug.wizard.console.CompositePrintStream;
import org.eclipse.tug.wizard.console.TextAreaOutputStream;
import org.eclipse.tug.wizard.roundtrip.RoundtripData;
import org.eclipse.tug.wizard.roundtrip.RoundtripUtils;
import org.eclipse.tug.wizard.widgets.testprojecteditor.TestProjectEditor;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteDescriptor;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteNode;

import es.um.casa.qt_test_api.generation_app.GenerationProcess;
import es.um.casa.qt_test_api.generation_app.MyGenerator;

public abstract class WizardWindowGen extends WizardWindowImpl {


	/*
	 * GENERATION PROCESS
	 */


	/**
	 * Main generation method
	 */
	public void but_generate__actionPerformed(ActionEvent arg0){

		/// if not in step 7, go there
		if (_currentStep != 6){ //step 7
			pan_top.setSelectedIndex(6);
		}

		///
		/// enable, clear and connect output to TUG console
		spa_console.setVisible(false);
		txa_console.setVisible(false);
		txa_console.setText("");
		txa_console.setVisible(true);
		spa_console.setVisible(true); // blinks console
		lbl_console_title.setVisible(true);
		TextAreaOutputStream taos = new TextAreaOutputStream(txa_console, 1000 );
		PrintStream ps = new PrintStream( taos );

		CompositePrintStream cps = new CompositePrintStream();
		cps.add(ps);
		cps.add(new PrintStream(new FileOutputStream(FileDescriptor.out)));

		System.setOut(cps);
		System.setErr(cps);

		///
		/// get and check data object
		_setStatus("Retrieving generation data."); //_sleep(1);
		WizardWindowData gendata =__getGenerationData();
		if (gendata == null)
			return;

		///
		/// get roundtrip data object
		_setStatus("Retrieving roundtrip data."); //_sleep(1);
		RoundtripData rtdata =__getRoundtripData(gendata);
		if (rtdata == null)
			return;

		///
		/// generate testsuite files and projects
		if (cbx_generate_testsuites.isSelected()){
			_setStatus("Generating testsuite projects."); //_sleep(1);
			__generateTestsuites(gendata,rtdata);
		}
		else{
			_setStatus("No testsuites to generate."); //_sleep(1);
		}


		///
		/// generate testpanel and the rest of the project
		_setStatus("Generating test panel project and the rest of the project."); //_sleep(1);
		__generateTestpanel(gendata, rtdata);

		///
		/// connect back output to System
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
		System.setErr(new PrintStream(new FileOutputStream(FileDescriptor.err)));
	}

	/// ///////////////////////////////////////////////////////////////////////
	/// ///////////////////////////////////////////////////////////////////////
	/// ///////////////////////////////////////////////////////////////////////


	/**
	 * Generates the rest of the project, main test, and testpanel files
	 * @return
	 */
	private void __generateTestpanel(WizardWindowData gendata, RoundtripData rtdata){

		final String TSPROY_GENDIR = gendata.project_generation_dir + gendata.testsuite_generation_reldir + "foo/";
		final String BIN_GENDIR = gendata.project_generation_dir + Defines.BIN_DIR;

		/// dump some rtdata to gendata
		gendata.rt_includes_h = rtdata.getTestpanelHIncludes();
		gendata.rt_code_h = rtdata.getTestpanelHCode();
		gendata.rt_includes_cpp = rtdata.getTestpanelCPPIncludes();
		gendata.rt_code_cpp = rtdata.getTestpanelCPPCode();

		/// create paths relative to project generation dir
		String rel_ui_file = FileSystemUtils.GetRelativePath(gendata.ui_file, TSPROY_GENDIR);
		String rel_gw_lib = FileSystemUtils.GetRelativePath(gendata.gw_lib, TSPROY_GENDIR);
		String rel_gw_file = FileSystemUtils.GetRelativePath(gendata.gw_file, TSPROY_GENDIR);
		String rel_model_lib = FileSystemUtils.GetRelativePath(gendata.model_lib, TSPROY_GENDIR);
		String rel_model_file = FileSystemUtils.GetRelativePath(gendata.model_file, TSPROY_GENDIR);
		String rel_signals_lib = FileSystemUtils.GetRelativePath(gendata.signals_lib, TSPROY_GENDIR);
		String rel_signals_file = FileSystemUtils.GetRelativePath(gendata.signals_file, TSPROY_GENDIR);
		/// create paths relative to bin dir (for coverage)
		String rel_gw_builddir = FileSystemUtils.GetRelativePath(gendata.gw_builddir, BIN_GENDIR);
		String rel_model_builddir = FileSystemUtils.GetRelativePath(gendata.model_builddir, BIN_GENDIR);
		String rel_signals_builddir = FileSystemUtils.GetRelativePath(gendata.signals_builddir, BIN_GENDIR);

		// generate a string including all relative paths to the generated testsuites
		gendata.testsuites_string = "";
		if (gendata.generated_testsuites != null){
			final String LINE_START = "(\"";
			final String LINE_END = "\")";
			final String LINE_SEP = "\",\"";
			ListIterator it = gendata.generated_testsuites.listIterator();
			while(it.hasNext())
			{
				TestsuiteDescriptor tsd = (TestsuiteDescriptor) it.next();
				gendata.testsuites_string += 
						//FileSystemUtils.GetRelativePath(aux,gendata.project_generation_dir)
						LINE_START 
						//+ StringTextUtils.HTMLEscapeTextLine(tsd.getId()) + LINE_SEP
						//+ StringTextUtils.HTMLEscapeTextLine(tsd.getBinpath()) + LINE_SEP
						+ tsd.getId() + LINE_SEP
						+ tsd.getBinpath() + LINE_SEP
						+ StringTextUtils.HTMLEscapeTextLine(tsd.getDescription()) 
						+ LINE_END;
			}
		}

		// generate project files
		_setStatus("Generating test project for panel " + gendata.ui_file + " in: "+ gendata.project_generation_dir);

		try {
			GenerationProcess.main(new String[]{ 
					//
					gendata.ui_no_panel_file_selected? "true" : "false",
							gendata.ui_file,
							rel_ui_file,
							gendata.ui_classname,
							gendata.ui_reference,
							gendata.ui_reference_include,
							//
							gendata.gw_selected? "true" : "false",
									rel_gw_lib,
									rel_gw_file,
									gendata.gw_classname,
									gendata.gw_panel_parameters,
									gendata.gw_parameters,
									rel_gw_builddir,
									gendata.gw_dependencies,
									//
									gendata.model_selected? "true" : "false",
											rel_model_lib,
											rel_model_file,
											gendata.model_classname,
											rel_model_builddir,
											gendata.model_dependencies,
											//
											gendata.signals_selected? "true" : "false",
													rel_signals_lib,
													rel_signals_file,
													gendata.signals_classname,
													rel_signals_builddir,
													gendata.signals_dependencies,
													gendata.signals_includes,
													//
													Boolean.toString(gendata.gcov_selected),
													gendata.gcov_includes,
													Boolean.toString(gendata.gprof_selected),
													gendata.gprof_includes,
													Boolean.toString(gendata.qwt_selected),
													gendata.qwt_includes,
													gendata.extra_dependencies,
													//
													gendata.testsuites_string,
													//
													gendata.tuglib_includes,
													//
													gendata.rt_includes_h,
													gendata.rt_code_h,
													gendata.rt_includes_cpp,
													gendata.rt_code_cpp,
													//
													gendata.project_name,
													Boolean.toString(gendata.generate_only_pro),
													//
													gendata.testpanel_generation_reldir,
													gendata.testsuite_generation_reldir,
													//
													gendata.project_generation_dir});
			_setOKStatus("Generated files in: "+ gendata.project_generation_dir);

		} catch (Exception exc) {
			String status = "Generation process failed. " + exc.toString();
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			exc.printStackTrace();
			return;
		}

	}


	/**
	 * Generates testsuite files and projects
	 * @return
	 */
	private void __generateTestsuites(WizardWindowData gendata, RoundtripData rtdata){

		///
		/// create paths relative to testsuites generation dir
		/// (note that testsuites are generated into "tests/" directory while
		///  testsuite projects are generated into "tests/foo/" directory

		final String TS_GENDIR = gendata.project_generation_dir + gendata.testsuite_generation_reldir;
		final String TSPRO_GENDIR = TS_GENDIR + "foo" + Defines.PATH_SEP;

		// relative to testsuites
		String ts_rel_model_file = FileSystemUtils.GetRelativePath(gendata.model_file, TS_GENDIR);
		String ts_rel_signals_file = FileSystemUtils.GetRelativePath(gendata.signals_file, TS_GENDIR);

		// relative to test projects
		String tspro_rel_gw_lib_dir = FileSystemUtils.GetRelativePath(gendata.gw_lib_dir, TSPRO_GENDIR);
		String tspro_rel_gw_inc_dir = FileSystemUtils.GetRelativePath(gendata.gw_file_dir, TSPRO_GENDIR);
		String tspro_rel_model_lib_dir = FileSystemUtils.GetRelativePath(gendata.model_lib_dir, TSPRO_GENDIR);
		String tspro_rel_model_inc_dir = FileSystemUtils.GetRelativePath(gendata.model_file_dir, TSPRO_GENDIR);
		String tspro_rel_signals_lib_dir = FileSystemUtils.GetRelativePath(gendata.signals_lib_dir, TSPRO_GENDIR);
		String tspro_rel_signals_inc_dir = FileSystemUtils.GetRelativePath(gendata.signals_file_dir, TSPRO_GENDIR);

		///
		/// put generation values into a map using the relative paths created before
		///

		Map values = new HashMap();
		String tmp = "";

		values.put(Defines.TESTSUITEPRO_NAME, gendata.project_name);

		// test panel 
		//values.put(Defines.TESTSUITE_BASE_TESTPANEL_INCLUDE,"#include \"" + testpanel_filename + "\"");
		//values.put(Defines.TESTSUITE_BASE_TESTPANEL_OBJECT,testpanel_classname +"* _panel;");
		//values.put(Defines.TESTSUITE_BASE_TESTPANEL_INSTANTIATION,"_panel = new " + testpanel_classname + "();");
		values.put(Defines.TESTPANEL_CLASSNAME,Defines.TESTPANEL_FILE_PREFIX + gendata.ui_classname);

		// gw
		//if (cbx_include_gw.isSelected()){
		values.put(Defines.TESTSUITEPRO_GW_LIB_DIR,tspro_rel_gw_lib_dir);
		if (gendata.gw_lib_name.length() > 0){
			tmp = gendata.gw_lib_name.startsWith("lib")? gendata.gw_lib_name.substring(3) : gendata.gw_lib_name;
			tmp = "-l" + tmp.replace(".so","");
			values.put(Defines.TESTSUITEPRO_GW_LIB_INCLUDE,tmp);
		}
		values.put(Defines.TESTSUITEPRO_GW_INC_DIR,tspro_rel_gw_inc_dir);
		values.put(Defines.TESTSUITEPRO_GW_EXTRA_DEPS,gendata.gw_dependencies);
		/*}
		else{
			values.put(Defines.TESTSUITEPRO_GW_LIB_DIR,"../");// avoid qmake compilation problems
			values.put(Defines.TESTSUITEPRO_GW_LIB_INCLUDE,"");
			values.put(Defines.TESTSUITEPRO_GW_INC_DIR,"../");// avoid qmake compilation problems
			values.put(Defines.TESTSUITEPRO_GW_EXTRA_DEPS,"");
		}*/

		// model
		if (cbx_include_model.isSelected()){
			values.put(Defines.TESTSUITE_MODEL_INCLUDE,"#include \"" + ts_rel_model_file + "\"");
			values.put(Defines.TESTSUITE_MODEL_OBJECT,gendata.model_classname +"* _model;");
			values.put(Defines.TESTSUITE_MODEL_INSTANTIATION,"_model = new " + gendata.model_classname + "();");
			values.put(Defines.TESTSUITEPRO_MODEL_LIB_DIR,tspro_rel_model_lib_dir);
			tmp = gendata.model_lib_name.startsWith("lib")? gendata.model_lib_name.substring(3) : gendata.model_lib_name;
			tmp = "-l" + tmp.replace(".so","");
			values.put(Defines.TESTSUITEPRO_MODEL_LIB_INCLUDE,tmp);
			values.put(Defines.TESTSUITEPRO_MODEL_INC_DIR,tspro_rel_model_inc_dir);
			values.put(Defines.TESTSUITEPRO_MODEL_EXTRA_DEPS,gendata.model_dependencies);
		}
		else{
			values.put(Defines.TESTSUITE_MODEL_INCLUDE,"");
			values.put(Defines.TESTSUITE_MODEL_OBJECT,"");
			values.put(Defines.TESTSUITE_MODEL_INSTANTIATION,"");
			values.put(Defines.TESTSUITEPRO_MODEL_LIB_DIR,"../");// avoid qmake compilation problems
			values.put(Defines.TESTSUITEPRO_MODEL_LIB_INCLUDE,"");
			values.put(Defines.TESTSUITEPRO_MODEL_INC_DIR,"../");// avoid qmake compilation problems
			values.put(Defines.TESTSUITEPRO_MODEL_EXTRA_DEPS,"");
		}

		// signals
		if (cbx_include_signals.isSelected()){
			values.put(Defines.TESTSUITE_SIGNALS_CONFIG,"no_keywords");
			values.put(Defines.TESTSUITE_SIGNALS_INCLUDE,"#include \"" + ts_rel_signals_file + "\"");
			values.put(Defines.TESTSUITE_SIGNALS_OBJECT,gendata.signals_classname +"* _signals;");
			values.put(Defines.TESTSUITE_SIGNALS_INSTANTIATION,"_signals = new " + gendata.signals_classname + "();");
			values.put(Defines.TESTSUITEPRO_SIGNALS_LIB_DIR,tspro_rel_signals_lib_dir);
			tmp = gendata.signals_lib_name.startsWith("lib")? gendata.signals_lib_name.substring(3) : gendata.signals_lib_name;
			tmp = "-l" + tmp.replace(".so","");
			values.put(Defines.TESTSUITEPRO_SIGNALS_LIB_INCLUDE,tmp);
			values.put(Defines.TESTSUITEPRO_SIGNALS_INC_DIR,tspro_rel_signals_inc_dir);
			values.put(Defines.TESTSUITEPRO_SIGNALS_INC,gendata.signals_includes);
			values.put(Defines.TESTSUITEPRO_SIGNALS_EXTRA_DEPS,gendata.signals_dependencies);
		}
		else{
			values.put(Defines.TESTSUITE_SIGNALS_CONFIG,"");
			values.put(Defines.TESTSUITE_SIGNALS_INCLUDE,"");
			values.put(Defines.TESTSUITE_SIGNALS_OBJECT,"");
			values.put(Defines.TESTSUITE_SIGNALS_INSTANTIATION,"");
			values.put(Defines.TESTSUITEPRO_SIGNALS_LIB_DIR,"../");// avoid qmake compilation problems
			values.put(Defines.TESTSUITEPRO_SIGNALS_LIB_INCLUDE,"");
			values.put(Defines.TESTSUITEPRO_SIGNALS_INC_DIR,"../");// avoid qmake compilation problems
			values.put(Defines.TESTSUITEPRO_SIGNALS_INC,"");
			values.put(Defines.TESTSUITEPRO_SIGNALS_EXTRA_DEPS,"");
		}

		// tuglib includes
		values.put(Defines.TESTSUITEPRO_TUGLIB_INC,gendata.tuglib_includes);

		// gcov includes
		values.put(Defines.TESTSUITEPRO_GCOV_INC,gendata.gcov_includes);

		// gprof includes
		values.put(Defines.TESTSUITEPRO_GPROF_INC,gendata.gprof_includes);

		// qwt includes
		values.put(Defines.TESTSUITEPRO_QWT_INC,gendata.qwt_includes);

		// extra includes
		values.put(Defines.TESTSUITEPRO_EXTRA_INC,gendata.extra_dependencies);


		///
		/// generate testsuites
		///

		try {
			gendata.generated_testsuites = 
					TestsuiteGenerationProcess.GenerateTestsuitesFromTreeModel(
							tpeEditor.getTestProjectModel(), 
							values,
							gendata, 
							rtdata);
			_setOKStatus("Testsuite generation done. Please, check files in: "+ gendata.project_generation_dir);
		} catch (Exception exc) {
			String status = "Testsuite generation process failed. " + exc.toString();
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			exc.printStackTrace();
			return;
		}

		///
		/// generate testsuites (model based)
		///

		/*
		try {
			TestsuiteGenProcess.main(new String[]{ 
					// model URI
					"",
					// base class
					"",
					"",
					//
					gendata.project_generation_dir});
			_setOKStatus("Generation done. Please, check files in: "+ gendata.project_generation_dir);
		} catch (Exception exc) {
			String status = "Generation process failed. " + exc.toString();
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			exc.printStackTrace();
			return;
		}*/
	}


	/**
	 * Gets all data needed for generation process
	 * @return
	 */
	private WizardWindowData __getGenerationData(){

		_setStatus("Getting and validating data for generation process.");

		WizardWindowData gendata = new WizardWindowData();

		///
		/// get generation parameters

		// panel
		if (__verifyStep1()){
			// panel
			gendata.ui_no_panel_file_selected = cbx_no_panel_file.isSelected();
			gendata.ui_file = tef_panel_file.getText();
			gendata.ui_file_dir = FileSystemUtils.GetDirFromPath(gendata.ui_file);
			gendata.ui_classname = tef_panel_classname.getText();

			// ui reference
			gendata.ui_reference_selected = cbx_ui_reference.isSelected();
			gendata.ui_reference = tef_ui_reference.getText();
			// ui reference include
			gendata.ui_reference_include_selected = cbx_ui_reference_include.isSelected();
			gendata.ui_reference_include = tef_ui_reference_include.getText();
		}
		else{
			String status = "Please, verify the data in step 1 before starting the generation process.";
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			return null;
		}


		//gw
		if (__verifyStep2()){
			//if (cbx_include_gw.isSelected()){
			gendata.gw_selected = true;//cbx_include_gw.isSelected();
			gendata.gw_lib = tef_gw_lib.getText();
			if (gendata.gw_lib != ""){
				gendata.gw_lib_dir = FileSystemUtils.GetDirFromPath(gendata.gw_lib);
				gendata.gw_lib_name = FileSystemUtils.GetFilenameFromPath(gendata.gw_lib);
			}
			gendata.gw_file = tef_gw_file.getText();
			if (gendata.gw_file != ""){
				gendata.gw_file_dir = FileSystemUtils.GetDirFromPath(gendata.gw_file);
			}
			gendata.gw_classname = tef_gw_classname.getText();
			gendata.gw_panel_parameters = tef_gwpanel_parameters.getText();
			gendata.gw_parameters = tef_gw_parameters.getText();
			gendata.gw_builddir = tef_gw_builddir.getText();
			gendata.gw_dependencies = txa_gw_dependencies.getText();
			//}
		}
		else{
			String status = "Please, verify the data in step 2 before starting the generation process.";
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			return null;
		}

		//model
		if (__verifyStep3()){
			//if (cbx_include_model.isSelected()){
			gendata.model_selected = cbx_include_model.isSelected();
			gendata.model_lib = tef_model_lib.getText();
			if (gendata.model_lib != ""){
				gendata.model_lib_dir = FileSystemUtils.GetDirFromPath(gendata.model_lib);
				gendata.model_lib_name = FileSystemUtils.GetFilenameFromPath(gendata.model_lib);
			}
			gendata.model_file = tef_model_file.getText();
			if (gendata.model_file != ""){
				gendata.model_file_dir = FileSystemUtils.GetDirFromPath(gendata.model_file);
			}
			gendata.model_classname = tef_model_classname.getText();
			gendata.model_builddir = tef_model_builddir.getText();
			gendata.model_dependencies = txa_model_dependencies.getText();
			//}
		}
		else{
			String status = "Please, verify the data in step 3 before starting the generation process.";
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			return null;
		}


		//signals
		if (__verifyStep4()){
			//if (cbx_include_signals.isSelected()){
			gendata.signals_selected = cbx_include_signals.isSelected();
			gendata.signals_lib = tef_signals_lib.getText();
			if (gendata.signals_lib != ""){
				gendata.signals_lib_dir = FileSystemUtils.GetDirFromPath(gendata.signals_lib);
				gendata.signals_lib_name = FileSystemUtils.GetFilenameFromPath(gendata.signals_lib);
			}
			gendata.signals_file = tef_signals_file.getText();
			if (gendata.signals_file != ""){
				gendata.signals_file_dir = FileSystemUtils.GetDirFromPath(gendata.signals_file);
			}
			gendata.signals_classname = tef_signals_classname.getText();
			gendata.signals_builddir = tef_signals_builddir.getText();
			gendata.signals_dependencies = txa_signals_dependencies.getText();
			//}

			try {
				// load signal includes
				gendata.signals_boost_selected = rdb_signals_boost.isSelected();
				gendata.signals_libsig_selected = rdb_signals_libsig.isSelected();
				if (rdb_signals_boost.isSelected()){
					gendata.signals_includes = FileSystemUtils.FileToString(Defines.BOOSTSIGNAL_INCLUDES_FILEPATH);
				}
				else if (rdb_signals_libsig.isSelected()){
					gendata.signals_includes = FileSystemUtils.FileToString(Defines.LIBSIG_INCLUDES_FILEPATH);
				}
			} catch (IOException e1) {
				String status = e1.toString();
				_setErrorStatus(status);
				DialogsUtils.ShowErrorMessage(status);
				e1.printStackTrace();
				return null;
			}
		}
		else{
			String status = "Please, verify the data in step4 before starting the generation process.";
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			return null;
		}


		// other options
		if (__verifyStep5()){
			gendata.gcov_includes = "# gcov not selected";
			gendata.gprof_includes = "# gprof not selected";
			gendata.qwt_includes = "# qwt not selected";
			gendata.extra_dependencies = "# extra includes not set";
			try {
				/// load gcov includes
				gendata.gcov_selected = cbx_gcov.isSelected();
				if (cbx_gcov.isSelected()){
					gendata.gcov_includes = FileSystemUtils.FileToString(Defines.GCOV_INCLUDES_FILEPATH);
				}
				/// load gprof includes
				gendata.gprof_selected = cbx_gprof.isSelected();
				if (cbx_gprof.isSelected()){
					gendata.gprof_includes = FileSystemUtils.FileToString(Defines.GPROF_INCLUDES_FILEPATH);
				}
				/// load qwt includes
				gendata.qwt_selected = cbx_qwt.isSelected();
				if (cbx_qwt.isSelected()){
					gendata.qwt_includes = FileSystemUtils.FileToString(Defines.QWT_INCLUDES_FILEPATH);
				}
				/// load extra includes
				gendata.extra_dependencies = txa_extra_dependencies.getText();
			} catch (IOException e1) {
				String status = e1.toString();
				_setErrorStatus(status);
				DialogsUtils.ShowErrorMessage(status);
				e1.printStackTrace();
				return null;
			}
		}
		else{
			String status = "Please, verify the data in step 5 before starting the generation process.";
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			return null;
		}

		// testsuite configuration
		if (__verifyStep6()){
			gendata.testsuites_generate = cbx_generate_testsuites.isSelected();
			if (cbx_generate_testsuites.isSelected()){
				gendata.testsuites_model = (TestsuiteNode)tpeEditor.getTestProjectModel().getRoot();
			}
		}
		else{
			String status = "Please, verify the data in step 6 before starting the generation process.";
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			return null;
		}


		// destination dir
		if (__verifyStep7()){
			/// get destination dir
			gendata.project_name = tef_project_name.getText();
			gendata.project_generation_dir = lbl_destination_folder.getText();
			gendata.generate_only_pro = cbx_gen_only_pro.isSelected();
			//gendata.project_generation_dir = tef_destination.getText();
			if (!gendata.project_generation_dir.endsWith(Defines.PATH_SEP))
				gendata.project_generation_dir += Defines.PATH_SEP;
			gendata.testpanel_generation_reldir = /*gendata.project_generation_dir +*/ 
					Defines.TESTS_GEN_DIR + Defines.TESTPANEL_GEN_DIR;
			gendata.testsuite_generation_reldir = /*gendata.project_generation_dir +*/ 
					Defines.TESTS_GEN_DIR;
		}
		else{
			String status = "Please, verify the data in step 7 before starting the generation process.";
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			return null;
		}


		///
		/// load tuglib includes
		///

		try{
			gendata.tuglib_includes = FileSystemUtils.FileToString(Defines.TUGLIB_INCLUDES_FILEPATH);
			_log("INCLUDES: " + gendata.tuglib_includes);
		} catch (IOException e1) {
			String status = e1.toString();
			_setErrorStatus(status);
			DialogsUtils.ShowErrorMessage(status);
			e1.printStackTrace();
			return null;
		}

		///
		/// return if everything ok
		///

		return gendata;
	}


	/**
	 * Sets all data needed for generation process into the wizard
	 * @return
	 */
	private void __dumpGenerationData(WizardWindowData gendata){

		_setStatus("Restoring generation data.");

		// step 1
		tef_panel_file.setText(gendata.ui_file);
		tef_panel_classname.setText(gendata.ui_classname);
		cbx_no_panel_file.setSelected(gendata.ui_no_panel_file_selected);
		cbx_ui_reference.setSelected(gendata.ui_reference_selected);
		tef_ui_reference.setText(gendata.ui_reference);
		cbx_ui_reference_include.setSelected(gendata.ui_reference_include_selected);
		tef_ui_reference_include.setText(gendata.ui_reference_include);

		// step 2
		//cbx_include_gw.setSelected(gendata.gw_selected);
		tef_gw_lib.setText(gendata.gw_lib);
		tef_gw_file.setText(gendata.gw_file);
		tef_gw_classname.setText(gendata.gw_classname);
		tef_gwpanel_parameters.setText(gendata.gw_panel_parameters);
		tef_gw_parameters.setText(gendata.gw_parameters);
		tef_gw_builddir.setText(gendata.gw_builddir);
		txa_gw_dependencies.setText(gendata.gw_dependencies);

		// step 3
		cbx_include_model.setSelected(gendata.model_selected);
		tef_model_lib.setText(gendata.model_lib);
		tef_model_file.setText(gendata.model_file);
		tef_model_classname.setText(gendata.model_classname);
		tef_model_builddir.setText(gendata.model_builddir);
		txa_model_dependencies.setText(gendata.model_dependencies);

		// step 4
		cbx_include_signals.setSelected(gendata.signals_selected);
		tef_signals_lib.setText(gendata.signals_lib);
		tef_signals_file.setText(gendata.signals_file);
		tef_signals_classname.setText(gendata.signals_classname);
		tef_signals_builddir.setText(gendata.signals_builddir);
		txa_signals_dependencies.setText(gendata.signals_dependencies);

		rdb_signals_boost.setSelected(gendata.signals_boost_selected);
		rdb_signals_libsig.setSelected(gendata.signals_libsig_selected);

		// step 5
		cbx_gcov.setSelected(gendata.gcov_selected);
		cbx_gprof.setSelected(gendata.gprof_selected);
		cbx_qwt.setSelected(gendata.qwt_selected);
		txa_extra_dependencies.setText(gendata.extra_dependencies);

		// step 6
		cbx_generate_testsuites.setSelected(gendata.testsuites_generate);
		if (gendata.testsuites_generate == true){
			// remove current editor if exists
			if (tpeEditor != null){
				pan_step6.remove(tpeEditor);
				pan_step6.updateUI();
			}
			// add a new editor 
			tpeEditor = new TestProjectEditor(new TestProjectModel(gendata.testsuites_model));
			pan_step6.add(tpeEditor, "5, 8, 6, 1, fill, fill");
			pan_step6.updateUI();
		}

		// step 7
		tef_project_name.setText(gendata.project_name);
		tef_destination.setText(gendata.project_generation_dir);
		lbl_destination_folder.setText(gendata.project_generation_dir);	
	}



	/**
	 * Gets all data needed for generation process
	 * @return
	 */
	private RoundtripData __getRoundtripData(WizardWindowData gendata){

		RoundtripData rtdata = new RoundtripData(); 

		///
		/// explore testpanel for potential round-tripping
		RoundtripUtils.ParseTestpanelDirectory(gendata.project_generation_dir + gendata.testpanel_generation_reldir, rtdata);

		///
		/// explore testsuites dir for potential round-tripping
		RoundtripUtils.ParseTestsuitesDirectory(gendata.project_generation_dir + gendata.testsuite_generation_reldir, rtdata);

		//
		return rtdata;
	}


	/**
	 * 
	 */
	public void but_save_project__actionPerformed(ActionEvent arg0){

		// get a filename to save
		String path = "";
		if (_last_save_filepath.isEmpty())
			path = DialogsUtils.SaveFile(DialogsUtils.TUG_DESCRIPTION, DialogsUtils.TUG_EXTENSION);
		else
			path = _last_save_filepath;

		//save the project
		_saveCurrentProject(path);
	}


	/**
	 * 
	 */
	public void but_save_as_project__actionPerformed(ActionEvent arg0){

		// get a filename to save
		String path = "";
		if (_last_save_filepath.isEmpty())
			path = DialogsUtils.SaveFile(DialogsUtils.TUG_DESCRIPTION, DialogsUtils.TUG_EXTENSION);
		else
			path = DialogsUtils.SaveFile(DialogsUtils.TUG_DESCRIPTION, DialogsUtils.TUG_EXTENSION, _last_save_filepath);

		//save the project
		_saveCurrentProject(path);
	}


	/**
	 * 
	 */
	protected void _saveCurrentProject(String path){
		if (!path.isEmpty()){
			// check extension
			if (!path.endsWith("." + DialogsUtils.TUG_EXTENSION)){
				if (path.endsWith("."))
					path = path.substring(0,path.length()-1);
				path += "." + DialogsUtils.TUG_EXTENSION;
			}
			// dump content to file
			FileOutputStream fos = null;
			ObjectOutputStream out = null;
			try {
				fos = new FileOutputStream(path);
				out = new ObjectOutputStream(fos);
				WizardWindowData data = __getGenerationData();
				if (data == null)
					throw new NullPointerException("Generation data is null.");
				out.writeObject(data);
				out.close();
				_setOKStatus("Project saved to file: " + path);
				_last_save_filepath = path;
			} catch (Exception ex) {
				ex.printStackTrace();
				_setErrorStatus("Some error while saving TUG project.");
			}
		}
	}


	/**
	 * 
	 */
	public void but_load_project__actionPerformed(ActionEvent arg0){

		// get a filename to load

		String path = "";
		if (_last_save_filepath.isEmpty())
			path = DialogsUtils.ChooseFile(DialogsUtils.TUG_DESCRIPTION, DialogsUtils.TUG_EXTENSION);
		else
			path = DialogsUtils.ChooseFile(DialogsUtils.TUG_DESCRIPTION, DialogsUtils.TUG_EXTENSION,_last_save_filepath);


		if (!path.isEmpty()){
			// read the object from file
			// save the object to file
			FileInputStream fis = null;
			ObjectInputStream in = null;
			WizardWindowData data = null;
			try {
				fis = new FileInputStream(path);
				in = new ObjectInputStream(fis);
				data = (WizardWindowData) in.readObject();

				_log("LOADING PROJECT:");
				_log(path);
				if (data == null) _log("NULL data");

				__dumpGenerationData(data);
				in.close();
				_setOKStatus("Project loaded from file: " + path);
				_last_save_filepath = path;
			} catch (Exception ex) {
				ex.printStackTrace();
				_setErrorStatus("Some error while loading TUG project.");
			}
		}

	}
}
