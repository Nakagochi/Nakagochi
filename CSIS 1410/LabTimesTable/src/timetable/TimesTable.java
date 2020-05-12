/*
	Assignment: LabTimesTable
	Program:	TimesTable
	Programmer: Tysen - Tysen Christensen
	Created:	Nov 4, 2019Nov 4, 2019
*/
/**
 * FILE TimesTable.java
 */
package timetable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Tysen
 *CLASS - TimesTable
 */
public class TimesTable {

	/**
	 * METHOD-
	 *@param args
	 */
	public static void main(String[] args) {
		try(PrintWriter writer = new PrintWriter(new File("PrintFile.txt"))){
			writer.println("Times Table");
			for(int i = 1; i<11; i+=2) {
				for(int x = 1; x<11; x ++) {
					writer.printf("%2d * %d = %-3d\t%2d *%d = %-3d\n", x,i,i*x,x,i+1,(i+1)*x);
					
				}
				writer.printf("%n");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
