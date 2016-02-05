package org.eclipse.genericeditor.menus;


import javax.swing.JMenu;
import javax.swing.JMenuBar;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextArea;

import org.eclipse.genericeditor.EditImplFrame;
import org.eclipse.genericeditor.EditImplActions.ExitImplAction;
import org.eclipse.genericeditor.EditImplActions.NewImplAction;
import org.eclipse.genericeditor.EditImplActions.SaveImplAction;
import org.eclipse.genericeditor.EditImplActions.SearchAction;
import org.eclipse.genericeditor.EditImplActions.ReplaceAction;
import org.eclipse.genericeditor.EditImplActions.SetEOLMarkerAction;
import org.eclipse.genericeditor.EditImplActions.MultiAction;
import org.eclipse.genericeditor.EditImplActions.PageSetupAction;
import org.eclipse.genericeditor.EditImplActions.PrintAction;


/**
 * Menu bar displayed in the Implementation Editor.
 * It shows common options of any editor text such as Copy|Cut|Paste, Undo|Redo and Search|Replace.
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

		textArea = editImplFrame.getTextArea();

		//Creates the file menu
		menu = add(new JMenu("Archivo"));

		menu.add(editImplFrame.bind("Nuevo", new NewImplAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "new.gif"));
		menu.add(editImplFrame.bind("Guardar", new SaveImplAction(editImplFrame.getPath(), editImplFrame), EditImplFrame.IMAGE_FOLDER + "save.gif"));
		menu.addSeparator();
		menu.add(editImplFrame.bind("Configurar página", new PageSetupAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "pagesetup.gif"));
		menu.add(editImplFrame.bind("Imprimir", new PrintAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "print.gif"));
		menu.addSeparator();
		menu.add(editImplFrame.bind("Salir", new ExitImplAction(editImplFrame), null));

		//Creates the edit menu
		menu = add(new JMenu("Editar"));

		menu.add(editImplFrame.bind("Deshacer", new MultiAction(textArea, RTextArea.UNDO_ACTION), EditImplFrame.IMAGE_FOLDER + "undo.gif"));
		menu.add(editImplFrame.bind("Rehacer", new MultiAction(textArea, RTextArea.REDO_ACTION), EditImplFrame.IMAGE_FOLDER + "redo.gif"));
		menu.addSeparator();
		menu.add(editImplFrame.bind("Cortar", new MultiAction(textArea, RTextArea.CUT_ACTION), EditImplFrame.IMAGE_FOLDER + "cut.gif"));
		menu.add(editImplFrame.bind("Copiar", new MultiAction(textArea, RTextArea.COPY_ACTION), EditImplFrame.IMAGE_FOLDER + "copy.gif"));
		menu.add(editImplFrame.bind("Pegar", new MultiAction(textArea, RTextArea.PASTE_ACTION), EditImplFrame.IMAGE_FOLDER + "paste.gif"));
		menu.addSeparator();
		menu.add(editImplFrame.bind("Seleccionar todo", new MultiAction(textArea, RTextArea.SELECT_ALL_ACTION), EditImplFrame.IMAGE_FOLDER + "selectAll.gif"));
		menu.add(editImplFrame.bind("Eliminar", new MultiAction(textArea, RTextArea.DELETE_ACTION), EditImplFrame.IMAGE_FOLDER + "delete.gif"));
		menu.add(editImplFrame.bind("Marcar EOL", new SetEOLMarkerAction(textArea), EditImplFrame.IMAGE_FOLDER + "pilcrow.png"));

		//Creates the search menu
		menu = add(new JMenu("Buscar"));

		menu.add(editImplFrame.bind("Buscar", new SearchAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "search.gif"));
		menu.add(editImplFrame.bind("Reemplazar", new ReplaceAction(editImplFrame), EditImplFrame.IMAGE_FOLDER + "replace.gif"));
	}
}