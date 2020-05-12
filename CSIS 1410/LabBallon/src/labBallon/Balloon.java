/*
	Assignment: LabBallon
	Program:	Ballon
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 30, 2019Sep 30, 2019
*/
/**
 * FILE Ballon.java
 */
package labBallon;

/**
 * @author Tysen CLASS - Balloon
 */
public class Balloon {
	private Size size;
	private Boolean helium;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param size
	 * @param helium
	 */
	public Balloon(Size size, Boolean helium) {
		super();
		this.size = size;
		this.helium = helium;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((helium == null) ? 0 : helium.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balloon other = (Balloon) obj;
		if (helium == null) {
			if (other.helium != null)
				return false;
		} else if (!helium.equals(other.helium))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", this.size, this.helium ? "Helium" : "Air");
	}
	
	

}
