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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		KeyValuePair<String, Integer> p3 = new KeyValuePair<>("LA", 3819702);
		KeyValuePair<String, Integer> p4 = new KeyValuePair<>("SF", 812826);

		List<KeyValuePair> cities = new ArrayList<>();
		cities.add(p1);
		cities.add(p2);
		cities.add(p3);
		cities.add(p4);
		System.out.println("Original List");
		for (KeyValuePair k : cities) {
			System.out.println(k);
		}
		System.out.println();

		Collections.sort(cities);
		System.out.println("Sorted List");
		for (KeyValuePair k : cities) {
			System.out.println(k);
		}

	}

}
