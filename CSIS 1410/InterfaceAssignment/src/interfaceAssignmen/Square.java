/*
	Assignment: LabInheritance
	Program:	Square
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE Square.java
 */
package interfaceAssignmen;


/**
 * @author Tysen
 *CLASS - Square
 */
public class Square extends Rectangle implements Shape, Printable{

	/**
	 * CONSTRUCTOR
	 *@param length side of square sent to SuperClass Rectangle
	 *
	 */
	public Square(int length) {
		super(length, length);
		
	}
	/**
	 * METHOD-gets the side of the square from superclass
	 *@return getLength() from super class
	 */
	public int getSide() {
		return getLength() ;
	}
	
	/**
	*@see interfaceAssignmen.Rectangle#toString()
	*/
	@Override
	public String toString() {
		return String.format("Square (%s)",getSide());
	}
	/**
	*@see interfaceAssignmen.Shape#perimeter()
	*/
	@Override
	public double perimeter() {
		double per = (getLength() * 2) + (getWidth() * 2);
		return per;
	}

	/**
	*@see interfaceAssignmen.Shape#area()
	*/
	@Override
	public double area() {
		double a = getLength() * getWidth();
		return a;
	}

	/**
	*@see interfaceAssignmen.Printable#print()
	*/
	@Override
	public void print() {
		for (int x = 1; x <= getLength(); x++) {
			if (x == 1 || x == getLength()) {
				for (int y = 1; y <= getWidth(); y++) {
					System.out.printf("* ");
					if(y ==getWidth()) {System.out.printf("%n");}
				}
			} else {
				for (int y = 1; y <= getWidth(); y++) {
					if (y == 1 || y == getWidth()) {
						System.out.printf("* ");
						if(y ==getWidth()) {System.out.printf("%n");}
					} else {
						System.out.printf("  ");
					}
				}
			}

		}

	}
	

}


