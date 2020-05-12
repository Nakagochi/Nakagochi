/*
	Assignment: LabKeyValuePair1
	Program:	PairApp
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 28, 2019Oct 28, 2019
*/
/**
 * FILE PairApp.java
 */
package keyvalue;

/**
 * @author Tysen CLASS - PairApp
 */
public class PairApp {

	/**
	 * METHOD-
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		KeyValuePair<String, Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<>("NY", 8244910);

		System.out.println(p1);
		System.out.println(p2);

		System.out.println("p1.equals(p2):" + p1.equals(p2));
		System.out.println();

		p1 = p2;

		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1.equals(p2):" + p1.equals(p2));

	}

}
