package org.eclipse.tug.utils;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.eclipse.genericeditor.EditImplFrame;

public class DialogsUtils {
	/*
	 * FILE EDITOR
	 */

	public static void ShowFileEditor(String filepath){
		EditImplFrame fEditImpl = new EditImplFrame(new File(filepath), true);

	}


	/*
	 * ERROR and CONFIRMATION DIALOGS
	 */

	public static void ShowErrorMessage(String status_str){
		JOptionPane.showMessageDialog(null, status_str, "Error dialog", JOptionPane.ERROR_MESSAGE);
	}

	public static boolean ShowOkCancelMessage(String msg){
		int result = JOptionPane.showConfirmDialog(null, msg, "Confirmation dialog", JOptionPane.OK_CANCEL_OPTION);

		if(result == JOptionPane.YES_OPTION)
			return true;
		else
			return false;
	}


	public static void ShowOkMessage(String msg){
		JOptionPane.showMessageDialog(null, msg);
		//ConfirmDialog(null, msg, "Message dialog", JOptionPane.INFORMATION_MESSAGE);
	}

	/*
	 * FILE FILTERS and CHOOSERS
	 */

	private static javax.swing.filechooser.FileFilter newFileFilter(final String desc, final String[] allowed_extensions) {
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

	///
	/// Ui file filter

	public final static String UI_EXTENSION = "ui";
	public final static String UI_DESCRIPTION = "Qt4 design files (*.ui)";

	///
	/// tug project file filter

	public final static String TUG_EXTENSION = "tug";
	public final static String TUG_DESCRIPTION = "TUG project files (*.tug)";

	///
	/// .h file filter

	public final static String H_EXTENSION = "h";
	public final static String H_DESCRIPTION = "C++ header file (*.h)";

	///
	/// .cpp file filter

	public final static String CPP_EXTENSION = "cpp";
	public final static String CPP_DESCRIPTION = "C++ implementation file (*.cpp)";

	///
	/// .h file filter

	public final static String HPP_EXTENSION = "hpp";
	public final static String HPP_DESCRIPTION = "C++ header/implementation file (*.hpp)";


	public final static String SOURCES_DESCRIPTION = "C++ source files (*.h, *.cpp, *.hpp)";

	///
	/// .so file filter

	public final static String SO_EXTENSION = "so";
	public final static String SO_DESCRIPTION = "Dynamic library (*.so)";



	public static String ChooseFile(final String desc, final String allowed_extension){
		return ChooseFile(desc, new String[]{allowed_extension},_last_dir);
	}

	public static String ChooseFile(final String desc, final String allowed_extension, String suggested_dir){
		return ChooseFile(desc, new String[]{allowed_extension},suggested_dir);
	}

	public static String ChooseFile(final String desc, final String[] allowed_extensions){
		return ChooseFile(desc, allowed_extensions,_last_dir);
	}

	public static String ChooseFile(final String desc, final String[] allowed_extensions, String suggested_dir){
		String basedir = suggested_dir.isEmpty()? _last_dir : suggested_dir;
		JFileChooser chooser = _NewFileChooserInstance(basedir);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		if (!desc.isEmpty() && allowed_extensions.length > 0)
			chooser.setFileFilter(newFileFilter(desc, allowed_extensions));
		int returnVal = chooser.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			_last_dir = chooser.getSelectedFile().getAbsolutePath();
			return chooser.getSelectedFile().getAbsolutePath();
		}
		else{
			return "";
		}
	}

	public static String SaveFile(final String desc, final String allowed_extension){
		return SaveFile(desc,allowed_extension,_last_dir);
	}

	public static String SaveFile(final String desc, final String allowed_extension, String suggested_dir){
		String basedir = suggested_dir.isEmpty()? _last_dir : suggested_dir;
		JFileChooser chooser = _NewFileChooserInstance(basedir);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setFileFilter(newFileFilter(desc, new String[]{allowed_extension}));
		int returnVal = chooser.showSaveDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			_last_dir = chooser.getSelectedFile().getAbsolutePath();
			return chooser.getSelectedFile().getAbsolutePath();
		}
		else{
			return "";
		}
	}

	public static String ChooseDir(){
		return ChooseDir(_last_dir);
	}

	public static String ChooseDir(String suggested_dir){
		String basedir = suggested_dir.isEmpty()? _last_dir : suggested_dir;
		JFileChooser chooser = _NewFileChooserInstance(basedir);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = chooser.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			_last_dir = chooser.getSelectedFile().getAbsolutePath();
			return chooser.getSelectedFile().getAbsolutePath();
		}
		else{
			return "";
		}
	}

	private static String _last_dir = "";

	private static JFileChooser _NewFileChooserInstance(){
		if (_last_dir.isEmpty())
			_last_dir = System.getProperty("user.dir");
		return new JFileChooser(_last_dir);
	}

	private static JFileChooser _NewFileChooserInstance(String suggested_dir){
		_last_dir = suggested_dir;
		return new JFileChooser(suggested_dir);
	}

}
