/*
	Assignment: InterfaceAssignment1
	Program:	Square
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 7, 2019Oct 7, 2019
*/
/**
 * FILE Square.java
 */
package interfaceAssignment;


/**
 * @author Tysen
 *CLASS - Square
 */
public class Square  extends Rectangle implements Shape, Printable{
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
	*@see interfaceAssignment.Rectangle#toString()
	*/
	@Override
	public String toString() {
		return String.format("Square (%s)",getSide());
	}

}
