/*
	Assignment: PrinterApp
	Program:	Printer
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 23, 2019Sep 23, 2019
*/
/**
 * FILE Printer.java
 */
package printer;

/**
 * @author Tysen
 *CLASS - Printer
 */
public abstract class Printer {
	private int serialNumber;

	public Printer(int serialNumber) {super();
	this.serialNumber = serialNumber;}
	
	public abstract void print();

	@Override
	public String toString() {
		return String.format("Printer [serialNumber=%s]", serialNumber);
	}
	
}
