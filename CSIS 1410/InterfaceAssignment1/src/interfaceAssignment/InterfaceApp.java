/*
	Assignment: InterfaceAssignment1
	Program:	InterfaceApp
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 7, 2019Oct 7, 2019
*/
/**
 * FILE InterfaceApp.java
 */
package interfaceAssignment;

import java.text.DecimalFormat;
import java.util.ArrayList;



/**
 * @author Tysen
 *CLASS - InterfaceApp
 */
public class InterfaceApp {

	/**
	 * METHOD-
	 *@param args
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		
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

		shape.add( mySquare);
		shape.add( myRectangle);
		shape.add( myIsoscelesRightTriangle);
		shape.add( myCircle);
		System.out.printf("Shape Array:%n------------%n");

		for (int x = 0; x != shape.size(); x++) {

			System.out.printf(shape.get(x).toString() + "%n");
			System.out.printf("Perimiter: %s%nArea: %s%n%n", df.format(shape.get(x).perimeter()), df.format(shape.get(x).area()));
			if (shape.get(x) instanceof Rectangle) {
				((Rectangle) shape.get(x)).print();
			}
			if (shape.get(x) instanceof IsoscelesRightTriangle) {
				( myIsoscelesRightTriangle).print();
			}

		}
	}

	

}
