package org.eclipse.splash;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * Class used to display a splash screen while loading the main application.
 * The splash screen given by Java is quite useless in this case since it is
 * loaded from an external file while creating the jar.
 * This way we implement our own splash screen with a progress bar on it.
 * This progress bar will display the steps loaded while the application is starting.
 */
@SuppressWarnings("serial")
public class UISplashScreen extends JFrame
{
	/**
	 * The maximum number of steps of loading of our application.
	 */
	private static int MAX_STEPS;

	/**
	 * Private instance of the splash screen. Singleton.
	 */
	private static UISplashScreen instance;

	/**
	 * The progress bar to be displayed in the splash screen frame showing the loading progress.
	 */
	private JProgressBar progressBar;

	/**
	 * Default private constructor. It will display a frame with the image given as
	 * a parameter and a progress bar.
	 * @param image The image to be displayed as a splash image.
	 */
	private UISplashScreen(Image image, String appTitle)
	{
		super();
		setLayout(new BorderLayout());
		setTitle(appTitle);
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(image));
		label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		progressBar = new JProgressBar(0, MAX_STEPS);
		progressBar.setStringPainted(true);

		add(label, BorderLayout.CENTER);
		add(progressBar, BorderLayout.SOUTH);

		setUndecorated(true);
		pack();
		setLocationRelativeTo(null);
	}

	/**
	 * The static method used to update the progress bar one step and
	 * show an explicit message telling the user the step he/she is in.
	 * @param message The message to be displayed on the progress bar.
	 */
	public static void updateBarProgress(String message)
	{
		int step = instance.progressBar.getValue();
		if (step < MAX_STEPS){
			instance.progressBar.setValue(step + 1);
			instance.progressBar.setString(message);
			//_refreshSplash();
		}
	}

	/**
	 * Main call used to create the splash screen as a singleton and load the splash image.
	 * @param imageURL The url where the image may be found.
	 */
	public static void splash(URL imageURL, String appTitle, int steps)
	{
		if (instance == null && imageURL != null)
		{
			MAX_STEPS = steps;
			instance = new UISplashScreen(Toolkit.getDefaultToolkit().createImage(imageURL), appTitle);
			instance.setVisible(true);
		}
	}

	/**
	 * Method used to dispose the splash screen once the application is done loading elements.
	 */
	public static void disposeSplash()
	{
		instance.setVisible(false);
		instance.dispose();
	}

	/**
	 * 
	 */
	private static void _refreshSplash(){
		instance.invalidate();
		instance.validate();
		instance.repaint();
	}
}
