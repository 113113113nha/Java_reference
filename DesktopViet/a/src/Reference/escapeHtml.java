package Reference;

import org.apache.commons.lang3.StringEscapeUtils;

public class escapeHtml {

	public static void main(String[] args) {

		// 1 - String pattern
		String str = "<tag>text</tag>";		
		
		// 2 - Convert to escape
		String escapeString = StringEscapeUtils.escapeXml10(str);	
		
		// 3 - Convert to unescape
		String unescapeString = StringEscapeUtils.unescapeXml(escapeString);
		
		// 4 - Print
		System.out.println("Escapse String: "  + escapeString);
		System.out.println("Unescape String: " + unescapeString);
		
	}

}
