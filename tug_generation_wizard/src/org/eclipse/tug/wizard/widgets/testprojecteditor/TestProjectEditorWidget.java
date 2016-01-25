package org.eclipse.tug.wizard.widgets.testprojecteditor;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;

import org.eclipse.tug.wizard.widgets.jtreetable.JTreeTable;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestNode;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteNode;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class TestProjectEditorWidget extends JPanel{

	public TestProjectEditorWidget(){
	}
	
	protected final int NAME_COLUMN = 0;
	protected final int ONEPANEL_COLUMN = 1;
	protected final int DESCRIPTION_COLUMN = 2;

	// uncomment for design
	///////////////////////////////////////////////////////////////////////////
	/*public TestProjectEditorWidget(){
		initializeModel();
		initialize(_tpmodel);
	}
	protected TestProjectModel _tpmodel;

	private void initializeModel() {
		//TODO
		TestsuiteNode root = new TestsuiteNode(null,"root test",true);
		TestsuiteNode ts = new TestsuiteNode(root,"ts1",true);
		TestNode test = new TestNode(ts,"test1");
		ts = new TestsuiteNode(root,"ts2",true);
		test = new TestNode(ts,"test1");
		_tpmodel = new TestProjectModel(root);
	}*/
	///////////////////////////////////////////////////////////////////////////
	

	/**
	 * 
	 */
	protected void _initialize(TestProjectModel model) {

		///
		/// layout

		fl = new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.GLUE_COLSPEC,
		},
		new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.GLUE_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC
				,});

		setLayout(fl);

		///
		/// model editor //////////////////////////////////////////////////////

		scrollPane = new JScrollPane();
		add(scrollPane, "2, 2, 7, 1, fill, fill");

		// set and configure treetable widget
		// create table and reset viewport
		treetable_testsuites = new JTreeTable(model);
		scrollPane.setViewportView(treetable_testsuites);

		// cell selection listener
		ListSelectionModel cellSelectionModel = treetable_testsuites.getSelectionModel();
		cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// handle it only once per selection
				if (!e.getValueIsAdjusting())
					treetable_testsuites_table__valueChanged(e);
			}
		});

		/// configure look
		final int COLUMN_0_WIDTH = 450;
		final int COLUMN_1_WIDTH = 140;
		final int COLUMN_2_WIDTH = 250;
		final int ROW_HEIGHT = 35;
		treetable_testsuites.setRowHeight(ROW_HEIGHT);
		treetable_testsuites.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		treetable_testsuites.getColumnModel().getColumn(0).setPreferredWidth(COLUMN_0_WIDTH);
		treetable_testsuites.getColumnModel().getColumn(0).setMinWidth(COLUMN_0_WIDTH);
		treetable_testsuites.getColumnModel().getColumn(0).setMaxWidth((int)(COLUMN_0_WIDTH*1.5));
		treetable_testsuites.getColumnModel().getColumn(1).setPreferredWidth(COLUMN_1_WIDTH);
		treetable_testsuites.getColumnModel().getColumn(1).setMinWidth(COLUMN_1_WIDTH);
		treetable_testsuites.getColumnModel().getColumn(1).setMaxWidth(COLUMN_1_WIDTH);
		treetable_testsuites.getColumnModel().getColumn(2).setPreferredWidth(COLUMN_2_WIDTH);
		treetable_testsuites.getColumnModel().getColumn(2).setMinWidth(COLUMN_2_WIDTH);
		treetable_testsuites.getColumnModel().getColumn(2).setMaxWidth(COLUMN_2_WIDTH*4);

		treetable_testsuites.getTree().setRowHeight(ROW_HEIGHT);
		treetable_testsuites.getTree().setPreferredSize(
				new Dimension(treetable_testsuites.getColumnModel().getColumn(0).getPreferredWidth(),
						treetable_testsuites.getHeight()));
		treetable_testsuites.getTree().setSize(
				treetable_testsuites.getColumnModel().getColumn(0).getWidth(),
				treetable_testsuites.getHeight());

		///
		/// configure tree look and behavior

		// set font
		treetable_testsuites.getTree().setFont(new Font("Dialog", Font.PLAIN, 15));
		// set editable
		treetable_testsuites.getTree().setEditable(true);
		// set single selection
		treetable_testsuites.getTree().getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

		// change tree icons
		ImageIcon leafIcon = new ImageIcon(
				this.getClass().getResource("/org/eclipse/tug/resources/icons/test_icon.png"));
		ImageIcon folderIcon = new ImageIcon(
				this.getClass().getResource("/org/eclipse/tug/resources/icons/ts_icon.png"));
		if (leafIcon != null) {
			DefaultTreeCellRenderer renderer = 
					new DefaultTreeCellRenderer();
			renderer.setLeafIcon(leafIcon);
			renderer.setOpenIcon(folderIcon);
			renderer.setClosedIcon(folderIcon);
			//renderer.set
			treetable_testsuites.setCellRenderer(renderer);
		}

		///
		/// buttons ///////////////////////////////////////////////////////////

		//
		but_add_test = new JButton("Add Test");
		but_add_test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_add_test__actionPerformed(arg0);
			}
		});
		but_add_test.setEnabled(false);
		add(but_add_test,"2, 4, fill, fill");

		//
		but_add_testsuite = new JButton("Add Testsuite");
		but_add_testsuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_add_testsuite__actionPerformed(arg0);
			}
		});
		but_add_testsuite.setEnabled(false);
		add(but_add_testsuite, "4, 4, fill, fill");

		//
		but_delete_item = new JButton("Delete Item");
		but_delete_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but_delete_item__actionPerformed(arg0); 
			}
		});
		but_delete_item.setEnabled(false);
		add(but_delete_item, "6, 4, fill, fill");
	}


	// handlers

	protected abstract void but_add_test__actionPerformed(ActionEvent arg0);
	protected abstract void but_add_testsuite__actionPerformed(ActionEvent arg0);
	protected abstract void but_delete_item__actionPerformed(ActionEvent arg0);
	protected abstract void treetable_testsuites_table__valueChanged(ListSelectionEvent e);

	// gui

	protected JButton but_delete_item;
	protected JButton but_add_testsuite;
	protected JButton but_add_test;
	protected JScrollPane scrollPane;
	protected JTreeTable treetable_testsuites;
	protected FormLayout fl;

	///
	/// other methods /////////////////////////////////////////////////////////
	///

	@Override
	public void setEnabled(boolean e){
		super.setEnabled(e);
		scrollPane.setEnabled(e);
		treetable_testsuites.setEnabled(e);
		// buttons always false
		but_delete_item.setEnabled(false);
		but_add_testsuite.setEnabled(false);
		but_add_test.setEnabled(false);
	}

	/**
	 * Log method
	 * 
	 * @param s
	 */
	protected static void _log(String s) {
		System.out.println(s);
	}

}
