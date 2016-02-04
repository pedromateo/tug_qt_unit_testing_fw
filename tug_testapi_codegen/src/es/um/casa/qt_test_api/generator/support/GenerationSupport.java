package es.um.casa.qt_test_api.generator.support;

import java.sql.Timestamp;

public class GenerationSupport {

	public String getCurrentTime(){
	    java.util.Date date = new java.util.Date();
	    Timestamp ts = new Timestamp(date.getTime());
	    return ts.toString();
	}
	
	///
	/// Bool sentinel
	
	/// this does not work because acceleo does not allow
	/// to store vaalues into variables
	
	/*private static boolean _b_sentinel;

	public static void setBoolSentinel(boolean b){
		_b_sentinel = b;
		
	}

	public static boolean getBoolSentinel(){
		return _b_sentinel;
	}*/
	
	/*
	[query public setBoolSentinel(b : Boolean) : OclAny 
=  invoke('org.eclipse.acceleo.qt_test_api.generator.support.GenerationSupport', 'setBoolSentinel(boolean)', Sequence{b}) /]
[query public getBoolSentinel() : Boolean 
=  invoke('org.eclipse.acceleo.qt_test_api.generator.support.GenerationSupport', 'getBoolSentinel()', Sequence{}) /]
*/
}
