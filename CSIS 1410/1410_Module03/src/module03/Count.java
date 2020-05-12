/*
	Assignment: 1410_Module03
	Program:	Count
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 9, 2019Oct 9, 2019
*/
/**
 * FILE Count.java
 */
package module03;

/**
 * @author Tysen CLASS - Count
 */
public class Count {
	/**
	 * FIELDS - int a Counter var
	 */
	private int rCount =0;
	/**
	 * FIELDS - int a Counter var
	 */
	private int dCount = 0;

	/**
	 * CONSTRUCTOR Count() is an unparameterized constructor creating an instance of the Count class within another class.
	 */
	public Count() {
		
	}

	/**
	 * METHOD-reCounter() Adds a 1 to the rCount variable.
	 */
	public void repCounter() {
		if(rCount != 99) {rCount++;}
		
	}

	/**
	 * METHOD-demCounter() Adds a 1 to the dCount variable.
	 */
	public void demCounter() {
		if(dCount !=99) {dCount++;}
		
	}

	/**
	 * @return the rCount in String format of ##
	 */
	public String getrCount() {
		return String.format("%02d", rCount);
	}

	/**
	 * @return the dCount in String format of ##
	 */
	public String getdCount() {
		return String.format("%02d", dCount);
	}

}
