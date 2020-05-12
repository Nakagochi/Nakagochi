/*
	Assignment: ListVsSet
	Program:	ColoredSquare
	Programmer: Tysen - Tysen Christensen
	Created:	Nov 4, 2019 
*/
package listVsSet;

import java.awt.Color;

/**
 * @author Tysen
 *CLASS - ColoredSquare
 */
public class ColoredSquare {
	/**
	 * FIELDS - int Side of square
	 */
	private int side;
	/**
	 * FIELDS - Color square color
	 */
	private Color color;

	
	/**
	 * CONSTRUCTOR
	 *@param side
	 *@param color
	 */
	public ColoredSquare(int side, Color color) {
		super();
		this.side = side;
		this.color = color;
	}

	/**
	 * METHOD- area returns the area
	 *@return
	 */
	public int area() {

		return (side * side);
	}

	
	/**
	*@see java.lang.Object#hashCode()
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + side;
		return result;
	}

	
	/**
	*@see java.lang.Object#equals(java.lang.Object)
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColoredSquare other = (ColoredSquare) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (side != other.side)
			return false;
		return true;
	}

	
	/**
	*@see java.lang.Object#toString()
	*/
	@Override
	public String toString() {

		  return String.format("side:%d #%02X%02X%02X",
	                side, color.getRed(), color.getGreen(),
	                color.getBlue());
	}

}
