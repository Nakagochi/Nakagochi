/*
	Assignment: FinalCodeCSIS1410
	Program:	RunCode
	Programmer: Tysen - Tysen Christensen
	Created:	Dec 9, 2019Dec 9, 2019
*/
/**
 * FILE RunCode.java
 */
package finalCode;

import java.util.*;

/**
 * @author Tysen CLASS - RunCode
 */
public class RunCode {

	/**
	 * METHOD-
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileExercise fe = new FileExercise();
		fe.fileChange();
		fe.printFile();
		System.out.printf("%n%n%n");

		SerializeExercise se = new SerializeExercise();
		se.printList();
		se.sortList();
		se.deSerialize();
		se.shuffle();

		ArrayList<Double> numberList = new ArrayList<Double>();
		ArrayList<String> stringList = new ArrayList<String>();
		numberList.add(1.1);
		numberList.add(2.2);
		numberList.add(3.3);
		numberList.add(4.4);
		numberList.add(5.5);
		numberList.add(6.6);
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		stringList.add("d");
		stringList.add("e");
		stringList.add("f");
		stringList.add("g");
System.out.printf("%n%n%n");
		System.out.printf("Original lists:%nnumber : " + numberList + "%nletters: " + stringList);
		removeEveryOtherElement(numberList);
		removeEveryOtherElement(stringList);
		System.out.printf("%n%nAfter removing:%nnumber : " + numberList + "%nletters: " + stringList);

	}

	public static <T> void removeEveryOtherElement(List<T> l) {
		
			for (int i = 0; i < l.size(); i++) {
				if(i+1<l.size()) {
					l.remove(i+1);
				}
			}

		}

	}

