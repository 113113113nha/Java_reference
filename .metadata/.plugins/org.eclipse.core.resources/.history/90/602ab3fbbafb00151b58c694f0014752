package search;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class readCSV2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = null;
		file = new File("testdata.csv");

		//
		String[] animal = new String[20];
		int index = 0;

		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {
			animal[index] = input.nextLine();
			System.out.println(animal[index]);
			index++;
		}
		input.close();
		System.out.println("dong 0:" + animal[0]);
		System.out.println("---------------------------------------------------------");

		// Trial
		List<String> stringLine = FileUtils.readLines(file);
		String a = "";
		for (int i = 4; i < stringLine.size(); i++) {
			a = stringLine.get(i);
			System.out.println(a);
		}
	}
}
