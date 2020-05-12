/*
	Assignment: LabInheritance
	Program:	IsoscelesRightTriangle
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE IsoscelesRightTriangle.java
 */
package labInheritance;

/**
 * @author Tysen CLASS - IsoscelesRightTriangle
 */
public class IsoscelesRightTriangle {
	final private int leg;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param leg side of a Isosceles Right Triangle sent to SuperClass
	 *
	 */
	public IsoscelesRightTriangle(int leg) {
		super();
		this.leg = leg;
	}

	/**
	 * METHOD-finds the hypotenuse of the triangle
	 */
	public void hypotenuse() {
		double x = 0;
		x = Math.pow(leg, 2) + Math.pow(leg, 2);
		System.out.printf("Hypotenuse: %.2g%n%n", (Math.sqrt(x)));
	}

	/**
	 * @return the leg
	 */
	public int getLeg() {
		return leg;
	}

	@Override
	public String toString() {
		return String.format("IsoscelesRightTriangle (%s)", leg);
	}

	/**
	 * METHOD-
	 */
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
