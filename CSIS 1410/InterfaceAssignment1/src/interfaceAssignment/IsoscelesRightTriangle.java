/*
	Assignment: InterfaceAssignment1
	Program:	IsoscelesRightTriangle
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 7, 2019Oct 7, 2019
*/
/**
 * FILE IsoscelesRightTriangle.java
 */
package interfaceAssignment;



/**
 * @author Tysen
 *CLASS - IsoscelesRightTriangle
 */
public class IsoscelesRightTriangle implements Shape, Printable {
	
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

	/**
	*@see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return String.format("IsoscelesRightTriangle (%s)", leg);
	}

	/**
	*@see interfaceAssignment.Printable#print()
	*/
	@Override
	public void print() {
		for(int x=1; x<=leg;x++) {
			if(x==1 && x<leg) {System.out.println("* ");}
			if(x==2 && x<leg) {System.out.println("* * ");}
			if(x>2 && x<leg) {
				System.out.print("* ");
				for(int y = 1; y!= (x-1); y++ ) {
					System.out.print("  ");
				}
				System.out.println("* ");
				
			}
			if(x == leg) {
				for(int y = 1; y<= leg; y++ ) {
					System.out.print("* ");
				}
			}
		}
		System.out.println("");
	}

	/**
	*@see interfaceAssignment.Shape#perimeter()
	*/
	@Override
	public double perimeter() {
		double hyp = Math.sqrt(Math.pow(leg, 2) + Math.pow(leg, 2));
		double p = (leg * 2) + hyp;
		return p;
	}

	/**
	*@see interfaceAssignment.Shape#area()
	*/
	@Override
	public double area() {
		double a = Math.pow(leg, 2) / 2;
		return a;
	}
}
