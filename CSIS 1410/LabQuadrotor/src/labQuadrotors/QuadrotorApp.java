/*
	Assignment: LabQuadrotor
	Program:	QuadrotorApp
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 14, 2019Oct 14, 2019
*/
/**
 * FILE QuadrotorApp.java
 */
package labQuadrotors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tysen CLASS - QuadrotorApp
 */
public class QuadrotorApp {

	/**
	 * METHOD-
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Quadrotor> rotors = new ArrayList(Arrays.asList(new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), new Quadrotor(4, 4, 6),
				new Quadrotor(5, 4, 2), new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6)));

		System.out.println(rotors);
		changeOrientation(rotors);
		System.out.println(rotors);
		Quadrotor searchItem = new Quadrotor(4,6,4);
		System.out.printf("rotors %s contain %s%n", rotors.contains(searchItem) ? "does" : "doesn't", searchItem);
		System.out.printf("Number of rotors: %d%n", rotors.size());
		
		System.out.println("Remove searchItem = " + rotors.remove(searchItem));
		System.out.println(rotors);
		System.out.println("Remove First Item: "+ rotors.remove(0));
		System.out.println(rotors);
	}

	private static void changeOrientation(List<Quadrotor> list) {
		for (Quadrotor q : list) {
			int temp = q.getX();
			q.setX(q.getY());
			q.setY(temp);

		}

	}

}
