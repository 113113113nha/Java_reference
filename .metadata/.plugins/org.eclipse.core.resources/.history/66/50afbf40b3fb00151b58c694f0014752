package search;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class readCSV {

	public static void main(String[] args) throws IOException {

		// Way 1:
		File file = new File("testdata.csv");
		FileReader fr = new FileReader(file);
		LineNumberReader lnr = new LineNumberReader(fr);

		lnr.setLineNumber(0);

		String line = "";
		while ((line = lnr.readLine()) != null) {
			System.out.println("Line Number " + lnr.getLineNumber() + " : " + line);
			// System.out.println(line);

		}
		fr.close();
		System.out.println("----------------------------------------------------");

		// Way 2:
		List<String> stringLine = FileUtils.readLines(file);
		for (String S : stringLine) {
			System.out.println(S);
		}
		System.out.println("----------------------------------------------------");

		// Read from startline to endline
		List<String> stringLines = FileUtils.readLines(file);
		String lineList = "";
		for (int i = 4; i < stringLines.size(); i++) {
			lineList = stringLines.get(i);
			System.out.println(lineList);
		}
		System.out.println("----------------------------------------------------");
		System.out.println(lineList);

	}

}
