package org.eclipse.tug.wizard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.wizard.roundtrip.RoundtripData;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestNode;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteDescriptor;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteNode;

public class TestsuiteGenerationProcess {

	private static Boolean generateOnlyPro = false;
	private static String generationDirectory = "";
	private static List<TestsuiteDescriptor> generatedTestsuites;
	private static String TESTSUITEBASE_CODE_TEMPLATE = "";
	private static String TESTSUITE_MP_CODE_TEMPLATE = "";
	private static String TESTSUITE_OP_CODE_TEMPLATE = "";
	private static String TESTSUITE_OP_INTERNAL_CODE_TEMPLATE = "";
	private static String TESTSUITE_OP_CONFIGURE_CODE_TEMPLATE = "";
	private static String TESTSUITE_OP_FINISH_CODE_TEMPLATE = "";
	private static String TEST_CODE_MP_TEMPLATE = "";
	private static String TEST_CODE_OP_TEMPLATE = "";
	private static String TEST_CODE_MP_RT_TEMPLATE = "";
	private static String TEST_CODE_OP_RT_TEMPLATE = "";
	private static String TESTSUITE_PROJECT_MAIN_CODE_TEMPLATE = "";
	private static String TESTSUITE_PROJECT_PRO_CODE_TEMPLATE = "";


	///
	/// generation of testsuite files based on nodes

	public static List<TestsuiteDescriptor> GenerateTestsuitesFromTreeModel(TestProjectModel model, 
			Map translations, 
			WizardWindowData gendata,
			RoundtripData rtdata) throws Exception{

		generateOnlyPro = gendata.generate_only_pro;
		generationDirectory = gendata.project_generation_dir + gendata.testsuite_generation_reldir + Defines.PATH_SEP;
		generatedTestsuites = new LinkedList<TestsuiteDescriptor>();

		// load testsuite and test templates
		TESTSUITEBASE_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITEBASE_TEMPLATE_FILEPATH);
		TESTSUITE_MP_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITE_MP_TEMPLATE_FILEPATH);
		TEST_CODE_MP_TEMPLATE =	FileSystemUtils.FileToString(Defines.TEST_MP_TEMPLATE_FILEPATH);
		TEST_CODE_MP_RT_TEMPLATE = FileSystemUtils.FileToString(Defines.TEST_MP_RT_TEMPLATE_FILEPATH);
		TESTSUITE_OP_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITE_OP_TEMPLATE_FILEPATH);
		TESTSUITE_OP_INTERNAL_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITE_OP_INTERNAL_TEMPLATE_FILEPATH);
		TESTSUITE_OP_CONFIGURE_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITE_OP_CONFIGURE_TEMPLATE_FILEPATH);
		TESTSUITE_OP_FINISH_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITE_OP_FINISH_TEMPLATE_FILEPATH);
		TEST_CODE_OP_TEMPLATE = FileSystemUtils.FileToString(Defines.TEST_OP_TEMPLATE_FILEPATH);
		TEST_CODE_OP_RT_TEMPLATE = FileSystemUtils.FileToString(Defines.TEST_OP_RT_TEMPLATE_FILEPATH);

		TESTSUITE_PROJECT_MAIN_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITE_PROJECT_MAIN_FILEPATH);
		TESTSUITE_PROJECT_PRO_CODE_TEMPLATE = FileSystemUtils.FileToString(Defines.TESTSUITE_PROJECT_PRO_FILEPATH);

		// for each testsuite in the model
		if (model != null) {
			TestsuiteNode root = (TestsuiteNode) model.getRoot();
			_doTestsuiteNode(model,root,translations,rtdata);  
		}
		else
			System.out.println("Tree is empty.");

		//return
		return generatedTestsuites;
	}

	///
	/// testsuites tree iterator
	private static void _doTestsuiteNode(TestProjectModel model, TestsuiteNode node, 
			Map translations, RoundtripData rtdata) 
					throws Exception{

		// expand first child branches, then child leafs and finally the node
		int cc = node.getChildCount();
		TestsuiteNode child = null;

		///
		/// expand child branches

		// save the old parent info and set me as the current parent
		String aux;
		aux = (String) translations.get(Defines.TESTSUITE_PARENT_NAME);
		String myParent = aux != null? aux : "";
		aux = (String) translations.get(Defines.TESTSUITE_PARENT_FILENAME);
		String myParentFile = aux != null? aux : "";
		aux = (String) translations.get(Defines.TESTSUITE_GRANDPA_NAME);
		String myGrandpa = aux != null? aux : "";
		aux = (String) translations.get(Defines.TESTSUITE_GRANDPA_FILENAME);
		String myGrandpaFile = aux != null? aux : ""; 

		translations.put(Defines.TESTSUITE_PARENT_NAME, node.getName());
		translations.put(Defines.TESTSUITE_PARENT_FILENAME, node.getName() + Defines.TESTSUITE_FILE_EXTENSION);
		translations.put(Defines.TESTSUITE_GRANDPA_NAME, myParent);
		translations.put(Defines.TESTSUITE_GRANDPA_FILENAME, myParentFile);

		// expand
		for( int i=0; i < cc; i++) {
			child = (TestsuiteNode) node.getChildAt(i);
			// handle tests (i.e., leaf nodes)
			if (!child.isLeaf()){
				_doTestsuiteNode(model,child,translations,rtdata); 
			}
		}

		///
		/// expand child leafs

		translations.put(Defines.TESTSUITE_NAME, node.getName());
		String leafsCode = "";
		for( int i=0; i < cc; i++) {
			child = (TestsuiteNode) node.getChildAt(i);
			if (child.isLeaf()){
				leafsCode += _generateTestCode((TestNode)child,translations,
						node.isOnepanel(),rtdata);
			}
		}

		///
		/// restore parent values, set my values, expand myself and generate the testsuite files

		// -- parents
		translations.put(Defines.TESTSUITE_PARENT_NAME, myParent);
		translations.put(Defines.TESTSUITE_PARENT_FILENAME, myParentFile);
		translations.put(Defines.TESTSUITE_GRANDPA_NAME, myGrandpa);
		translations.put(Defines.TESTSUITE_GRANDPA_FILENAME, myGrandpaFile);
		// -- special parent if we are testsuite_base
		if (model.getRoot() == node){
			translations.put(Defines.TESTSUITE_PARENT_NAME, Defines.TESTSUITE_BASE_CLASS);
			translations.put(Defines.TESTSUITE_PARENT_FILENAME, Defines.TESTSUITE_BASE_CLASS + Defines.TESTSUITE_BASE_CLASS_FILE_EXTENSION);
			translations.put(Defines.TESTSUITE_GRANDPA_NAME, "");
			translations.put(Defines.TESTSUITE_GRANDPA_FILENAME, "");
		}

		///
		/// set my values

		translations.put(Defines.TESTSUITE_NAME, node.getName());
		translations.put(Defines.TESTSUITE_FILENAME, node.getName() + Defines.TESTSUITE_FILE_EXTENSION);
		translations.put(Defines.TESTS_DEFINITION, leafsCode);

		///
		/// do roundtrip


		// -- set roundtrip values for configure/finish methods

		aux = rtdata.getConfigure(node.getName());
		translations.put(Defines.TESTSUITE_CONFIGURE, aux);
		// special case for onepanel testsuites...
		if (aux.trim().isEmpty() 
				&& node.isOnepanel()
				&& node.getParent() == model.getRoot()){
			translations.put(Defines.TESTSUITE_CONFIGURE, TESTSUITE_OP_CONFIGURE_CODE_TEMPLATE);
		}

		aux = rtdata.getFinish(node.getName());
		translations.put(Defines.TESTSUITE_FINISH, aux);
		// special case for onepanel testsuites...
		if (aux.trim().isEmpty() 
				&& node.isOnepanel()
				&& node.getParent() == model.getRoot()){
			translations.put(Defines.TESTSUITE_FINISH, TESTSUITE_OP_FINISH_CODE_TEMPLATE);
		}

		// -- set roundtrip values for other code
		aux = rtdata.getIncludes(node.getName());
		translations.put(Defines.TESTSUITE_INCLUDES, aux);
		aux = rtdata.getExtensions(node.getName());
		translations.put(Defines.TESTSUITE_EXTENSIONS, aux);

		///
		/// generate
		_generateTestsuiteFiles(model,node,translations);
	}

	///
	/// generates all files for each testsuite
	private static void _generateTestsuiteFiles(TestProjectModel model, TestsuiteNode node, Map translations) 
			throws Exception{

		if (node != null){

			// select the template depending on root + manypanels + internal
			String tstemplate = "";
			// - testsuite for root node - level 0
			if (model.getRoot() == node){
				// root
				tstemplate = TESTSUITEBASE_CODE_TEMPLATE;
			}
			// - testsuite level 1
			else if (node.getParent() == model.getRoot()){
				// onepanel
				if (node.isOnepanel()) tstemplate = TESTSUITE_OP_CODE_TEMPLATE;
				// manypanels
				else tstemplate = TESTSUITE_MP_CODE_TEMPLATE;
			}
			// - testsuite level 2 or more
			else{
				// onepanel
				if (node.isOnepanel()) tstemplate = TESTSUITE_OP_INTERNAL_CODE_TEMPLATE;
				// manypanels
				else tstemplate = TESTSUITE_MP_CODE_TEMPLATE;
			}

			// generate the testsuite project folder
			String tsDirpath = generationDirectory + node.getName() + Defines.PATH_SEP;
			FileSystemUtils.MakeDir(tsDirpath);

			// generate the testsuite project pro file
			String tsProPath = tsDirpath + node.getName() + Defines.TESTSUITE_PROFILE_EXTENSION;
			String tsProTemplate = TESTSUITE_PROJECT_PRO_CODE_TEMPLATE;
			String tsProCode = _generateNodeString(translations, tsProTemplate);
			FileSystemUtils.StringToFile(tsProCode, tsProPath);

			// generate testsuite code if:
			//  - generateOnlyPro is false
			//  - or...
			//  - generateOnlyPro is true but code was not generated before

			// generate the testsuite project main file
			String tsMainPath = tsDirpath + node.getName() + Defines.TESTSUITE_MAINFILE_EXTENSION;
			if (!generateOnlyPro || !FileSystemUtils.IsExistingFile(tsMainPath)){
				String tsMainTemplate = TESTSUITE_PROJECT_MAIN_CODE_TEMPLATE;
				String tsMainCode = _generateNodeString(translations, tsMainTemplate);
				FileSystemUtils.StringToFile(tsMainCode, tsMainPath);
			}
			else
				System.out.println("Testsuite main file not generated; it already exists.");

			// generate the testsuite file
			String tsCodePath = generationDirectory + node.getName() + Defines.TESTSUITE_FILE_EXTENSION;
			if (!generateOnlyPro || !FileSystemUtils.IsExistingFile(tsCodePath)){
				// generate testsuite code
				String testsuiteCode = _generateNodeString(translations, tstemplate);
				FileSystemUtils.StringToFile(testsuiteCode, tsCodePath);
			}
			else
				System.out.println("Testsuite file not generated; it already exists.");

			// write down generated files
			generatedTestsuites.add(new TestsuiteDescriptor(
					node.getName(), 
					node.getName() + Defines.TESTSUITE_FILE_EXTENSION,
					"." + Defines.PATH_SEP + node.getName(),
					node.getDescription()));

			System.out.println("Testsuite saved to: " + tsDirpath);
		}
		else{
			throw new Exception("Testsuite node is null. No files are generated.");
		}
	}

	///
	/// generates the code of a test
	private static String _generateTestCode(TestNode node, Map translations, 
			boolean isOnePanel, 
			RoundtripData rtrip_data) throws Exception{
		if (node != null){

			// add test_name to translations
			translations.put(Defines.TEST_NAME, node.getName());

			// check roundtrip
			boolean do_roundtrip = false;
			TestsuiteNode parent = (TestsuiteNode)node.getParent();
			if (parent != null){
				String method_id = 
						RoundtripData.GenerateMethodId(parent.getName(), node.getName());
				String code = rtrip_data.getMethod(method_id);
				if (code != null && !code.isEmpty()){
					translations.put(Defines.TEST_CODE, code);
					do_roundtrip = true;
					System.out.println("Roundtripped method: " + method_id);
				}
			}

			// select template
			String template = "";
			if (isOnePanel)
				if (do_roundtrip)
					template = TEST_CODE_OP_RT_TEMPLATE;
				else
					template = TEST_CODE_OP_TEMPLATE;
			else
				if (do_roundtrip)
					template = TEST_CODE_MP_RT_TEMPLATE;
				else
					template = TEST_CODE_MP_TEMPLATE;

			// generate method code
			return _generateNodeString(translations, template);
		}
		else{
			throw new Exception("Leaf node (i.e., test node) is null. No code is generated.");
		}
	}

	///
	/// generates the code from a template and a set of translations

	private static String _generateNodeString(Map trans, String template){
		// the final string
		String result = template;

		// substitute all strings
		// does 2 iterations because some substitutions may include templated code
		for (int i = 0; i < 2; i++){
			Iterator it = trans.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pairs = (Map.Entry)it.next();
				//System.out.println(pairs.getKey() + " = " + pairs.getValue());
				result = result.replace(pairs.getKey().toString(), pairs.getValue().toString());
			}
		}

		// return
		return result;
	}

}
