/*
	Assignment: LabInheritance
	Program:	InheritanceApp
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE InheritanceApp.java
 */
package labInheritance;

import java.util.ArrayList;

/**
 * @author Tysen CLASS - InheritanceApp
 */
public class InheritanceApp {

	/**
	 * METHOD-where the methods are implemented.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5, 4);
		Square mySquare = new Square(4);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		Circle myCircle = new Circle(4);

		// Rectangle
		System.out.printf(myRectangle.toString() + "%n");
		System.out.printf("Length: %s%nWidth: %s%n%n", myRectangle.getLength(), myRectangle.getWidth());

		// Square
		System.out.printf(mySquare.toString() + "%n");
		System.out.printf("Side: %s%n%n", mySquare.getSide());

		// IsoscelesRightTriangle
		System.out.printf(myIsoscelesRightTriangle.toString() + "%nLeg: %s%n", myIsoscelesRightTriangle.getLeg());
		myIsoscelesRightTriangle.hypotenuse();

		// Circle
		System.out.printf(myCircle.toString() + "%n");
		myCircle.diameter();
		myCircle.circumference();
		System.out.printf("Radius: %s%n%n", myCircle.getRadius());

		// rectangle2
		Rectangle rectangle2 = new Square(4);
		System.out.printf("rectangle2%n----------%n" + rectangle2.toString() + "%n");
		System.out.printf("Length: %s%nWidth: %s%n%n", rectangle2.getLength(), rectangle2.getWidth());

		ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();

		rectangle.add(rectangle2);
		rectangle.add(mySquare);
		rectangle.add(myRectangle);
		System.out.printf("Rectangle Array:%n----------------%n");
		for (int x = 0; x != rectangle.size(); x++) {

			System.out.printf(rectangle.get(x).toString() + "%n");
			System.out.printf("Length: %s%nWidth: %s%n%n", rectangle.get(x).getLength(), rectangle.get(x).getWidth());
		}
	}

}
