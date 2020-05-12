/*
	Assignment: PrinterApp
	Program:	LaserPrinter
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 23, 2019Sep 23, 2019
*/
/**
 * FILE LaserPrinter.java
 */
package printer;

/**
 * @author Tysen
 *CLASS - LaserPrinter
 */
public class LaserPrinter extends Printer {
private int remainingToner;

/**
 * CONSTRUCTOR
 *@param remainingToner
 */
public LaserPrinter(int remainingToner) {
	super(remainingToner);
	this.remainingToner = 100;
	
}

/**
 * @return the remainingToner
 */
public int getRemainingToner() {
	return remainingToner;
}



@Override
public void print() {
	if(this.getRemainingToner() > 0) {
		this.remainingToner -= 10;
		System.out.printf("%nLaserPrinter is printing. Remaining toner: %d%%", this.remainingToner );
	}else { System.out.println("\nToner is empty.");}
	
}

}
