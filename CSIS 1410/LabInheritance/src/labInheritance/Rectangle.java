/*
	Assignment: LabInheritance
	Program:	Rectangle
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE Rectangle.java
 */
package labInheritance;

/**
 * @author Tysen CLASS - Rectangle
 */
public class Rectangle {
	final private int length;
	final private int width;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param length side of Rectangle
	 * @param width  side of Rectangle
	 */
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return String.format("Rectangle (%sX%s)", length, width);
	}

	/**
	 * METHOD-
	 */
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
