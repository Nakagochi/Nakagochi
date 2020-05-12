/*
	Assignment: Divisable
	Program:	DivisableTest
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 18, 2019Sep 18, 2019
*/
/**
 * FILE DivisableTest.java
 */
package divisable;

import java.util.Scanner;

/**
 * @author Tysen
 *CLASS - DivisableTest
 */
public class DivisableTest {

	/**
	 * METHOD-
	 *@param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Divisable d = new Divisable();
		int x=0;
		int y=0;
		int z = 0;
		System.out.print("Please input a number: ");
		x = s.nextInt();
		System.out.print("Please input a number: ");
		y =  s.nextInt();
		z = d.divide(x, y);
		System.out.printf("%d - %d = %d", x,y,z);
	}

}
