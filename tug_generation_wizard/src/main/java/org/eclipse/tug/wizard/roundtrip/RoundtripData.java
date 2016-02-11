package org.eclipse.tug.wizard.roundtrip;

import java.util.HashMap;
import java.util.Map;

public class RoundtripData {
	
	public RoundtripData(){
		_methods = new HashMap<String,String>();
		_configure = new HashMap<String,String>();
		_finish = new HashMap<String,String>();
		_includes = new HashMap<String,String>();
		_extensions = new HashMap<String,String>();
		_testpanel_h_includes = "";
		_testpanel_h_code = "";
		_testpanel_cpp_includes = "";
		_testpanel_cpp_code = "";
	}
	
	/// methods
	
	static public String GenerateMethodId(String classname, String methodname){
		return classname + "::" + methodname;
	}
	
	public void addMethod(String classname, String methodname, String code){
		addMethod(GenerateMethodId(classname, methodname), code);
	}
	
	public void addMethod(String methodid, String code){
		_methods.put(methodid, code);
	}
	
	public boolean existsMethod(String classname, String methodname){
		return existsMethod(GenerateMethodId(classname, methodname));
	}
	
	public boolean existsMethod(String methodid){
		return _methods.containsKey(methodid);
	}
	
	public String getMethod(String classname, String methodname){
		return getMethod(GenerateMethodId(classname, methodname));
	}
	
	public String getMethod(String methodid){
		String aux = _methods.get(methodid);
		return aux != null? aux : "";
	}
	

	/// configure
	
	public void addConfigure(String classname, String code){
		_configure.put(classname, code);
	}
	
	public String getConfigure(String classname){
		String aux = _configure.get(classname);
		return aux != null? aux : "";
	}
	

	/// finish
	
	public void addFinish(String classname, String code){
		_finish.put(classname, code);
	}
	
	public String getFinish(String classname){
		String aux = _finish.get(classname);
		return aux != null? aux : "";
	}
	

	/// includes
	
	public void addIncludes(String classname, String code){
		_includes.put(classname, code);
	}
	
	public String getIncludes(String classname){
		String aux = _includes.get(classname);
		return aux != null? aux : "";
	}
	

	/// extensions
	
	public void addExtensions(String classname, String code){
		_extensions.put(classname, code);
	}
	
	public String getExtensions(String classname){
		String aux = _extensions.get(classname);
		return aux != null? aux : "";
	}
	

	/// _testpanel_h/cpp_extensions
	
	public void setTestpanelHIncludes(String includes){
		_testpanel_h_includes = includes;
	}
	
	public String getTestpanelHIncludes(){
		return _testpanel_h_includes;
	}
	
	public void setTestpanelHCode(String code){
		_testpanel_h_code = code;
	}
	
	public String getTestpanelHCode(){
		return _testpanel_h_code;
	}
	
	public void setTestpanelCPPIncludes(String includes){
		_testpanel_cpp_includes = includes;
	}
	
	public String getTestpanelCPPIncludes(){
		return _testpanel_cpp_includes;
	}
	
	public void setTestpanelCPPCode(String code){
		_testpanel_cpp_code = code;
	}
	
	public String getTestpanelCPPCode(){
		return _testpanel_cpp_code;
	}


	
	///
	///
	///
	
	// map to store methods code
	private Map<String,String> _methods;
	private Map<String,String> _configure;
	private Map<String,String> _finish;
	private Map<String,String> _includes;
	private Map<String,String> _extensions;
	private String _testpanel_h_includes;
	private String _testpanel_h_code;
	private String _testpanel_cpp_includes;
	private String _testpanel_cpp_code;
	

	
	public Map<String,String> getMethods(){
		return _methods;
	}
	
	public Map<String,String> getConfigure(){
		return _configure;
	}
	
	public Map<String,String> getFinish(){
		return _finish;
	}
	
	public Map<String,String> getIncludes(){
		return _includes;
	}
	
	public Map<String,String> getExtensions(){
		return _extensions;
	}
}
