package saes.interf.editor.implementationEditor.dialogs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import com.mxgraph.util.mxResources;

import saes.interf.editor.utils.Constants;

/**
 * Class used to display a JDialog with Search options.
 * It gives the user the option to filter by Case Sensitive, Regular Expressions, by Whole Word or even Backwards.
 * @author Alberto Hernández Chillón
 */
@SuppressWarnings("serial")
public class DialogSearch extends JDialog implements ActionListener
{
	private RSyntaxTextArea textArea;

	private JLabel lSearch;

	private JTextField fSearch;

	private JCheckBox cbCaseSensitive;
	private JCheckBox cbRegEx;
	private JCheckBox cbSearchBackward;
	private JCheckBox cbWholeWord;

	private JButton bSearch;
	private JButton bCancel;

	private JPanel[] pCreationData;
	private JPanel centerPanel;
	private JPanel southPanel;

	private int windowHeight = 220;
	private int windowWidth = 500;

	public DialogSearch(RSyntaxTextArea textArea)
	{
		this.textArea = textArea;

		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(windowWidth, windowHeight);
		setResizable(false);
		setTitle(mxResources.get("search"));
		getContentPane().setLayout(new BorderLayout());

		lSearch = new JLabel(mxResources.get("search") + ": ");

		fSearch = new JTextField();
		fSearch.setMinimumSize(new Dimension(new Double(windowWidth * 0.62).intValue(), Constants.DEFAULT_FIELD_HEIGHT));
		fSearch.setMaximumSize(new Dimension(new Double(windowWidth * 0.62).intValue(), Constants.DEFAULT_FIELD_HEIGHT));
		fSearch.setPreferredSize(new Dimension(new Double(windowWidth * 0.62).intValue(), Constants.DEFAULT_FIELD_HEIGHT));
		fSearch.setBorder(Constants.DEFAULT_BORDER);
		lSearch.setLabelFor(fSearch);

		cbCaseSensitive = new JCheckBox(mxResources.get("matchCase"));
		cbCaseSensitive.setPreferredSize(Constants.READWRITE_TF_DIMENSION);
		cbRegEx = new JCheckBox(mxResources.get("regEx"));
		cbRegEx.setPreferredSize(Constants.READWRITE_TF_DIMENSION);
		cbSearchBackward = new JCheckBox(mxResources.get("searchBack"));
		cbSearchBackward.setPreferredSize(Constants.READWRITE_TF_DIMENSION);
		cbWholeWord = new JCheckBox(mxResources.get("wholeWord"));
		cbWholeWord.setPreferredSize(Constants.READWRITE_TF_DIMENSION);

		bSearch = new JButton(mxResources.get("search"));
		bSearch.addActionListener(this);

		bCancel = new JButton(mxResources.get("cancel"));
		bCancel.addActionListener(this);

		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));	
		pCreationData = new JPanel[3];
		for(int i = 0; i < pCreationData.length; i++)
		{
			pCreationData[i] = new JPanel();
			pCreationData[i].setLayout(new BoxLayout(pCreationData[i], BoxLayout.X_AXIS));
			switch(i)
			{
				case 0:
				{
					pCreationData[i].add(Box.createRigidArea(new Dimension(new Double(windowWidth * 0.15).intValue(), Constants.DEFAULT_FIELD_HEIGHT)));
					pCreationData[i].add(lSearch);
					pCreationData[i].add(fSearch);
					pCreationData[i].add(Box.createHorizontalGlue());
					centerPanel.add(Constants.getStandardRigidArea());
					break;
				}
				case 1:
				{
					pCreationData[i].add(Box.createRigidArea(new Dimension(new Double(windowWidth * 0.15).intValue(), Constants.DEFAULT_FIELD_HEIGHT)));
					pCreationData[i].add(cbCaseSensitive);
					pCreationData[i].add(Constants.getStandardRigidArea());
					pCreationData[i].add(cbRegEx);
					pCreationData[i].add(Box.createHorizontalGlue());
					centerPanel.add(Constants.getStandardRigidArea());
					break;
				}
				case 2:
				{
					pCreationData[i].add(Box.createRigidArea(new Dimension(new Double(windowWidth * 0.15).intValue(), Constants.DEFAULT_FIELD_HEIGHT)));
					pCreationData[i].add(cbSearchBackward);
					pCreationData[i].add(Constants.getStandardRigidArea());
					pCreationData[i].add(cbWholeWord);
					pCreationData[i].add(Box.createHorizontalGlue());
					break;
				}
			}
			centerPanel.add(pCreationData[i]);
		}
		southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));		
		southPanel.add(bSearch);
		southPanel.add(bCancel);

		getContentPane().add(centerPanel, BorderLayout.CENTER);
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		getRootPane().setDefaultButton(bSearch);
		setVisible(true);
	}

	public void setVisible(boolean visible)
	{
		setLocationRelativeTo(textArea);
		super.setVisible(visible);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == bSearch)
		{
			if (fSearch.getText().length() == 0) return;

			SearchContext context = new SearchContext();
			context.setSearchFor(fSearch.getText());
			context.setMatchCase(cbCaseSensitive.isSelected());
			context.setRegularExpression(cbRegEx.isSelected());
			context.setSearchForward(!cbSearchBackward.isSelected());
			context.setWholeWord(cbWholeWord.isSelected());

			if (!SearchEngine.find(textArea, context).wasFound())
				JOptionPane.showMessageDialog(textArea, mxResources.get("textNotFound"));
		}
		if(e.getSource() == bCancel)
			this.dispose();
	}
}