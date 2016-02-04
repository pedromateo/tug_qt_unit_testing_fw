package es.um.casa.qt_test_api.generation_app;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//final String uifile = "/home/pedro/svn_catedra/anotaciones/dsl_testing/current_version/testapi_generator_project/testapi_generator/input/layout_panel.ui";
		//final String uifile = "/home/pedro/svn_catedra/anotaciones/dsl_testing/current_version/testapi_generator_project/testapi_generator/input/PlotCenterPanel.ui";
		final String uifile = "/home/pedro/svn_catedra/anotaciones/dsl_testing/current_version/testapi_generator_project/testapi_generator/input/qwt_panel.ui";
		
		
		final String gendir = "/tmp/genoutput";
		
		///
		/// generation process
		///

		try {
			GenerationProcess.main(new String[]{ 
					//
					//gendata.ui_file,
					uifile,
					//rel_ui_file,
					uifile,
					//gendata.ui_classname,
					"foofoo",
					//gendata.ui_reference,
					"ui->",
					//
					//rel_gw_lib,
					"foo/foo.so",
					//rel_gw_file,
					"foo/foo.h",
					//gendata.gw_classname,
					"foofoo",
					//.builddir
					"foo/foo/",
					//gendata.gw_extras,
					"",
					//
					//rel_model_lib,
					"foo/foo.so",
					//rel_model_file,
					"foo/foo.h",
					//gendata.model_classname,
					"foofoo",
					//.builddir
					"foo/foo/",
					//gendata.model_extras,
					"",
					//
					//rel_signals_lib,
					"foo/foo.so",
					//rel_signals_file,
					"foo/foo.h",
					//gendata.signals_classname,
					"foofoo",
					//.builddir
					"foo/foo/",
					//gendata.signals_extras,
					"",
					//gendata.signals_includes,
					"",
					//
					//Boolean.toString(gendata.gcov_selected),
					"false",
					//gendata.gcov_includes,
					"",
					//Boolean.toString(gendata.gprof_selected),
					"false",
					//gendata.gprof_includes,
					"",
					//gendata.extra_includes,
					"",
					//
					//generated_testsuites_string,
					"",
					//
					//gendata.tuglib_includes,
					"",
					//
					//gendata.project_name,
					"proyname",
					//gendata.project_generation_dir
					gendir});
			System.out.println("Generation done.");
			
		} catch (Exception exc) {
			System.out.println("Generation process failed. " + exc.toString());
			exc.printStackTrace();
			return;
		}
	}

}
