package org.eclipse.acceleo.qt_testsuite.run;

import java.io.File;
import java.util.ArrayList;

import org.casa.dsltesting.TestsuiteModel.Test;
import org.casa.dsltesting.TestsuiteModel.Testsuite;
import org.casa.dsltesting.TestsuiteModel.impl.TestsuiteModelFactoryImpl;
import org.eclipse.acceleo.qt_testsuite.generator.main.GenerateMain;
import org.eclipse.acceleo.qt_testsuite.generator.main.GenerateTestsuite;
import org.eclipse.emf.common.util.BasicMonitor;


public class TestGeneration { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		final String gendir = "/tmp/genoutput";
		File fgendir = new File(gendir);

		// create model
		TestsuiteModelFactoryImpl tsfactory = new TestsuiteModelFactoryImpl();
		Testsuite root = tsfactory.createTestsuite();
		root.setName("rootts");
		//
		Testsuite ts = tsfactory.createTestsuite();
		ts.setName("ts1");
		Test t = tsfactory.createTest();
		t.setName("test1");
		ts.getTests().add(t);
		root.getChildren().add(ts);
		//
		ts = tsfactory.createTestsuite();
		ts.setName("ts2");
		t = tsfactory.createTest();
		t.setName("test2");
		ts.getTests().add(t);
		root.getChildren().add(ts);
		
		// args
		
		ArrayList<String> arguments = new ArrayList<String>();
		// base class
		//arguments.add("classnameaaa");
		//arguments.add("filename.h");
		//arguments.add("filename.h");

		///
		/// generation process

		try {
			
			// create generator
			GenerateMain tsgen = new GenerateMain(root, fgendir, arguments); 
			// launch generation
			tsgen.doGenerate(new BasicMonitor());
			
			
			//TestsuiteGenProcess.main(root, gendir, arguments);
			//TestsuiteGenerator.GenFromObject(root, fgendir,arguments);
			
			//Generate generator = new Generate(root, fgendir, arguments);
			//generator.doGenerate(new BasicMonitor());
			
			System.out.println("Generation done.");

		} catch (Exception exc) {
			System.out.println("Generation process failed. " + exc.toString());
			exc.printStackTrace();
			return;
		}
	}

}

