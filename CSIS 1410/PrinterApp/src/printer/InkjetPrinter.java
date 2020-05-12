/*
	Assignment: PrinterApp
	Program:	InkjetPrinter
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 23, 2019Sep 23, 2019
*/
/**
 * FILE InkjetPrinter.java
 */
package printer;

/**
 * @author Tysen
 *CLASS - InkjetPrinter
 */
public class InkjetPrinter extends Printer {
	private int remainingCartrage;

	/**
	 * CONSTRUCTOR
	 *@param remainingToner
	 */
	public InkjetPrinter(int remainingCartrage) {
		super(remainingCartrage);
		this.remainingCartrage = 100;
		
	}

	/**
	 * @return the remainingToner
	 */
	public int getRemainingCartrage() {
		return remainingCartrage;
	}



	@Override
	public void print() {
		if(this.getRemainingCartrage() > 0) {
			this.remainingCartrage -= 10;
			System.out.printf("%nLaserPrinter is printing. Remaining toner: %d%%", this.remainingCartrage );
		}else { System.out.println("\nToner is empty.");}
		
	}
}
