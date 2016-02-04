package org.eclipse.tug.wizard.widgets.dependenciesbox;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.eclipse.tug.utils.DialogsUtils;
import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.wizard.Defines;
import org.eclipse.tug.wizard.WizardWindowWidget;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;


public class DependenciesBox extends JPanel {

	// constants
	final String INCLUDE_PREFIX = "INCLUDEPATH += ";
	final String DEPEND_PREFIX = "DEPENDPATH += ";
	final String LIBS_PREFIX = "LIBS += ";

	// components
	private JScrollPane _scrollPanel;
	private JTextArea _txa_dependencies; 
	private JButton _but_addLibrary;
	private JButton _but_addIncludes;
	private JButton _but_addFile;
	private JButton _but_addDir;
	
	// referred widgets
	private WizardWindowWidget _wizard_window;

	// constructor
	public DependenciesBox(WizardWindowWidget ww){
		_wizard_window = ww;
		initialize();
	}

	// initialization
	public void initialize(){

		// layout
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("83dlu:grow"),},
				new RowSpec[] {
				//FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.NARROW_LINE_GAP_ROWSPEC,// RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		// add text area within a scrollpanel
		_txa_dependencies = new JTextArea();
		_txa_dependencies.setTabSize(3);
		_txa_dependencies.setToolTipText("Add additional dependencies here.");
		_txa_dependencies.setFont(new Font("Courier New", Font.PLAIN, 14));

		_scrollPanel = new JScrollPane();
		_scrollPanel.setViewportView(_txa_dependencies);
		add(_scrollPanel, "1, 1, 9, 1, fill, fill");
		
		// set default content
		final String DEP_CONTENT = "# SOURCES += \n# HEADERS += \n# FORMS += \n# DEPENDPATH += \n# INCLUDEPATH += \n# LIBS +=";
		setText(DEP_CONTENT);
		
		//

		// add buttons
		_but_addLibrary = new JButton("Add dynamic library");
		add(_but_addLibrary, "1, 3");
		_but_addLibrary.addActionListener(new ActionListener() {
			///
			///
			public void actionPerformed(ActionEvent arg0) {
				String path = DialogsUtils.ChooseFile(DialogsUtils.SO_DESCRIPTION, DialogsUtils.SO_EXTENSION);
				if (!path.equalsIgnoreCase("")){
					String absolutepath = path.substring(0,
							path.lastIndexOf(Defines.PATH_SEP)+1);
					String libname = path.substring(path.lastIndexOf(Defines.PATH_SEP) + 1);
					if (libname.startsWith("lib"))
						libname = libname.substring(3);
					if (libname.endsWith(".so"))
						libname = libname.substring(0,libname.length()-3);
					
					path = absolutepath;
					
					// try to do path relative
					String basedir = _wizard_window.getTestsuitesDir();
					if (!basedir.equals("")){
						path = FileSystemUtils.GetRelativePath(path, basedir);
					}
					
					// append content
					append("\n");
					append(DEPEND_PREFIX + path + "\n");
					append(LIBS_PREFIX + "-L" + path + " -l" + libname);
				}
			}
		});


		_but_addIncludes = new JButton("Add includes directory");
		add(_but_addIncludes, "3, 3");
		_but_addIncludes.addActionListener(new ActionListener() {
			///
			///
			public void actionPerformed(ActionEvent arg0) {
				String path = DialogsUtils.ChooseDir();
				if (!path.equalsIgnoreCase("")){
					// try to do path relative
					String basedir = _wizard_window.getTestsuitesDir();
					if (!basedir.equals("")){
						path = FileSystemUtils.GetRelativePath(path, basedir);
					}
					
					// append content
					append("\n");
					append(INCLUDE_PREFIX + path);
				}
			}
		});


		_but_addFile = new JButton("Add file");
		add(_but_addFile, "5, 3");
		_but_addFile.addActionListener(new ActionListener() {
			///
			///
			public void actionPerformed(ActionEvent arg0) {
				String path = DialogsUtils.ChooseFile("","");
				if (!path.equalsIgnoreCase("")){
					// try to do path relative
					String basedir = _wizard_window.getTestsuitesDir();
					if (!basedir.equals("")){
						path = FileSystemUtils.GetRelativePath(path, basedir);
					}
					
					// append content
					insertAtCaret(path);
				}
			}
		});


		_but_addDir = new JButton("Add directory");
		add(_but_addDir, "7, 3");
		_but_addDir.addActionListener(new ActionListener() {
			///
			///
			public void actionPerformed(ActionEvent arg0) {
				String path = DialogsUtils.ChooseDir();
				if (!path.equalsIgnoreCase("")){
					// try to do path relative
					String basedir = _wizard_window.getTestsuitesDir();
					if (!basedir.equals("")){
						path = FileSystemUtils.GetRelativePath(path, basedir);
					}
					
					// append content
					insertAtCaret(path);
				}
			}
		});
	}

	///
	/// overloaded methods
	///

	public void setText(String text){
		_txa_dependencies.setText(text);
	}

	public void append(String text){
		_txa_dependencies.append(text);
	}

	public void insertAtCaret(String text){
		_txa_dependencies.insert(text,_txa_dependencies.getCaretPosition());
	}

	public String getText(){
		return _txa_dependencies.getText();
	}
	
	public void setEnabled(boolean enabled){
		_scrollPanel.setEnabled(enabled);
		_txa_dependencies.setEnabled(enabled); 
		_but_addLibrary.setEnabled(enabled);
		_but_addIncludes.setEnabled(enabled);
		_but_addFile.setEnabled(enabled);
		_but_addDir.setEnabled(enabled);
	}
}
