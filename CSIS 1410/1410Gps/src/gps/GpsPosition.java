/*
	Assignment: 1410Gps
	Program:	GpsPosition
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 21, 2019Sep 21, 2019
*/
/**
 * FILE GpsPosition.java
 */
package gps;

/**
 * @author Tysen 
 * CLASS - GpsPosition creates the position for the Gps.
 */

public class GpsPosition {
	/**
	 * FIELDS - double latitude of position
	 */
	private double latitude;
	/**
	 * FIELDS - double longitude of position
	 */
	private double longitude;
	/**
	 * FIELDS - double elevation of position
	 */
	private double elevation;

	/**
	 * CONSTRUCTOR- constructs GpsPosition within a class.
	 * 
	 * @param latitude-double
	 * @param longitude-double
	 * @param elevation-double
	 */
	public GpsPosition(double latitiude, double longitude, double elevation) {
		super();
		this.latitude = latitiude;
		this.longitude = longitude;
		this.elevation = elevation;
		if (latitude < -90 || latitude > 90 && longitude < -180 || longitude > 180) {
			throw new IllegalArgumentException("invalid latitude and / or longitude");
		}
	}

	/**
	 * METHOD- getLatitude gets the Latitude from the private variables.
	 * 
	 * @return - latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * METHOD- getLongitude gets the Longitude from the private variables.
	 * 
	 * @return - longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * METHOD-getElevation gets the elevation from private variables.
	 * 
	 * @return - elevation
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * METHOD - override toString method creates a string from the variables above.
	 * 
	 * @return - "%s, %s (%s)", latitude, longitude, elevation
	 */
	@Override
	public String toString() {
		return String.format("%s, %s (%s)", latitude, longitude, elevation);
	}

}
