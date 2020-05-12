/*
	Assignment: 1410_Module02
	Program:	DeskPealPlus
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE DeskPealPlus.java
 */
package module02;

/**
 * @author Tysen CLASS - DeskPealPlus
 */
/**
 * @author Tysen CLASS - DeskPedalPlus subclass to the superclass DeskPedal.
 */
public class DeskPedalPlus extends DeskPedal {
	/**
	 * FIELDS - int sets the time.
	 */
	private int time = 0;

	/**
	 * CONSTRUCTOR sends the color to the superclass
	 * 
	 * @param color - the color
	 */
	public DeskPedalPlus(String color) {
		super(color);
	}

	/**
	 * @Override overrides the pedal class from DeskPedal to add an amount to the
	 *           time and print "pedaling.."
	 */
	@Override
	public void pedal() {
		time += 15;
		super.pedal();
	}

	/**
	 * METHOD- reset() resets the time.
	 */
	public void reset() {
		time = 0;
	}

	/**
	 * METHOD- printReport() prints a report for the total time pedaled.
	 */
	public void printReport() {
		int y = 0;
		int z = 0;
		y = time / 60;
		for (int x = 0; x < y; x++) {
			z = time - 60;
		}
		if (y > 0 && z < 60) {
			System.out.printf("Total time pedaled: %s' %s\"%n", y, z);
		} else {
			System.out.printf("Total time pedaled: %s\"%n", z);
		}
	}

	/**
	 * @Override toString() to print out the color, class and time.
	 */
	@Override
	public String toString() {
		return String.format("%s DeskPedalPlus %s min%n", getColor(), time);
	}

}
