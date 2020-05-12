/*
	Assignment: ListVsSet
	Program:	ListVsSetDemo
	Programmer: Tysen - Tysen Christensen
	Created:	Nov 4, 2019 
*/
package listVsSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Tysen
 *CLASS - ListVsSetDemo
 */
public class ListVsSetDemo {
	/**
	 * FIELDS - List<ColoredSquare> - Creates a list called list
	 */
	private List<ColoredSquare> list;
	/**
	 * FIELDS - Set<ColoredSquare> - Creates a set called set
	 */
	private Set<ColoredSquare> set;

	
	/**
	 * CONSTRUCTOR
	 *@param elements
	 */
	public ListVsSetDemo(ColoredSquare... elements) {
		list = new ArrayList<ColoredSquare>();

		set = new HashSet<ColoredSquare>();

		for (ColoredSquare el : elements){

			addElement(el);

		}
	}

	/**
	 * METHOD- getListElements gets the elements of the list
	 *@return
	 */
	public String getListElements(){

		StringBuilder string = new StringBuilder();

		for (ColoredSquare el : list) {
			string.append(el.toString()).append("\n");

		}

		return string.toString();

	}

	/**
	 * METHOD- getSetElements gets the elements of the set
	 *@return
	 */
	public String getSetElements(){

		StringBuilder string = new StringBuilder();

		for (ColoredSquare el : set){

			string.append(el.toString()).append("\n");

		}

		return string.toString();

	}

	/**
	 * METHOD- addElement adds elements to both the list and set
	 *@param el
	 */
	public void addElement(ColoredSquare el) {
		list.add(el);
		set.add(el);
	}

}
