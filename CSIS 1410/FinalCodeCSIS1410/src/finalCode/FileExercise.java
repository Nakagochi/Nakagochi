/*
	Assignment: FinalCodeCSIS1410
	Program:	FileExercise
	Programmer: Tysen - Tysen Christensen
	Created:	Dec 9, 2019Dec 9, 2019
*/
/**
 * FILE FileExercise.java
 */
package finalCode;

import java.io.*;
import java.util.*;

/**
 * @author Tysen CLASS - FileExercise
 */
/**
 * @author Tysen
 *CLASS - FileExercise
 */
public class FileExercise {

	/**
	 * FIELDS - File
	 */
	private File f;
	/**
	 * FIELDS - BufferedReader
	 */
	private BufferedReader br;
	/**
	 * FIELDS - BufferedWriter
	 */
	private BufferedWriter writer;
	/**
	 * FIELDS - ArrayList<String>
	 */
	private ArrayList<String> diamondArray;
	/**
	 * FIELDS - StringBuilder
	 */
	private StringBuilder changingX;

	/**
	 * CONSTRUCTOR
	 *@param <br>
	 */
	public <br> FileExercise() {
		super();
		diamondArray = new ArrayList<String>();
		changingX = new StringBuilder();
		f = new File("src/finalCode/Diamond");
		try {
			br = new BufferedReader(new FileReader(f));
			writer = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(new File("src/finalCode/Diamond2.txt"))));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * METHOD- fileChange chagnes the files x to o
	 */
	public void fileChange() {
		try {
			for (int x = 0; x < 9; x++) {
				diamondArray.add(br.readLine());
				changingX.append(diamondArray.get(x));
				for (int y = 0; y < changingX.length(); y++) {
					if (changingX.charAt(y) == 'x') {
						changingX.setCharAt(y, 'O');

					}

				}
				writer.write(changingX.toString());
				// System.out.println(changingX.toString());

				writer.newLine();
				writer.flush();
				changingX.delete(0, changingX.length());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

/** 
 * METHOD- printFile prints the file
 */
public void printFile() {
	try (BufferedReader br = new BufferedReader(new FileReader("src/finalCode/Diamond2.txt"))) {
		   String line;
		   while ((line = br.readLine()) != null) {
		       System.out.println(line);
		   }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
