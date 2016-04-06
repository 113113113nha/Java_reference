package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readCSV3 {

	//https://commons.apache.org/proper/commons-io/description.html
	public static void main(String[] args) throws FileNotFoundException {
		//
		File file = null;
		file = new File("testdata.csv");

		Scanner s = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();
		
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		
		for(String l:list){
			System.out.println(l);
		}
	}
}
