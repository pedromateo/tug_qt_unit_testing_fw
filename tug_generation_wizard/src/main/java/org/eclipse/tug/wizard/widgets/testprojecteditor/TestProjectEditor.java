package org.eclipse.tug.wizard.widgets.testprojecteditor;

import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionEvent;
import javax.swing.tree.TreePath;

import org.eclipse.tug.utils.DialogsUtils;
import org.eclipse.tug.wizard.Defines;
import org.eclipse.tug.wizard.widgets.jtreetable.TreeTableModelAdapter;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestNode;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModel;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestProjectModelListener;
import org.eclipse.tug.wizard.widgets.testprojecteditor.model.TestsuiteNode;


public class TestProjectEditor 
extends TestProjectEditorWidget 
implements TestProjectModelListener {
	//CellEditorListener
	//TreeSelectionListener
	// TreeModelListener,
	// TableModelListener

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/// objects
	protected TestProjectModel _tpmodel;

	/// methods

	public TestProjectEditor(TestProjectModel model){
		_tpmodel = model;
		_tpmodel.addTestProjectModelListener(this);
		_initialize(_tpmodel);

		// do listeners setup
		//_tpmodel.addTreeModelListener(this);
		//treetable_testsuites.getModel().addTableModelListener(this);
		//treetable_testsuites.getTree().addTreeSelectionListener(this);
	}

	/**
	 * 
	 * @return model
	 */
	public TestProjectModel getTestProjectModel(){
		return _tpmodel;
	}

	protected void treetable_testsuites_table__valueChanged(ListSelectionEvent e){
		_log("treetable_testsuites_table__valueChanged");

		/// get selected node
		int selectedRow =  treetable_testsuites.getSelectedRow();
		int selectedColumn = treetable_testsuites.getSelectedColumn();
		TestsuiteNode tsn = null;

		// if indexes are ok, select...
		if (selectedRow >= 0 && selectedColumn >= 0){

			_lastSelectedRow = selectedRow;
			_lastSelectedColumn = selectedColumn;

			// get selected node
			tsn = _getNodeAtRow(selectedRow);
			_log("selected: (" + Integer.toString(selectedRow) + "," + Integer.toString(selectedColumn) + ")");
		}
		else
			_log("selected: (none)");

		/// check buttons enable/disable
		_checkButtons(selectedRow,selectedColumn,tsn);
	}

	/**
	 * Returns selected node in the tree.
	 * @param row
	 * @return
	 */
	private TestsuiteNode _getNodeAtRow(int row){

		Object o = ((TreeTableModelAdapter)treetable_testsuites.getModel()).getTreeNode(row);
		//Object o = treetable_testsuites.getTree().getLastSelectedPathComponent();
		// (using the commented option returns always null nodes)

		if (o != null)
			return (TestsuiteNode)o;
		else{
			_log("_getNodeAtRow::null node");
			return null;
		}
	}

	/**
	 * Returns selected node in the tree.
	 * @param row
	 * @return
	 */
	private TestsuiteNode _getSelectedNode(){

		/// remember last tree path 
		_lastSelectedRow = treetable_testsuites.getSelectedRow();
		_lastSelectedColumn = treetable_testsuites.getSelectedColumn();

		_lastSelectedTreePath = treetable_testsuites.getTree().getPathForRow(_lastSelectedRow);

		return _getNodeAtRow(_lastSelectedRow);
	}

	private void _selectLastSelectedNode(){
		treetable_testsuites.setRowSelectionInterval(_lastSelectedRow, _lastSelectedRow);
	}

	private void _selectNodeAtRow(int row){
		treetable_testsuites.setRowSelectionInterval(row, row);
	}

	TreePath _lastSelectedTreePath = null;
	int _lastSelectedRow = 0;
	int _lastSelectedColumn = 0;

	///
	/// TestProjectModelListener interface implementation ///////////////////////////
	///

	@Override
	public void nodeChanged(Object aValue, TestsuiteNode node, int column) {

		_log("nodeChanged::column " + Integer.toString(column));

		// expand node values if testsuite && not root testsuite
		if (node.isTestsuite() && !node.isRootTestsuite()){
			TestsuiteNode aux;
			// find top-parent testsuite and not root testsuite
			aux = node;
			while (aux.getParent() != null &&
					!((TestsuiteNode)aux.getParent()).isRootTestsuite()){
				aux = (TestsuiteNode)aux.getParent();
			}
			// expand all children
			_expandTestsuitePropertiesDown(node,aux);
			// repaint 
			_repaintTableAndNoSelection();
		}

		// if column 0 changed
		if (column == 0){
			// repaint tree to update fields size
			_repaintTreeAndSelectRow(_lastSelectedRow);
		}

	}

	/**
	 * 
	 * @param root
	 * @param current
	 */
	protected void _expandTestsuitePropertiesDown(TestsuiteNode original, TestsuiteNode current){
		// set values if not the same node
		if (original != current && current.isTestsuite())
			current.setIsOnepanel(original.isOnepanel());
		// expand
		for (int i = 0; i < current.getChildCount(); i++){
			TestsuiteNode aux = (TestsuiteNode)current.getChildAt(i);
			if (aux.isTestsuite())
				_expandTestsuitePropertiesDown(original,aux);
		}
	}



	///
	/// buttons ///////////////////////////////////////////////////////////////
	///


	/**
	 * 
	 * @param e
	 */
	protected void but_delete_item__actionPerformed(ActionEvent arg0){
		//
		TestsuiteNode tsn = _getSelectedNode();
		if (tsn == null){
			DialogsUtils.ShowErrorMessage(Defines.ERROR_NULL_NODE);
			return;
		}
		TestsuiteNode parent = (TestsuiteNode) tsn.getParent();
		// 

		/// if node is testsuite
		if (tsn.isTestsuite()){
			// - case 1: root testsuite can not be deleted
			if (tsn == _tpmodel.getRoot()){
				DialogsUtils.ShowErrorMessage(Defines.ERROR_ROOT_DELETE);
				return;
			}
			else if (parent != null){
				// - case 2: last testsuite of root node
				if (parent == _tpmodel.getRoot() && parent.getTestsuiteCount() <= 1){
					DialogsUtils.ShowErrorMessage(Defines.ERROR_ROOT_LAST_TESTSUITE);
					return;
				}
			}

		}
		/// if node is test
		else{
			// - case 1: last test of a testsuite (not for root node)
			if (parent != _tpmodel.getRoot() && parent.getTestCount() <= 1){
				DialogsUtils.ShowErrorMessage(Defines.ERROR_TS_LAST_TEST);
				return;
			}
		}

		// OK - we can remove testsuite or test
		_log("Node " + tsn.getName() + " removed from " + parent.getName());
		parent.removeChildAt(parent.getIndex(tsn));
		_repaintTreeAndNoSelection();

	}


	/**
	 * 
	 */
	protected void but_add_testsuite__actionPerformed(ActionEvent arg0){
		//
		TestsuiteNode tsn = _getSelectedNode();
		// 
		if (tsn != null && !tsn.isLeaf()) {
			// add only a testsuite if level < 2
			//  - level 0 = root testsuite
			//  - level 1 = first-level children
			// (this decision is because of a limitation in the generation process,
			//  as well as to prevent very complex testsuite configurations)
			int level = 0;
			TestsuiteNode aux = tsn;
			while (aux.getParent() != null){
				aux = (TestsuiteNode)aux.getParent();
				level++;
			}
			if (level < 2){
				// add a new testsuite
				TestsuiteNode tsn_new = new TestsuiteNode(tsn, "Testsuite1", false, "");
				TestNode tn_new = new TestNode(tsn_new, "test1");
				_log("Testsuite added to " + tsn.toString());

				_repaintTreeAndSelectLastNode();
			}
			else{
				DialogsUtils.ShowErrorMessage(Defines.ERROR_TS_LEVEL3);
			}
		}
		else{
			DialogsUtils.ShowErrorMessage(Defines.ERROR_NULL_NODE);
		}
	}

	/**
	 * 
	 */
	protected void but_add_test__actionPerformed(ActionEvent arg0){
		//
		TestsuiteNode tsn = _getSelectedNode();
		// 
		if (tsn != null && !tsn.isLeaf()) {
			// add a test to current testsuite
			TestNode tn_new = new TestNode(tsn, "test1");
			_log("Test added to " + tsn.toString());

			_repaintTreeAndSelectLastNode();
		}
		else{
			DialogsUtils.ShowErrorMessage(Defines.ERROR_NULL_NODE);
		}
	}


	/**
	 * Check if buttons have to be enabled or not when an element in 
	 * the table is selected.
	 * @param row
	 * @param column
	 */
	private void _checkButtons(int row, int column, TestsuiteNode node){
		if (node != null && column == 0){
			// if node is a test
			if (node.isLeaf()){
				but_delete_item.setEnabled(true);
				but_add_testsuite.setEnabled(false);
				but_add_test.setEnabled(false);
			}
			// if node is a testsuite
			else {
				but_delete_item.setEnabled(true);
				but_add_testsuite.setEnabled(true);
				but_add_test.setEnabled(true);
			}
		}
		else{
			but_delete_item.setEnabled(false);
			but_add_testsuite.setEnabled(false);
			but_add_test.setEnabled(false);
		}
	}


	///
	/// repainting ///////////////////////////////////////////////////////////////
	///

	/**
	 * 
	 */
	protected void _repaintTableAndSelectLastCell(){
		updateUI();
		//treetable_testsuites.getTree().updateUI();
		_selectLastSelectedNode();
	}

	/**
	 * 
	 */
	protected void _repaintTableAndNoSelection(){
		updateUI();
	}

	/**
	 * 
	 */
	protected void _repaintTreeAndSelectLastNode(){
		treetable_testsuites.updateUI();
		//treetable_testsuites.getTree().updateUI();
		_selectLastSelectedNode();
	}

	/**
	 * 
	 */
	protected void _repaintTreeAndSelectRow(int row){
		treetable_testsuites.updateUI();
		//treetable_testsuites.getTree().updateUI();
		_selectNodeAtRow(row);
	}

	/**
	 * 
	 */
	protected void _repaintTreeAndNoSelection(){
		treetable_testsuites.updateUI();
	}

}
