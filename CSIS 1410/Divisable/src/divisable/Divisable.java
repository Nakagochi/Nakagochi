/*
	Assignment: Divisable
	Program:	Divisable
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 18, 2019Sep 18, 2019
*/
/**
 * FILE Divisable.java
 */
package divisable;



/**
 * @author Tysen
 *CLASS - Divisable
 */
public class Divisable {
	
 public Divisable() {}
int count = 0;
 public int divide(int n, int d) {
	 
	 
	 if(!(n<d)) {
		 n -= d;
		 count++;
		 divide(n,d);
	 }
	
	 return count;
 }

}
