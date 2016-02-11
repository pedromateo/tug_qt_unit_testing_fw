package org.eclipse.tug.wizard.roundtrip;

import java.util.regex.Pattern;

public class RoundtripDefines {
	
	///
	/// protected regions
	///

	public static final String START_CODE = "/// >>>>>";
	public static final String END_CODE = "/// <<<<<";
	
	///
	/// is testsuite checking
	///

	public static final String IS_TESTSUITE = "(\n)class(.*?):(.*?[^\\{])public(.*?)\\{(.*?)Q_OBJECT";
	
	///
	/// test methods structure
	///

	public static final String TEST_SIGNATURE = "(\n)(\\s*)void\\s+(\\w+)\\s*\\([^\\)]*\\)\\s*\\{";
	//"(public|protected|private|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(\{?|[^;])"

	public static final String TEST_STRUCTURE = "(" + TEST_SIGNATURE
			+ "(.*?)" //"\\s*"//".*?(void){0}.*?"
			+ Pattern.quote(START_CODE) 
			+  "(.*?)" 
			+ Pattern.quote(END_CODE) + ")";
	
	///
	/// configure method structure
	///

	//public static final String CONFIGURE_SIGNATURE = "(\n)(\\s*)virtual void configure_testsuite()\\s+(\\w+)\\s*\\([^\\)]*\\)\\s*\\{";
	public static final String CONFIGURE_SIGNATURE = "(\n)(\\s*)virtual(\\s+)void(\\s+)configure_testsuite\\(\\)(\\s*)\\{";

	public static final String CONFIGURE_STRUCTURE = "(" + CONFIGURE_SIGNATURE
			+ "(.*?)" 
			+ Pattern.quote(START_CODE) 
			+  "(.*?)" 
			+ Pattern.quote(END_CODE) 
			+ ")";
	
	///
	/// finish method structure
	///

	public static final String FINISH_SIGNATURE = "(\n)(\\s*)virtual(\\s+)void(\\s+)finish_testsuite\\(\\)(\\s*)\\{";

	public static final String FINISH_STRUCTURE = "(" + FINISH_SIGNATURE
			+ "(.*?)" 
			+ Pattern.quote(START_CODE) 
			+  "(.*?)" 
			+ Pattern.quote(END_CODE) 
			+ ")";
	
	///
	/// includes structure
	///

	public static final String INCLUDES_STRUCTURE = "(\n)(\\s*)#include"
			+ "(.*?)" 
			+ Pattern.quote(START_CODE) 
			+  "(.*?)" 
			+ Pattern.quote(END_CODE)
			+  "(.*?)" 
			+ "(\n)(\\s*)class";
	
	///
	/// extensions structure
	///

	public static final String EXTENSIONS_STRUCTURE = "\\}" 
	        + "([^\\{]*)"
			+ Pattern.quote(START_CODE)
			+ "(.*?)"
			+ Pattern.quote(END_CODE) 
			+  "(.*?)"
			+ "(\\};)";
	
	///
	/// testpanel structure
	///

	public static final String TESTPANEL_STRUCTURE = "(.*?)"
			+ Pattern.quote(START_CODE) 
			+ "(.*?)"
			+ Pattern.quote(END_CODE)
			+  "(.*?)"
			+ Pattern.quote(START_CODE) 
			+ "(.*?)"
			+ Pattern.quote(END_CODE)
			+  "(.*?)";
	
	///
	///
	///

}
