package org.eclipse.tug.wizard.roundtrip;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.tug.utils.FileSystemUtils;
import org.eclipse.tug.wizard.Defines;


public class RoundtripUtils {

	/// logging stuff ////////////////////////
	private static boolean DO_LOG = false;
	private static void _log(String s) {
		if (DO_LOG) System.out.println(s);
	}
	/// //////////////////////////////////////


	/**
	 * 
	 * @param dirpath
	 * @return
	 */
	static public RoundtripData ParseTestsuitesDirectory(String dirpath, RoundtripData data){

		_log("Roundtrip testsuites: Attempting directory: " + dirpath);

		if (data == null) 
			data = new RoundtripData();

		// for each *.hpp file in the directory
		File[] files = new File(dirpath).listFiles();
		if (files != null){
			for (File file : files) {
				if (file.isDirectory()) {
					_log("Roundtrip: Avoiding directory: " + file.getName());
					// Calls same method again.
				} else {

					// ends with *.hpp?
					if (file.getName().endsWith(Defines.TESTSUITE_FILE_EXTENSION)){
						System.out.println("Roundtripping File: " + file.getName());

						///
						/// get file content
						///

						String content = "";

						try {
							content = FileSystemUtils.FileToString(file);
						} catch (IOException e) {
							e.printStackTrace();
							// continue to next file
							continue;
						}

						String p = "";
						Pattern MY_PATTERN = null; 
						Matcher matcher = null;

						///
						/// check that is a testsuite and get testsuite name
						///

						boolean is_testsuite = false;
						String tsname = "";
						p = RoundtripDefines.IS_TESTSUITE;
						MY_PATTERN = Pattern.compile(p, Pattern.DOTALL);
						matcher = MY_PATTERN.matcher(content);
						if (matcher.find()) {

							_log("Is testsuite");
							/*_log("-- " + matcher.group(0)); // everything
							_log("-- " + matcher.group(1)); // 
							_log("-- " + matcher.group(2)); // ts name
							_log("-- " + matcher.group(3)); // 
							_log("-- " + matcher.group(4)); // parent class name*/

							is_testsuite = true;
							tsname = matcher.group(2).trim();
						}

						///
						/// if testsuite, look for methods name and code
						///

						if (is_testsuite){

							///
							/// look for tests
							///

							p = RoundtripDefines.TEST_STRUCTURE;

							MY_PATTERN = Pattern.compile(p, Pattern.DOTALL);
							matcher = MY_PATTERN.matcher(content);
							while (matcher.find()) {

								// get method name
								String method_name = matcher.group(4).trim();
								// get code
								String code = _trimCode(matcher.group(6));
								// add method to RoundtripData
								data.addMethod(tsname, method_name, code);

								_log("----------------------------");
								_log(" Test Name: " + tsname.trim() + "::" + method_name.trim());
								_log(" Test Code: " + code);
								_log("----------------------------");
							}


							///
							/// look for configuration methods
							///

							p = RoundtripDefines.CONFIGURE_STRUCTURE;

							MY_PATTERN = Pattern.compile(p, Pattern.DOTALL);
							matcher = MY_PATTERN.matcher(content);
							while (matcher.find()) {
								// get code
								String code = _trimCode(matcher.group(8));
								// add method to RoundtripData
								data.addConfigure(tsname, code);

								_log("----------------------------");
								_log(" Config method: " + tsname.trim());
								_log(" Config Code: " + code);
								_log("----------------------------");
							}


							///
							/// look for finish methods
							///

							p = RoundtripDefines.FINISH_STRUCTURE;

							MY_PATTERN = Pattern.compile(p, Pattern.DOTALL);
							matcher = MY_PATTERN.matcher(content);
							while (matcher.find()) {

								/*System.out.println("Matched >>");
								for (int i = 1; i < matcher.groupCount() + 1; i++){
									_log("---------------------------- G" + String.valueOf(i));
									String s = matcher.group(i);
									System.out.println(s);
									_log("----------------------------");
								}
								System.out.println("Matched <<");*/

								// get code
								String code = _trimCode(matcher.group(8));
								// add method to RoundtripData
								data.addFinish(tsname, code);

								_log("----------------------------");
								_log(" Finish method: " + tsname.trim());
								_log(" Finish Code: " + code);
								_log("----------------------------");
							}


							///
							/// look for includes
							///

							p = RoundtripDefines.INCLUDES_STRUCTURE;

							MY_PATTERN = Pattern.compile(p, Pattern.DOTALL);
							matcher = MY_PATTERN.matcher(content);
							while (matcher.find()) {

								// get includes
								String includes = _trimCode(matcher.group(4));
								// add includes to RoundtripData
								data.addIncludes(tsname, includes);

								_log("----------------------------");
								_log(" TS: " + tsname.trim());
								_log(" Includes: " + includes);
								_log("----------------------------");
							}


							///
							/// look for additional testsuite code
							///

							p = RoundtripDefines.EXTENSIONS_STRUCTURE;

							MY_PATTERN = Pattern.compile(p, Pattern.DOTALL);
							matcher = MY_PATTERN.matcher(content);
							while (matcher.find()) {							
								// get extensions
								String extensions = _trimCode(matcher.group(2));
								// add extensions to RoundtripData
								data.addExtensions(tsname, extensions);

								_log("----------------------------");
								_log(" TS: " + tsname.trim());
								_log(" Extensions: " + extensions);
								_log("----------------------------");
							}

						}
					}
				}
			}
		}

		_log("__________ ROUNDTRIP METHODS __________");

		for (Map.Entry<String, String> entry : data.getMethods().entrySet())
		{
			_log(entry.getKey() + Defines.PATH_SEP + entry.getValue());
		}

		_log("__________ ROUNDTRIP CONFIGURES __________");

		for (Map.Entry<String, String> entry : data.getConfigure().entrySet())
		{
			_log(entry.getKey() + Defines.PATH_SEP + entry.getValue());
		}

		_log("__________ ROUNDTRIP FINISH __________");

		for (Map.Entry<String, String> entry : data.getFinish().entrySet())
		{
			_log(entry.getKey() + Defines.PATH_SEP + entry.getValue());
		}

		_log("__________ ROUNDTRIP INCLUDES __________");

		for (Map.Entry<String, String> entry : data.getIncludes().entrySet())
		{
			_log(entry.getKey() + Defines.PATH_SEP + entry.getValue());
		}

		_log("__________ ROUNDTRIP EXTENSIONS __________");

		for (Map.Entry<String, String> entry : data.getExtensions().entrySet())
		{
			_log(entry.getKey() + Defines.PATH_SEP + entry.getValue());
		}

		// return result
		return data;
	}

	/**
	 * 
	 * @param dirpath
	 * @return
	 */
	static public RoundtripData ParseTestpanelDirectory(String dirpath, RoundtripData data){

		_log("Roundtrip panel: Attempting directory: " + dirpath);

		if (data == null) 
			data = new RoundtripData();

		// for each file in the directory
		File[] files = new File(dirpath).listFiles();
		if (files != null){
			for (File file : files) {
				if (file.isDirectory()) {
					_log("Roundtrip: Avoiding directory: " + file.getName());
					// Calls same method again.
				} else {

					boolean IS_TESTPANEL = file.getName().startsWith(Defines.TESTPANEL_FILE_PREFIX);
					boolean IS_H = file.getName().endsWith(Defines.TESTPANEL_H_EXTENSION);
					boolean IS_CPP = file.getName().endsWith(Defines.TESTPANEL_CPP_EXTENSION);

					// if is a source file, read file content
					if (IS_TESTPANEL && (IS_H || IS_CPP)){

						String content = "";
						try {
							content = FileSystemUtils.FileToString(file);
						} catch (IOException e) {
							e.printStackTrace();
							// continue to next file
							continue;
						}

						// get the roundtripped content
						String p = "";
						Pattern MY_PATTERN = null; 
						Matcher matcher = null;

						p = RoundtripDefines.TESTPANEL_STRUCTURE;

						MY_PATTERN = Pattern.compile(p, Pattern.DOTALL);
						matcher = MY_PATTERN.matcher(content);
						String includes = "";
						String code = "";
						while (matcher.find()) {
							// get code
							includes = matcher.group(2);
							code = matcher.group(4);
						}

						/*_log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						_log("includes: --" + includes + "--");
						_log("trim: --" + _trimCode(includes) + "--");
						_log("code: --" + code + "--");
						_log("trim: --" + _trimCode(code) + "--");
						_log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");*/

						includes = _trimCode(includes);
						code = _trimCode(code);

						// ends with *.h?
						if (IS_H){
							data.setTestpanelHIncludes(includes);
							data.setTestpanelHCode(code);

							_log("----------------------------");
							_log(" Testpanel. Rountripped H code: ");
							_log(" Includes: " + includes);
							_log(" Code: " + code);
							_log("----------------------------");
						}

						// ends with *.cpp?
						else if (IS_CPP){
							data.setTestpanelCPPIncludes(includes);
							data.setTestpanelCPPCode(code);

							_log("----------------------------");
							_log(" Testpanel. Rountripped CPP code: ");
							_log(" Includes: " + includes);
							_log(" Code: " + code);
							_log("----------------------------");

						}

					}
				}
			}

		} 

		return data;
	}


	/**
	 * 
	 * @param code
	 * @return
	 */
	static public String _trimCode(String code){

		if (code.length() >= 2){ // expected, at least, two \n characters

			//System.out.println("1 CODE >>>" + code + "<<<");

			// remove first \n after "/// >>>>>"
			int i = code.indexOf('\n');
			if (i >= 0)
				code = code.substring(i+1, code.length());

			//System.out.println("2 CODE >>>" + code + "<<<");

			// remove FROM last \n before "/// <<<<<"
			i = code.lastIndexOf('\n');
			if (i >= 0)
				code = code.substring(0,i);

			//System.out.println("3 CODE >>>" + code + "<<<");
		}

		return code;
	}
}
