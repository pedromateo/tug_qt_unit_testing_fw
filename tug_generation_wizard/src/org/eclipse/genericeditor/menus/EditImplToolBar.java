package org.eclipse.genericeditor.menus;

import javax.swing.BorderFactory;
import javax.swing.JToolBar;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextArea;

import org.eclipse.genericeditor.EditImplFrame;
import org.eclipse.genericeditor.EditImplActions.NewImplAction;
import org.eclipse.genericeditor.EditImplActions.SaveImplAction;
import org.eclipse.genericeditor.EditImplActions.SetEOLMarkerAction;
import org.eclipse.genericeditor.EditImplActions.MultiAction;
import org.eclipse.genericeditor.EditImplActions.SearchAction;
import org.eclipse.genericeditor.EditImplActions.ReplaceAction;
import org.eclipse.genericeditor.EditImplActions.PrintAction;

/**
 * Toolbar displayed in the editor frame.
 * It shows common options of any editor text such as Copy|Cut|Paste, Undo|Redo and Search|Replace.
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

		RSyntaxTextArea textArea = editImplFrame.getTextArea();

		add(editImplFrame.bind("New", new NewImplAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "new.gif")).setToolTipText("Nuevo");
		add(editImplFrame.bind("Save", new SaveImplAction(editImplFrame.getPath(), editImplFrame), EditImplFrame.IMAGE_FOLDER + "save.gif")).setToolTipText("Guardar");
		add(editImplFrame.bind("Print", new PrintAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "print.gif")).setToolTipText("Imprimir");

		addSeparator();

		add(editImplFrame.bind("undo", new MultiAction(textArea, RTextArea.UNDO_ACTION), EditImplFrame.IMAGE_FOLDER + "undo.gif")).setToolTipText("Deshacer");
		add(editImplFrame.bind("redo", new MultiAction(textArea, RTextArea.REDO_ACTION), EditImplFrame.IMAGE_FOLDER + "redo.gif")).setToolTipText("Rehacer");

		addSeparator();

		add(editImplFrame.bind("cut", new MultiAction(textArea, RTextArea.CUT_ACTION), EditImplFrame.IMAGE_FOLDER + "cut.gif")).setToolTipText("Cortar");
		add(editImplFrame.bind("copy", new MultiAction(textArea, RTextArea.COPY_ACTION), EditImplFrame.IMAGE_FOLDER + "copy.gif")).setToolTipText("Copiar");
		add(editImplFrame.bind("paste", new MultiAction(textArea, RTextArea.PASTE_ACTION), EditImplFrame.IMAGE_FOLDER + "paste.gif")).setToolTipText("Pegar");

		addSeparator();

		add(editImplFrame.bind("selectAll", new MultiAction(textArea, RTextArea.SELECT_ALL_ACTION), EditImplFrame.IMAGE_FOLDER + "selectAll.gif")).setToolTipText("Seleccionar todo");
		add(editImplFrame.bind("Delete", new MultiAction(textArea, RTextArea.DELETE_ACTION), EditImplFrame.IMAGE_FOLDER + "delete.gif")).setToolTipText("Eliminar");
		add(editImplFrame.bind("EOL marker", new SetEOLMarkerAction(textArea), EditImplFrame.IMAGE_FOLDER + "pilcrow.png")).setToolTipText("Marcar EOL");

		addSeparator();

		add(editImplFrame.bind("search", new SearchAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "search.gif")).setToolTipText("Buscar");
		add(editImplFrame.bind("replace", new ReplaceAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "replace.gif")).setToolTipText("Reemplazar");
	}
}