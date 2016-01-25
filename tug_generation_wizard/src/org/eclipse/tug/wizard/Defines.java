package org.eclipse.tug.wizard;

import java.io.File;

public class Defines {
	
	// platform independent path separator
	public static final String PATH_SEP = File.separator;
	

	//config files for includes
	public static final String TUGLIB_INCLUDES_FILEPATH = "config/includes/tuglib_include";
	public static final String TUGLIB_INCLUDES_BAK_FILEPATH = "config/includes/tuglib_include_bak";
	public static final String BOOSTSIGNAL_INCLUDES_FILEPATH = "config/includes/boost_signals_include";
	public static final String BOOSTSIGNAL_INCLUDES_BAK_FILEPATH = "config/includes/boost_signals_include_bak";
	public static final String LIBSIG_INCLUDES_FILEPATH = "config/includes/libsig_signals_include";
	public static final String LIBSIG_INCLUDES_BAK_FILEPATH = "config/includes/libsig_signals_include_bak";
	public static final String GCOV_INCLUDES_FILEPATH = "config/includes/gcov_include";
	public static final String GCOV_INCLUDES_BAK_FILEPATH = "config/includes/gcov_include_bak";
	public static final String GPROF_INCLUDES_FILEPATH = "config/includes/gprof_include";
	public static final String GPROF_INCLUDES_BAK_FILEPATH = "config/includes/gprof_include_bak";
	public static final String QWT_INCLUDES_FILEPATH = "config/includes/qwt_include";
	public static final String QWT_INCLUDES_BAK_FILEPATH = "config/includes/qwt_include_bak";


	// template files for testsuite generation
	
	// ts
	public static final String TESTSUITEBASE_TEMPLATE_FILEPATH = "config/generation_templates/testsuitebase_template";
	public static final String TESTSUITEBASE_TEMPLATE_BAK_FILEPATH = "config/generation_templates/testsuitebase_template_bak";
	// ts MP
	public static final String TESTSUITE_MP_TEMPLATE_FILEPATH = "config/generation_templates/mp_testsuite_template";
	public static final String TESTSUITE_MP_TEMPLATE_BAK_FILEPATH = "config/generation_templates/mp_testsuite_template_bak";
	public static final String TEST_MP_TEMPLATE_FILEPATH = "config/generation_templates/mp_test_template";
	public static final String TEST_MP_TEMPLATE_BAK_FILEPATH = "config/generation_templates/mp_test_template_bak";
	public static final String TEST_MP_RT_TEMPLATE_FILEPATH = "config/generation_templates/mp_rt_test_template";
	public static final String TEST_MP_RT_TEMPLATE_BAK_FILEPATH = "config/generation_templates/mp_rt_test_template_bak";
	// ts OP
	public static final String TESTSUITE_OP_TEMPLATE_FILEPATH = "config/generation_templates/op_testsuite_template";
	public static final String TESTSUITE_OP_TEMPLATE_BAK_FILEPATH = "config/generation_templates/op_testsuite_template_bak";
	public static final String TESTSUITE_OP_INTERNAL_TEMPLATE_FILEPATH = "config/generation_templates/op_testsuite_internal_template";
	public static final String TESTSUITE_OP_INTERNAL_TEMPLATE_BAK_FILEPATH = "config/generation_templates/op_testsuite_internal_template_bak";
	public static final String TESTSUITE_OP_CONFIGURE_TEMPLATE_FILEPATH = "config/generation_templates/op_testsuite_configure_template";
	public static final String TESTSUITE_OP_CONFIGURE_TEMPLATE_BAK_FILEPATH = "config/generation_templates/op_testsuite_configure_template_bak";
	public static final String TESTSUITE_OP_FINISH_TEMPLATE_FILEPATH = "config/generation_templates/op_testsuite_finish_template";
	public static final String TESTSUITE_OP_FINISH_TEMPLATE_BAK_FILEPATH = "config/generation_templates/op_testsuite_finish_template_bak";
	public static final String TEST_OP_TEMPLATE_FILEPATH = "config/generation_templates/op_test_template";
	public static final String TEST_OP_TEMPLATE_BAK_FILEPATH = "config/generation_templates/op_test_template_bak";
	public static final String TEST_OP_RT_TEMPLATE_FILEPATH = "config/generation_templates/op_rt_test_template";
	public static final String TEST_OP_RT_TEMPLATE_BAK_FILEPATH = "config/generation_templates/op_rt_test_template_bak";
	// ts project
	public static final String TESTSUITE_PROJECT_MAIN_FILEPATH = "config/generation_templates/testsuite_project_main";
	public static final String TESTSUITE_PROJECT_MAIN_BAK_FILEPATH = "config/generation_templates/testsuite_project_main_bak";
	public static final String TESTSUITE_PROJECT_PRO_FILEPATH = "config/generation_templates/testsuite_project_pro";
	public static final String TESTSUITE_PROJECT_PRO_BAK_FILEPATH = "config/generation_templates/testsuite_project_pro_bak";
	
	// template defines for testsuite generation
	public static final String TESTS_GEN_DIR = "tests" + PATH_SEP; 
	public static final String TESTPANEL_GEN_DIR = "_testpanel" + PATH_SEP;
	public static final String BIN_DIR = "bin" + PATH_SEP;
	public static final String PANEL_FILE_EXTENSION = ".ui";
	public static final String TESTSUITE_BASE_CLASS = "TestSuiteBase";
	public static final String TESTSUITE_BASE_CLASS_FILE_EXTENSION = ".h";
	public static final String TESTSUITE_FILE_EXTENSION = ".hpp";
	public static final String TESTSUITE_MAINFILE_EXTENSION = "_main.cpp";
	public static final String TESTSUITE_PROFILE_EXTENSION = ".pro";
	public static final String TESTPANEL_FILE_PREFIX = "test_";
	public static final String TESTPANEL_H_EXTENSION = ".h";
	public static final String TESTPANEL_CPP_EXTENSION = ".cpp";
	
	public static final String TESTSUITEPRO_NAME ="##PROJECTNAME##";
	
	public static final String TESTPANEL_CLASSNAME = "##TESTPANELCLASSNAME##";
	//public static final String TESTSUITE_BASE_TESTPANEL_INCLUDE ="##TESTPANELINCLUDE##";
	//public static final String TESTSUITE_BASE_TESTPANEL_OBJECT ="##TESTPANELOBJECT##";
	//public static final String TESTSUITE_BASE_TESTPANEL_INSTANTIATION ="##TESTPANELINSTANTIATION##";
	
	public static final String TESTSUITEPRO_GW_LIB_DIR ="##GWLIBDIR##";
	public static final String TESTSUITEPRO_GW_LIB_INCLUDE ="##GWLIBINCLUDE##";
	public static final String TESTSUITEPRO_GW_INC_DIR ="##GWINCDIR##";
	public static final String TESTSUITEPRO_GW_EXTRA_DEPS ="##GWEXTRADEPS##";

	public static final String TESTSUITE_MODEL_INCLUDE ="##MODELINCLUDE##";
	public static final String TESTSUITE_MODEL_OBJECT ="##MODELOBJECT##";
	public static final String TESTSUITE_MODEL_INSTANTIATION ="##MODELINSTANTIATION##";
	public static final String TESTSUITEPRO_MODEL_LIB_DIR ="##MODELLIBDIR##";
	public static final String TESTSUITEPRO_MODEL_LIB_INCLUDE ="##MODELLIBINCLUDE##";
	public static final String TESTSUITEPRO_MODEL_INC_DIR ="##MODELINCDIR##";
	public static final String TESTSUITEPRO_MODEL_EXTRA_DEPS ="##MODELEXTRADEPS##";
	
	public static final String TESTSUITE_SIGNALS_CONFIG ="##SIGNALSCONFIG##";
	public static final String TESTSUITE_SIGNALS_INCLUDE ="##SIGNALSINCLUDE##";
	public static final String TESTSUITE_SIGNALS_OBJECT ="##SIGNALSOBJECT##";
	public static final String TESTSUITE_SIGNALS_INSTANTIATION ="##SIGNALSINSTANTIATION##";
	public static final String TESTSUITEPRO_SIGNALS_LIB_DIR ="##SIGNALSLIBDIR##";
	public static final String TESTSUITEPRO_SIGNALS_LIB_INCLUDE ="##SIGNALSLIBINCLUDE##";
	public static final String TESTSUITEPRO_SIGNALS_INC_DIR ="##SIGNALSINCDIR##";
	public static final String TESTSUITEPRO_SIGNALS_EXTRA_DEPS ="##SIGNALSEXTRADEPS##";
	public static final String TESTSUITEPRO_SIGNALS_INC ="##SIGNALSINC##";
	
	public static final String TESTSUITEPRO_TUGLIB_INC ="##TUGLIBINC##";
	public static final String TESTSUITEPRO_GCOV_INC ="##GCOVINC##";
	public static final String TESTSUITEPRO_GPROF_INC ="##GPROFINC##";
	public static final String TESTSUITEPRO_QWT_INC ="##QWTINC##";
	public static final String TESTSUITEPRO_EXTRA_INC ="##EXTRAINC##";
	
	public static final String TESTSUITE_NAME = "##TESTSUITENAME##";
	public static final String TESTSUITE_FILENAME = "##TESTSUITEFILENAME##";
	public static final String TESTSUITE_PARENT_NAME = "##TESTSUITEPARENTNAME##";
	public static final String TESTSUITE_PARENT_FILENAME = "##TESTSUITEPARENTFILENAME##";
	public static final String TESTSUITE_GRANDPA_NAME = "##TESTSUITEGRANDPANAME##";
	public static final String TESTSUITE_GRANDPA_FILENAME = "##TESTSUITEGRANDPAFILENAME##";
	public static final String TESTSUITE_INCLUDES = "##TESTSUITEINCLUDES##";
	public static final String TESTSUITE_CONFIGURE = "##TESTSUITECONFIGURE##";
	public static final String TESTSUITE_FINISH = "##TESTSUITEFINISH##";
	public static final String TESTSUITE_EXTENSIONS = "##TESTSUITEEXTENSIONS##";
	public static final String TESTS_DEFINITION = "##TESTSDEFINITION##";
	public static final String TEST_NAME = "##TESTNAME##";
	public static final String TEST_CODE = "##TESTCODE##";
	

	/*
	 * MESSAGES
	 */

	public static final String ERROR_ROOT_DELETE = "TestsuiteBase node can't be deleted.";
	public static final String ERROR_ROOT_LAST_TESTSUITE = "TestsuiteBase has to include one testsuite at least.";
	public static final String ERROR_TS_LAST_TEST = "A testsuite has to include one test at least.";
	public static final String ERROR_TS_LEVEL3 = "New Testsuites can't be added at level 3.";
	public static final String ERROR_NULL_NODE = "No node selected or node is not a Testsuite.";
}

