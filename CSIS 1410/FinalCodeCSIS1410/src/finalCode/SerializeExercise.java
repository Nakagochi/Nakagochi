/*
	Assignment: FinalCodeCSIS1410
	Program:	SerializeExercise
	Programmer: Tysen - Tysen Christensen
	Created:	Dec 9, 2019Dec 9, 2019
*/
/**
 * FILE SerializeExercise.java
 */
package finalCode;

import java.io.*;
import java.util.*;

/**
 * @author Tysen CLASS - SerializeExercise
 */
/**
 * @author Tysen
 *CLASS - SerializeExercise
 */
public class SerializeExercise {

	/**
	 * FIELDS - List<Integer>
	 */
	private List<Integer> l;
	/**
	 * FIELDS - ArrayList<Integer>
	 */
	private ArrayList<Integer> i = new ArrayList<Integer>();
	/**
	 * FIELDS - ArrayList<String>
	 */
	private ArrayList<String> numbers2 = new ArrayList<String>();

	/**
	 * CONSTRUCTOR
	 */
	/**
	 * CONSTRUCTOR
	 */
	public SerializeExercise() {
		super();
		i.add(10);
		i.add(15);
		i.add(20);
		i.add(25);
		i.add(30);
		i.add(35);
		i.add(40);
		i.add(45);
		i.add(50);
		Random r = new Random();
		r.setSeed(19);
		l = new ArrayList<Integer>();
		for (int x = 0; x < 20; x++) {
			l.add(i.get(r.nextInt(9)));
		}
	}

	/**
	 * METHOD- printList prints list
	 */
	public void printList() {
		System.out.println("numbers : " + l);
	}

	/**
	 * METHOD-sortList sorts and serilzes the list
	 */
	public void sortList() {
		Collections.sort(l);
		try {
			FileOutputStream fos = new FileOutputStream("src/finalCode/NumberList.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(l);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/**
	 * METHOD-seserializes and print list
	 */
	public void deSerialize() {
		
		try {
			FileInputStream fis = new FileInputStream("src/finalCode/NumberList.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			numbers2 = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		System.out.println("numbers2: "+ numbers2);
	}
	/** 
	 * METHOD- suffles list
	 */
	public void shuffle() {
		Collections.shuffle(numbers2);
		System.out.println("numbers2: " + numbers2);
	}
}
