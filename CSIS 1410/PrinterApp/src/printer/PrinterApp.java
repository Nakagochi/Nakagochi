/*
	Assignment: PrinterApp
	Program:	PrinterApp
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 23, 2019Sep 23, 2019
*/
/**
 * FILE PrinterApp.java
 */
package printer;

import java.util.ArrayList;

/**
 * @author Tysen
 *CLASS - PrinterApp
 */
public class PrinterApp {
	public static void main(String[] args) {
	InkjetPrinter inkjet = new InkjetPrinter(44578993);
	System.out.println(inkjet);
	System.out.printf("Remaining cartridge: " + inkjet.getRemainingCartrage()+"%n%n");
	
	LaserPrinter laserprinter = new LaserPrinter(88993554);
	System.out.println(laserprinter);
	System.out.printf("Remaining cartridge: " + laserprinter.getRemainingToner()+"%n%n");
	ArrayList<Printer> printers = new ArrayList();
	printers.add(laserprinter);
	printers.add(inkjet);
	System.out.println("\nArray of Printers:");
	for(Printer p : printers) {System.out.printf("%n"+p); 
	p.print(); p.print();
	System.out.println();
	
	}
	
	}
	
	

	
}
