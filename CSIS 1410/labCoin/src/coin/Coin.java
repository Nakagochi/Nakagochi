/*
	Assignment: labCoin
	Program:	Coin
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 28, 2019Oct 28, 2019
*/
/**
 * FILE Coin.java
 */
package coin;

/**
 * @author Tysen
 *CLASS - Coin
 */
public enum Coin {
	CENT(2.5, 19.15), NICKEL(5, 21.21), DIME(2.268, 17.91), QUARTER(5.670, 25.26);
	
	
	private final double weight;
	private final double diameter;
	/**
	 * CONSTRUCTOR
	 *@param weight
	 *@param diameter
	 */
	private Coin(double weight, double diameter) {
		this.weight = weight;
		this.diameter = diameter;
	}
	@Override
	public String toString() {
		return String.format("%s w:%.1f d:%.1f", this.name(), this.weight, this.diameter);
	}
}
