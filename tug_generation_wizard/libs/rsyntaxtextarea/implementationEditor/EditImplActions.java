package saes.interf.editor.implementationEditor;

import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextArea;

import saes.interf.editor.GraphEditor;
import saes.interf.editor.implementationEditor.dialogs.DialogReplace;
import saes.interf.editor.implementationEditor.dialogs.DialogSearch;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxResources;

@SuppressWarnings("serial")
public class EditImplActions
{
	/**
	 * Action used to create an empty text area.
	 */
	public static class NewImplAction extends AbstractAction
	{
		private EditImplFrame editImplFrame;

		public NewImplAction(EditImplFrame editImplFrame)
		{
			this.editImplFrame = editImplFrame;
		}

		public void actionPerformed(ActionEvent event)
		{
			if(JOptionPane.showConfirmDialog(GraphEditor.getGraphEditor(),  mxResources.get("loseChanges")) == JOptionPane.YES_OPTION)
			{
				editImplFrame.getTextArea().setText("");
				editImplFrame.getTextArea().discardAllEdits();
			}
		}
	}

	/**
	 * Action used to save the current implementation in the implementation file.
	 */
	public static class SaveImplAction extends AbstractAction
	{
		private String path;
		private RSyntaxTextArea textArea;
		
		public SaveImplAction(String path, RSyntaxTextArea textArea)
		{
			this.path = path;
			this.textArea = textArea;
		}

		public void actionPerformed(ActionEvent event)
		{
			try
			{
				FileWriter fileWriter = new FileWriter(new File(path));
				fileWriter.write(textArea.getText());
				fileWriter.close();
				JOptionPane.showMessageDialog(GraphEditor.getGraphEditor(), mxResources.get("savedImpl"));
			}catch(IOException e)
			{
				JOptionPane.showMessageDialog(GraphEditor.getGraphEditor(), mxResources.get("IOError"), mxResources.get("error"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * Action used to ask the user if he really wants to exit the editor.
	 */
	public static class ExitImplAction extends AbstractAction
	{
		private EditImplFrame editImplFrame;
		
		public ExitImplAction(EditImplFrame editImplFrame)
		{
			this.editImplFrame = editImplFrame;
		}

		public void actionPerformed(ActionEvent event)
		{
			if(!editImplFrame.isModified() || JOptionPane.showConfirmDialog(GraphEditor.getGraphEditor(),  mxResources.get("exitNow")) == JOptionPane.YES_OPTION)
				editImplFrame.dispose();
			//exitValue == JOptionPane.NO_OPTION || exitValue == JOptionPane.CANCEL_OPTION => Nothing happens
		}
	}

	/**
	 * Action used to display the Search dialog.
	 */
	public static class SearchAction extends AbstractAction
	{
		private RSyntaxTextArea textArea;
		DialogSearch dSearch;
		
		public SearchAction(RSyntaxTextArea textArea)
		{
			this.textArea = textArea;
		}

		public void actionPerformed(ActionEvent event)
		{
			if(dSearch == null) dSearch = new DialogSearch(textArea);
			else dSearch.setVisible(true);
		}
	}

	/**
	 * Action used to display the Replace dialog.
	 */
	public static class ReplaceAction extends AbstractAction
	{
		private RSyntaxTextArea textArea;
		DialogReplace dReplace;

		public ReplaceAction(RSyntaxTextArea textArea)
		{
			this.textArea = textArea;
		}

		public void actionPerformed(ActionEvent event)
		{
			if(dReplace == null) dReplace = new DialogReplace(textArea);
			else dReplace.setVisible(true);
		}
	}

	/**
	 * Action used to enable/disable the EOL marker.
	 */
	public static class SetEOLMarkerAction extends AbstractAction
	{
		private RSyntaxTextArea textArea;

		public SetEOLMarkerAction(RSyntaxTextArea textArea)
		{
			this.textArea = textArea;
		}

		public void actionPerformed(ActionEvent event)
		{
			textArea.setEOLMarkersVisible(!textArea.getEOLMarkersVisible());
		}
	}

	/**
	 * Action used to apply a operation code to the selected text. Codes expected are:
	 * -RTextArea.COPY_ACTION.
	 * -RTextArea.CUT_ACTION.
	 * -RTextArea.DELETE_ACTION.
	 * -RTextArea.PASTE_ACTION.
	 * -RTextArea.REDO_ACTION.
	 * -RTextArea.SELECT_ALL_ACTION.
	 * -RTextArea.UNDO_ACTION.
	 */
	public static class MultiAction extends AbstractAction
	{
		private RSyntaxTextArea textArea;
		private int operationCode;

		public MultiAction(RSyntaxTextArea textArea, int operationCode)
		{
			this.textArea = textArea;
			this.operationCode = operationCode;
		}

		public void actionPerformed(ActionEvent event)
		{
			switch(operationCode)
			{
				case RTextArea.COPY_ACTION:	{textArea.copy(); break;}
				case RTextArea.CUT_ACTION: {textArea.cut(); break;}
				case RTextArea.DELETE_ACTION: {textArea.replaceSelection(""); break;}
				case RTextArea.PASTE_ACTION: {textArea.paste(); break;}
				case RTextArea.REDO_ACTION: {textArea.redoLastAction(); break;}
				case RTextArea.SELECT_ALL_ACTION: {textArea.selectAll(); break;}
				case RTextArea.UNDO_ACTION: {textArea.undoLastAction(); break;}
			}
		}
	}

	/**
	 * Action used to display the print dialog.
	 */
	public static class PrintAction extends AbstractAction
	{
		private RSyntaxTextArea textArea;

		public PrintAction(EditImplFrame frame)
		{
			this.textArea = frame.getTextArea();
		}

		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() instanceof mxGraphComponent)
			{
				mxGraphComponent graphComponent = (mxGraphComponent) e.getSource();
				PrinterJob pj = PrinterJob.getPrinterJob();

				if (pj.printDialog())
				{
					PageFormat pf = graphComponent.getPageFormat();
					Paper paper = new Paper();
					double margin = 36;
					paper.setImageableArea(margin, margin, paper.getWidth()	- margin * 2, paper.getHeight() - margin * 2);
					pf.setPaper(paper);
					pj.setPrintable(textArea, pf);

					try
					{
						// Don't delete the float cast! If done, deriveFont will change the style instead of the font size.
						textArea.setFont(textArea.getFont().deriveFont((float)(textArea.getFont().getSize() - 5)));
						pj.print();
					} catch (PrinterException e2)
					{
						JOptionPane.showMessageDialog(GraphEditor.getGraphEditor(), mxResources.get("printError"), mxResources.get("error"), JOptionPane.ERROR_MESSAGE);
					}
					textArea.setFont(textArea.getFont().deriveFont((float)(textArea.getFont().getSize() + 5)));
				}
			}
		}
	}
}