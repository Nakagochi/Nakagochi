/*
	Assignment: 1410_Module05
	Program:	Module05
	Programmer: Tysen - Tysen Christensen
	Created:	Nov 13, 2019Nov 13, 2019
*/
/**
 * FILE Module05.java
 */
package m05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tysen CLASS - Module05
 */
public class Module05 {

	/**
	 * METHOD- Reads a file and flips the contents along the vertical and horizontal axis
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "";
		ArrayList<String> stringList = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader("Pattern.txt"))) {
			PrintWriter write2 = new PrintWriter("Pattern2.txt");
			PrintWriter write = new PrintWriter("Pattern1.txt");
			while (s != null) {
				s = br.readLine();
				stringList.add(s);
				if (s != null) {
					write.print(s);
					write.println(reverse(s));
				}
			}
			int x = stringList.size() - 1;

			while (x != -1) {
				if (stringList.get(x) != null) {
					write2.println(stringList.get(x));
				}
				x--;
			}
			write2.close();
			write.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}


	}

	/**
	 * METHOD- Reverses the string that is read from the file.
	 * 
	 * @param s
	 * @return
	 */
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		return sb.toString();
	}

}
