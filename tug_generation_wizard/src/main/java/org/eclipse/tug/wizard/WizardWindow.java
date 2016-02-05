package org.eclipse.tug.wizard;

import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;

import org.eclipse.splash.UISplashScreen;

public class WizardWindow extends WizardWindowGen{

	///////////////////////////////////////////////////////////////////////////
	final static String TUG_VERSION = "1.8.4";
	final static boolean TESTING_MODE = false;
	final static boolean JUST_TESTING = false;
	final static boolean SAES_VERSION = false;
	///////////////////////////////////////////////////////////////////////////

	/*
	// Here we create a unique temp directory. 
	// It will be used along the application

	public static String TUG_TMP_DIR = "";

	try {
		// setting up a temp directory to work with
		TUG_TMP_DIR = Files.createTempDirectory("tug").toString();
		//System.out.println("TMP Path: " + TUG_TMP_DIR);
		File file = new File(TUG_TMP_DIR);
		file.deleteOnExit();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 */
	///////////////////////////////////////////////////////////////////////////


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// some previous data
		final String TUG_TITLE = "TUG Wizard v" + TUG_VERSION + " - catedrasaes.org";
		
		// create splash screen and messages (do not show in testing mode)
		final String splashMsg1 = "TUG v" + TUG_VERSION + " :: Initializing TUG data.";
		final String splashMsg2 = "TUG v" + TUG_VERSION + " :: Loading Qt model utilities.";
		final String splashMsg3 = "TUG v" + TUG_VERSION + " :: Launching TUG wizard application.";
		if (!TESTING_MODE){
			URL urlToImage = WizardWindow.class.getClassLoader().getResource("images/splash/tug_splash.png");
			//System.out.println(urlToImage.getPath());
			//Image spimage = ImageIO.read(urlToImage);
			UISplashScreen.splash(
					urlToImage, 
					TUG_TITLE, 
					3);
			_sleep(0.3);
			UISplashScreen.updateBarProgress(splashMsg1);
			_sleep(0.5);
		}

		
		///
		///
		///
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {*/
				try {

					if (JUST_TESTING){
						Test_WizardWindow.JustTesting();
						return;
					}

					// create wizard app
					WizardWindow window = null;

					if (TESTING_MODE)
						window = new Test_WizardWindow();
					else
						window = new WizardWindow();

					// initialize and launch
					if (!TESTING_MODE){
						UISplashScreen.updateBarProgress(splashMsg2);
						_sleep(0.5);
					}
					window.frmTugGeneratorWizard.setTitle(TUG_TITLE);

					if (!TESTING_MODE){
						UISplashScreen.updateBarProgress(splashMsg3);
						_sleep(0.5);
					}
					window.initializeAppearanceAndGUIContent();

				    window.frmTugGeneratorWizard.setVisible(true);
					if (!TESTING_MODE) 
						UISplashScreen.disposeSplash();

				} catch (Exception e) {
					e.printStackTrace();
				}
		/*	}
		});*/
	}

}
