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
 * @author Tysen CLASS - Module02App
 */
public class Module02App {

	/**
	 * METHOD- main runs the classes to show how they work.
	 */
	public static void main(String[] args) {
		DeskPedal deskPedal1 = new DeskPedal("blue");
		DeskPedalPlus deskPedal2 = new DeskPedalPlus("blue");

		System.out.printf("deskPedal1: " + deskPedal1.toString() + "%n");
		deskPedal1.pedal();
		System.out.printf("%ndeskPedal2: " + deskPedal2.toString());
		deskPedal2.printReport();

		for (int x = 0; x != 4; x++) {
			deskPedal2.pedal();
		}
		System.out.printf("deskPedal2: " + deskPedal2.toString());
		deskPedal2.printReport();
		deskPedal2.pedal();
		System.out.printf("deskPedal2: " + deskPedal2.toString());
		deskPedal2.printReport();
		deskPedal2.reset();
		System.out.printf("deskPedal2: " + deskPedal2.toString());

	}

}
