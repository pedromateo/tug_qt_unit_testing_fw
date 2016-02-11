package org.eclipse.tug.wizard.widgets.testprojecteditor.model;

import java.io.Serializable;
import java.util.Vector;


public class TestNode extends TestsuiteNode implements Serializable {

	public TestNode(TestsuiteNode parent, String name) { 
		super(parent,name,parent.isOnepanel(),"",false);
	}
}
