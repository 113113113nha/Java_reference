package search;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class readCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = null;
		FileReader fr = null;
		LineNumberReader lnr  = null;
		
		//
		file = new File("testdata.csv");
		fr = new FileReader(file);
		lnr  = new LineNumberReader(fr);
		lnr.setLineNumber(0);
		
		String line = "";
		while ((line = lnr.readLine()) != null) {
		   System.out.println("Line Number " + lnr.getLineNumber() + 
		                        ": " + line);      

		} 
		fr.close();
		

	}

}
