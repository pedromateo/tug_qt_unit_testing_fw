package org.eclipse.tug.utils;


public class StringTextUtils {
	/**
	 * Removes comments from cpp or java file
	 * @param original string from which remove comments
	 * @return
	 */
	public static String EscapeComments(String original){
		return original.replaceAll( "//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "$1 " );
	}



	/*public static String Text2HTML(String s){
		StringBuilder builder = new StringBuilder();
		boolean previousWasASpace = false;
		for( char c : s.toCharArray() ) {
			if( c == ' ' ) {
				if( previousWasASpace ) {
					builder.append("&nbsp;");
					previousWasASpace = false;
					continue;
				}
				previousWasASpace = true;
			} else {
				previousWasASpace = false;
			}
			switch(c) {
			case '<': builder.append("&lt;"); break;
			case '>': builder.append("&gt;"); break;
			case '&': builder.append("&amp;"); break;
			case '"': builder.append("&quot;"); break;
			case '\n': builder.append("<br>"); break;
			case ',': builder.append("&#44;"); break;
			case ';': builder.append("&#59;"); break;
			case '/': builder.append("&frasl;"); break;
			case ':': builder.append("&#58;"); break;
			case '?': builder.append("&#63;"); break;
			case '@': builder.append("&#64;"); break;
			case '(': builder.append("&#40;"); break;
			case ')': builder.append("&#41;"); break;
			// We need Tab support here, because we print StackTraces as HTML
			case '\t': builder.append("&nbsp; &nbsp; &nbsp;"); break;  
			default:
				if( c < 128 ) {
					builder.append(c);
				} else {
					builder.append("&#").append((int)c).append(";");
				}    
			}
		}
		return builder.toString();
	}*/


	///
	/// escape HTML
	///

	private static char[] hex={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'}; 

	/** 
	 * Method for html escaping a text string 
	 * @param original The String to escape 
	 * @return The escaped String 
	 */ 
	public static String HTMLEscapeTextLine(String original) 
	{ 
		return HTMLEscapeSpecial(HTMLEscapeTags(original)); 
	} 

	/** 
	 * Normal escape function, for Html escaping paragraphs 
	 * @param original The original String 
	 * @return The escape String 
	 */ 
	public static String HTMLEscapeTextParagraph(String original) 
	{ 
		return HTMLEscapeSpecial(HTMLEscapeBr(HTMLEscapeTags(original))); 
	} 

	public static String HTMLEscapeTags(String original)
	{
		if(original==null) return ""; 
		StringBuffer out=new StringBuffer(""); 
		char[] chars=original.toCharArray(); 
		for(int i=0;i<chars.length;i++) 
		{ 
			boolean found=true; 
			switch(chars[i]) 
			{ 
			case 60:out.append("&lt;"); break; //< 
			case 62:out.append("&gt;"); break; //> 
			case 34:out.append("&quot;"); break; //" 
			default:found=false;break; 
			} 
			if(!found) out.append(chars[i]); 

		} 
		return out.toString(); 

	}

	public static String HTMLEscapeBr(String original) 
	{ 
		if(original==null) return ""; 
		StringBuffer out=new StringBuffer(""); 
		char[] chars=original.toCharArray(); 
		for(int i=0;i<chars.length;i++) 
		{ 
			boolean found=true; 
			switch(chars[i]) 
			{ 
			case '\n': out.append("<br/>"); break; //newline 
			case '\r': break; 
			default:found=false;break; 
			} 
			if(!found) out.append(chars[i]); 

		} 
		return out.toString(); 
	} 

	public static String HTMLEscapeSpecial(String original) 
	{ 
		if(original==null) return ""; 
		StringBuffer out=new StringBuffer(""); 
		char[] chars=original.toCharArray(); 
		for(int i=0;i<chars.length;i++) 
		{ 
			boolean found=true; 
			switch(chars[i]) { 
			case 38:out.append("&amp;"); break; //& 
			case 198:out.append("&AElig;"); break; //Æ 
			case 193:out.append("&Aacute;"); break; //Á 
			case 194:out.append("&Acirc;"); break; //Â 
			case 192:out.append("&Agrave;"); break; //À 
			case 197:out.append("&Aring;"); break; //Å 
			case 195:out.append("&Atilde;"); break; //Ã 
			case 196:out.append("&Auml;"); break; //Ä 
			case 199:out.append("&Ccedil;"); break; //Ç 
			case 208:out.append("&ETH;"); break; //Ð 
			case 201:out.append("&Eacute;"); break; //É 
			case 202:out.append("&Ecirc;"); break; //Ê 
			case 200:out.append("&Egrave;"); break; //È 
			case 203:out.append("&Euml;"); break; //Ë 
			case 205:out.append("&Iacute;"); break; //Í 
			case 206:out.append("&Icirc;"); break; //Î 
			case 204:out.append("&Igrave;"); break; //Ì 
			case 207:out.append("&Iuml;"); break; //Ï 
			case 209:out.append("&Ntilde;"); break; //Ñ 
			case 211:out.append("&Oacute;"); break; //Ó 
			case 212:out.append("&Ocirc;"); break; //Ô 
			case 210:out.append("&Ograve;"); break; //Ò 
			case 216:out.append("&Oslash;"); break; //Ø 
			case 213:out.append("&Otilde;"); break; //Õ 
			case 214:out.append("&Ouml;"); break; //Ö 
			case 222:out.append("&THORN;"); break; //Þ 
			case 218:out.append("&Uacute;"); break; //Ú 
			case 219:out.append("&Ucirc;"); break; //Û 
			case 217:out.append("&Ugrave;"); break; //Ù 
			case 220:out.append("&Uuml;"); break; //Ü 
			case 221:out.append("&Yacute;"); break; //Ý 
			case 225:out.append("&aacute;"); break; //á 
			case 226:out.append("&acirc;"); break; //â 
			case 230:out.append("&aelig;"); break; //æ 
			case 224:out.append("&agrave;"); break; //à 
			case 229:out.append("&aring;"); break; //å 
			case 227:out.append("&atilde;"); break; //ã 
			case 228:out.append("&auml;"); break; //ä 
			case 231:out.append("&ccedil;"); break; //ç 
			case 233:out.append("&eacute;"); break; //é 
			case 234:out.append("&ecirc;"); break; //ê 
			case 232:out.append("&egrave;"); break; //è 
			case 240:out.append("&eth;"); break; //ð 
			case 235:out.append("&euml;"); break; //ë 
			case 237:out.append("&iacute;"); break; //í 
			case 238:out.append("&icirc;"); break; //î 
			case 236:out.append("&igrave;"); break; //ì 
			case 239:out.append("&iuml;"); break; //ï 
			case 241:out.append("&ntilde;"); break; //ñ 
			case 243:out.append("&oacute;"); break; //ó 
			case 244:out.append("&ocirc;"); break; //ô 
			case 242:out.append("&ograve;"); break; //ò 
			case 248:out.append("&oslash;"); break; //ø 
			case 245:out.append("&otilde;"); break; //õ 
			case 246:out.append("&ouml;"); break; //ö 
			case 223:out.append("&szlig;"); break; //ß 
			case 254:out.append("&thorn;"); break; //þ 
			case 250:out.append("&uacute;"); break; //ú 
			case 251:out.append("&ucirc;"); break; //û 
			case 249:out.append("&ugrave;"); break; //ù 
			case 252:out.append("&uuml;"); break; //ü 
			case 253:out.append("&yacute;"); break; //ý 
			case 255:out.append("&yuml;"); break; //ÿ 
			case 162:out.append("&cent;"); break; //¢ 
			default: 
				found=false; 
				break; 
			} 

			if(!found) { 
				///
				///
				if(chars[i]>127) { 
					char c=chars[i]; 
					int a4=c%16; 
					c=(char) (c/16); 
					int a3=c%16; 
					c=(char) (c/16); 
					int a2=c%16; 
					c=(char) (c/16); 
					int a1=c%16; 
					out.append("&#x"+hex[a1]+hex[a2]+hex[a3]+hex[a4]+";");
				} 
				///
				///
				else if(chars[i] >= 33 && chars[i] <= 47
						|| chars[i] >= 58 && chars[i] <= 64
						|| chars[i] >= 91 && chars[i] <= 96
						|| chars[i] >= 123 && chars[i] <= 151){
					out.append("&#" + (int)(chars[i]) + ";");
				}
				else 
				{ 
					out.append(chars[i]); 
				} 
			} 
		}
		return out.toString(); 
	} 




	/*
	 * 
	 */
	private static void _log(String s) {
		System.out.println(s);
	}
}
