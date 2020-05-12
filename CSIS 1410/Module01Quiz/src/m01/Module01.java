/*
	Assignment: Module01Quiz
	Program:	Module01
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 11, 2019Sep 11, 2019
*/
/**
 * FILE Module01.java
 */
package m01;

import java.lang.StringBuilder;

/**
 * @author Tysen CLASS - Module01
 */
public class Module01 {
	/**
	 * METHOD- transform Transforms the word to output a specific sequence of
	 * characters.
	 * 
	 * @param word input that is to be transformed.
	 * @return The changed word.
	 */
	public static String transform(String word) {
		String wordInput="";
		String sbOut = "";
		StringBuilder sb = new StringBuilder(word.toLowerCase());
		StringBuilder reverseSB = new StringBuilder();
		char charA = '\'';
		char charB = '-';
		int y = sb.length() - 1;
		if (!word.equalsIgnoreCase("null")) {
			// (') + (-) removed.
			for (int x = 0; x <= y; x++) {

				if (sb.charAt(x) == charA || sb.charAt(x) == charB) {
					sb.deleteCharAt(x);
				}

				// Start a or b Upper case

				if (sb.charAt(0) == 'a') {
					sb.deleteCharAt(0);
					sb.replace(0, 0, "A");
				}
				if (sb.charAt(0) == 'b') {
					sb.deleteCharAt(0);
					sb.replace(0, 0, "B");
				}

				// Ends y or z Upper case
				if (sb.charAt(y) == 'y') {
					sb.deleteCharAt(y);
					sb.replace(y, y, "Y");
				}
				if (sb.charAt(y) == 'z') {
					sb.deleteCharAt(y);
					sb.replace(y, y, "Z");
				}
				wordInput = sb.toString();

				// Reverse word add _ and separate

				

			}
			word = sb.reverse() + "_" + wordInput;
			System.out.println(word);
		}
		return word;
	}
}
