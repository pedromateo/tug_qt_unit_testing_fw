package org.eclipse.tug.wizard.widgets.testprojecteditor.model;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.tree.TreeNode;

import sun.awt.geom.AreaOp.AddOp;


public class TestsuiteNode implements TreeNode, Serializable, Enumeration {

	public TestsuiteNode(TestsuiteNode parent, String name, boolean onepanel, String description) { 
		this(parent, name, onepanel, description, true);
	}

	public TestsuiteNode(TestsuiteNode parent, String name, 
			boolean onepanel, String description, boolean isTestsuite) { 

		_isTestsuite = isTestsuite;
		_parent = parent;
		this.setIsOnepanel(onepanel);
		this.setDescription(description);
		_children = new LinkedList<TestsuiteNode>();

		/// if I have parent, add me as a children
		/// (testsuites first, then include tests)
		boolean added = false;
		if (parent != null){
			if (_isTestsuite){
				for (int i = 0; i < parent.getChildCount(); i++){
					if (((TestsuiteNode)parent._children.get(i)).isTest()){
						parent._children.add(i,this);
						added = true;
						break;
					}
				}
			}
			if (!added)//in case it is a test or the last testsuite
				parent._children.add(this);
		}

		/// set unique name
		this.setName(name); 
	}
	
	/// //////////////////////////////////////////////

	public void setName(String name){
		_name = _checkName(name); 
	}

	public String getName(){
		return _name;
	}

	public void setDescription(String desc){
		_description = desc; 
	}

	public String getDescription(){
		return _description;
	}

	public void setIsOnepanel(boolean b){
		// only for testsuites
		if (_isTestsuite)
			_isOnepanel = b; 
		else
			_isOnepanel = false;
	}

	public boolean isOnepanel(){
		return _isOnepanel;
	}

	public boolean isTestsuite(){
		return _isTestsuite;
	}

	public boolean isTest(){
		return !_isTestsuite;
	}

	public boolean isRootTestsuite(){
		return _parent == null;
	}

	public boolean isBranchStart(){
		return _parent.isRootTestsuite();
	}

	public int getTestsuiteCount(){
		int c = 0;
		if (_isTestsuite)
			for (int i = 0; i < _children.size(); i++)
				if (!_children.get(i).isLeaf()) c++;
		return c;
	}

	public int getTestCount(){
		int c = 0;
		if (_isTestsuite)
			for (int i = 0; i < _children.size(); i++)
				if (_children.get(i).isLeaf()) c++;
		return c;
	}

	public String toString(){
		return _name;
	}

	///
	/// variables
	///

	protected LinkedList<TestsuiteNode> _children;
	protected boolean _isTestsuite;
	protected TestsuiteNode _parent;
	protected String _name;
	protected boolean _isOnepanel;
	protected String _description;

	///
	/// name cheking
	///

	protected String _checkName(String name){

		String resultname = name;

		////////////////////////////////////////////////////
		/// check name content

		// no extra spaces
		resultname = resultname.trim();
		//It can not start with a number
		if (Character.isDigit(resultname.charAt(0)))
			resultname = "_" + resultname;
		// no spaces between
		resultname = resultname.replace(' ','_');
		// Can be composed of letters, numbers, underscore, universal character
		// names1 and implementation defined characters
		resultname = resultname.replaceAll("[^\\p{L}\\p{Nd}\\_]+", "");
		//Can not be a keyword.
		// TODO
		// no empty name
		if (resultname.equals(""))
			resultname = "test";

		////////////////////////////////////////////////////
		/// check name uniqueness

		/// if I am a testsuite, check that my name is unique
		/// among all testsuites in the model

		if (_isTestsuite){
			// go to root
			TestsuiteNode root = this;
			while (root.getParent() != null){
				root = (TestsuiteNode) root.getParent();
			}

			// check testsuite name
			while (!_checkTestsuiteUniqueName(root, resultname))
				resultname = _nextName(resultname);
		}

		/// if I am a test, check that my name is unique
		/// among my brothers

		else{
			// check testsuite name
			while (!_checkTestUniqueName(resultname))
				resultname = _nextName(resultname);
		}

		//
		return resultname;
	}

	/**
	 * Checks that the name of a testsuite is unique within a testsuites tree.
	 * @param node
	 * @param _name
	 * @return
	 */
	private boolean _checkTestsuiteUniqueName(TestsuiteNode node, String myname){

		//System.out.println("checking " + node.getName() + " vs " + myname);

		// if not a testsuite, name is unique
		if (!node.isTestsuite()) return true;

		// if node is me, no problem
		if (node == this) return true;

		// if node is another, check node name
		if (node.getName().equals(myname)) return false;

		// check children names
		for (int i = 0; i < node.getChildCount(); i++)
			if (_checkTestsuiteUniqueName((TestsuiteNode) node.getChildAt(i), myname) == false)
				return false;

		// no problem
		return true;
	}

	/**
	 * Checks that the name of a test is unique among its brothers.
	 * @param node
	 * @param name
	 * @return
	 */
	private boolean _checkTestUniqueName(String name){

		if (_parent != null && _parent._children.size() > 0){
			for (int i = 0; i < _parent._children.size(); i++){
				if (_parent._children.get(i) != this && 
						_parent._children.get(i)._name.equals(name))
					return false;
			}
		}
		//
		return true;
	}

	/**
	 * Gets next name using an integer as suplement.
	 * @param name
	 * @return
	 */
	private String _nextName(String name){

		Integer i = 1;

		// ends with a digit?
		if (Character.isDigit(name.charAt(name.length()-1))){
			i = Integer.parseInt(Character.toString(name.charAt(name.length()-1))); 
			name = name.substring(0,name.length()-1);
		}

		return name + Integer.toString(++i);
	}

	///
	/// TreeNode implementation
	///

	@Override
	public boolean getAllowsChildren() {
		return _isTestsuite;
	}

	@Override
	public TreeNode getChildAt(int arg0) {
		return _children.get(arg0);
	}

	@Override
	public int getChildCount() {
		return _children.size();
	}

	@Override
	public int getIndex(TreeNode arg0) {
		return _children.indexOf(arg0);
	}

	@Override
	public TreeNode getParent() {
		return _parent;
	}

	@Override
	public boolean isLeaf() {
		return !_isTestsuite;
	}

	@Override
	public Enumeration children() {
		_enumIterator = _children.iterator();
		return this;
	}




	///
	/// Enumeration interface implementation
	///

	private Iterator<TestsuiteNode> _enumIterator = null;

	@Override
	public boolean hasMoreElements() {
		if (_enumIterator != null){
			return _enumIterator.hasNext();
		}
		return false;
	}

	@Override
	public Object nextElement() {
		if (_enumIterator != null){
			return _enumIterator.next();
		}
		return null;
	}

	///
	/// additional methods
	///

	public TreeNode removeChildAt(int arg0) {
		return _children.remove(arg0);
	}
}
