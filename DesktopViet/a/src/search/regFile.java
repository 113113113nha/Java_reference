package search;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;

public class regFile {

	public static void main(String[] args) throws IOException {

		//
		File inputFile = new File("text_regex.txt");
		
		InputStream inputStream = new FileInputStream(inputFile);
		String fileString = IOUtils.toString(inputStream);
		System.out.println(fileString);
		System.out.println(fileString.length());
		
		int countConsonat = 0;
		Pattern patternConsonant = Pattern.compile("([a-zA-Z&&[^aAoOiIuUeE]])");
		Matcher matcherConsonant = patternConsonant.matcher(fileString);
		while (matcherConsonant.find()) {
			countConsonat++;
		}
		System.out.println(countConsonat);
	}

}
