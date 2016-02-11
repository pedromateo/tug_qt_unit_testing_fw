package org.eclipse.tug.wizard;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.event.ChangeEvent;

import org.eclipse.tug.utils.DialogsUtils;
import org.eclipse.tug.utils.FileParseUtils;
import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.wizard.widgets.testprojecteditor.TestProjectEditor;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestNode;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteNode;

public abstract class WizardWindowImpl extends WizardWindowWidget {

	/*
	 * MAIN WINDOW STUFF
	 */

	public void frmTugGeneratorWizard__windowStateChanged(WindowEvent e){
		// minimized
		if ((e.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED){
		}
		// maximized
		else if ((e.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH){
			//pan_top.addTab("<html><body leftmargin=165 topmargin=8 marginwidth=165 marginheight=5>Tab1</body></html>", new JLabel("Text Component 1"));
		}
	}

	/*
	 * TEST EVERYTHING
	 */



	/*
	 * WIZARD PROCESS: INITIALIZATION
	 */
	public void initializeAppearanceAndGUIContent(){

		/// widgets content
		
		// step 1
		// step 2
		// step 3
		// step 4
		// step 5
		// step 6
		// step 7
		lbl_destination_folder.setText("");
		// 

		/// tabs appearance
		for (int i = 0; i < pan_top.countComponents(); i++){
			// title
			String title = pan_top.getTitleAt(i);
			String pre = "<html><body text=black marginwidth=20 marginheight=10 align=left>";
			String post = "</body></html>";
			pan_top.setTitleAt(i, pre + title + post);

			// color
			pan_top.setBackgroundAt(i, Color.BLUE);// tab color - does not work
		}

		/// wizard appearance
		pan_top.setOpaque(true);
		pan_top.setBackground(Color.LIGHT_GRAY);
	}
	
	
	
	
	/*
	 * WIZARD PROCESS: Variables and other initialization
	 */

	// remember last path variable
	protected String _last_open_filepath = "";
	protected String _last_save_filepath = _last_open_filepath;
	


	/*
	 * WIZARD PROCESS: STEP 1
	 */

	public void but_select_panel__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseFile(DialogsUtils.UI_DESCRIPTION, DialogsUtils.UI_EXTENSION, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			tef_panel_file.setText(path);
			//tef_panel_classname.setText(path.substring(path.lastIndexOf('/')+1, path.length()-3));
			tef_panel_classname.setText(FileParseUtils.GetPanelnameFromUi(path));
			// provide hint in Step 7
			tef_project_name.setText(tef_panel_classname.getText() + "Testproject");
			
			_last_open_filepath = path;
		}
	}

	public void cbx_no_panel_file__stateChanged(ChangeEvent e){
		// selected
		if (cbx_no_panel_file.isSelected()){
			// disable panel selectors
			tef_panel_file.setEnabled(false);
			tef_panel_file.setText("../resources/panels/no_dialog.ui");
			but_select_panel.setEnabled(false);
			// clean classname
			tef_panel_classname.setText("");
		}
		// not selected
		else{
			// enable panel selectors
			tef_panel_file.setEnabled(true);
			tef_panel_file.setText("");
			but_select_panel.setEnabled(true);
		}
	}

	public void cbx_ui_reference__stateChanged(ChangeEvent e){
		// selected
		if (cbx_ui_reference.isSelected()){
			// enable text field
			tef_ui_reference.setEnabled(true);
			// suggest text
			tef_ui_reference.setText("p_impl->ui.");
		}
		// not selected
		else{
			// disable text field
			tef_ui_reference.setEnabled(false);
			// empty text
			tef_ui_reference.setText("ui->");
		}
	}

	public void cbx_ui_reference_include__stateChanged(ChangeEvent e){
		// selected
		if (cbx_ui_reference_include.isSelected()){
			// enable label, field and button for add. include
			tef_ui_reference_include.setEnabled(true);
			but_ui_reference_include.setEnabled(true);
		}
		// not selected
		else{
			// disable label, field and button for add. include
			tef_ui_reference_include.setEnabled(false);
			tef_ui_reference_include.setText("");
			but_ui_reference_include.setEnabled(false);
		}
	}


	public void but_ui_reference_include__actionPerformed(ActionEvent arg0){
		String[] allowed_ext =
				new String[] {DialogsUtils.H_EXTENSION, 
				DialogsUtils.CPP_EXTENSION, 
				DialogsUtils.HPP_EXTENSION};

		String path = DialogsUtils.ChooseFile(DialogsUtils.SOURCES_DESCRIPTION, allowed_ext, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			String filename = FileSystemUtils.GetFilenameFromPath(path);
			tef_ui_reference_include.setText(filename);
			
			_last_open_filepath = path;
		}
	}

	protected boolean __verifyStep1(){
		if (!cbx_no_panel_file.isSelected()){
			if (!checkNotEmpty(tef_panel_file.getText(),"ui_file")) return false;
		}
		if (!checkNotEmpty(tef_panel_classname.getText(),"ui_classname")) return false;
		if (cbx_ui_reference.isSelected()){
			if (!checkNotEmpty(tef_ui_reference.getText(),"ui_reference")) return false;
		}
		if (cbx_ui_reference_include.isSelected()){
			if (!checkNotEmpty(tef_ui_reference_include.getText(),"ui_reference")) return false;
		}
		return true;
	}

	/*
	 * WIZARD PROCESS: STEP 2
	 */

	public void cbx_include_gw__stateChanged(ChangeEvent e){
		//if (cbx_include_gw.isSelected()){
			lbl_21.setEnabled(true);
			tef_gw_lib.setEnabled(true);
			but_select_gw_lib.setEnabled(true);
			lbl_22.setEnabled(true);
			tef_gw_file.setEnabled(true);
			but_select_gw_file.setEnabled(true);
			lbl_22_cn.setEnabled(true);
			tef_gw_classname.setEnabled(true);
			lbl_23.setEnabled(true);
			lbl_23_pp.setEnabled(true);
			tef_gwpanel_parameters.setEnabled(true);
			lbl_23_gp.setEnabled(true);
			tef_gw_parameters.setEnabled(true);
			lbl_24.setEnabled(true);
			tef_gw_builddir.setEnabled(true);
			but_select_gw_builddir.setEnabled(true);
			lbl_25.setEnabled(true);
			txa_gw_dependencies.setEnabled(true);
		/*}
		else{
			lbl_21.setEnabled(false);
			tef_gw_lib.setEnabled(false);
			but_select_gw_lib.setEnabled(false);
			lbl_22.setEnabled(false);
			tef_gw_file.setEnabled(false);
			but_select_gw_file.setEnabled(false);
			lbl_22_cn.setEnabled(false);
			tef_gw_classname.setEnabled(false);
			lbl_23.setEnabled(false);
			lbl_23_pp.setEnabled(false);
			tef_gwpanel_parameters.setEnabled(false);
			lbl_23_gp.setEnabled(false);
			tef_gw_parameters.setEnabled(false);
			lbl_24.setEnabled(false);
			tef_gw_builddir.setEnabled(false);
			but_select_gw_builddir.setEnabled(false);
			lbl_25.setEnabled(false);
			txa_gw_dependencies.setEnabled(false);
		}*/
	}

	protected void but_select_gw_lib__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseFile(DialogsUtils.SO_DESCRIPTION, DialogsUtils.SO_EXTENSION, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			tef_gw_lib.setText(path);

			// try to deduce build dir from lib dir
			tef_gw_builddir.setText(FileSystemUtils.DeduceBuildDirFromPath(tef_gw_lib.getText()));
			
			_last_open_filepath = path;
		}
	}


	protected void but_select_gw_file__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseFile(DialogsUtils.H_DESCRIPTION, DialogsUtils.H_EXTENSION, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			tef_gw_file.setText(path);
			//tef_gw_classname.setText(path.substring(path.lastIndexOf('/')+1, path.length()-2));
			tef_gw_classname.setText(FileParseUtils.GetClassnameFromHeader(path));

			// try to deduce include dir from file dir
			String pot_includedir = FileSystemUtils.DeduceIncludeDirFromPath(tef_gw_file.getText());
			if (pot_includedir.length() > 0) 
				txa_gw_dependencies.append("\nINCLUDEPATH += " + pot_includedir);
			
			_last_open_filepath = path;
		}
	}


	protected void but_select_gw_builddir__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseDir();
		if (!path.equalsIgnoreCase("")){
			tef_gw_builddir.setText(path);
		}
	}

	protected boolean __verifyStep2(){
		//if (cbx_include_gw.isSelected()){
			if (!checkNotEmpty(tef_gw_lib.getText() 
					+ txa_gw_dependencies.getText(),"gw_lib_or_deps")) return false;
			if (!checkNotEmpty(tef_gw_file.getText(),"gw_file")) return false;
			if (!checkNotEmpty(tef_gw_classname.getText(),"gw_classname")) return false;
			//if (!checkNotEmpty(tef_gwpanel_parameters.getText(),"gwpanel_parameters")) return false;
			//if (!checkNotEmpty(tef_gw_parameters.getText(),"gw_parameters")) return false;
			//if (!checkNotEmpty(tef_gw_builddir.getText(),"gw_builddir")) return false;
			//if (!checkNotEmpty(txa_gw_dependencies.getText(),"gw_extras")) return false;
		//}
		return true;
	}


	/*
	 * WIZARD PROCESS: STEP 3
	 */

	public void cbx_include_model__stateChanged(ChangeEvent e){
		if (cbx_include_model.isSelected()){
			lbl_31.setEnabled(true);
			tef_model_lib.setEnabled(true);
			but_select_model_lib.setEnabled(true);
			lbl_32.setEnabled(true);
			tef_model_file.setEnabled(true);
			but_select_model_file.setEnabled(true);
			lbl_32a.setEnabled(true);
			tef_model_classname.setEnabled(true);
			lbl_33.setEnabled(true);
			tef_model_builddir.setEnabled(true);
			but_select_model_builddir.setEnabled(true);
			lbl_34.setEnabled(true);
			txa_model_dependencies.setEnabled(true);

		}
		else{
			lbl_31.setEnabled(false);
			tef_model_lib.setEnabled(false);
			but_select_model_lib.setEnabled(false);
			lbl_32.setEnabled(false);
			tef_model_file.setEnabled(false);
			but_select_model_file.setEnabled(false);
			lbl_32a.setEnabled(false);
			tef_model_classname.setEnabled(false);
			lbl_33.setEnabled(false);
			tef_model_builddir.setEnabled(false);
			but_select_model_builddir.setEnabled(false);
			lbl_34.setEnabled(false);
			txa_model_dependencies.setEnabled(false);
		}
	}

	public void but_select_model_lib__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseFile(DialogsUtils.SO_DESCRIPTION, DialogsUtils.SO_EXTENSION, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			tef_model_lib.setText(path);

			// try to deduce build dir from lib dir
			tef_model_builddir.setText(FileSystemUtils.DeduceBuildDirFromPath(tef_model_lib.getText()));
			
			_last_open_filepath = path;
		}
	}


	public void but_select_model_file__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseFile(DialogsUtils.H_DESCRIPTION, DialogsUtils.H_EXTENSION, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			tef_model_file.setText(path);
			//tef_model_classname.setText(path.substring(path.lastIndexOf('/')+1, path.length()-2));
			tef_model_classname.setText(FileParseUtils.GetClassnameFromHeader(path));

			// try to deduce include dir from file dir
			String pot_includedir = FileSystemUtils.DeduceIncludeDirFromPath(tef_model_file.getText());
			if (pot_includedir.length() > 0) 
				txa_model_dependencies.append("\nINCLUDEPATH += " + pot_includedir);
			
			_last_open_filepath = path;
		}
	}


	protected void but_select_model_builddir__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseDir();
		if (!path.equalsIgnoreCase("")){
			tef_model_builddir.setText(path);
		}
	}

	protected boolean __verifyStep3(){
		if (cbx_include_model.isSelected()){
			if (!checkNotEmpty(tef_model_lib.getText(),"model_lib")) return false;
			if (!checkNotEmpty(tef_model_file.getText(),"model_file")) return false;
			if (!checkNotEmpty(tef_model_classname.getText(),"model_classname")) return false;
			if (!checkNotEmpty(tef_model_builddir.getText(),"model_builddir")) return false;
			//if (!checkNotEmpty(txa_model_dependencies.getText(),"model_extras")) return false;
		}
		return true;
	}

	/*
	 * WIZARD PROCESS: STEP 4
	 */

	public void cbx_include_signals__stateChanged(ChangeEvent e){
		if (cbx_include_signals.isSelected()){
			lbl_41.setEnabled(true);
			tef_signals_lib.setEnabled(true);
			but_select_signals_lib.setEnabled(true);
			lbl_42.setEnabled(true);
			tef_signals_file.setEnabled(true);
			but_select_signals_file.setEnabled(true);
			lbl_42a.setEnabled(true);
			tef_signals_classname.setEnabled(true);
			lbl_43.setEnabled(true);
			tef_signals_builddir.setEnabled(true);
			but_select_signals_builddir.setEnabled(true);
			lbl_44.setEnabled(true);
			rdb_signals_nosignals.setEnabled(true);
			rdb_signals_boost.setEnabled(true);
			rdb_signals_libsig.setEnabled(true);
			lbl_45.setEnabled(true);
			txa_signals_dependencies.setEnabled(true);
		}
		else{
			lbl_41.setEnabled(false);
			tef_signals_lib.setEnabled(false);
			but_select_signals_lib.setEnabled(false);
			lbl_42.setEnabled(false);
			tef_signals_file.setEnabled(false);
			but_select_signals_file.setEnabled(false);
			lbl_42a.setEnabled(false);
			tef_signals_classname.setEnabled(false);
			lbl_43.setEnabled(false);
			tef_signals_builddir.setEnabled(false);
			but_select_signals_builddir.setEnabled(false);
			lbl_44.setEnabled(false);
			rdb_signals_nosignals.setEnabled(false);
			rdb_signals_boost.setEnabled(false);
			rdb_signals_libsig.setEnabled(false);
			lbl_45.setEnabled(false);
			txa_signals_dependencies.setEnabled(false);
		}
	}

	public void but_select_signals_lib__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseFile(DialogsUtils.SO_DESCRIPTION, DialogsUtils.SO_EXTENSION, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			tef_signals_lib.setText(path);

			// try to deduce build dir from lib dir
			tef_signals_builddir.setText(FileSystemUtils.DeduceBuildDirFromPath(tef_signals_lib.getText()));
			
			_last_open_filepath = path;
		}
	}


	public void but_select_signals_file__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseFile(DialogsUtils.H_DESCRIPTION, DialogsUtils.H_EXTENSION, _last_open_filepath);
		if (!path.equalsIgnoreCase("")){
			tef_signals_file.setText(path);
			//tef_signals_classname.setText(path.substring(path.lastIndexOf('/')+1, path.length()-2));
			tef_signals_classname.setText(FileParseUtils.GetClassnameFromHeader(path));

			// try to deduce include dir from file dir
			String pot_includedir = FileSystemUtils.DeduceIncludeDirFromPath(tef_signals_file.getText());
			if (pot_includedir.length() > 0) 
				txa_signals_dependencies.append("\nINCLUDEPATH += " + pot_includedir);
			
			_last_open_filepath = path;
		}
	}

	protected void but_select_signals_builddir__actionPerformed(ActionEvent arg0){
		String path = DialogsUtils.ChooseDir();
		if (!path.equalsIgnoreCase("")){
			tef_signals_builddir.setText(path);
		}
	}

	public void but_edit_boost_file__actionPerformed(ActionEvent arg0){
		DialogsUtils.ShowFileEditor(Defines.BOOSTSIGNAL_INCLUDES_FILEPATH);
	}

	public void but_bak_boost_file__actionPerformed(ActionEvent arg0){
		if (DialogsUtils.ShowOkCancelMessage("Sure do you want to backup 'Boost signals' includes?")){
			try {
				boolean result = FileSystemUtils.CopyFile(Defines.BOOSTSIGNAL_INCLUDES_BAK_FILEPATH, Defines.BOOSTSIGNAL_INCLUDES_FILEPATH);
				if (result){
					String status = "File backuped successfully.";
					_setOKStatus(status);
					DialogsUtils.ShowOkMessage(status);
				}
				else{
					String status = "There was a problem while backuping the file.";
					_setErrorStatus(status);
					DialogsUtils.ShowErrorMessage(status);
				}

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void but_edit_libsig_file__actionPerformed(ActionEvent arg0){
		DialogsUtils.ShowFileEditor(Defines.LIBSIG_INCLUDES_FILEPATH);
	}

	public void but_bak_libsig_file__actionPerformed(ActionEvent arg0){
		if (DialogsUtils.ShowOkCancelMessage("Sure do you want to backup 'LibSig signals' includes?")){
			try {
				boolean result = FileSystemUtils.CopyFile(Defines.LIBSIG_INCLUDES_BAK_FILEPATH, Defines.LIBSIG_INCLUDES_FILEPATH);
				if (result){
					String status = "File backuped successfully.";
					_setOKStatus(status);
					DialogsUtils.ShowOkMessage(status);
				}
				else{
					String status = "There was a problem while backuping the file.";
					_setErrorStatus(status);
					DialogsUtils.ShowErrorMessage(status);
				}

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	protected boolean __verifyStep4(){
		if (cbx_include_signals.isSelected()){
			if (!checkNotEmpty(tef_signals_lib.getText(),"signals_lib")) return false;
			if (!checkNotEmpty(tef_signals_file.getText(),"signals_file")) return false;
			if (!checkNotEmpty(tef_signals_classname.getText(),"signals_classname")) return false;
			if (!checkNotEmpty(tef_signals_builddir.getText(),"signals_builddir")) return false;
			//if (!checkNotEmpty(txa_signals_dependencies.getText(),"signals_extras")) return false;
		}
		return true;
	}

	/*
	 * WIZARD PROCESS: STEP 5
	 */

	public void but_edit_gcov_file__actionPerformed(ActionEvent arg0){
		DialogsUtils.ShowFileEditor(Defines.GCOV_INCLUDES_FILEPATH);
	}

	public void but_bak_gcov_file__actionPerformed(ActionEvent arg0){
		if (DialogsUtils.ShowOkCancelMessage("Sure do you want to backup 'GCov' includes?")){
			try {
				boolean result = FileSystemUtils.CopyFile(Defines.GCOV_INCLUDES_BAK_FILEPATH, Defines.GCOV_INCLUDES_FILEPATH);
				if (result){
					String status = "File backuped successfully.";
					_setOKStatus(status);
					DialogsUtils.ShowOkMessage(status);
				}
				else{
					String status = "There was a problem while backuping the file.";
					_setErrorStatus(status);
					DialogsUtils.ShowErrorMessage(status);
				}

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void but_edit_gprof_file__actionPerformed(ActionEvent arg0){
		DialogsUtils.ShowFileEditor(Defines.GPROF_INCLUDES_FILEPATH);
	}

	public void but_bak_gprof_file__actionPerformed(ActionEvent arg0){
		if (DialogsUtils.ShowOkCancelMessage("Sure do you want to backup 'GProf' includes?")){
			try {
				boolean result = FileSystemUtils.CopyFile(Defines.GPROF_INCLUDES_BAK_FILEPATH, Defines.GPROF_INCLUDES_FILEPATH);
				if (result){
					String status = "File backuped successfully.";
					_setOKStatus(status);
					DialogsUtils.ShowOkMessage(status);
				}
				else{
					String status = "There was a problem while backuping the file.";
					_setErrorStatus(status);
					DialogsUtils.ShowErrorMessage(status);
				}

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void but_edit_qwt_file__actionPerformed(ActionEvent arg0){
		DialogsUtils.ShowFileEditor(Defines.QWT_INCLUDES_FILEPATH);
	}

	public void but_bak_qwt_file__actionPerformed(ActionEvent arg0){
		if (DialogsUtils.ShowOkCancelMessage("Sure do you want to backup 'Qwt' includes?")){
			try {
				boolean result = FileSystemUtils.CopyFile(Defines.QWT_INCLUDES_BAK_FILEPATH, Defines.QWT_INCLUDES_FILEPATH);
				if (result){
					String status = "File backuped successfully.";
					_setOKStatus(status);
					DialogsUtils.ShowOkMessage(status);
				}
				else{
					String status = "There was a problem while backuping the file.";
					_setErrorStatus(status);
					DialogsUtils.ShowErrorMessage(status);
				}

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void but_edit_tuglib_file__actionPerformed(ActionEvent arg0){
		DialogsUtils.ShowFileEditor(Defines.TUGLIB_INCLUDES_FILEPATH);
	}

	public void but_bak_tuglib_file__actionPerformed(ActionEvent arg0){
		if (DialogsUtils.ShowOkCancelMessage("Sure do you want to backup 'TUGLib' includes?")){
			try {
				boolean result = FileSystemUtils.CopyFile(Defines.TUGLIB_INCLUDES_BAK_FILEPATH, Defines.TUGLIB_INCLUDES_FILEPATH);
				if (result){
					String status = "File backuped successfully.";
					_setOKStatus(status);
					DialogsUtils.ShowOkMessage(status);
				}
				else{
					String status = "There was a problem while backuping the file.";
					_setErrorStatus(status);
					DialogsUtils.ShowErrorMessage(status);
				}

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}



	protected boolean __verifyStep5(){
		//nothing to verify
		return true;
	}

	/*
	 * WIZARD PROCESS: STEP 6
	 */


	///
	/// checkbox enabling/disabling all

	public void cbx_generate_testsuites__actionPerformed(ActionEvent arg0){

		// enable or disable widgets
		if (cbx_generate_testsuites.isSelected()){

			// give a pre-configuration in the testsuite tree

			// get model name

			String stemp = "";
			if (tef_panel_classname.getText().equalsIgnoreCase("") == false){
				stemp = tef_panel_classname.getText();
			}
			else{
				stemp = "MyPanel";
			}

			final String panelName = stemp;
			final String tsdesc = "<No description set for this Testsuite>";

			// create an initial model

			TestsuiteNode root = new TestsuiteNode(null, "Testsuite_base_" + panelName, false, "");
			TestsuiteNode tsn;
			TestNode tn;
			// ts1
			tsn = new TestsuiteNode(root, "Testsuite_" + panelName + "_1", true, tsdesc);
			tn = new TestNode(tsn, "test1");
			tn = new TestNode(tsn, "test2");
			// ts1.1
			tsn = new TestsuiteNode(tsn, "Testsuite_" + panelName + "_1_1", true, tsdesc);
			tn = new TestNode(tsn, "test1_1");
			// ts2
			tsn = new TestsuiteNode(root, "Testsuite_" + panelName + "_2", false, tsdesc);
			tn = new TestNode(tsn, "test1");

			// create widget and add it to the panel
			tpeEditor = new TestProjectEditor(new TestProjectModel(root));
			pan_step6.add(tpeEditor, "5, 8, 6, 1, fill, fill");
			pan_step6.updateUI();
		}
		else {
			// remove widget from panel and update;
			pan_step6.remove(tpeEditor);
			pan_step6.updateUI();
		}
	}

	protected boolean __verifyStep6(){
		if (cbx_generate_testsuites.isSelected()){
			//TODO
		}
		return true;
	}


	/*
	 * WIZARD PROCESS: STEP 7
	 */


	public void but_select_destination_directory__actionPerformed(ActionEvent arg0){
		if (tef_project_name.getText().equals("")){
			tef_project_name.setText("MyTestProject");
		}

		String dir = DialogsUtils.ChooseDir(tef_destination.getText());

		if (!dir.isEmpty()){
			tef_destination.setText(dir);
			_update_lbl_destination_folder();
		}
	}


	public void tef_project_name__actionPerformed(ActionEvent arg0){
		_update_lbl_destination_folder();
	}

	protected void _update_lbl_destination_folder(){

		if (!tef_destination.getText().isEmpty() 
				&& !tef_project_name.getText().isEmpty()){
			lbl_destination_folder.setText(tef_destination.getText() + Defines.PATH_SEP + tef_project_name.getText());
		}
	}

	protected boolean __verifyStep7(){
		if (!checkNotEmpty(tef_project_name.getText(),"tef_project_name")) return false;
		if (!checkNotEmpty(tef_destination.getText(),"dest_folder")) return false;
		if (!checkNotEmpty(lbl_destination_folder.getText(),"lbl_destination_folder")) return false;
		return true;
	}

	/*
	 * WIZARD PROCESS: STEP VERIFICATION
	 */

	protected boolean __verifyWizardData(){
		return __verifyStep1() && __verifyStep2() && __verifyStep3() 
				&& __verifyStep4() && __verifyStep5() && __verifyStep6() 
				&& __verifyStep7();
	}


	/*
	 * WIZARD PROCESS: STEP SWITCHING
	 */

	protected int _currentStep = 0;

	/// back
	public void but_previous__actionPerformed(ActionEvent arg0){
		//_setOKStatus("Prev - Input step: " + Integer.toString(_currentStep));
		if (_currentStep == 0){
			// verify step data
			__verifyStep1();
		}
		else if (_currentStep == 1){
			// verify step data
			__verifyStep2();
			// show previous step
			pan_top.setSelectedIndex(0);
		}
		else if (_currentStep == 2){
			// verify step data
			__verifyStep3();
			// show previous step
			pan_top.setSelectedIndex(1);
		}
		else if (_currentStep == 3){
			// verify step data
			__verifyStep4();
			// show previous step
			pan_top.setSelectedIndex(2);
		}
		else if (_currentStep == 4){
			// verify step data
			__verifyStep5();
			// show previous step
			pan_top.setSelectedIndex(3);
		}
		else if (_currentStep == 5){
			// verify step data
			__verifyStep6();
			// show previous step
			pan_top.setSelectedIndex(4);
		}
		else if (_currentStep == 6){
			// verify step data
			__verifyStep7();
			// show previous step
			pan_top.setSelectedIndex(5);
		}
		//_setStatus("Configuring Step " + Integer.toString(pan_top.getSelectedIndex()+1));
	}

	/// next
	public void but_next__actionPerformed(ActionEvent arg0){
		//_setOKStatus("Next - Input step: " + Integer.toString(_currentStep));
		if (_currentStep == 0){
			// verify step data
			__verifyStep1();
			// show previous step
			pan_top.setSelectedIndex(1);
		}
		else if (_currentStep == 1){
			// verify step data
			__verifyStep2();
			// show previous step
			pan_top.setSelectedIndex(2);
		}
		else if (_currentStep == 2){
			// verify step data
			__verifyStep3();
			// show previous step
			pan_top.setSelectedIndex(3);
		}
		else if (_currentStep == 3){
			// verify step data
			__verifyStep4();
			// show previous step
			pan_top.setSelectedIndex(4);
		}
		else if (_currentStep == 4){
			// verify step data
			__verifyStep5();
			// show previous step
			pan_top.setSelectedIndex(5);
		}
		else if (_currentStep == 5){
			// verify step data
			__verifyStep6();
			// show previous step
			pan_top.setSelectedIndex(6);
		}
		else if (_currentStep == 6){
			// verify step data
			__verifyStep7();
		}
		//_setStatus("Configuring Step " + Integer.toString(pan_top.getSelectedIndex()+1));
	}

	/// click in a tab
	public void pan_top__stateChanged(ChangeEvent arg0){
		//_setOKStatus("Click - Input step: " + Integer.toString(_currentStep));
		if (_currentStep == 1){
			// verify step data
			__verifyStep1();
		}
		else if (_currentStep == 2){
			// verify step data
			__verifyStep2();
		}
		else if (_currentStep == 3){
			// verify step data
			__verifyStep3();
		}
		else if (_currentStep == 4){
			// verify step data
			__verifyStep4();
		}
		else if (_currentStep == 5){
			// verify step data
			__verifyStep5();
		}
		else if (_currentStep == 6){
			// verify step data
			__verifyStep6();
		}
		else if (_currentStep == 7){
			// verify step data
			__verifyStep7();
		}
		// update current step
		_currentStep = pan_top.getSelectedIndex();
		//_setStatus("Configuring Step " + Integer.toString(pan_top.getSelectedIndex()+1));
	}

	/*
	 * WIZARD: MENU FUNCTIONALITY
	 */

	/// exit
	public void but_exit__actionPerformed(ActionEvent arg0){
		System.exit(0);
	}

	/// load and save functionality are defined in subclass


	/*
	 * GENERATION PARAMETERS CHECKING
	 */

	protected boolean checkNotEmpty(String param, String param_name){
		if (param.equalsIgnoreCase("")){
			String status = "Parameter '" + param_name + "' is empty.";
			_setErrorStatus(status);
			//DialogsUtils.ShowErrorMessage(status);
			return false;
		}
		return true;
	}

	/*
	 * STATUS
	 */ 

	protected void _setErrorStatus(String status_str){
		if (status_str != null && lbl_status != null){
			System.out.print("@ERROR ");
			_setStatus(status_str);
			lbl_status.setForeground(Color.red);
		}
	}


	protected void _setOKStatus(String status_str){
		if (status_str != null && lbl_status != null){
			System.out.print("@OK ");
			_setStatus(status_str);
			lbl_status.setForeground(new Color(0,128,0));
		}
	}

	protected void _setStatus(String status_str){
		if (status_str != null && lbl_status != null){
			lbl_status.setText(status_str);
			lbl_status.setToolTipText(status_str);
			lbl_status.setForeground(Color.gray);
			lbl_status.repaint();
			_log("@Status: " + status_str);
		}
	}


}
