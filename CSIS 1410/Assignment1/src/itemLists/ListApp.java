/*
	Assignment: Assignment1
	Program:	ListApp
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 7, 2019Sep 7, 2019
*/
/**
 * FILE ListApp.java
 */
package itemLists;

import java.util.Scanner;

/**
 * @author Tysen CLASS - ListApp is the main application to run project.
 */
public class ListApp {

	/**
	 * METHOD- Main method to run project.
	 * 
	 */
	public static void main(String[] args) {
		ItemList gems = new ItemList();
		ItemStorage geminfo = new ItemStorage();
		DisplayList display = new DisplayList();
		Scanner input = new Scanner(System.in);
		int x = 0;
		String itemInput = null;
		int numInput = 0;
		boolean exit = false;
		do {
			display.display();
			x = input.nextInt();
			if (x >= 1 && x <= 6) {
				switch (x) {
				case 1:
					gems.printList();
					break;
				case 2:
					System.out.println("Type:");
					itemInput = input.next();
					geminfo.setType(itemInput);

					System.out.println("Size in Milimeters:");
					numInput = input.nextInt();
					geminfo.setSize(numInput);

					System.out.println("Shape:");
					itemInput = input.next();
					geminfo.setShape(itemInput);

					System.out.println("Color:");
					itemInput = input.next();
					geminfo.setColor(itemInput);

					gems.addItem(geminfo.toString());

					break;
				case 3:
					System.out.println("ID:");
					numInput = input.nextInt();
					gems.findItem(numInput);
					break;
				case 4:
					System.out.println("ID:");
					numInput = input.nextInt();
					gems.removeItem(numInput);
					break;
				case 5:
					gems.numberItem();
					break;
				case 6:
					exit = true;
					break;
				}

			} else {
				System.out.println("Please enter a number between 1-6 ");
			}

		} while (!exit == true);

		System.out.println("Good Bye, Thank You");
	}

}
