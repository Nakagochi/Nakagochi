/*
	Assignment: 1410_A03
	Program:	CodingBat
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 15, 2019Sep 15, 2019
*/
/**
 * FILE CodingBat.java
 */
package a03;

/**
 * @author Tysen CLASS - CodingBat
 */
public class CodingBat {

	/**
	 * METHOD- zipZap takes a string and looks for a pattern of strings that begin with z and end with p
	 * 		   and removes the middle character.
	 *@param str String input from user
	 *@return answer the augmented String that removeds the middle character between z and p.
	 */
	public String zipZap(String str) {
		String answer = "";
		if (str.length() < 3) 
			return str;
		
		for (int y = 0; y < str.length(); y++) {
			if (str.charAt(y) == 'z' && str.charAt(y + 2) == 'p') {
				answer = answer + "zp";
				y += 2;
			} else {
				answer = answer + str.charAt(y);
			}

		}

		return answer;
	}

	
	
}
