package org.eclipse.tug.wizard.widgets.testprojecteditor.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.event.CellEditorListener;
import javax.swing.event.EventListenerList;

import org.eclipse.tug.wizard.widgets.jtreetable.AbstractTreeTableModel;
import org.eclipse.tug.wizard.widgets.jtreetable.TreeTableModel;


public class TestProjectModel extends AbstractTreeTableModel 
implements TreeTableModel, Serializable {

	// Names of the columns.
	static protected String[]  cNames = {"Test element", "Single-panel tests", "Description"};

	// Types of the columns.
	static protected Class[]  cTypes = {TreeTableModel.class, Boolean.class, String.class};


	public TestProjectModel() { 
	}

	public TestProjectModel(TestsuiteNode root) { 
		super(root); 
	}

	// Editable types (override)
	public boolean isCellEditable(Object node, int column) { 
		
		// tree is always editable
		if (getColumnClass(column) == TreeTableModel.class)
			return true;
		
		// isOnePanel is only editable for testsuites
		if (getColumnClass(column) == Boolean.class &&
				((TestsuiteNode)node).isTestsuite())
			return true;
		
		// Description is only editable for testsuites
		if (getColumnClass(column) == String.class &&
				((TestsuiteNode)node).isTestsuite())
			return true;
		
		//
		return false; 
	}

	public String toString(){
		return _toString((TestsuiteNode)getRoot(), 0);
	} 

	protected String _toString(TestsuiteNode node, int level){
		String result = "\n";
		for (int i = 0; i < level; i++)
			result += "   ";
		result += node.getName();

		for (int i = 0; i < node.getChildCount(); i++)
			result += _toString((TestsuiteNode)node.getChildAt(i), level+1);

		return result;
	}

	//
	//  The TreeTableNode interface. 
	//

	public int getColumnCount() {
		return cNames.length;
	}

	public String getColumnName(int column) {
		return cNames[column];
	}

	public Class getColumnClass(int column) {
		return cTypes[column];
	}

	public Object getValueAt(Object node, int column) {
		TestsuiteNode tn = (TestsuiteNode)node; 
		try {
			switch(column) {
			case 0:
				return tn._name;
			case 1:
				return tn._isOnepanel;
			case 2:
				return tn._description;
			}
		}
		catch  (SecurityException se) { }
		return null; 
	}

	public void setValueAt(Object aValue, Object node, int column) {


		if (aValue == null) return;

		//System.out.println("setValueAt::aValue " + aValue.toString());
		//System.out.println("setValueAt::node " + node.toString());
		//System.out.println("setValueAt::column " + column);

		try {

			// set value
			TestsuiteNode tsn = (TestsuiteNode)node; 
			boolean changed = false;

			if (column == 0){
				tsn.setName((String)aValue);
				changed = true;
			}
			else if (column == 1 && tsn.isTestsuite() && !tsn.isRootTestsuite()){
				// exception in column 1: it can not be changed in root testsuite
				// exception in column 1: it can not be changed in tests
				tsn.setIsOnepanel((Boolean)aValue);
				changed = true;
			}
			else if (column == 2 && tsn.isTestsuite() && !tsn.isRootTestsuite()){
				// exception in column 2: it can not be changed in root testsuite
				// exception in column 2: it can not be changed in tests
				tsn.setDescription((String)aValue);
				changed = true;
			}

			// notify listeners
			if (changed)
				notifyNodeChanged(aValue, tsn, column);
		}
		catch  (SecurityException se) { }
	}


	///
	/// The TreeModel interface
	///

	@Override
	public Object getChild(Object arg0, int arg1) {
		TestsuiteNode tn = (TestsuiteNode)arg0;
		if (tn._isTestsuite){
			return tn._children.get(arg1);
		}

		return null;
	}

	@Override
	public int getChildCount(Object arg0) {
		TestsuiteNode tn = (TestsuiteNode)arg0;
		if (tn._isTestsuite){
			return tn._children.size();
		}
		return 0;
	}

	///
	/// Own listeners implementation
	///

	protected ArrayList<TestProjectModelListener> _listeners = new ArrayList();

	public void addTestProjectModelListener(TestProjectModelListener l) {
		_listeners.add(l);
	}

	public void removeTestProjectModelListener(TestProjectModelListener l) {
		_listeners.remove(l);
	}

	protected void notifyNodeChanged(Object aValue, TestsuiteNode node, int column){
		for (TestProjectModelListener l : _listeners){
			l.nodeChanged(aValue, node, column);
		}
	}
}
