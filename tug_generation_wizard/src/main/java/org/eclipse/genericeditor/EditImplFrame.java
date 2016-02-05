package org.eclipse.genericeditor;

import org.eclipse.genericeditor.menus.EditImplMenuBar;
import org.eclipse.genericeditor.menus.EditImplToolBar;
import org.eclipse.tug.wizard.Defines;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.print.PageFormat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

/**
 * Class used to display a Implementation Editor with the help of the RSyntaxTextArea library.
 * It extends a swing frame and installs a Toolbar as well as a Menu Bar with common options.
 * This Editor will be used to modify the implementation of a generated box.
 */
@SuppressWarnings("serial")
public class EditImplFrame extends JDialog implements WindowListener
{
	public final static String IMAGE_FOLDER = "icons" + Defines.PATH_SEP;
	
	/**
	 * Maximum screen width.
	 */
	private final static double SCREEN_WIDTH = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize().getWidth();

	/**
	 * Maximum screen height.
	 */
	private final static double SCREEN_HEIGHT = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize().getHeight();

	private PageFormat pageformat;

	/**
	 * The path of the implementation file being edited.
	 */
	private String path;

	/**
	 * The content of the implementation file before editing. Used to set the modified flag.
	 */
	private String initialText;

	/**
	 * Text area in which the implementation will be displayed.
	 */
	private RSyntaxTextArea textArea;

	/**
	 * Text area scroll container.
	 */
	private RTextScrollPane textAreaContainer;

	private JPanel panel;

	private int windowWidth = (int)SCREEN_WIDTH;
	private int windowHeight = (int)SCREEN_HEIGHT;

	/**
	 * Method used to verify if the implementation was edited.
	 * @return true if the implementation was edited, false otherwise.
	 */
	public boolean isModified(){return !textArea.getText().equals(initialText);}

	/**
	 * Get method for the Path attribute.
	 * @return The implementation file path.
	 */
	public String getPath(){return this.path;}

	/**
	 * Get method for the text area panel.
	 * @return The text area panel.
	 */
	public RSyntaxTextArea getTextArea(){return this.textArea;}

	public PageFormat getPageFormat(){return this.pageformat;}

	public void setPageFormat(PageFormat pageformat){this.pageformat = pageformat;}

	/**
	 * Default constructor which will initialize every aspect of the editor.
	 * @param fileImpl The implementation file to be edited.
	 */
	public EditImplFrame(File fileImpl, boolean modal)
	{
		path = fileImpl.getPath();
		
		//if (modal) 
		this.setModal(modal);

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(windowWidth/2, windowHeight/2);
		setTitle("Edit - " + path);
		getContentPane().setLayout(new BorderLayout());
		addWindowListener(this);

		panel = new JPanel(new BorderLayout());

		textArea = new RSyntaxTextArea(readFile(fileImpl));
		textArea.setCaretPosition(0);
		textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CPLUSPLUS);
		textArea.setCodeFoldingEnabled(true);
		textArea.setAntiAliasingEnabled(true);
		textArea.discardAllEdits();

		textAreaContainer = new RTextScrollPane(textArea);
		textAreaContainer.setFoldIndicatorEnabled(true);

		initialText = textArea.getText();

		panel.add(textAreaContainer);
		panel.add(new EditImplToolBar(this), BorderLayout.NORTH);

		getContentPane().add(panel, BorderLayout.CENTER);

		setJMenuBar(new EditImplMenuBar(this));
        setVisible(true);
        setFocus();
	}

	public Action bind(String name, final Action action, String iconUrl)
	{
		AbstractAction newAction = new AbstractAction(name, (iconUrl != null) ? new ImageIcon(EditImplFrame.class.getResource(iconUrl)) : null)
		{
			public void actionPerformed(ActionEvent e)
			{
				action.actionPerformed(new ActionEvent(this, e.getID(), e.getActionCommand()));
			}
		};

		newAction.putValue(Action.SHORT_DESCRIPTION, action.getValue(Action.SHORT_DESCRIPTION));

		return newAction;
	}

	/**
	 * Private method used to read the implementation file and return a String with the text contained. We could've used the method
	 * given by RSyntaxTextArea, but it doesn't work well with \n characters...
	 * @param file The file to be read.
	 * @return A string in which the implementation text is contained.
	 */
	private String readFile(File file)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
	
			while (line != null)
			{
				sb.append(line);
				line = br.readLine();
				if(line != null)
					sb.append("\n");
			}
			br.close();
			return sb.toString();
		}catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "No se encuentra el fichero: " + file.getPath(), "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}

	/**
	 * Private method used to set the focus on the textArea instead of the frame.
	 */
	private void setFocus()
	{
		textArea.requestFocusInWindow();
	}

	/**
	 * Method used to override the close function and ask the user if he really wants to close the editor.
	 */
	public void windowClosing(WindowEvent e)
	{
		if(!this.isModified() || JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea salir?") == JOptionPane.YES_OPTION)
			this.dispose();
		//exitValue == JOptionPane.NO_OPTION || exitValue == JOptionPane.CANCEL_OPTION => Nothing happens		
	}

	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}