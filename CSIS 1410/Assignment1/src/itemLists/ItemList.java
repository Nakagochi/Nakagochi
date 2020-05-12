/*
	Assignment: Assignment1
	Program:	ItemList
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 7, 2019Sep 7, 2019
*/
/**
 * FILE ItemList.java
 */
package itemLists;

import java.util.ArrayList;

/**
 * @author Tysen CLASS - ItemList stores items within an arraylist.
 */
public class ItemList {
	/**
	 * FIELDS - ArrayList sets an array for String variables.
	 */
	ArrayList<String> gem = new ArrayList<String>();

	/**
	 * CONSTRUCTOR - ItemList() adds gems to the array when constructing the class.
	 */
	public ItemList() {
		gem.add("Type of Gem: Sapphire Size: 5 mm Shape: Square Color: Blue ID: 21958926");
		gem.add("Type of Gem: Diamond Size: 69 mm Shape: Oval Color: Clear ID: 21958927");
		gem.add("Type of Gem: Opal Size: 6.5 mm Shape: Tear Drop Color: White ID: 21958928");
	}

	/**
	 * METHOD-printList() prints the variables within the array.
	 */
	public void printList() {
		for (int i = 0; i < gem.size(); i++) {
			System.out.println(gem.get(i));
		}
	}

	/**
	 * METHOD-addItem(String gems) adds an item into the gem array.
	 * 
	 * @param gems-String
	 */
	public void addItem(String gems) {
		gem.add(gems);
	}

	/**
	 * METHOD-findItem(int id) finds the item within the array.
	 * 
	 * @param id-int
	 */
	public void findItem(int id) {
		int x = id - 21958929;
		if (x <= gem.size() && x < 0) {
			System.out.printf("ID %s is not found.\n", id);
		} else {
			System.out.println(gem.get(x));
		}
	}

	/**
	 * METHOD-removeItem(int id) finds and removes items from the array.
	 * 
	 * @param id-int
	 */
	public void removeItem(int id) {
		int x = id - 21958929;
		if (x <= gem.size() && x < 0) {
			System.out.printf("ID %s is not found.\n", id);
		} else {
			gem.remove(x);
			System.out.printf("Gem at ID:%s has been deleted\n", id);
		}
	}

	/**
	 * METHOD- numberItem() shows how many items are in the array.
	 */
	public void numberItem() {
		System.out.println("Number of Gems " + gem.size());
	}

}
