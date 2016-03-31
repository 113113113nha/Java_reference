package Reference;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URL_Encode_Decode {

	public static void main(String[] args) throws URISyntaxException, UnsupportedEncodingException {

		String a = "<html><body> �?ây là Text </body></html>";
		
		// Encode URL
		String encode =  URLEncoder.encode(a, "UTF-8");
		System.out.println(encode);
		
		// Decode URL
		String decode = URLDecoder.decode(encode, "UTF-8");
		System.out.println(decode);
		

	}

	
}
