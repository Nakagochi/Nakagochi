/*
	Assignment: InterfaceAssignment
	Program:	InterfaceApp
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 7, 2019Oct 7, 2019
*/
/**
 * FILE InterfaceApp.java
 */
package interfaceAssignmen;

/**
 * @author Tysen
 *CLASS - InterfaceApp
 */

	/*
	Assignment: InterfaceAssignment
	Program:	InterfaceApp
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 5, 2019Oct 5, 2019
*/
/**
 * FILE InterfaceApp.java
 */

import java.util.ArrayList;

import labInheritance.Circle;
import labInheritance.IsoscelesRightTriangle;
import labInheritance.Rectangle;
import labInheritance.Square;

/**
 * @author Tysen CLASS - InterfaceApp
 */
public class InterfaceApp {

	/**
	 * METHOD-
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(6, 3);
		Square mySquare = new Square(5);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(6);
		Circle myCircle = new Circle(5);

		// Rectangle
		System.out.printf(myRectangle.toString() + "%n");

		// Square
		System.out.printf(mySquare.toString() + "%n");

		// IsoscelesRightTriangle
		System.out.printf(myIsoscelesRightTriangle.toString() + "%n", myIsoscelesRightTriangle.getLeg());
		myRectangle.print();

		// Circle
		System.out.printf(myCircle.toString() + "%n");
		myCircle.diameter();
		myCircle.circumference();

		ArrayList<Shape> shape = new ArrayList<Shape>();

		shape.add((Shape) mySquare);
		shape.add((Shape) myRectangle);
		shape.add((Shape) myIsoscelesRightTriangle);
		shape.add((Shape) myCircle);
		System.out.printf("Shape Array:%n------------%n");

		for (int x = 0; x != shape.size(); x++) {

			System.out.printf(shape.get(x).toString() + "%n");
			System.out.printf("Perimiter: %s%nArea: %s%n%n", shape.get(x).perimeter(), shape.get(x).area());
			if (shape.get(x) instanceof Rectangle) {
				((Rectangle) shape.get(x)).print();
			}
			if (shape.get(x) instanceof IsoscelesRightTriangle) {
				( (IsoscelesRightTriangle) myIsoscelesRightTriangle).print();
			}

		}
	}

}

