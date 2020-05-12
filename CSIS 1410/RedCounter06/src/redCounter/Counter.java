/*
	Assignment: RedCounter06
	Program:	Counter
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 9, 2019Oct 9, 2019
*/
/**
 * FILE Counter.java
 */
package redCounter;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Tysen CLASS - Counter
 */
public class Counter {
	private int counter = 0;
	private Color color = Color.ORANGE;
	ArrayList<Color> c = new ArrayList<Color>();
	Random r = new Random();

	/**
	 * CONSTRUCTOR
	 */
	public Counter() {
		c.add(Color.RED);
		c.add(Color.BLUE);
		c.add(Color.GREEN);
		c.add(Color.ORANGE);
		c.add(Color.MAGENTA);
		color = c.get(r.nextInt(5));

	}

	public Color randomColor(Color colorA) {

		while (color == colorA) {
			color = c.get(r.nextInt(5));

		}

		return color;
	}

	public void count(Color colorB) {
		if (colorB == Color.RED) {
			counter++;
		}
	}

	/**
	 * @return the counter
	 */
	public String getCounter() {
		return String.format("%02d", counter);
	}

}
