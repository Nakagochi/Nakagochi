/*
	Assignment: LabInheritance
	Program:	Square
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE Square.java
 */
package labInheritance;

/**
 * @author Tysen
 *CLASS - Square
 */
public class Square extends Rectangle{

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
	@Override
	public String toString() {
		return String.format("Square (%s)",getSide());
	}

}
