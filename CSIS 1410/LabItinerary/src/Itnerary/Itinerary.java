/*
	Assignment: LabItinerary
	Program:	Itinerary
	Programmer: Tysen - Tysen Christensen
	Created:	Aug 28, 2019Aug 28, 2019
*/
/**
 * FILE Itinerary.java
 */
package Itnerary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * CLASS Itinerary
 * @author Tysen
 *
 */
public class Itinerary {

	/**
	 * METHOD - Void main-
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> itinerary = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String dest = null;
		do {
			System.out.print("Destination: ");
			dest = input.nextLine();
			if (!dest.equalsIgnoreCase("DONE")) {
				itinerary.add(dest.toUpperCase());
			}
		}while(!dest.equalsIgnoreCase("DONE"));
		
		StringBuilder sb = new StringBuilder();
		
		for (String s : itinerary) {
			sb.append(s);
			//if (itinerary.indexOf(s) != itinerary.size()-1) {
				sb.append(" to ");
			//}
		}
		
		sb.delete(sb.length()-4, sb.length()-1);
		String travelRoute = sb.toString();
		
		System.out.println("travel route: ");
		System.out.println(travelRoute);
	}

}
