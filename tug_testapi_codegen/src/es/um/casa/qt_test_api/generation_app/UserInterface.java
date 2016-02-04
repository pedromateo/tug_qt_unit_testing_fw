package es.um.casa.qt_test_api.generation_app;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public abstract class UserInterface {

	protected JFrame frame;
	protected JTextField text_single_file;
	protected JTextField text_input_directory;
	protected JTextField text_output_directory;
	protected JButton button_browse_single_file;
	protected JRadioButton radio_single_file;
	protected JButton button_browse_input_directory;
	protected JRadioButton radio_directory;
	protected JButton button_browse_output_directory;
	protected JButton button_generate;
	protected JLabel label_step2;
	protected JLabel label_step3;
	protected JLabel label_result;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		text_single_file = new JTextField();
		text_single_file.setEditable(false);
		text_single_file.setBounds(47, 66, 380, 19);
		frame.getContentPane().add(text_single_file);
		text_single_file.setColumns(10);

		button_browse_single_file = new JButton("Browse");
		button_browse_single_file.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button_browse_single_file__mouseClicked(e);
			}
		});
		button_browse_single_file.setBounds(439, 63, 117, 25);
		frame.getContentPane().add(button_browse_single_file);

		JLabel lblStepSelect = new JLabel("Step 1: Select input file or directory");
		lblStepSelect.setBounds(12, 12, 355, 15);
		frame.getContentPane().add(lblStepSelect);

		radio_single_file = new JRadioButton("Single *.ui file");
		radio_single_file.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				radio_single_file__itemStateChanged(arg0);
			}
		});
		radio_single_file.setBounds(22, 35, 149, 23);
		frame.getContentPane().add(radio_single_file);

		text_input_directory = new JTextField();
		text_input_directory.setEditable(false);
		text_input_directory.setColumns(10);
		text_input_directory.setBounds(47, 124, 380, 19);
		frame.getContentPane().add(text_input_directory);

		button_browse_input_directory = new JButton("Browse");
		button_browse_input_directory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button_browse_input_directory__mouseClicked(e);
			}
		});
		button_browse_input_directory.setBounds(439, 121, 117, 25);
		frame.getContentPane().add(button_browse_input_directory);

		radio_directory = new JRadioButton("Directory including *.ui files");
		radio_directory.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				radio_directory__itemStateChanged(arg0);
			}
		});
		radio_directory.setBounds(22, 93, 263, 23);
		frame.getContentPane().add(radio_directory);

		label_step2 = new JLabel("Step 2: Select output directory");
		label_step2.setBounds(12, 183, 291, 15);
		frame.getContentPane().add(label_step2);

		text_output_directory = new JTextField();
		text_output_directory.setEditable(false);
		text_output_directory.setColumns(10);
		text_output_directory.setBounds(22, 213, 405, 19);
		frame.getContentPane().add(text_output_directory);

		button_browse_output_directory = new JButton("Browse");
		button_browse_output_directory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button_browse_output_directory__mouseClicked(e);
			}
		});
		button_browse_output_directory.setBounds(439, 210, 117, 25);
		frame.getContentPane().add(button_browse_output_directory);

		label_step3 = new JLabel("Step 3: Generate C++ classes");
		label_step3.setBounds(12, 264, 310, 15);
		frame.getContentPane().add(label_step3);

		button_generate = new JButton("Generate");
		button_generate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button_generate__mouseClicked(e);
			}
		});
		button_generate.setBounds(22, 291, 117, 25);
		frame.getContentPane().add(button_generate);

		label_result = new JLabel("put result here");
		label_result.setForeground(Color.GRAY);
		label_result.setBounds(157, 296, 407, 15);
		frame.getContentPane().add(label_result);

		///
		///
		/// widget post-initialization
		postInitialization();
		
		_log("GUI Initialized.");
	}

	///
	/// methods that can be override
	///

	protected abstract void postInitialization();

	protected abstract void button_browse_single_file__mouseClicked(MouseEvent e);

	protected abstract void radio_single_file__itemStateChanged(ItemEvent arg0);
	
	protected abstract void button_browse_input_directory__mouseClicked(MouseEvent e);
	
	protected abstract void radio_directory__itemStateChanged(ItemEvent arg0);
	
	protected abstract void button_browse_output_directory__mouseClicked(MouseEvent e);
	
	protected abstract void button_generate__mouseClicked(MouseEvent e);
	

	///
	///
	///

	/**
	 * Log method
	 * 
	 * @param s
	 */
	public static void _log(String s) {
		System.out.println(s);
	}

}
