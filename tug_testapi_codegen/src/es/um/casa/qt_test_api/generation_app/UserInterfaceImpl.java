package es.um.casa.qt_test_api.generation_app;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;

public class UserInterfaceImpl extends UserInterface {

	public UserInterfaceImpl() {
	}

	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// process args
					if (_processArguments(args)){
						// GUI mode
						if (_gui){
							UserInterface window = new UserInterfaceImpl();
							window.frame.setVisible(true);
						}
						// console mode
						else{
							_generate(_input, _output);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	///
	/// arguments processing
	///
	/// -g --gui (true|false)
	/// -i --input path
	/// -o --output path 
	/// --test
	///

	private static boolean _test = false;
	private static boolean _gui = false;
	private static String _input = "";
	private static String _output = "";

	private static boolean _processArguments(String[] args) {

		boolean error = false;

		// checking test mode
		if (args.length > 0 && args[0].equalsIgnoreCase("--test")){
			_log("Configuring test mode...");

			_gui = true;
			_input = "./input";
			_output = "./output";
			_test = true;

			return true;
		}

		_log("Processing arguments...");

		int i = 0;
		while (i < args.length){
			// GUI
			if (args[i].equalsIgnoreCase("-g") || args[i].equalsIgnoreCase("--gui")){
				// check next arg
				i++;
				if (i < args.length && args[i].equalsIgnoreCase("true")){
					_gui = true;
				}
				else if (i < args.length && args[i].equalsIgnoreCase("false")){
					_gui = false;
				}
				else{
					error = true;
					break;
				}
			}
			// INPUT
			else if (args[i].equalsIgnoreCase("-i") || args[i].equalsIgnoreCase("--input")){
				// check next arg
				i++;
				if (i < args.length 
						&& !args[i].equalsIgnoreCase("")
						&& !args[i].startsWith("-")){
					_input = args[i];
				}
				else{
					error = true;
					break;
				}
			}
			// OUTPUT
			else if (args[i].equalsIgnoreCase("-o") || args[i].equalsIgnoreCase("--output")){
				// check next arg
				i++;
				if (i < args.length 
						&& !args[i].equalsIgnoreCase("")
						&& !args[i].startsWith("-")){
					_output = args[i];
				}
				else{
					error = true;
					break;
				}
			}

			// go to next argument
			i++;
		}

		// check arguments
		if (!error){
			if (! _gui) {
				if (_input.equalsIgnoreCase("") || _output.equalsIgnoreCase(""))
					error = true;
				else if ((new File(_output)).isDirectory() == false)
					error = true;
				else if ((new File(_input)).isDirectory() == false &&
						(new File(_input)).isFile() == false)
					error = true;
			}
		}

		// check error
		if (error){
			_log("Error processing arguments.");
			_log("Use: binary [options]");
			_log("Options:");
			_log("  -g|--gui true|false      GUI mode on/off.");
			_log("  -i|--input path          Valid input file (.ui) or directory.");
			_log("  -o|--output path         Valid output directory.");
			_log("");
			_log("For GUI mode paths are not necessary. For console mode paths are mandatory.");
			return false;
		}
		else{
			_log("Arguments processed successfully.");
			_log("GUI mode: " + _gui);
			_log("Input dir/file: " + _input);
			_log("Output directory: " + _output);
			return true;
		}
	}
	
	/// //////////////////////////////////////////////////////////
	/// //////////////////////////////////////////////////////////

	///
	/// overrided handlers
	///

	@Override
	protected void postInitialization(){
		_log("postInitialization");

		// group of radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(radio_single_file);
		group.add(radio_directory);

		// disable all
		goStep1();
		
		// set text of directories in arguments
		text_input_directory.setText(_input);
		text_single_file.setText(_input);
		text_output_directory.setText(_output);

		///
		/// test code
		///

		if (_test){
			goStep2();
			goStep3();

			radio_directory.setSelected(true);
		}

		///
		/// test code end
		///
	}

	/// RADIOS

	@Override
	protected void radio_single_file__itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange() == ItemEvent.SELECTED){
			text_single_file.setEnabled(true);
			button_browse_single_file.setEnabled(true);
		}
		else{
			text_single_file.setEnabled(false);
			button_browse_single_file.setEnabled(false);
		}
	}

	@Override
	protected void radio_directory__itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange() == ItemEvent.SELECTED){
			text_input_directory.setEnabled(true);
			button_browse_input_directory.setEnabled(true);
		}
		else{
			text_input_directory.setEnabled(false);
			button_browse_input_directory.setEnabled(false);
		}
	}

	/// BUTTONS

	@Override
	protected void button_browse_single_file__mouseClicked(MouseEvent e) {
		//_log("button_browse_single_file__mouseClicked");

		if (button_browse_single_file.isEnabled()){
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			chooser.setFileFilter(newUiFileFilter(UI_DESCRIPTION, new String[] {UI_EXTENSION}));
			int returnVal = chooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				text_single_file.setText(chooser.getSelectedFile().getAbsolutePath());
				goStep2();
			}
		}
	}

	@Override
	protected void button_browse_input_directory__mouseClicked(MouseEvent e) {
		//_log("button_browse_input_directory__mouseClicked");

		if (button_browse_input_directory.isEnabled()){
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = chooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				text_input_directory.setText(chooser.getSelectedFile().getAbsolutePath());
				goStep2();
			}
		}
	}

	@Override
	protected void button_browse_output_directory__mouseClicked(MouseEvent e) {
		//_log("button_browse_output_directory__mouseClicked");

		if (button_browse_output_directory.isEnabled()){
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = chooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				text_output_directory.setText(chooser.getSelectedFile().getAbsolutePath());
				goStep3();
			}
		}
	}

	@Override
	protected void button_generate__mouseClicked(MouseEvent e) {
		//_log("button_generate__mouseClicked");

		///
		/// input file/directory
		
		String input = "";

		// single file
		if (radio_single_file.isSelected()){
			if (text_single_file.getText().equalsIgnoreCase("")){
				label_result.setText("ERROR: file path is empty.");
				label_result.setVisible(true);
				throw new IllegalArgumentException("Single filepath should not be empty.");
			}
			input = text_single_file.getText();
		}
		// directory
		else if (radio_directory.isSelected()){
			if (text_input_directory.getText().equalsIgnoreCase("")){
				label_result.setText("ERROR: input directory is empty.");
				label_result.setVisible(true);
				throw new IllegalArgumentException("Input directory should not be empty.");
			}
			input = text_input_directory.getText();
		}

		///
		/// output directory

		String outputDirectory = text_output_directory.getText();
		if (outputDirectory.equalsIgnoreCase("")){
			label_result.setText("ERROR: output directory is empty.");
			label_result.setVisible(true);
			throw new IllegalArgumentException("Output directory should not be empty.");
		}


		///
		/// do generation
		
		if (_generate(input,outputDirectory)){
			label_result.setText("Files already processed.");
			label_result.setVisible(true);
		}
		else{
			label_result.setText("ERROR during generation process.");
			label_result.setVisible(true);
		}
	}

	private static boolean _generate(String input, String output_dir) {

		///
		/// input files

		ArrayList<String> files = new ArrayList<String>();

		File d = new File(input);
		if (d.isDirectory()) {
			for (File file : d.listFiles()) {
				String filepath = file.getAbsolutePath();
				if (filepath.endsWith(UI_EXTENSION)){
					_log("Adding file: " + filepath);
					files.add(filepath);
				}
			}
		}
		else{
			files.add(input);
		}

		///
		/// do generation for each input file

		for(String filepath : files){
			_log("Generating files for panel: " + filepath);
			try {
				GenerationProcess.main(new String[]{filepath,output_dir});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return true;
	}

	///
	/// goStepX() methods
	///

	private void goStep1(){
		// disable/enable elements for step 1
		radio_single_file.setEnabled(true);
		radio_single_file.setSelected(false);
		text_single_file.setEnabled(false);
		button_browse_single_file.setEnabled(false);

		radio_directory.setEnabled(true);
		radio_directory.setSelected(false);
		text_input_directory.setEnabled(false);
		button_browse_input_directory.setEnabled(false);

		label_step2.setEnabled(false);
		text_output_directory.setEnabled(false);
		button_browse_output_directory.setEnabled(false);

		label_step3.setEnabled(false);
		button_generate.setEnabled(false);
		label_result.setVisible(false);
	}

	private void goStep2(){
		// disable/enable elements for step 2
		label_step2.setEnabled(true);
		text_output_directory.setEnabled(true);
		button_browse_output_directory.setEnabled(true);

		label_step3.setEnabled(false);
		button_generate.setEnabled(false);
		label_result.setVisible(false);
	}

	private void goStep3(){
		// disable/enable elements for step 3
		label_step3.setEnabled(true);
		button_generate.setEnabled(true);
		label_result.setVisible(false);
	}

	///
	/// Ui file filter
	///

	private final static String UI_EXTENSION = "ui";
	private final static String UI_DESCRIPTION = "Qt4 design files (*.ui)";

	private javax.swing.filechooser.FileFilter newUiFileFilter(final String desc, final String[] allowed_extensions) {
		return new javax.swing.filechooser.FileFilter() {
			@Override
			public boolean accept(java.io.File f) {
				if (f.isDirectory()) {
					return true;
				}
				int pos = f.getName().lastIndexOf('.');
				if (pos == -1) {
					return false;
				} else {
					String extension = f.getName().substring(pos + 1);
					for (String allowed_extension : allowed_extensions) {
						if (extension.equalsIgnoreCase(allowed_extension)) {
							return true;
						}
					}
					return false;
				}
			}

			@Override
			public String getDescription() {
				return desc;
			}
		};
	}


}


