package org.eclipse.tug.utils;

import java.io.IOException;

public class FileParseUtils {


	/*
	 * FILE PARSING and ANALYSIS
	 */

	/**
	 * Get classname from .h CPP file
	 * @param headerpath
	 * @return
	 * @throws IOException
	 */
	public static String GetClassnameFromHeader(String headerpath){
		
		if (headerpath.length() == 0) return "";
		
		String filecontent = "";
		String result = "";

		// get file content
		try{
			filecontent = FileSystemUtils.FileToString(headerpath);
		}
		catch (IOException e) {
			e.printStackTrace();
			return "";
		}

		// remove comments
		filecontent = StringTextUtils.EscapeComments(filecontent);

		//System.out.println("_____________________________________________________");
		//System.out.println(filecontent);
		//System.out.println("______________________________________________________");


		// get classname
		if (filecontent != null){
			//int begin_class = filecontent.indexOf("class");
			int first_class = filecontent.indexOf("class ");
			int end_first_class = first_class + 5;
			int next_class = filecontent.indexOf("class ",end_first_class);
			int first_bracket = filecontent.indexOf('{',end_first_class);
			int first_colon = filecontent.indexOf(':',end_first_class);

			// no option if empty
			if (first_class == -1) return "";
			if (first_bracket == -1) return "";

			// find the first 'class ' placed before a ':' or a '{'
			while (next_class < first_bracket && next_class != -1){
				// update class
				first_class = next_class;
				end_first_class = first_class + 5;
				next_class = filecontent.indexOf("class ",end_first_class);
				// update : and {
				first_bracket = filecontent.indexOf('{',end_first_class);
				first_colon = filecontent.indexOf(':',end_first_class);
			}

			// if there exists inheritance...
			if (first_colon != -1 && first_colon < first_bracket){
				result = filecontent.substring(end_first_class,first_colon);
			}
			// if there exists no inheritance...
			else{
				result = filecontent.substring(end_first_class,first_bracket);
			}
			result = result.trim();
		}

		return result;
	}

	/**
	 * Get panel name from .ui Qt file
	 * @param panelpath
	 * @return
	 * @throws IOException
	 */
	public static String GetPanelnameFromUi(String panelpath){
		
		if (panelpath.length() == 0) return "";
		
		String filecontent = "";
		String result = "";

		// get file content
		try{
			filecontent = FileSystemUtils.FileToString(panelpath);
		}
		catch (IOException e) {
			e.printStackTrace();
			return "";
		}

		// get panel name
		if (filecontent != null){
			int begin_class = filecontent.indexOf("<class>");
			int begin_class_end = begin_class + 7;
			int end_class = filecontent.indexOf("</class>");

			if (begin_class != -1 && end_class != -1 
					&& end_class > begin_class_end){
				result = filecontent.substring(begin_class_end,end_class);
				result = result.trim();
			}
		}

		return result;
	}
}
