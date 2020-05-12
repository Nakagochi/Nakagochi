/*
Assignment: 1410_Module02
	Program:	Module02App
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE Module02App.java
 */
package module02;

/**
 * @author Tysen Christensen CLASS - DeskPedal Super Class to DeskPedalPlus.
 */
public class DeskPedal {
	/**
	 * FIELDS - String is the color of the class.
	 */
	private String color;

	/**
	 * CONSTRUCTOR - Sets the Color of the class.
	 * 
	 * @param color - the color of class.
	 */
	public DeskPedal(String color) {
		super();
		this.color = color;
	}

	/**
	 * METHOD - getColor() gets the private variable color.
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * METHOD- pedal() prints "pedaling" to the Console.
	 */
	public void pedal() {
		System.out.println("pedaling..");
	}

	/**
	 * @Overide overrides the toString() method to print out the color and class.
	 */
	@Override
	public String toString() {
		return String.format("%s DeskPedal", color);
	}

}
