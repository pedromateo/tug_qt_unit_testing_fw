package saes.interf.editor.implementationEditor.menus;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextArea;

import saes.interf.editor.GraphEditor;
import saes.interf.editor.utils.Constants;
import saes.interf.editor.implementationEditor.EditImplFrame;
import saes.interf.editor.implementationEditor.EditImplActions.ExitImplAction;
import saes.interf.editor.implementationEditor.EditImplActions.NewImplAction;
import saes.interf.editor.implementationEditor.EditImplActions.SaveImplAction;
import saes.interf.editor.implementationEditor.EditImplActions.SearchAction;
import saes.interf.editor.implementationEditor.EditImplActions.ReplaceAction;
import saes.interf.editor.implementationEditor.EditImplActions.SetEOLMarkerAction;
import saes.interf.editor.implementationEditor.EditImplActions.MultiAction;
import saes.interf.editor.actions.EditorActions.PageSetupAction;
import saes.interf.editor.implementationEditor.EditImplActions.PrintAction;

import com.mxgraph.util.mxResources;

/**
 * Menu bar displayed in the Implementation Editor.
 * It shows common options of any editor text such as Copy|Cut|Paste, Undo|Redo and Search|Replace.
 * @author Alberto Hernández Chillón
 */
@SuppressWarnings("serial")
public class EditImplMenuBar extends JMenuBar
{
	private RSyntaxTextArea textArea;

	/**
	 * Main constructor in charge of creating the menu bar. It binds the actions to the options of the supported operations.
	 * @param editImplFrame The implementation frame in which the menu bar will be displayed.
	 */
	public EditImplMenuBar(EditImplFrame editImplFrame)
	{
		JMenu menu = null;
		GraphEditor editor = GraphEditor.getGraphEditor();

		textArea = editImplFrame.getTextArea();

		//Creates the file menu
		menu = add(new JMenu(mxResources.get("file")));

		menu.add(editor.bind(mxResources.get("new"), new NewImplAction(editImplFrame), Constants.IMAGE_FOLDER + "new.gif"));
		menu.add(editor.bind(mxResources.get("save"), new SaveImplAction(editImplFrame.getPath(), textArea), Constants.IMAGE_FOLDER + "save.gif"));
		menu.addSeparator();
		menu.add(editor.bind(mxResources.get("pageSetup"), new PageSetupAction(), Constants.IMAGE_FOLDER + "pagesetup.gif"));
		menu.add(editor.bind(mxResources.get("print"), new PrintAction(editImplFrame), Constants.IMAGE_FOLDER + "print.gif"));
		menu.addSeparator();
		menu.add(editor.bind(mxResources.get("exit"), new ExitImplAction(editImplFrame)));

		//Creates the edit menu
		menu = add(new JMenu(mxResources.get("edit")));

		menu.add(editor.bind(mxResources.get("undo"), new MultiAction(textArea, RTextArea.UNDO_ACTION), Constants.IMAGE_FOLDER + "undo.gif"));
		menu.add(editor.bind(mxResources.get("redo"), new MultiAction(textArea, RTextArea.REDO_ACTION), Constants.IMAGE_FOLDER + "redo.gif"));
		menu.addSeparator();
		menu.add(editor.bind(mxResources.get("cut"), new MultiAction(textArea, RTextArea.CUT_ACTION), Constants.IMAGE_FOLDER + "cut.gif"));
		menu.add(editor.bind(mxResources.get("copy"), new MultiAction(textArea, RTextArea.COPY_ACTION), Constants.IMAGE_FOLDER + "copy.gif"));
		menu.add(editor.bind(mxResources.get("paste"), new MultiAction(textArea, RTextArea.PASTE_ACTION), Constants.IMAGE_FOLDER + "paste.gif"));
		menu.addSeparator();
		menu.add(editor.bind(mxResources.get("selectAll"), new MultiAction(textArea, RTextArea.SELECT_ALL_ACTION), Constants.IMAGE_FOLDER + "selectAll.gif"));
		menu.add(editor.bind(mxResources.get("delete"), new MultiAction(textArea, RTextArea.DELETE_ACTION), Constants.IMAGE_FOLDER + "delete.gif"));
		menu.add(editor.bind(mxResources.get("setEOLMarker"), new SetEOLMarkerAction(textArea), Constants.IMAGE_FOLDER + "pilcrow.png"));

		//Creates the search menu
		menu = add(new JMenu(mxResources.get("search")));

		menu.add(editor.bind(mxResources.get("search"), new SearchAction(textArea), Constants.IMAGE_FOLDER + "search.gif"));
		menu.add(editor.bind(mxResources.get("replace"), new ReplaceAction(textArea), Constants.IMAGE_FOLDER + "replace.gif"));
	}
}