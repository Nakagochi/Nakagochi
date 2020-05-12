/*
	Assignment: LabInheritance
	Program:	Circle
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE Circle.java
 */
package interfaceAssignmen;

/**
 * @author Tysen CLASS - Circle
 */
public class Circle implements Shape {
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

	/**
	*@see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return String.format("Circle (%s)", radius);
	}

	/**
	*@see interfaceAssignmen.Shape#perimeter()
	*/
	@Override
	public double perimeter() {
		double x = 0;
		x = 2 * Math.PI * radius;
		return x;
	}

	
	/**
	*@see interfaceAssignmen.Shape#area()
	*/
	@Override
	public double area() {
		double x = Math.PI * Math.pow(radius, 2);
		return x;
	}

}
