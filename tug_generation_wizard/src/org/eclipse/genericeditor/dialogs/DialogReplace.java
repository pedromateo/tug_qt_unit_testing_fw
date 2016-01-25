package org.eclipse.genericeditor.dialogs;

import org.eclipse.genericeditor.EditImplFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.SearchContext;
import org.fife.ui.rtextarea.SearchEngine;

/**
 * Class used to display a JDialog with Replace options. It is quite similar to the DialogSearch, but with additional components.
 * It gives the user the option to filter by Case Sensitive, Regular Expressions, by Whole Word or even Backwards.
 */
@SuppressWarnings("serial")
public class DialogReplace extends JDialog implements ActionListener
{
	private EditImplFrame frame;
	private RSyntaxTextArea textArea;

	private JLabel lSearch;
	private JLabel lReplace;

	private JTextField fSearch;
	private JTextField fReplace;

	private JCheckBox cbCaseSensitive;
	private JCheckBox cbRegEx;
	private JCheckBox cbSearchBackward;
	private JCheckBox cbWholeWord;

	private JButton bSearch;
	private JButton bReplace;
	private JButton bReplaceAll;
	private JButton bCancel;

	private JPanel[] pCreationData;
	private JPanel centerPanel;
	private JPanel southPanel;

	private int windowHeight = 300;
	private int windowWidth = 500;

	public DialogReplace(EditImplFrame frame)
	{
		this.frame = frame;
		this.textArea = frame.getTextArea();

		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(windowWidth, windowHeight);
		setResizable(false);
		setTitle("Buscar");
		getContentPane().setLayout(new BorderLayout());

		lSearch = new JLabel("Buscar: ");
		fSearch = new JTextField();
		fSearch.setMinimumSize(new Dimension(new Double(windowWidth * 0.62).intValue(), 25));
		fSearch.setMaximumSize(new Dimension(new Double(windowWidth * 0.62).intValue(), 25));
		fSearch.setPreferredSize(new Dimension(new Double(windowWidth * 0.62).intValue(), 25));
		fSearch.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lSearch.setLabelFor(fSearch);

		lReplace = new JLabel("Reemplazar: ");
		fReplace = new JTextField();
		fReplace.setMinimumSize(new Dimension(new Double(windowWidth * 0.62).intValue(), 25));
		fReplace.setMaximumSize(new Dimension(new Double(windowWidth * 0.62).intValue(), 25));
		fReplace.setPreferredSize(new Dimension(new Double(windowWidth * 0.62).intValue(), 25));
		fReplace.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lReplace.setLabelFor(fReplace);

		cbCaseSensitive = new JCheckBox("Sensible a mayúsculas");
		cbCaseSensitive.setPreferredSize(new Dimension(200, 25));
		cbRegEx = new JCheckBox("Expresión regular");
		cbRegEx.setPreferredSize(new Dimension(200, 25));
		cbSearchBackward = new JCheckBox("Búsqueda hacia atrás");
		cbSearchBackward.setPreferredSize(new Dimension(200, 25));
		cbWholeWord = new JCheckBox("Palabra completa");
		cbWholeWord.setPreferredSize(new Dimension(200, 25));

		bSearch = new JButton("Buscar");
		bSearch.addActionListener(this);

		bReplace = new JButton("Reemplazar");
		bReplace.addActionListener(this);

		bReplaceAll = new JButton("Reemplazar todo");
		bReplaceAll.addActionListener(this);

		bCancel = new JButton("Cancelar");
		bCancel.addActionListener(this);

		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));	
		pCreationData = new JPanel[4];
		for(int i = 0; i < pCreationData.length; i++)
		{
			pCreationData[i] = new JPanel();
			pCreationData[i].setLayout(new BoxLayout(pCreationData[i], BoxLayout.X_AXIS));
			switch(i)
			{
				case 0:
				{
					pCreationData[i].add(Box.createRigidArea(new Dimension(new Double(windowWidth * 0.15).intValue(), 25)));
					pCreationData[i].add(lSearch);
					pCreationData[i].add(fSearch);
					pCreationData[i].add(Box.createHorizontalGlue());
					centerPanel.add(Box.createRigidArea(new Dimension(25, 25)));
					break;
				}
				case 1:
				{
					pCreationData[i].add(Box.createRigidArea(new Dimension(new Double(windowWidth * 0.078).intValue(), 25)));
					pCreationData[i].add(lReplace);
					pCreationData[i].add(fReplace);
					pCreationData[i].add(Box.createHorizontalGlue());
					centerPanel.add(Box.createRigidArea(new Dimension(25, 25)));
					break;
				}
				case 2:
				{
					pCreationData[i].add(Box.createRigidArea(new Dimension(new Double(windowWidth * 0.15).intValue(), 25)));
					pCreationData[i].add(cbCaseSensitive);
					pCreationData[i].add(Box.createRigidArea(new Dimension(25, 25)));
					pCreationData[i].add(cbRegEx);
					pCreationData[i].add(Box.createHorizontalGlue());
					centerPanel.add(Box.createRigidArea(new Dimension(25, 25)));
					break;
				}
				case 3:
				{
					pCreationData[i].add(Box.createRigidArea(new Dimension(new Double(windowWidth * 0.15).intValue(), 25)));
					pCreationData[i].add(cbSearchBackward);
					pCreationData[i].add(Box.createRigidArea(new Dimension(25, 25)));
					pCreationData[i].add(cbWholeWord);
					pCreationData[i].add(Box.createHorizontalGlue());
					break;
				}
			}
			centerPanel.add(pCreationData[i]);
		}
		southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));		
		southPanel.add(bSearch);
		southPanel.add(bReplace);
		southPanel.add(bReplaceAll);
		southPanel.add(bCancel);

		getContentPane().add(centerPanel, BorderLayout.CENTER);
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		getRootPane().setDefaultButton(bSearch);
		setVisible(true);
	}

	public void setVisible(boolean visible)
	{
		setLocationRelativeTo(frame);
		super.setVisible(visible);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == bCancel)
			this.dispose();

		if (fSearch.getText().length() == 0) return;

		SearchContext context = new SearchContext();
		context.setSearchFor(fSearch.getText());
		context.setMatchCase(cbCaseSensitive.isSelected());
		context.setRegularExpression(cbRegEx.isSelected());
		context.setSearchForward(!cbSearchBackward.isSelected());
		context.setWholeWord(cbWholeWord.isSelected());

		if(e.getSource() == bSearch)
		{
			if (!SearchEngine.find(textArea, context).wasFound())
				JOptionPane.showMessageDialog(frame, "Texto no encontrado");
			return;
		}
		
		if(fReplace.getText().length() == 0) return;

		context.setReplaceWith(fReplace.getText());

		if(e.getSource() == bReplace)
		{
			SearchEngine.replace(textArea, context);
			return;
		}
		if(e.getSource() == bReplaceAll)
		{
			SearchEngine.replaceAll(textArea, context).wasFound();
			return;
		}
	}
}