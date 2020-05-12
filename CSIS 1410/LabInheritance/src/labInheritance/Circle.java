/*
	Assignment: LabInheritance
	Program:	Circle
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE Circle.java
 */
package labInheritance;

/**
 * @author Tysen CLASS - Circle
 */
public class Circle {
	final private int radius;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param radius radius of the circle
	 */
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	/**
	 * METHOD-Finds the diameter
	 */
	public void diameter() {
		double x = radius;
		x *= 2;
		System.out.printf("Diameter: %s%n", x);

	}

	/**
	 * METHOD-finds the circumference
	 */
	public void circumference() {
		double x = 0;
		x = 2 * Math.PI * radius;
		System.out.printf("Circumference: %.3g%n", x);
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return String.format("Circle (%s)", radius);
	}

}
