package saes.interf.editor.implementationEditor.menus;

import javax.swing.BorderFactory;
import javax.swing.JToolBar;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextArea;

import saes.interf.editor.GraphEditor;
import saes.interf.editor.utils.Constants;
import saes.interf.editor.implementationEditor.EditImplFrame;
import saes.interf.editor.implementationEditor.EditImplActions.NewImplAction;
import saes.interf.editor.implementationEditor.EditImplActions.SaveImplAction;
import saes.interf.editor.implementationEditor.EditImplActions.SetEOLMarkerAction;
import saes.interf.editor.implementationEditor.EditImplActions.MultiAction;
import saes.interf.editor.implementationEditor.EditImplActions.SearchAction;
import saes.interf.editor.implementationEditor.EditImplActions.ReplaceAction;
import saes.interf.editor.implementationEditor.EditImplActions.PrintAction;

import com.mxgraph.util.mxResources;

/**
 * Toolbar displayed in the editor frame.
 * It shows common options of any editor text such as Copy|Cut|Paste, Undo|Redo and Search|Replace.
 * @author Alberto Hernández Chillón
 */
@SuppressWarnings("serial")
public class EditImplToolBar extends JToolBar
{

	/**
	 * Main constructor in charge of creating the toolbar menu. It binds the actions to the icons of the supported operations.
	 * @param editImplFrame The implementation frame in which the toolbar will be displayed.
	 */
	public EditImplToolBar(EditImplFrame editImplFrame)
	{
		super();
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3), getBorder()));
		setFloatable(false);

		GraphEditor editor = GraphEditor.getGraphEditor();
		RSyntaxTextArea textArea = editImplFrame.getTextArea();

		add(editor.bind("New", new NewImplAction(editImplFrame), Constants.IMAGE_FOLDER + "new.gif")).setToolTipText(mxResources.get("new"));
		add(editor.bind("Save", new SaveImplAction(editImplFrame.getPath(), textArea), Constants.IMAGE_FOLDER + "save.gif")).setToolTipText(mxResources.get("save"));
		add(editor.bind("Print", new PrintAction(editImplFrame), Constants.IMAGE_FOLDER + "print.gif")).setToolTipText(mxResources.get("print"));

		addSeparator();

		add(editor.bind("undo", new MultiAction(textArea, RTextArea.UNDO_ACTION), Constants.IMAGE_FOLDER + "undo.gif")).setToolTipText(mxResources.get("undo"));
		add(editor.bind("redo", new MultiAction(textArea, RTextArea.REDO_ACTION), Constants.IMAGE_FOLDER + "redo.gif")).setToolTipText(mxResources.get("redo"));

		addSeparator();

		add(editor.bind("cut", new MultiAction(textArea, RTextArea.CUT_ACTION), Constants.IMAGE_FOLDER + "cut.gif")).setToolTipText(mxResources.get("cut"));
		add(editor.bind("copy", new MultiAction(textArea, RTextArea.COPY_ACTION), Constants.IMAGE_FOLDER + "copy.gif")).setToolTipText(mxResources.get("copy"));
		add(editor.bind("paste", new MultiAction(textArea, RTextArea.PASTE_ACTION), Constants.IMAGE_FOLDER + "paste.gif")).setToolTipText(mxResources.get("paste"));

		addSeparator();

		add(editor.bind("selectAll", new MultiAction(textArea, RTextArea.SELECT_ALL_ACTION), Constants.IMAGE_FOLDER + "selectAll.gif")).setToolTipText(mxResources.get("selectAll"));
		add(editor.bind("Delete", new MultiAction(textArea, RTextArea.DELETE_ACTION), Constants.IMAGE_FOLDER + "delete.gif")).setToolTipText(mxResources.get("delete"));
		add(editor.bind("EOL marker", new SetEOLMarkerAction(textArea), Constants.IMAGE_FOLDER + "pilcrow.png")).setToolTipText(mxResources.get("setEOLMarker"));

		addSeparator();

		add(editor.bind("search", new SearchAction(textArea), Constants.IMAGE_FOLDER + "search.gif")).setToolTipText(mxResources.get("search"));
		add(editor.bind("replace", new ReplaceAction(textArea), Constants.IMAGE_FOLDER + "replace.gif")).setToolTipText(mxResources.get("replace"));
	}
}