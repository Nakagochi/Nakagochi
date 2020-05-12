/*
	Assignment: TwoDArrays
	Program:	TwoD
	Programmer: Tysen - Tysen Christensen
	Created:	Dec 8, 2019Dec 8, 2019
*/
/**
 * FILE TwoD.java
 */
package twoDArrays;

/**
 * @author Tysen CLASS - TwoD
 */
public class TwoD {

	/**
	 * METHOD-
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Arrays a = new Arrays(11, 11);
		int z = 0;
		for (int x = 0; x < 11; x++) {
			for (int y = 0; y < 11; y++) {
				z = x * y;
				a.Add_Number(x, y, z);
			}
		}
		a.PrintArray();
	}

}
