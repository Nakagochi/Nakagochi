package concert;
/*
	Assignment: LabConcert
	Program:	Concert
	Programmer: Tysen - Tysen Christensen
	Created:	Aug 26, 2019Aug 26, 2019
*/

/**
 * CLASS FILE - COncert.java
 */
/**
 * Class Concert - creates an instance/ object of the concert class.
 * 
 * @author Tysen
 *
 */
public class Concert {
	
	/**
	 * FIELD - String name is the name of the concert
	 */
	private String name;
	/**
	 *  FIELD - Time startTime is the time the concert begins
	 */
	private Time startTime;
	/**
	 * FIELD - Time endTime is the time the concert ends
	 */
	
	private Time endTime;
	/**
	 * CONSTRUCTOR - Concert instantiates and instance /object of class Concert.
	 * 
	 * @param n Concert name
	 * @param start Concert start time
	 * @param end Concert end time
	 */
	public Concert(String n, Time start, Time end) {
		super();
		this.name = n;
		this.startTime = start;
		this.endTime = end;
	}
	/** (Javadoc)
	 * @see Java.lang.Object#toString() overrides the toString from Object class
	 */
	@Override
	public String toString() {
		return String.format("Concert %s starts at %s and ends at %s", name, startTime.toMilitary(), endTime.toMilitary());
	}
	
	
	
}
