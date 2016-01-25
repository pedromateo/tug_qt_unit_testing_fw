package org.eclipse.tug.wizard;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.FlowLayout;

import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.JTree;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.table.TableCellRenderer;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.ToolTipManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

import java.awt.Component;

import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.wizard.widgets.dependenciesbox.DependenciesBox;
import org.eclipse.tug.wizard.widgets.jtreetable.JTreeTable;
import org.eclipse.tug.wizard.widgets.jtreetable.TreeTableModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.TestProjectEditor;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestNode;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteNode;

import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.VetoableChangeListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;


public abstract class WizardWindowWidget {

	protected JFrame frmTugGeneratorWizard;
	protected JTextField tef_panel_file;
	protected JTextField tef_gw_lib;
	protected JTextField tef_gw_classname;
	protected JTextField tef_gwpanel_parameters;
	protected JTextField tef_gw_parameters;
	protected JTextField tef_model_lib;
	protected JTextField tef_model_classname;
	protected JTextField tef_destination;

	protected JButton but_select_panel;
	protected JTextField tef_gw_file;
	protected JTextField tef_model_file;
	protected JCheckBox cbx_gprof;
	protected JCheckBox cbx_gcov;
	protected JTextField tef_panel_classname;


	protected JLabel lbl_status;
	protected JCheckBox cbx_generate_testsuites;
	protected JCheckBox cbx_include_model;
	protected JLabel lbl_31;
	protected JLabel lbl_32;
	protected JButton but_select_model_lib;
	protected JButton but_select_model_file;
	protected JLabel lbl_32a;
	protected JTextField tef_signals_lib;
	protected JTextField tef_signals_file;
	protected JTextField tef_signals_classname;
	protected JCheckBox cbx_include_signals;
	protected JLabel lbl_41;
	protected JButton but_select_signals_lib;
	protected JLabel lbl_42;
	protected JButton but_select_signals_file;
	protected JLabel lbl_44;
	protected JLabel lbl_42a;
	protected JRadioButton rdb_signals_nosignals;
	protected JRadioButton rdb_signals_boost;
	protected JRadioButton rdb_signals_libsig;
	protected DependenciesBox txa_gw_dependencies;
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_3;
	protected JTextField textField_4;
	protected JTextField textField_5;
	protected JLabel lblAddA_1;
	protected JLabel lbl_34;
	protected JScrollPane scrollPane_1;
	protected JLabel lbl_45;
	protected JScrollPane scrollPane_2;
	protected DependenciesBox txa_signals_dependencies;
	protected DependenciesBox txa_model_dependencies;
	protected JScrollPane scrollPane_3;
	protected DependenciesBox txa_extra_dependencies;

	protected JPanel pan_step1;
	protected JPanel pan_step2;
	protected JPanel pan_step3;
	protected JPanel pan_step4;
	protected JPanel pan_step5;
	protected JPanel pan_step6;
	protected JPanel pan_step7;
	protected JTabbedPane pan_top;
	protected JButton but_edit_boost_file;
	protected JButton but_bak_boost_file;
	protected JButton but_edit_libsig_file;
	protected JButton but_bak_libsig_file;
	protected JLabel lblAddA_2;
	protected JRadioButton rdb_manyt_onep;
	protected JLabel lbl_61;
	protected JRadioButton rdb_manyt_manyp;
	protected JLabel lbl_62;
	protected TestProjectEditor tpeEditor;
	protected JLabel lbl_7_1;
	protected JLabel lbl_7_2;
	protected JTextField tef_project_name;
	protected JLabel lbl_destination_folder;
	protected JButton but_menu;
	private Component horizontalStrut;
	private Component verticalStrut;
	private Component horizontalStrut_1;
	private Component verticalStrut_1;
	private Component horizontalStrut_2;
	private Component verticalStrut_2;
	private Component horizontalStrut_3;
	private Component verticalStrut_3;
	private Component horizontalStrut_4;
	private Component verticalStrut_4;
	private Component verticalStrut_5;
	private Component horizontalStrut_5;
	private Component verticalStrut_6;
	private Component horizontalStrut_6;
	protected JTextArea txa_console;
	protected JScrollPane spa_console;
	protected JLabel lbl_console_title;
	protected JLabel lblNewLabel_1;
	protected JLabel lblNewLabel;
	protected JCheckBox cbx_ui_reference;
	protected JTextField tef_ui_reference;
	protected JLabel lblNewLabel_2;
	protected JLabel lblNewLabel_4;
	protected JTextField tef_gw_builddir;
	protected JButton but_select_gw_builddir;
	protected JLabel lbl_33;
	protected JTextField tef_model_builddir;
	protected JButton but_select_model_builddir;
	protected JLabel lbl_43;
	protected JTextField tef_signals_builddir;
	protected JButton but_select_signals_builddir;
	protected JTextField tef_ui_reference_include;
	protected JButton but_ui_reference_include;
	protected JCheckBox cbx_ui_reference_include;
	protected JCheckBox cbx_no_panel_file;
	protected JLabel lbl_111;
	protected JButton but_select_gw_lib;
	protected JButton but_select_destination_directory;
	protected JButton but_previous;
	protected JButton but_next;
	protected JButton but_generate;
	protected JLabel lblNewLabel_3;
	protected JCheckBox cbx_qwt;
	protected JButton but_edit_qwt_file;
	protected JButton but_bak_qwt_file;
	protected JLabel lblNewLabel_5;
	protected JCheckBox cbx_gen_only_pro;
	protected JLabel lbl_21;
	protected JLabel lbl_22;
	protected JLabel lbl_22_cn;
	protected JLabel lbl_23;
	protected JLabel lbl_23_gp;
	protected JLabel lbl_23_pp;
	protected JLabel lbl_24;
	protected JLabel lbl_25;
	protected JLabel lbl_help_step2;
	protected JLabel lbl_help_step1;
	protected JLabel lbl_help_step3;
	protected JLabel lbl_help_step5;
	protected JLabel lbl_help_step6;
	protected JLabel lbl_help_step7;
	protected JLabel lbl_help_step4;
	protected JButton but_select_gw_file;
	private Component horizontalStrut_7;
	private Component horizontalStrut_8;
	private Component horizontalStrut_9;
	private Component horizontalStrut_10;
	private Component horizontalStrut_11;
	private Component horizontalStrut_12;
	private Component horizontalStrut_13;
	private JLabel lblAsd;



	/**
	 * Create the application.
	 */
	public WizardWindowWidget() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		frmTugGeneratorWizard = new JFrame();
		frmTugGeneratorWizard.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
				frmTugGeneratorWizard__windowStateChanged(arg0);
			}
		});

		frmTugGeneratorWizard.setBounds(100, 100, 1380, 900);
		frmTugGeneratorWizard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTugGeneratorWizard.getContentPane().setLayout(new BorderLayout(0, 0));

		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setResizeWeight(1.0);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frmTugGeneratorWizard.getContentPane().add(splitPane);

		pan_top = new JTabbedPane();
		pan_top.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				pan_top__stateChanged(arg0);
			}
		});
		pan_top.setForeground(Color.DARK_GRAY);
		pan_top.setFont(new Font("Dialog", Font.BOLD, 16));
		pan_top.setBackground(Color.LIGHT_GRAY);
		pan_top.setTabPlacement(JTabbedPane.LEFT);
		//pan_top.setPreferredSize(new Dimension(100,100)); 
		splitPane.setTopComponent(pan_top);

		///
		/// step 0
		///


		// fields 7.1 and 7.2 need to be created here before any 
		// DependenciesBox object is created.

		tef_project_name = new JTextField();
		tef_destination = new JTextField();




		///
		/// step 1
		///

		pan_step1 = new JPanel();
		pan_top.addTab("<html><p align=\"left\">Step 1: Select Qt panel to test</p></html>", null, pan_step1, null);
		pan_top.setBackgroundAt(0, Color.LIGHT_GRAY);
		pan_step1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(5dlu;pref)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(61dlu;pref):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(25dlu;default)"),
				ColumnSpec.decode("89dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(30dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("74dlu:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("80px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("33px"),
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("33px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		horizontalStrut_5 = Box.createHorizontalStrut(20);
		pan_step1.add(horizontalStrut_5, "2, 2");
		
		horizontalStrut_13 = Box.createHorizontalStrut(20);
		pan_step1.add(horizontalStrut_13, "17, 2");

		verticalStrut_5 = Box.createVerticalStrut(20);
		pan_step1.add(verticalStrut_5, "2, 3");

		JLabel lbluiFile = new JLabel("1. Select a Qt panel to test");
		lbluiFile.setFont(new Font("Ubuntu", Font.BOLD, 18));
		pan_step1.add(lbluiFile, "4, 4, 5, 1, left, top");

		lbl_help_step1 = new JLabel("");

		lblNewLabel = new JLabel("1.1. Select panel to test (*.ui file and class name expected). Please, check class name:");
		pan_step1.add(lblNewLabel, "4, 6, 10, 1");

		tef_panel_file = new JTextField();
		pan_step1.add(tef_panel_file, "6, 8, 8, 1, fill, fill");
		tef_panel_file.setEditable(false);
		tef_panel_file.setColumns(10);

		but_select_panel = new JButton("Select");
		but_select_panel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_panel__actionPerformed(arg0);
			}
		});
		pan_step1.add(but_select_panel, "15, 8, fill, top");
		cbx_no_panel_file = new JCheckBox("Check if no panel file to test (class name is mandatory):");
		pan_step1.add(cbx_no_panel_file, "6, 10, 7, 1");
		cbx_no_panel_file.setRolloverEnabled(false);//avoid change events when mouse over

		cbx_no_panel_file.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				cbx_no_panel_file__stateChanged(arg0);
			}
		});

		lbl_111 = new JLabel("Class name:");
		pan_step1.add(lbl_111, "4, 12, 3, 1, right, top");

		tef_panel_classname = new JTextField();
		tef_panel_classname.setColumns(10);
		pan_step1.add(tef_panel_classname, "8, 12, 6, 1, fill, top");

		lblNewLabel_1 = new JLabel("1.2. Private implementation support (optional):");
		pan_step1.add(lblNewLabel_1, "4, 15, 10, 1");

		cbx_ui_reference = new JCheckBox("Referenced as:");
		pan_step1.add(cbx_ui_reference, "6, 17, left, default");
		cbx_ui_reference.setRolloverEnabled(false);//avoid change events when mouse over

		cbx_ui_reference.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				cbx_ui_reference__stateChanged(arg0);
			}
		});

		tef_ui_reference = new JTextField();
		tef_ui_reference.setText("ui->"); // default value
		tef_ui_reference.setEnabled(false);
		pan_step1.add(tef_ui_reference, "8, 17, 2, 1, fill, default");
		tef_ui_reference.setColumns(10);

		cbx_ui_reference_include = new JCheckBox("Add this include:");
		pan_step1.add(cbx_ui_reference_include, "6, 19, left, default");
		cbx_ui_reference_include.setRolloverEnabled(false);//avoid change events when mouse over

		cbx_ui_reference_include.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				cbx_ui_reference_include__stateChanged(arg0);
			}
		});


		tef_ui_reference_include = new JTextField();
		pan_step1.add(tef_ui_reference_include, "8, 19, 2, 1, fill, default");
		tef_ui_reference_include.setColumns(10);
		tef_ui_reference_include.setEnabled(false);

		but_ui_reference_include = new JButton("Select");
		pan_step1.add(but_ui_reference_include, "11, 19, fill, default");
		but_ui_reference_include.setEnabled(false);

		but_ui_reference_include.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_ui_reference_include__actionPerformed(arg0);
			}
		});

		///
		/// step 2
		///

		pan_step2 = new JPanel();
		pan_top.addTab("Step 2: Add GW class", null, pan_step2, null);
		pan_step2.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("96px"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("625px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("78px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("25px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(80dlu;default):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		horizontalStrut_4 = Box.createHorizontalStrut(20);
		pan_step2.add(horizontalStrut_4, "2, 2");
		
		horizontalStrut_7 = Box.createHorizontalStrut(20);
		pan_step2.add(horizontalStrut_7, "12, 2");

		verticalStrut_4 = Box.createVerticalStrut(20);
		pan_step2.add(verticalStrut_4, "2, 4");


		lblAddA_2 = new JLabel("2. Add Qt panel implementation (i.e, a controller or Gateway if signals are used)");
		lblAddA_2.setFont(new Font("Ubuntu", Font.BOLD, 18));
		pan_step2.add(lblAddA_2, "4, 4, 5, 1");

		lbl_help_step2 = new JLabel("");

		lbl_21 = new JLabel("2.1. Panel implementation can be given packed as a library (*.so file expected)...");
		//lbl_21.setEnabled(false);
		pan_step2.add(lbl_21, "4, 6, 5, 1, fill, fill");

		tef_gw_lib = new JTextField();
		//tef_gw_lib.setEnabled(false);
		pan_step2.add(tef_gw_lib, "4, 8, 5, 1, fill, fill");
		tef_gw_lib.setEditable(false);
		tef_gw_lib.setColumns(10);

		but_select_gw_lib = new JButton("Select");
		//but_select_gw_lib.setEnabled(false);
		but_select_gw_lib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_gw_lib__actionPerformed(arg0);
			}
		});
		pan_step2.add(but_select_gw_lib, "10, 8, fill, fill");
		
		lblAsd = new JLabel("        ...or can be given as a set of dependencies (i.e., sources, headers and forms) below in step 2.5.");
		pan_step2.add(lblAsd, "4, 10, 5, 1");

		lbl_22 = new JLabel("2.2. Select the controller/GW class (*.h file and class name expected):");
		//lbl_22.setEnabled(false);
		pan_step2.add(lbl_22, "4, 12, 7, 1, fill, fill");

		tef_gw_file = new JTextField();
		//tef_gw_file.setEnabled(false);
		tef_gw_file.setEditable(false);
		tef_gw_file.setColumns(10);
		pan_step2.add(tef_gw_file, "4, 14, 5, 1, fill, fill");

		but_select_gw_file = new JButton("Select");
		//but_select_gw_file.setEnabled(false);
		but_select_gw_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_gw_file__actionPerformed(arg0);
			}
		});
		pan_step2.add(but_select_gw_file, "10, 14, fill, fill");

		lbl_22_cn = new JLabel("Class name:");
		//lbl_22_cn.setEnabled(false);
		pan_step2.add(lbl_22_cn, "4, 16, 3, 1, right, center");

		tef_gw_classname = new JTextField();
		//tef_gw_classname.setEnabled(false);
		pan_step2.add(tef_gw_classname, "8, 16, fill, fill");
		tef_gw_classname.setColumns(10);

		lbl_23 = new JLabel("2.3. Set custom parameters for Panel and controller/GW constructors (optional):");
		//lbl_23.setEnabled(false);
		pan_step2.add(lbl_23, "4, 18, 5, 1");

		lbl_23_pp = new JLabel("Panel params:");
		//lbl_23_pp.setEnabled(false);
		pan_step2.add(lbl_23_pp, "4, 20, 3, 1, right, default");

		tef_gwpanel_parameters = new JTextField();
		//tef_gwpanel_parameters.setEnabled(false);
		tef_gwpanel_parameters.setText("QWidget* parent");
		pan_step2.add(tef_gwpanel_parameters, "8, 20, fill, default");
		tef_gwpanel_parameters.setColumns(10);

		lbl_23_gp = new JLabel("GW params:");
		//lbl_23_gp.setEnabled(false);
		pan_step2.add(lbl_23_gp, "4, 22, 3, 1, right, default");

		tef_gw_parameters = new JTextField();
		//tef_gw_parameters.setEnabled(false);
		tef_gw_parameters.setText("parent");
		pan_step2.add(tef_gw_parameters, "8, 22, fill, default");
		tef_gw_parameters.setColumns(10);

		lbl_24 = new JLabel("2.4. Select the building directory if coverage analysis enabled (auto-deduced, please check):");
		//lbl_24.setEnabled(false);
		pan_step2.add(lbl_24, "4, 24, 5, 1");

		tef_gw_builddir = new JTextField();
		//tef_gw_builddir.setEnabled(false);
		pan_step2.add(tef_gw_builddir, "4, 26, 5, 1, fill, default");
		tef_gw_builddir.setColumns(10);
		tef_gw_builddir.setEditable(false);

		but_select_gw_builddir = new JButton("Select");
		//but_select_gw_builddir.setEnabled(false);
		pan_step2.add(but_select_gw_builddir, "10, 26");
		but_select_gw_builddir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_gw_builddir__actionPerformed(arg0);
			}
		});

		lbl_25 = new JLabel("2.5. Add additional dependencies in this box (relative paths if 7.1 and 7.2 are defined):");
		//lbl_25.setEnabled(false);
		pan_step2.add(lbl_25, "4, 28, 7, 1, fill, fill");

		/*JScrollPane scrollPanel = new JScrollPane();
		pan_step2.add(scrollPanel, "4, 22, 5, 1, fill, fill");

		txa_gw_dependencies = new JTextArea();
		scrollPanel.setViewportView(txa_gw_dependencies);
		txa_gw_dependencies.setTabSize(3);
		txa_gw_dependencies.setToolTipText("Add additional dependencies here.");
		txa_gw_dependencies.setFont(new Font("Courier New", Font.PLAIN, 14));

		scrollPanel.setViewportView(txa_gw_dependencies);*/

		txa_gw_dependencies = new DependenciesBox(this);
		//txa_gw_dependencies.setEnabled(false);
		pan_step2.add(txa_gw_dependencies, "4, 30, 7, 1, fill, fill");

		///
		/// step 3
		///

		pan_step3 = new JPanel();
		pan_top.addTab("Step 3: Add manager class", null, pan_step3, null);
		pan_step3.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("99px"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("612px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("78px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(80dlu;default):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		cbx_include_model = new JCheckBox("Add a model to the test project");
		cbx_include_model.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				cbx_include_model__stateChanged(arg0);
			}
		});

		horizontalStrut_3 = Box.createHorizontalStrut(20);
		pan_step3.add(horizontalStrut_3, "2, 2");
		
		horizontalStrut_12 = Box.createHorizontalStrut(20);
		pan_step3.add(horizontalStrut_12, "12, 2");

		verticalStrut_3 = Box.createVerticalStrut(20);
		pan_step3.add(verticalStrut_3, "2, 4");

		JLabel lbl_3 = new JLabel("3. Add a model (a.k.a. manager) for the selected Qt panel");
		lbl_3.setFont(new Font("Ubuntu", Font.BOLD, 18));
		pan_step3.add(lbl_3, "4, 4, 5, 1, fill, fill");

		lbl_help_step3 = new JLabel("");
		pan_step3.add(cbx_include_model, "4, 6, 7, 1, fill, fill");

		lbl_31 = new JLabel("3.1. Select the library including the model classes (*.so file expected):");
		lbl_31.setEnabled(false);
		pan_step3.add(lbl_31, "4, 8, 7, 1, left, fill");

		tef_model_lib = new JTextField();
		pan_step3.add(tef_model_lib, "4, 10, 5, 1, fill, fill");
		tef_model_lib.setEnabled(false);
		tef_model_lib.setEditable(false);
		tef_model_lib.setColumns(10);

		but_select_model_lib = new JButton("Select");
		but_select_model_lib.setEnabled(false);
		but_select_model_lib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_model_lib__actionPerformed(arg0);
			}
		});
		pan_step3.add(but_select_model_lib, "10, 10, fill, fill");

		lbl_32 = new JLabel("3.2. Select the model class to use (*.h file and class name expected):");
		lbl_32.setEnabled(false);
		pan_step3.add(lbl_32, "4, 12, 7, 1, left, fill");

		tef_model_file = new JTextField();
		tef_model_file.setEnabled(false);
		tef_model_file.setEditable(false);
		tef_model_file.setColumns(10);
		pan_step3.add(tef_model_file, "4, 14, 5, 1, fill, fill");

		but_select_model_file = new JButton("Select");
		but_select_model_file.setEnabled(false);
		but_select_model_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_model_file__actionPerformed(arg0);
			}
		});
		pan_step3.add(but_select_model_file, "10, 14, fill, fill");

		lbl_32a = new JLabel("Class name:");
		lbl_32a.setEnabled(false);
		pan_step3.add(lbl_32a, "6, 16, right, center");

		tef_model_classname = new JTextField();
		tef_model_classname.setEnabled(false);
		pan_step3.add(tef_model_classname, "8, 16, fill, fill");
		tef_model_classname.setColumns(10);

		lbl_33 = new JLabel("3.3. Select the building directory if coverage analysis enabled (auto-deduced, please check):");
		pan_step3.add(lbl_33, "4, 18, 5, 1");
		lbl_33.setEnabled(false);

		tef_model_builddir = new JTextField();
		pan_step3.add(tef_model_builddir, "4, 20, 5, 1, fill, default");
		tef_model_builddir.setColumns(10);
		tef_model_builddir.setEnabled(false);
		tef_model_builddir.setEditable(false);


		but_select_model_builddir = new JButton("Select");
		pan_step3.add(but_select_model_builddir, "10, 20");
		but_select_model_builddir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_model_builddir__actionPerformed(arg0);
			}
		});
		but_select_model_builddir.setEnabled(false);

		lbl_34 = new JLabel("3.4. Add additional dependencies in this box (relative paths if 7.1 and 7.2 are defined):");
		lbl_34.setEnabled(false);
		pan_step3.add(lbl_34, "4, 22, 7, 1, fill, fill");

		/*scrollPane_1 = new JScrollPane();
		pan_step3.add(scrollPane_1, "4, 24, 5, 1, fill, fill");

		txa_model_dependencies = new JTextArea();
		txa_model_dependencies.setEnabled(false);
		txa_model_dependencies.setToolTipText("Add additional dependencies here.");
		txa_model_dependencies.setTabSize(3);
		txa_model_dependencies.setFont(new Font("Courier New", Font.PLAIN, 14));
		scrollPane_1.setViewportView(txa_model_dependencies);*/
		txa_model_dependencies = new DependenciesBox(this);
		txa_model_dependencies.setEnabled(false);
		pan_step3.add(txa_model_dependencies, "4, 24, 7, 1, fill, fill");

		///
		/// step 4
		///

		pan_step4 = new JPanel();
		pan_top.addTab("Step 4: Add signals class", null, pan_step4, null);
		pan_step4.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("99px"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("102px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("497px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("78px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("25px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(80dlu;default):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		but_edit_libsig_file = new JButton("Check/edit config file");
		but_edit_libsig_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_edit_libsig_file__actionPerformed(arg0);
			}
		});

		but_edit_boost_file = new JButton("Check/edit config file");
		but_edit_boost_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_edit_boost_file__actionPerformed(arg0);
			}
		});

		cbx_include_signals = new JCheckBox("Add signals to the test project");
		cbx_include_signals.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cbx_include_signals__stateChanged(e);
			}
		});

		horizontalStrut_2 = Box.createHorizontalStrut(20);
		pan_step4.add(horizontalStrut_2, "2, 2");
		
		horizontalStrut_11 = Box.createHorizontalStrut(20);
		pan_step4.add(horizontalStrut_11, "14, 2");

		verticalStrut_2 = Box.createVerticalStrut(20);
		pan_step4.add(verticalStrut_2, "2, 4");

		lblAddA_1 = new JLabel("4. Configure signals to communicate GUI and model");
		lblAddA_1.setFont(new Font("Ubuntu", Font.BOLD, 18));
		pan_step4.add(lblAddA_1, "4, 4, 7, 1, fill, fill");

		lbl_help_step4 = new JLabel("");
		pan_step4.add(cbx_include_signals, "4, 6, 8, 1, fill, fill");

		lbl_41 = new JLabel("4.1. Select the library including the signals classes (*.so file expected):");
		lbl_41.setEnabled(false);
		pan_step4.add(lbl_41, "4, 8, 9, 1, left, fill");

		tef_signals_lib = new JTextField();
		tef_signals_lib.setEnabled(false);
		tef_signals_lib.setEditable(false);
		tef_signals_lib.setColumns(10);
		pan_step4.add(tef_signals_lib, "4, 10, 7, 1, fill, fill");

		but_select_signals_lib = new JButton("Select");
		but_select_signals_lib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_signals_lib__actionPerformed(arg0);
			}
		});
		but_select_signals_lib.setEnabled(false);
		pan_step4.add(but_select_signals_lib, "12, 10, fill, fill");

		lbl_42 = new JLabel("4.2. Select the signals class to use (*.h file and class name expected):");
		lbl_42.setEnabled(false);
		pan_step4.add(lbl_42, "4, 12, 9, 1, left, fill");

		tef_signals_file = new JTextField();
		tef_signals_file.setEnabled(false);
		tef_signals_file.setEditable(false);
		tef_signals_file.setColumns(10);
		pan_step4.add(tef_signals_file, "4, 14, 7, 1, fill, fill");

		but_select_signals_file = new JButton("Select");
		but_select_signals_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_signals_file__actionPerformed(arg0);
			}
		});
		but_select_signals_file.setEnabled(false);
		pan_step4.add(but_select_signals_file, "12, 14, fill, fill");

		lbl_42a = new JLabel("Class name:");
		lbl_42a.setEnabled(false);
		pan_step4.add(lbl_42a, "4, 16, 3, 1, right, center");

		tef_signals_classname = new JTextField();
		tef_signals_classname.setEnabled(false);
		tef_signals_classname.setColumns(10);
		pan_step4.add(tef_signals_classname, "8, 16, 3, 1, fill, fill");

		lbl_43 = new JLabel("4.3. Select the building directory if coverage analysis enabled (auto-deduced, please check):");
		pan_step4.add(lbl_43, "4, 18, 7, 1");
		lbl_43.setEnabled(false);

		tef_signals_builddir = new JTextField();
		pan_step4.add(tef_signals_builddir, "4, 20, 7, 1, fill, default");
		tef_signals_builddir.setColumns(10);
		tef_signals_builddir.setEnabled(false);
		tef_signals_builddir.setEditable(false);

		but_select_signals_builddir = new JButton("Select");
		pan_step4.add(but_select_signals_builddir, "12, 20");
		but_select_signals_builddir.setEnabled(false);
		but_select_signals_builddir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_signals_builddir__actionPerformed(arg0);
			}
		});

		lbl_44 = new JLabel("4.4. Select signals type:");
		lbl_44.setEnabled(false);
		pan_step4.add(lbl_44, "4, 22, 9, 1, fill, fill");

		ButtonGroup signals_group = new ButtonGroup();

		rdb_signals_nosignals = new JRadioButton("None, I will add signals manually");
		rdb_signals_nosignals.setEnabled(false);
		rdb_signals_nosignals.setSelected(true);
		pan_step4.add(rdb_signals_nosignals, "4, 24, 7, 1, left, fill");
		signals_group.add(rdb_signals_nosignals);

		rdb_signals_boost = new JRadioButton("Boost signals");
		rdb_signals_boost.setEnabled(false);
		pan_step4.add(rdb_signals_boost, "6, 26, 3, 1, left, fill");
		signals_group.add(rdb_signals_boost);
		pan_step4.add(but_edit_boost_file, "6, 28, 3, 1, right, fill");

		but_bak_boost_file = new JButton("Back to default config");
		but_bak_boost_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_bak_boost_file__actionPerformed(arg0);
			}
		});
		pan_step4.add(but_bak_boost_file, "10, 28, left, fill");

		rdb_signals_libsig = new JRadioButton("Libsig");
		rdb_signals_libsig.setEnabled(false);
		pan_step4.add(rdb_signals_libsig, "6, 30, 3, 1, fill, fill");
		signals_group.add(rdb_signals_libsig);
		pan_step4.add(but_edit_libsig_file, "6, 32, 3, 1, right, fill");

		but_bak_libsig_file = new JButton("Back to default config");
		but_bak_libsig_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_bak_libsig_file__actionPerformed(arg0);
			}
		});
		pan_step4.add(but_bak_libsig_file, "10, 32, left, fill");

		lbl_45 = new JLabel("4.5. Add additional dependencies in this box (relative paths if 7.1 and 7.2 are defined):");
		lbl_45.setEnabled(false);
		pan_step4.add(lbl_45, "4, 34, 9, 1, fill, fill");

		/*scrollPane_2 = new JScrollPane();
		pan_step4.add(scrollPane_2, "4, 36, 7, 1, fill, fill");

		txa_signals_dependencies = new JTextArea();
		txa_signals_dependencies.setEnabled(false);
		txa_signals_dependencies.setToolTipText("Add additional dependencies here.");
		txa_signals_dependencies.setTabSize(3);
		txa_signals_dependencies.setFont(new Font("Courier New", Font.PLAIN, 14));
		scrollPane_2.setViewportView(txa_signals_dependencies);*/
		txa_signals_dependencies = new DependenciesBox(this);
		txa_signals_dependencies.setEnabled(false);
		pan_step4.add(txa_signals_dependencies, "4, 36, 9, 1, fill, fill");

		///
		/// step 5
		///

		pan_step5 = new JPanel();
		pan_top.addTab("Step 5: Other testing options", null, pan_step5, null);

		pan_step5.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("216px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("609px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(80dlu;default):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		JButton but_edit_tuglib_file = new JButton("Check/edit config file");
		but_edit_tuglib_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_edit_tuglib_file__actionPerformed(arg0);
			}
		});

		JButton but_edit_gprof_file = new JButton("Check/edit config file");
		but_edit_gprof_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_edit_gprof_file__actionPerformed(arg0);
			}
		});

		JButton but_edit_gcov_file = new JButton("Check/edit config file");
		but_edit_gcov_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_edit_gcov_file__actionPerformed(arg0);
			}
		});

		horizontalStrut_1 = Box.createHorizontalStrut(20);
		pan_step5.add(horizontalStrut_1, "2, 2");
		
		horizontalStrut_10 = Box.createHorizontalStrut(20);
		pan_step5.add(horizontalStrut_10, "10, 2");

		verticalStrut_1 = Box.createVerticalStrut(20);
		pan_step5.add(verticalStrut_1, "2, 4");

		JLabel lblSelectOther = new JLabel("5. Select other options for the test project");
		lblSelectOther.setFont(new Font("Ubuntu", Font.BOLD, 18));
		pan_step5.add(lblSelectOther, "4, 4, 3, 1, left, fill");

		lbl_help_step5 = new JLabel("");
		pan_step5.add(lbl_help_step5, "8, 4");

		JLabel lblEnableCoverage_1 = new JLabel("5.1. Enable coverage analysis (Gcov):");
		pan_step5.add(lblEnableCoverage_1, "4, 6, 3, 1, left, fill");

		cbx_gcov = new JCheckBox("GCov enabled");
		pan_step5.add(cbx_gcov, "4, 8, fill, fill");
		pan_step5.add(but_edit_gcov_file, "4, 10, right, fill");

		JButton but_bak_gcov_file = new JButton("Back to default config");
		but_bak_gcov_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_bak_gcov_file__actionPerformed(arg0);
			}
		});
		pan_step5.add(but_bak_gcov_file, "6, 10, left, fill");

		JLabel lblEnableCoverage = new JLabel("5.2. Enable profiling analysis (Gprof):");
		pan_step5.add(lblEnableCoverage, "4, 12, 3, 1, left, fill");

		cbx_gprof = new JCheckBox("GProf enabled");
		pan_step5.add(cbx_gprof, "4, 14, fill, fill");
		pan_step5.add(but_edit_gprof_file, "4, 16, right, fill");

		JButton but_bak_gprof_file = new JButton("Back to default config");
		but_bak_gprof_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_bak_gprof_file__actionPerformed(arg0);
			}
		});
		pan_step5.add(but_bak_gprof_file, "6, 16, left, fill");

		lblNewLabel_3 = new JLabel("5.3. Add support for Qwt widgets:");
		pan_step5.add(lblNewLabel_3, "4, 18, 3, 1");

		cbx_qwt = new JCheckBox("Qwt enabled");
		pan_step5.add(cbx_qwt, "4, 20");

		but_edit_qwt_file = new JButton("Check/edit config file");
		but_edit_qwt_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_edit_qwt_file__actionPerformed(arg0);
			}
		});
		pan_step5.add(but_edit_qwt_file, "4, 22, right, default");

		but_bak_qwt_file = new JButton("Back to default config");
		but_bak_qwt_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_bak_qwt_file__actionPerformed(arg0);
			}
		});
		pan_step5.add(but_bak_qwt_file, "6, 22, left, default");

		JLabel lblAddAdditional_1 = new JLabel("5.4. Add additional dependencies in this box (relative paths if 7.1 and 7.2 are defined):");
		pan_step5.add(lblAddAdditional_1, "4, 24, 3, 1, fill, fill");

		/*JScrollPane scrollPane = new JScrollPane();
		pan_step5.add(scrollPane, "4, 20, 3, 1, fill, fill");

		txa_extra_dependencies = new JTextArea();
		txa_extra_dependencies.setToolTipText("Add additional dependencies here.");
		txa_extra_dependencies.setTabSize(3);
		txa_extra_dependencies.setFont(new Font("Courier New", Font.PLAIN, 14));
		scrollPane.setViewportView(txa_extra_dependencies);*/
		txa_extra_dependencies = new DependenciesBox(this);
		pan_step5.add(txa_extra_dependencies, "4, 26, 5, 1, fill, fill");

		JLabel lblCheckOr = new JLabel("5.5. Check or edit TUGLib includes:");
		pan_step5.add(lblCheckOr, "4, 28, 3, 1, left, fill");
		pan_step5.add(but_edit_tuglib_file, "4, 30, right, fill");

		JButton but_bak_tuglib_file = new JButton("Back to default config");
		but_bak_tuglib_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_bak_tuglib_file__actionPerformed(arg0);
			}
		});
		pan_step5.add(but_bak_tuglib_file, "6, 30, left, fill");

		///
		/// step 6
		///

		pan_step6 = new JPanel();
		pan_top.addTab("Step 6: Testsuite configuration", null, pan_step6, null);
		pan_step6.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("16px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("136px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("137px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("516px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		cbx_generate_testsuites = new JCheckBox("Generate test suites");
		cbx_generate_testsuites.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cbx_generate_testsuites__actionPerformed(arg0);
			}
		});

		horizontalStrut = Box.createHorizontalStrut(20);
		pan_step6.add(horizontalStrut, "2, 2");
		
		horizontalStrut_9 = Box.createHorizontalStrut(20);
		pan_step6.add(horizontalStrut_9, "14, 2");

		verticalStrut = Box.createVerticalStrut(20);
		pan_step6.add(verticalStrut, "2, 4");



		JLabel lblAddA = new JLabel("6. Configure and generate a test suite project");
		lblAddA.setFont(new Font("Ubuntu", Font.BOLD, 18));
		pan_step6.add(lblAddA, "4, 4, 7, 1, left, fill");

		lbl_help_step6 = new JLabel("");
		pan_step6.add(lbl_help_step6, "12, 4");
		pan_step6.add(cbx_generate_testsuites, "4, 6, 7, 1, fill, fill");

		tpeEditor = null;
		/*tpeEditor = new TestProjectEditor();
			tpeEditor.setEnabled(false);
			pan_step6.add(tpeEditor, "5, 8, 6, 1, fill, fill");*/


		///
		/// step 7
		///

		pan_step7 = new JPanel();
		pan_top.addTab("Step 7: Project generation", null, pan_step7, null);
		pan_step7.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("708px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("80px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(141dlu;default):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		horizontalStrut_6 = Box.createHorizontalStrut(20);
		pan_step7.add(horizontalStrut_6, "2, 2");
		
		horizontalStrut_8 = Box.createHorizontalStrut(20);
		pan_step7.add(horizontalStrut_8, "10, 2");

		verticalStrut_6 = Box.createVerticalStrut(20);
		pan_step7.add(verticalStrut_6, "2, 4");

		JLabel lbl_7 = new JLabel("7. Finish configuration and generate project");
		lbl_7.setFont(new Font("Ubuntu", Font.BOLD, 18));
		pan_step7.add(lbl_7, "4, 4, 3, 1, fill, fill");

		lbl_help_step7 = new JLabel("");

		lbl_7_1 = new JLabel("7.1. Name of the test project:");
		pan_step7.add(lbl_7_1, "5, 6, 2, 1");



		//tef_project_name = new JTextField(); // created above
		tef_project_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tef_project_name__actionPerformed(arg0);
			}
		});
		pan_step7.add(tef_project_name, "5, 8, 2, 1, fill, default");
		tef_project_name.setColumns(10);

		lbl_7_2 = new JLabel("7.2. Select project destination:");
		pan_step7.add(lbl_7_2, "5, 10, 2, 1");

		//tef_destination = new JTextField(); // created above
		pan_step7.add(tef_destination, "5, 12, 2, 1, fill, fill");
		tef_destination.setEditable(false);
		tef_destination.setColumns(10);

		but_select_destination_directory = new JButton("Select");
		but_select_destination_directory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_select_destination_directory__actionPerformed(arg0);
			}
		});
		pan_step7.add(but_select_destination_directory, "8, 12, fill, fill");

		lbl_destination_folder = new JLabel("New label");
		lbl_destination_folder.setEnabled(false);
		pan_step7.add(lbl_destination_folder, "6, 14");

		txa_console = new JTextArea();
		txa_console.setForeground(Color.LIGHT_GRAY);
		txa_console.setFont(new Font("Console", Font.PLAIN, 15));
		txa_console.setBackground(Color.BLACK);
		spa_console = new JScrollPane(txa_console);
		txa_console.setVisible(false);
		spa_console.setVisible(false);

		lbl_console_title = new JLabel("Generation output:");
		lbl_console_title.setVisible(false);

		lblNewLabel_5 = new JLabel("7.3. Other generation options:");
		pan_step7.add(lblNewLabel_5, "5, 16, 2, 1");

		cbx_gen_only_pro = new JCheckBox("Generate only project files (*.pro)  if testsuites already exist");
		pan_step7.add(cbx_gen_only_pro, "6, 18");

		pan_step7.add(lbl_console_title, "5, 20, 2, 1");
		//pan_step7.add(txa_console, "5, 16, 2, 1, fill, fill");
		pan_step7.add(spa_console, "5, 22, 4, 1, fill, fill");




		JPanel pan_bottom = new JPanel();
		splitPane.setRightComponent(pan_bottom);
		pan_bottom.setLayout(new BoxLayout(pan_bottom, BoxLayout.X_AXIS));

		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setResizeWeight(1.0);
		pan_bottom.add(splitPane_2);

		JPanel pan_bottom_left = new JPanel();
		splitPane_2.setLeftComponent(pan_bottom_left);
		pan_bottom_left.setLayout(new BoxLayout(pan_bottom_left, BoxLayout.X_AXIS));

		JLabel lblStatusaa = new JLabel("  Status: ");
		pan_bottom_left.add(lblStatusaa);
		lblStatusaa.setHorizontalAlignment(SwingConstants.LEFT);
		lblStatusaa.setBackground(Color.WHITE);
		lblStatusaa.setForeground(Color.BLACK);
		lblStatusaa.setFont(new Font("Dialog", Font.BOLD, 13));

		lbl_status = new JLabel("Ready");
		pan_bottom_left.add(lbl_status);
		lbl_status.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_status.setForeground(Color.DARK_GRAY);
		// enable ... when label is shorter than text
		lbl_status.setMinimumSize(new Dimension(10,0));

		JPanel pan_bottom_right = new JPanel();
		splitPane_2.setRightComponent(pan_bottom_right);

		but_previous = new JButton("Go Back");
		but_previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_previous__actionPerformed(arg0);
			}
		});
		pan_bottom_right.add(but_previous);

		but_next = new JButton("Next Step");
		but_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_next__actionPerformed(arg0);
			}
		});
		pan_bottom_right.add(but_next);

		but_generate = new JButton("Generate");
		but_generate.setBackground(new Color(255, 239, 213));
		pan_bottom_right.add(but_generate);
		but_generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_generate__actionPerformed(arg0);
			}
		});

		/*JButton but_exit = new JButton("Exit Wizard");
			but_exit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					but_exit__actionPerformed(arg0);
				}
			});
			pan_bottom_right.add(but_exit);*/

		///
		/// popup menu
		///

		// create the popup menu.
		final JPopupMenu popup = new JPopupMenu();
		popup.add(new JMenuItem(new AbstractAction("Load TUG project") {
			public void actionPerformed(ActionEvent e) {
				but_load_project__actionPerformed(e);
			}
		}));
		popup.add(new JMenuItem(new AbstractAction("Save TUG project") {
			public void actionPerformed(ActionEvent e) {
				but_save_project__actionPerformed(e);
			}
		}));
		popup.add(new JMenuItem(new AbstractAction("Save TUG project as...") {
			public void actionPerformed(ActionEvent e) {
				but_save_as_project__actionPerformed(e);
			}
		}));
		popup.addSeparator();
		popup.add(new JMenuItem(new AbstractAction("Exit") {
			public void actionPerformed(ActionEvent e) {
				but_exit__actionPerformed(e);
			}
		}));

		// create button
		but_menu = new JButton("");
		pan_bottom_right.add(but_menu);
		but_menu.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Point p = but_menu.getLocation();
				Point dest = new Point();
				dest.x = 0 - popup.getPreferredSize().width + but_menu.getWidth();
				dest.y = 0 - popup.getPreferredSize().height;
				popup.show(but_menu,dest.x,dest.y);
			}
		});
		ImageIcon menuIcon = new ImageIcon(
				this.getClass().getResource("/org/eclipse/tug/resources/icons/menu_icon_mobileversion.png"));
		but_menu.setIcon(menuIcon);

		// set fixed size to bottom-left and bottom-right panel
		Dimension blp_dim = new Dimension(120,(int)(pan_bottom_left.getMinimumSize().getHeight()));
		pan_bottom_left.setMinimumSize(blp_dim);
		Dimension brp_dim = new Dimension(330,(int)(pan_bottom_right.getMinimumSize().getHeight()));
		pan_bottom_right.setMinimumSize(brp_dim);
		pan_bottom_right.setMaximumSize(brp_dim);

		///
		/// tab names
		///
		
		final String PRE_HTML = "<html><p style=\"text-align: left; width: 230px\">"; 
		final String POST_HTML = "</p></html>"; 
		
		// tab names for the funding company
		if (WizardWindow.SAES_VERSION){
			pan_top.setTitleAt(0, PRE_HTML + "Step 1: Qt panel to test" + POST_HTML);
			pan_top.setTitleAt(1, PRE_HTML + "Step 2: Gateway" + POST_HTML);
			pan_top.setTitleAt(2, PRE_HTML + "Step 3: Manager (op.)" + POST_HTML);
			pan_top.setTitleAt(3, PRE_HTML + "Step 4: Signals (op.)" + POST_HTML);
			pan_top.setTitleAt(4, PRE_HTML + "Step 5: Other testing options" + POST_HTML);
			pan_top.setTitleAt(5, PRE_HTML + "Step 6: Testsuites configuration" + POST_HTML);
			pan_top.setTitleAt(6, PRE_HTML + "Step 7: Project generation" + POST_HTML);
		}
		// tab names for the rest of the world
		else {
			pan_top.setTitleAt(0, PRE_HTML + "Step 1: Qt panel to test" + POST_HTML);
			pan_top.setTitleAt(1, PRE_HTML + "Step 2: Panel implementation" + POST_HTML);
			pan_top.setTitleAt(2, PRE_HTML + "Step 3: Model (op.)" + POST_HTML);
			pan_top.setTitleAt(3, PRE_HTML + "Step 4: Signals (op.)" + POST_HTML);
			pan_top.setTitleAt(4, PRE_HTML + "Step 5: Other testing options" + POST_HTML);
			pan_top.setTitleAt(5, PRE_HTML + "Step 6: Testsuites configuration" + POST_HTML);
			pan_top.setTitleAt(6, PRE_HTML + "Step 7: Project generation" + POST_HTML);
		}


		///
		/// help icons
		///

		// help icon configuration
		ImageIcon helpIcon = new ImageIcon(WizardWindowWidget.class.getResource("/org/eclipse/tug/resources/icons/help_icon.png"));
		Image helpImg = helpIcon.getImage() ;  
		helpImg = helpImg.getScaledInstance( 25, 25,  java.awt.Image.SCALE_SMOOTH ) ;  
		helpIcon = new ImageIcon(helpImg);

		// configure tooltip manager for fixed tooltips
		ToolTipManager.sharedInstance().setDismissDelay(Integer.MAX_VALUE);		

		// fill step 1
		lbl_help_step1.setIcon(helpIcon);
		pan_step1.add(lbl_help_step1, "15, 4, right, default");
		lbl_help_step1.setToolTipText("<html>"
				+ "In this step, information about the <b>Qt panel to test</b> is provided.<br>"
				//+ "In MVC pattern, the Qt panel is the view.<br>"
				+ "Normally, Qt panels are <b>defined in a *.ui file</b>.In case the panel is defined<br>"
				+ "within a <b>C++ class</b>, you have to check this option and provide a class name.<br>"
				+ "<b>Private implementation</b> pattern is supported as well."
				+ "</html>");

		// fill step 2
		lbl_help_step2.setIcon(helpIcon);
		pan_step2.add(lbl_help_step2, "10, 4, right, default");
		lbl_help_step2.setToolTipText("<html>In this step, the implementation of the panel is given. The panel implementation is<br>"
				+ "often included into a controller class (or GW if signals are used) that <b>connects the<br>GUI and the model</b>.<br>"
				//+ "In MVC pattern, this element is the controller.<br>"
				+ "Qt often uses a *.cpp and a *.h file to implement the GUI controller.<br>"
				+ "The controller usually uses the model directly. However, the controller can also use<br>"
				+ "signals, sockets or another mechanism to allow communication with the model.<br>"
				+ "If <b>signals</b> is your choice, you can do additional configuration in <b>Step 4</b>.<br>"
				+ "The generated <b>test panel</b> will inherit from this controller.</html>");

		// fill step 3
		lbl_help_step3.setIcon(helpIcon);
		pan_step3.add(lbl_help_step3, "10, 4, right, default");
		lbl_help_step3.setToolTipText("<html>(Optional)<br>"
				+ "A manager (or <b>model</b>) is used to manage data, logic and rules of the application<br>"
				//+ "In MVC pattern, this element is the controller.<br>"
				+ ""
				+ "</html>");

		// fill step 4
		lbl_help_step4.setIcon(helpIcon);
		pan_step4.add(lbl_help_step4, "12, 4, right, default");
		lbl_help_step4.setToolTipText("<html>(Optional)<br>"
				+ "If you use <b>signals</b> in your application, different options can be configured here."
				+ "</html>");

		// fill step 5
		lbl_help_step5.setIcon(helpIcon);
		lbl_help_step5.setToolTipText("<html>"
				+ "Several testing options can be configured in this step.<br>"
				+ "<b>Coverage</b> and <b>profiling</b> can be included in the final summary.<br>"
				+ "<b>Qwt widgets</b> are supported as well.<br>"
				+ "As in previous steps, <b>additional dependencies</b> can be added to the generated<br>"
				+ "Qt testing projects. In this case, dependencies are added for all projects.<br>"
				+ "Finally, includes for testing library <b>TUGLib</b> can be configured in Step 5.5. The<br>"
				+ "location of TUGLib was selected during the installation process."
				+ "</html>");

		// fill step 6
		lbl_help_step6.setIcon(helpIcon);
		lbl_help_step6.setToolTipText("<html>(Optional)"
				+ "In this step you can create a test project.<br>"
				+ "A <b>test project</b> is composed of a set of test suites, each of them composed<br>"
				+ "of a set of tests.<br>"
				+ "Test suites can be <b>single-panel</b>, which means that all tests are executed<br>"
				+ "sequentially on the same panel instance. Otherwise, each test will be executed<br>"
				+ "in a new panel instance.<br>"
				+ "<b>Description</b> will be used in the final test report."
				+ "</html>");

		// fill step 7
		lbl_help_step7.setIcon(helpIcon);
		pan_step7.add(lbl_help_step7, "8, 4, right, default");
		lbl_help_step7.setToolTipText("<html>"
				+ "In this step we need to select the name of the test project, as well as<br>"
				+ "the place where to store it.<br>"
				+ "Other <b>generation options</b> can be also selected in this step."
				+ "</html>");
	}

	/*
	 * METHODS TO BE OVERRIDED
	 */

	protected abstract void but_select_panel__actionPerformed(ActionEvent arg0);
	protected abstract void cbx_ui_reference__stateChanged(ChangeEvent e);
	protected abstract void but_ui_reference_include__actionPerformed(ActionEvent arg0);
	protected abstract void cbx_no_panel_file__stateChanged(ChangeEvent e);
	protected abstract void cbx_ui_reference_include__stateChanged(ChangeEvent e);



	protected abstract void but_select_gw_lib__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_gw_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_gw_builddir__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_model_lib__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_model_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_model_builddir__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_destination_directory__actionPerformed(ActionEvent arg0);

	protected abstract void but_generate__actionPerformed(ActionEvent arg0);

	protected abstract void cbx_generate_testsuites__actionPerformed(ActionEvent arg0);
	protected abstract void cbx_include_model__stateChanged(ChangeEvent e);
	protected abstract void cbx_include_signals__stateChanged(ChangeEvent e);

	protected abstract void but_select_signals_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_signals_lib__actionPerformed(ActionEvent arg0);
	protected abstract void but_select_signals_builddir__actionPerformed(ActionEvent arg0);
	protected abstract void but_previous__actionPerformed(ActionEvent arg0);
	protected abstract void but_next__actionPerformed(ActionEvent arg0);
	protected abstract void but_exit__actionPerformed(ActionEvent arg0);
	protected abstract void but_load_project__actionPerformed(ActionEvent arg0);
	protected abstract void but_save_project__actionPerformed(ActionEvent arg0);
	protected abstract void but_save_as_project__actionPerformed(ActionEvent arg0);

	protected abstract void but_edit_gcov_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_bak_gcov_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_edit_gprof_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_bak_gprof_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_edit_qwt_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_bak_qwt_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_edit_tuglib_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_bak_tuglib_file__actionPerformed(ActionEvent arg0);


	protected abstract void but_edit_boost_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_bak_boost_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_edit_libsig_file__actionPerformed(ActionEvent arg0);
	protected abstract void but_bak_libsig_file__actionPerformed(ActionEvent arg0); 

	protected abstract void pan_top__stateChanged(ChangeEvent arg0);
	protected abstract void frmTugGeneratorWizard__windowStateChanged(WindowEvent arg0);


	protected abstract void tef_project_name__actionPerformed(ActionEvent arg0);




	///
	/// supporting methods
	///



	public String getGenerationDir(){

		String base = tef_destination.getText();
		String proy = tef_project_name.getText();

		if (base.equals("") || proy.equals(""))
			return "";
		else{
			return base.endsWith(Defines.PATH_SEP)? base + proy : 
				base + Defines.PATH_SEP + proy + Defines.PATH_SEP;
		}
	}

	public String getTestsuitesDir(){

		String gendir = getGenerationDir();

		if (gendir.equals(""))
			return "";
		else{
			return gendir += "tests" + Defines.PATH_SEP + "foo_ts" + Defines.PATH_SEP;
		}
	}



	///
	/// other supporting methods
	///

	public static void _log(String s) {
		System.out.println(s);
	}

	public static void _sleep(double secs) {
		try {
			Thread.sleep((int)(secs * 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

