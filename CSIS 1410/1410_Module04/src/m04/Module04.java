/*
	Assignment: 1410_Module04
	Program:	Module04
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 16, 2019Oct 16, 2019
*/
/**
 * FILE Module04.java
 */
package m04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tysen CLASS - Module04
 */
public class Module04 implements Module04Interface {
	

	/**
	 * CONSTRUCTOR
	 */
	public Module04() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	*@see m04.Module04Interface#demoCollection()
	*/
	@Override
	public void demoCollection() {
		int hold = 0;
		double n = 0;
		int f = 0;
		String h = "";
		ArrayList<Double>numbers = new ArrayList<Double>();
		
		numbers.add(1.0 / 5.0); 
		numbers.add(2.0 / 5.0) ;
		numbers.add(3.0 / 5.0) ;
		numbers.add(1.0 / 4.0) ;
		numbers.add(1.0 / 2.0) ;
		numbers.add( 3.0 / 4.0 );
		f = numbers.size();
		System.out.println("numbers: " + numbers);
		
		hold = numbers.size();
		for (int x = 0; x <= hold; x++) {
			n = 2 *numbers.get(x);
			numbers.add(n);
			
		}
		numbers.sort(null);
		System.out.println("numbers: "+numbers);
		
		hold = numbers.size();
		
		for (int x = 0; x < hold; x++) {
			n = 100* numbers.get(0);
			
			numbers.add(n);
			numbers.remove(0);
		}
		numbers.sort(null);
		System.out.println("numbers: "+numbers);
		System.out.println("");
		hold = numbers.size();
		ArrayList<String> hexNumbers = new ArrayList<String>();
		for (int x = 0; x < hold; x++) {
			h= Double.toHexString(numbers.get(x));
			hexNumbers.add(h);
		}
		System.out.println("hexNumbers: " +hexNumbers);
		List<String> listWithoutDuplicates = hexNumbers.stream().distinct().collect(Collectors.toList());
		System.out.println("hexNumbers: " +listWithoutDuplicates);
	}



}
