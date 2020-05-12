/*
	Assignment: LabRegex
	Program:	LabRegex
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 4, 2019Sep 4, 2019
*/
/**
 * FILE LabRegex.java
 */
package regexLab;

import java.util.Scanner;

/**
 * @author Tysen
 *
 */
public class LabRegex {

		public static void main(String[] args) {
			String myRegex1 = "CS\\d{4}";
			test(myRegex1);
			String myRegex2 = "A\\w*";
			test(myRegex2);
			String myRegex3 = "[A|E|I|O|U]\\w*";
			test(myRegex3);
			String myRegex4 = "[A|E|I|O|U]\\w{2}\\w*"; //Could also use the +
			test(myRegex4);
			String myRegex5 = "[2-9]\\d{2}-\\d{3}-\\d{4}$"; 
			test(myRegex5);
			String myRegex6 = "[A-Za-z0-9](([_\\.\\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([\\.\\-]?[a-zA-Z0-9]+)*)\\.([A-Za-z]{2,})$"; 
			test(myRegex6);
			
		}

		private static void test(String regex) {
			String word;
			Scanner input = new Scanner(System.in);

			System.out.printf("Enter words to match the expression %s%n", regex);
			System.out.println("Enter DONE when you are finished");
			System.out.print("Word: ");
			word = input.nextLine();
			while (!word.equalsIgnoreCase("done")) {
				System.out.printf("%s %s%n", word, word.matches(regex) ? "matches" : "does not match");
				System.out.print("Word: ");
				word = input.nextLine();
			}
		
		}
	}
