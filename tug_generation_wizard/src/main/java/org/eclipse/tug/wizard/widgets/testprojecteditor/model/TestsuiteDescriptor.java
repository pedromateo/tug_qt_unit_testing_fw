package org.eclipse.tug.wizard.widgets.testprojecteditor.model;

import java.util.LinkedList;

public class TestsuiteDescriptor {

	///
	/// constructor
	///

	public TestsuiteDescriptor(String id, String filepath, String binpath, String desc){
		_id = id;
		_filepath = filepath;
		_binpath = binpath;
		_description = desc;
	}

	///
	/// accessors
	///

	public String getId(){
		return _id;
	}

	public String getFilepath(){
		return _filepath;
	}

	public String getBinpath(){
		return _binpath;
	}

	public String getDescription(){
		return _description;
	}

	///
	/// variables
	///

	protected String _id;
	protected String _filepath;
	protected String _binpath;
	protected String _description;

}
