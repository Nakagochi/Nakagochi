/*
	Assignment: LabConcert
	Program:	ConcertApp
	Programmer: Tysen - Tysen Christensen
	Created:	Aug 26, 2019Aug 26, 2019
*/
/**
 * CLASS File-
 */
package concert;

import javax.swing.JOptionPane;

/**
 * @author Tysen
 *
 */
public class ConcertApp {

	/**
	 * METHOD - void main -
	 * @param args
	 */
	public static void main(String[] args) {
		Concert myConcert = new Concert("FyreFest", new Time(17,30,0), new  Time(23,30,0));
		JOptionPane.showMessageDialog(null, myConcert.toString());
		System.out.println(myConcert.toString());
		
	}

}
