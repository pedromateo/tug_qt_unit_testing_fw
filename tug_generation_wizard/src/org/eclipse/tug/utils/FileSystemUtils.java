package org.eclipse.tug.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.eclipse.tug.wizard.Defines;

public class FileSystemUtils {

	/**
	 * 
	 * @param path
	 * @return
	 */
	public static String CleanPath(String path){

		return path.replace(Defines.PATH_SEP+Defines.PATH_SEP, Defines.PATH_SEP);
	}



	/*
	 * BUILD AND INCLUDE DIRECTORIES
	 */

	public static String DeduceBuildDirFromPath(String path){

		ArrayList<String> clues = new ArrayList<String>();
		clues.add("build");

		return _DeduceFromPath(path, clues);
	}

	public static String DeduceIncludeDirFromPath(String path){

		ArrayList<String> clues = new ArrayList<String>();
		clues.add("include");
		clues.add("src_inc");
		clues.add("inc");

		return _DeduceFromPath(path, clues);
	}

	protected static String _DeduceFromPath(String path, ArrayList<String> clues){

		if (path.length() > 0){
			String mypath = path;

			if (!mypath.endsWith(Defines.PATH_SEP))
				mypath += Defines.PATH_SEP;

			int clue_index = 0;
			int cut_at = 0;

			for (String clue : clues){
				clue_index = mypath.indexOf(clue);
				if (clue_index != -1){
					cut_at = mypath.indexOf(Defines.PATH_SEP,clue_index);
					if (cut_at != -1)
						return mypath.substring(0,cut_at+1);
				}
			}
		}

		return "";
	}

	/*
	 * DIRECTORIES AND FILENAMES
	 */

	public static String GetDirFromPath(String path){
		// File f = new File(path);
		// if(!f.exists()) return "";
		// else if(f.isDirectory()) return path;
		// else return file.getParentFile();

		if (path.length() > 0){
			if (path.endsWith(Defines.PATH_SEP)) return path;
			else{
				return path.substring(0,path.lastIndexOf(Defines.PATH_SEP)) + Defines.PATH_SEP;
			}
		}
		return path;
	}

	public static String GetFilenameFromPath(String path){

		if (path.length() > 0){
			if (path.endsWith(Defines.PATH_SEP)) return "";

			else{
				return path.substring(path.lastIndexOf(Defines.PATH_SEP) + 1);
			}
		}
		return "";
	}

	public static Boolean IsExistingDirectory(String path){
		return new File(path).isDirectory();
	}

	public static Boolean IsDirectory(String path){

		if (path.length() > 0){
			// for existing dirs
			if (IsExistingDirectory(path))
				return true;

			// for non-existing dirs 1
			if (path.endsWith(Defines.PATH_SEP)) 
				return true;

			// for non-existing dirs 2
			int last_sep = path.lastIndexOf(Defines.PATH_SEP);
			int last_dot = path.lastIndexOf('.');
			if (last_sep > 0 && last_dot < last_sep) 
				return true;
		}

		//
		return false;
	}

	public static Boolean IsExistingFile(String path){
		return new File(path).isFile();
	}

	public static Boolean IsFile(String path){

		if (path.length() > 0){
			// for existing files
			if (IsExistingFile(path))
				return true;

			// for non-existing files
			int last_sep = path.lastIndexOf(Defines.PATH_SEP);
			int last_dot = path.lastIndexOf('.');
			int length = path.length();

			if (last_sep > 0 && last_dot > 0
					&& last_dot > last_sep 
					&& last_dot < length) 
				return true;
		}

		//
		return false;
	}

	/*
	 * RELATIVE PATHS
	 */

	public static String GetRelativePath(String path, String base){

		String mypath = path;
		String mybase = base;

		// discard if some empty
		if (mypath.length() == 0 || mybase.length() == 0){
			return "";
		}

		// if base is not a directory -> return empty
		if (!IsDirectory(mybase)){
			return "";
		}

		// if base does not ends with /, add /
		if (!mybase.endsWith(Defines.PATH_SEP)){
			mybase += Defines.PATH_SEP;
		}

		// check if path is a file -> remove last "/" at the end of the method
		boolean path_isfile = IsFile(mypath);
		// if not, and if does not ends with /, add /
		if (!path_isfile && !mypath.endsWith(Defines.PATH_SEP)){
			mypath += Defines.PATH_SEP;
		}

		// --------------------------------------------------------------------

		// get URIs and split them by using the separator
		String a = "";
		String b = "";
		try {
			a = new File(mybase).getCanonicalFile().toURI().getPath();
			a = a.replace("/", Defines.PATH_SEP);// makes it work in Windows and Linux systems
			b = new File(mypath).getCanonicalFile().toURI().getPath();
			b = b.replace("/", Defines.PATH_SEP);// makes it work in Windows and Linux systems
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] basePaths = a.split(Defines.PATH_SEP);
		String[] otherPaths = b.split(Defines.PATH_SEP);


		// check common part
		int n = 0;
		for(; n < basePaths.length && n < otherPaths.length; n ++)
		{
			if( basePaths[n].equals(otherPaths[n]) == false )
				break;
		}

		// 'n' points to the first different member

		// compose the new path
		StringBuffer aux = new StringBuffer("");
		for(int m = n; m < basePaths.length; m ++)
			aux.append(".."+Defines.PATH_SEP);
		for(int m = n; m < otherPaths.length; m ++)
		{
			aux.append(otherPaths[m]);
			aux.append(Defines.PATH_SEP);
		}

		// get path string
		String result = aux.toString();

		//_log(result);

		// remove last "/" if path is a file
		if (path_isfile && result.endsWith(Defines.PATH_SEP)){
			result = result.substring(0,result.length()-1);
		}

		// if result is empty, we are in the same directory
		if (result.isEmpty())
			result = "." + Defines.PATH_SEP;

		// format path
		result = CleanPath(result);


		//_log("from...: " + base);
		//_log("to.....: " + path);
		//_log("result.: " + result);

		return result;
	}
	/*
	 * FILE LOADING, DUMPING, and COPYING
	 */

	public static String FileToString(String path) throws IOException{
		/*File file = new File(path);
		return FileToString(file);*/
		if (path.length() > 0){
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			return new String(encoded, Charset.defaultCharset());
		}
		return "";
	}

	public static String FileToString(File file) throws IOException{

		int len;
		//char[] chr = new char[4096];
		char[] chr = new char[(int)file.length()];
		final StringBuffer buffer = new StringBuffer();
		final FileReader reader = new FileReader(file);
		try {
			while ((len = reader.read(chr)) > 0) {
				buffer.append(chr, 0, len);
			}
		} finally {
			reader.close();
		}
		return buffer.toString();
	}

	public static void StringToFile(String content, String path) throws IOException{
		
		if (path.length() == 0) throw new IOException("path is null.");
		
		// check dir
		String dirName = path.substring(0,path.lastIndexOf(Defines.PATH_SEP));
		MakeDir(dirName);

		// save the file
		PrintWriter out = new PrintWriter(path);
		out.println(content);
		out.close();
	}

	public static boolean CopyFile(String source, String dest) throws IOException{

		File sourceFile = new File(source);
		File destFile = new File(dest);

		if(!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel chSource = null;
		FileChannel chDest = null;

		try {
			chSource = new FileInputStream(sourceFile).getChannel();
			chDest = new FileOutputStream(destFile).getChannel();
			chDest.transferFrom(chSource, 0, chSource.size());

			return true;
		}
		finally {
			if(chSource != null) {
				chSource.close();
			}
			if(chDest != null) {
				chDest.close();
			}
		}
	}

	public static void MakeDir(String dirName) throws IOException{
		File dir = new File(dirName);
		if (!dir.exists()) {
			//System.out.println("Creating directory: " + dirName);
			boolean result = dir.mkdirs();  
			if(!result) {    
				System.out.println("Directory cannot be created: " + dirName);  
			}
		}
	}
}
