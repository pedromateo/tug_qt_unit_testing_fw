package org.eclipse.tug.wizard;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import org.casa.dsltesting.TestsuiteModel.Test;
import org.casa.dsltesting.TestsuiteModel.Testsuite;
import org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelFactoryImpl;
import org.eclipse.acceleo.qt_testsuite.generator.main.GenerateTestsuite;
import org.eclipse.acceleo.qt_testsuite.run.TestsuiteGenProcess;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.wizard.roundtrip.RoundtripData;
import org.eclipse.tug.wizard.roundtrip.RoundtripUtils;

public class Test_WizardWindow extends WizardWindow{

	Test_WizardWindow(){

		// add own initialization stuff

		// qt test
		JButton btn_test_generate = new JButton("Fill for Qt panel");
		btn_test_generate.setForeground(Color.MAGENTA);
		btn_test_generate.setHorizontalAlignment(SwingConstants.LEFT);
		pan_step1.add(btn_test_generate, "8, 23, 2, 1, fill, top");
		btn_test_generate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				_testQtPanel(e);
			} 
		});

		// qwt test
		JButton btn_testqwt_generate = new JButton("Fill for QWT panel");
		btn_testqwt_generate.setForeground(Color.MAGENTA);
		btn_testqwt_generate.setHorizontalAlignment(SwingConstants.LEFT);
		pan_step1.add(btn_testqwt_generate, "11, 23, 3, 1, fill, top");
		btn_testqwt_generate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				_testQWTPanel(e);
			} 
		});
	}

	public void _testQWTPanel(MouseEvent e){
		// step 1
		tef_panel_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/qwt_panel_lib/filePlotCenterPanel.ui");
		tef_panel_classname.setText("PlotCenterPanel");
		//cbx_no_panel_file.doClick(); cbx_no_panel_file.doClick();
		cbx_ui_reference.doClick();
		tef_ui_reference.setText("ui->");
		cbx_ui_reference_include.doClick();
		tef_ui_reference_include.setText("cassert");

		// step 2
		//cbx_include_gw.doClick();//.setSelected(true);
		tef_gw_lib.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/qwt_panel_lib/lib/libpanelgw.so");
		tef_gw_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/qwt_panel_lib/include/filePlotCenterPanelGw.h");
		tef_gw_classname.setText("PlotCenterPanelGw");
		tef_gw_builddir.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/qwt_panel_lib/build");
		txa_gw_dependencies.setText("INCLUDEPATH += /home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/qwt_panel_lib/include");

		// step 3
		cbx_include_model.doClick();//.setSelected(true);
		tef_model_lib.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/lib/libmodel.so");
		tef_model_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include/LcsModelSignals.h");
		tef_model_classname.setText("LcsModelSignals");
		tef_model_builddir.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/build");
		txa_model_dependencies.setText("INCLUDEPATH += /home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include");

		// step 4
		cbx_include_signals.doClick();//.setSelected(true);
		tef_signals_lib.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/lib/libmodel.so");
		tef_signals_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include/LcsModelSignals.h");
		tef_signals_classname.setText("LcsModelSignals");
		tef_signals_builddir.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/build");
		rdb_signals_boost.doClick();//.setSelected(true);
		txa_signals_dependencies.setText("INCLUDEPATH += /home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include");

		// step 5
		cbx_gcov.doClick();//.setSelected(true);
		cbx_gprof.doClick();//.setSelected(true);
		cbx_qwt.doClick();//.setSelected(true);
		txa_extra_dependencies.setText("# no extra dependencies set at step 5");
		// step 6
		cbx_generate_testsuites.doClick();
		// step 7
		tef_project_name.setText("QWTTestproject");
		tef_destination.setText("/tmp/testproject");
		lbl_destination_folder.setText(tef_destination.getText() + Defines.PATH_SEP + tef_project_name.getText());
		// end test
		//but_generate__mouseClicked(e);
	}

	public void _testQtPanel(MouseEvent e){
		// step 1
		tef_panel_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_panel/filePlotCenterPanel.ui");
		tef_panel_classname.setText("PlotCenterPanel");
		//cbx_no_panel_file.doClick(); cbx_no_panel_file.doClick();
		cbx_ui_reference.doClick();
		tef_ui_reference.setText("ui->");
		cbx_ui_reference_include.doClick();
		tef_ui_reference_include.setText("cassert");

		// step 2
		//cbx_include_gw.doClick();//.setSelected(true);
		tef_gw_lib.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_panel/lib/libpanelgw.so");
		tef_gw_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_panel/include/filePlotCenterPanelGw.h");
		tef_gw_classname.setText("PlotCenterPanelGw");
		tef_gw_builddir.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_panel/build");
		txa_gw_dependencies.setText("INCLUDEPATH += /home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_panel/include");

		// step 3
		cbx_include_model.doClick();//.setSelected(true);
		tef_model_lib.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/lib/libmodel.so");
		tef_model_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include/LcsModelSignals.h");
		tef_model_classname.setText("LcsModelSignals");
		tef_model_builddir.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/build");
		txa_model_dependencies.setText("INCLUDEPATH += /home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include");

		// step 4
		cbx_include_signals.doClick();//.setSelected(true);
		tef_signals_lib.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/lib/libmodel.so");
		tef_signals_file.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include/LcsModelSignals.h");
		tef_signals_classname.setText("LcsModelSignals");
		tef_signals_builddir.setText("/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/build");
		rdb_signals_boost.doClick();//.setSelected(true);
		txa_signals_dependencies.setText("INCLUDEPATH += /home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_model/include");

		// step 5
		cbx_gcov.doClick();//.setSelected(true);
		cbx_gprof.doClick();//.setSelected(true);
		txa_extra_dependencies.setText("# no extra dependencies set at step 5");
		// step 6
		cbx_generate_testsuites.doClick();
		// step 7
		tef_project_name.setText(tef_panel_classname.getText() + "Testproject");
		tef_destination.setText("/tmp/testproject");
		lbl_destination_folder.setText(tef_destination.getText() + Defines.PATH_SEP + tef_project_name.getText());
		// end test
		//but_generate__mouseClicked(e);
	}


	public static void JustTesting() {
		// TODO Auto-generated method stub

		_log("start test ---------------------------------------------------\n");

		/// deduce build and include dirs

		_id("DBD");

		_assert(FileSystemUtils.DeduceBuildDirFromPath("/home/pedro/build/algo.so"),
				"/home/pedro/build/");
		_assert(FileSystemUtils.DeduceBuildDirFromPath("/home/pedro/src_build/algo.so"),
				"/home/pedro/src_build/");
		_assert(FileSystemUtils.DeduceBuildDirFromPath("/home/pedro/build_hmi/algo.so"),
				"/home/pedro/build_hmi/");
		_assert(FileSystemUtils.DeduceBuildDirFromPath("/home/pedro/buil/algo.so"),
				"");
		_assert(FileSystemUtils.DeduceBuildDirFromPath("/home/pedro/build"),
				"/home/pedro/build/");
		_assert(FileSystemUtils.DeduceBuildDirFromPath("/home/pedro/buil_hmi"),
				"");

		_id("DID");

		_assert(FileSystemUtils.DeduceIncludeDirFromPath("/home/pedro/include/algo.h"),
				"/home/pedro/include/");
		_assert(FileSystemUtils.DeduceIncludeDirFromPath("/home/pedro/inc/algo.h"),
				"/home/pedro/inc/");
		_assert(FileSystemUtils.DeduceIncludeDirFromPath("/home/pedro/src_inc/algo.h"),
				"/home/pedro/src_inc/");
		_assert(FileSystemUtils.DeduceIncludeDirFromPath("/home/pedro/include/"),
				"/home/pedro/include/");
		_assert(FileSystemUtils.DeduceIncludeDirFromPath("/home/pedro/include"),
				"/home/pedro/include/");
		_assert(FileSystemUtils.DeduceIncludeDirFromPath("/home/pedro/inc"),
				"/home/pedro/inc/");

		/// relative paths

		_id("GRP");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/project/test/test1.hpp",
				"/tmp/home/pedro/generation/"),
				"../project/test/test1.hpp");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/project/test",
				"/tmp/home/pedro/generation/"),
				"../project/test/");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/project/test/",
				"/tmp/home/pedro/generation/"),
				"../project/test/");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/",
				"/tmp/home/pedro/generation/"),
				"../");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/generation",
				"/tmp/home/pedro/generation/"),
				"./");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/generation/",
				"/tmp/home/pedro/generation/"),
				"./");

		_assert(FileSystemUtils.GetRelativePath(
				"/home/pedro/",
				"/tmp/home/pedro/generation/"),
				"../../../../home/pedro/");

		_assert(FileSystemUtils.GetRelativePath(
				"/home/pedro",
				"/tmp/home/pedro/generation/"),
				"../../../../home/pedro/");

		_assert(FileSystemUtils.GetRelativePath(
				"/home/pedro/",
				"/tmp/home/pedro/generation"),
				"../../../../home/pedro/");

		_assert(FileSystemUtils.GetRelativePath(
				"/home/pedro",
				"/tmp/home/pedro/generation"),
				"../../../../home/pedro/");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/testing/testing2/testing3/test.hpp",
				"/tmp/home/pedro/generation"),
				"../testing/testing2/testing3/test.hpp");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/testing/testing2/testing3/",
				"/tmp/home/pedro/generation"),
				"../testing/testing2/testing3/");

		_assert(FileSystemUtils.GetRelativePath(
				"/tmp/home/pedro/testing/testing2/testing3",
				"/tmp/home/pedro/generation"),
				"../testing/testing2/testing3/");

		_assert(FileSystemUtils.GetRelativePath(
				"/home/SAES/s.garcia/Proyectos/scenario-manager/build_hmi/GeoplotHMI/application/HMI/plot/plot_panel/geographic_center/CMakeFiles/mpgc.dir/src_inc",
				"/home/SAES/s.garcia/Proyectos/scenario-manager/GeoplotHMI/application/HMI/plot/plot_panel/geographic_center/LibTUG_test_v1.6.7/GeographicCenterPanelTestproject/"),
				"../../../../../../../../build_hmi/GeoplotHMI/application/HMI/plot/plot_panel/geographic_center/CMakeFiles/mpgc.dir/src_inc/");

		_assert(FileSystemUtils.GetRelativePath(
				"/common/part/onedir/onedirdeeper",
				"/common/part/anotherdir/anotherdirdeeper/"),
				"../../onedir/onedirdeeper/");

		_assert(FileSystemUtils.GetRelativePath(
				"/common/part/onedir/onedirdeeper/",
				"/common/part/anotherdir/anotherdirdeeper"),
				"../../onedir/onedirdeeper/");

		_assert(FileSystemUtils.GetRelativePath(
				"/not/common/part/onedir/onedirdeeper/",
				"/not2/common/part/anotherdir/anotherdirdeeper"),
				"../../../../../not/common/part/onedir/onedirdeeper/");

		_assert(FileSystemUtils.GetRelativePath(
				"/not/common/part/onedir/onedirdeeper",
				"/not2/common/part/anotherdir/anotherdirdeeper/"),
				"../../../../../not/common/part/onedir/onedirdeeper/");

		_assert(FileSystemUtils.GetRelativePath(
				"/not/common/part/onedir/onedirdeeper",
				"/not2/common/part/anotherdir/anotherdirdeeper"),
				"../../../../../not/common/part/onedir/onedirdeeper/");

		_assert(FileSystemUtils.GetRelativePath(
				"/home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_panel/build/",
				"/tmp/testproject/PlotCenterPanelTestproject/bin/"),
				"../../../../home/pedro/svn_catedra/anotaciones/dsl_testing/example_test_sources/lib_panel/build/");

		/// roundtrip /////////////////////////////////////////////////////////
		_id("RDT");

		/*RoundtripUtils parser = new RoundtripUtils();
		RoundtripData rdata = parser.ParseTestsuitesDirectory("/tmp/testproject/PlotCenterPanelTestproject/tests");
		for (Map.Entry<String, String> entry : rdata.getMethods().entrySet())
		{
			System.out.println("/-------------------------------------------");
			System.out.println("/" + entry.getKey() + "/");
			System.out.println(entry.getValue());
		}
		
		if (true) return;*/


		/// ts model based generation /////////////////////////////////////////
		_id("TSGEN");

		// create model
		TestsuiteModelFactoryImpl tsfactory = new TestsuiteModelFactoryImpl();
		Testsuite root = tsfactory.createTestsuite();
		root.setName("rootts");
		//
		Testsuite ts = tsfactory.createTestsuite();
		ts.setName("ts1");
		Test t = tsfactory.createTest();
		t.setName("test1");
		ts.getTests().add(t);
		root.getChildren().add(ts);
		//
		ts = tsfactory.createTestsuite();
		ts.setName("ts2");
		t = tsfactory.createTest();
		t.setName("test2");
		ts.getTests().add(t);
		root.getChildren().add(ts);


		// generate model
		try {
			ArrayList<String> args = new ArrayList<String>();
			// base class
			//args.add("classname");
			args.add("filename.h");
			
			/*GenerateTestsuite ts_generator = 
					new GenerateTestsuite(
							root, new File("/tmp/ts_gendir_test/"), args);

			
			ts_generator.doGenerate(new BasicMonitor());*/
			
			TestsuiteGenProcess.main(root, "/tmp/ts_gendir_test/", args);


			_log("Generation done. Please, check files in: "+ "/tmp/ts_gendir_test/");
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		///
		_log("");
		_log("end test -----------------------------------------------------");

	}

	private static void _assert(String s1, String s2) {
		if (!s1.equals(s2)){
			_log(_base_id + Integer.toString(_base_id_counter) + " - ERROR: ");
			_log("s1: " + s1);
			_log("s2: " + s2);
		}
		_base_id_counter++;
	}

	private static String _base_id = ""; 
	private static int _base_id_counter = 0;

	private static void _id(String id) {
		_base_id = id;
		_base_id_counter = 0;
	}

}
