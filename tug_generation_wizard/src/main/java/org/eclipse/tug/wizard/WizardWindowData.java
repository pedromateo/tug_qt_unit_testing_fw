package org.eclipse.tug.wizard;

import java.io.Serializable;
import java.util.List;

import javax.swing.tree.TreeModel;

import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteDescriptor;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteNode;


public class WizardWindowData implements Serializable{

	WizardWindowData(){}

	///
	/// wizard data
	///

	// step 1
	public String ui_file = "";
	public String ui_file_dir = "";
	public String ui_classname = "";
	public boolean ui_no_panel_file_selected = false;
	public boolean ui_reference_selected = false;
	public String ui_reference = "";
	public boolean ui_reference_include_selected = false;
	public String ui_reference_include = "";

	// step 2
	public boolean gw_selected = false;
	public String gw_lib = "";
	public String gw_lib_dir = "";
	public String gw_lib_name = "";
	public String gw_file = "";
	public String gw_file_dir = "";
	public String gw_classname = "";
	public String gw_panel_parameters = "";
	public String gw_parameters = "";
	public String gw_builddir = "";
	public String gw_dependencies = "";


	// step 3
	public boolean model_selected = false;
	public String model_lib = "";
	public String model_lib_dir = "";
	public String model_lib_name = "";
	public String model_file = "";
	public String model_file_dir = "";
	public String model_classname = "";
	public String model_builddir = "";
	public String model_dependencies = "";


	// step 4
	public boolean signals_selected = false;
	public String signals_lib = "";
	public String signals_lib_dir = "";
	public String signals_lib_name = "";
	public String signals_file = "";
	public String signals_file_dir = "";
	public String signals_classname = "";
	public String signals_builddir = "";
	public String signals_includes = "# no signals selected";
	public String signals_dependencies = "";
	public boolean signals_boost_selected = false;
	public boolean signals_libsig_selected = false;


	// step 5
	public String gcov_includes = "# gcov not selected";
	public boolean gcov_selected = false;
	public String gprof_includes = "# gprof not selected";
	public boolean gprof_selected = false;
	public String qwt_includes = "# qwt not selected";
	public boolean qwt_selected = false;
	public String extra_dependencies = "# extra includes not set";


	// step 6
	public boolean testsuites_generate = false;
	public String testsuites_string = "";
	public TestsuiteNode testsuites_model = null;


	// step 7
	public String project_name = "";
	public String project_generation_dir = "";
	public String testpanel_generation_reldir = ""; 
	public String testsuite_generation_reldir = ""; 
	public Boolean generate_only_pro = false; 


	///
	/// includes 
	///

	public String tuglib_includes = "";


	///
	/// testpanel roundtrip 
	///
	
	public String rt_includes_h = "";
	public String rt_code_h = "";
	public String rt_includes_cpp = "";
	public String rt_code_cpp = "";


	///
	/// generation results
	///

	List<TestsuiteDescriptor> generated_testsuites;



	// 

}
