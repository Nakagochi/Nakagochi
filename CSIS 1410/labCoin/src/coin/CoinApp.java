/*
	Assignment: labCoin
	Program:	CoinApp
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 28, 2019Oct 28, 2019
*/
/**
 * FILE CoinApp.java
 */
package coin;

/**
 * @author Tysen
 *CLASS - CoinApp
 */
public class CoinApp {

	/**
	 * METHOD-
	 *@param args
	 */
	public static void main(String[] args) {
		for(Coin c  : Coin.values()) {
			System.out.println(c);
		}

	}

}
