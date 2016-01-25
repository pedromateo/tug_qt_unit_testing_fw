package org.eclipse.tug.wizard.widgets.testprojecteditor.model;

public interface TestProjectModelListener {
	
	public abstract void nodeChanged(Object aValue, TestsuiteNode node, int column);

}
