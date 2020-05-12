/*
	Assignment: 1410Gps
	Program:	Gps
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 21, 2019Sep 21, 2019
*/
/**
 * FILE Gps.java
 */
package gps;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Tysen CLASS - Gps Functions of the gps.
 */
public class Gps {
	/**
	 * FIELDS - ArrayList<GpsPosition> array of positions
	 */
	private ArrayList<GpsPosition> route = new ArrayList<GpsPosition>();

	/**
	 * CONSTRUCTOR - Constructs the Gps class within the code.
	 * 
	 * @param route
	 */
	public Gps(GpsPosition position) {
		super();
		this.route.add(position);
	}

	/**
	 * METHOD-Gets the position form the array.
	 * 
	 * @return route
	 */
	public ArrayList<GpsPosition> getRoute() {
		return route;
	}

	/**
	 * METHOD- update Adds a position to the array.
	 * 
	 * @param position
	 */
	public void update(GpsPosition position) {
		route.add(position);
	}

	/**
	 * METHOD-randomUpdate randomly updates position by +- .5 of a degree.
	 */
	public void randomUpdate() {
		double y = 0;
		double z = 0;
		Random d = new Random();
		GpsPosition x = route.get(route.size() - 1);
		if (d.nextBoolean()) {
			y = x.getLatitude() + (d.nextDouble() * .5);
			z = x.getLongitude() + (d.nextDouble() * .5);
		} else
			y = x.getLatitude() + (d.nextDouble() * -.5);
		z = x.getLongitude() + (d.nextDouble() * -.5);
		{
		}

	}

	/**
	 * METHOD-GpsPosition get the current position from the array.
	 * 
	 * @return route size-1
	 */
	public GpsPosition position() {
		return route.get(route.size() - 1);
	}

	/**
	 * METHOD-distanceTraveled calculates the total distances traveltd form start to
	 * end.
	 * 
	 * @return d the sum of all distances.
	 */
	public double distanceTraveled() {
		double d = 0;
		GpsPosition p1;
		GpsPosition p2;

		for (int x = 0; x != route.size() - 1; x++) {
			if (x != route.size() - 1) {
				p1 = route.get(x);
				p2 = route.get(x + 1);
				d += Gps.distance(p1, p2);

			}
		}
		return d;
	}

	/**
	 * METHOD- distance gets the distance between two positions.
	 * 
	 * @param p1 First position
	 * @param p2 Second position
	 * @return distance in kilometers
	 */
	private static double distance(GpsPosition p1, GpsPosition p2) {
		final int R = 6371; // Radius of the earth
		double lat2 = p2.getLatitude(), lat1 = p1.getLatitude();
		double lon1 = p1.getLongitude(), lon2 = p2.getLongitude();
		double el1 = p1.getElevation(), el2 = p2.getElevation();
		double latDistance = Math.toRadians(lat2 - lat1);
		double lonDistance = Math.toRadians(lon2 - lon1);
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = R * c * 1000; // convert to meters

		double height = el1 - el2;

		distance = Math.pow(distance, 2) + Math.pow(height, 2);

		return (Math.sqrt(distance) / 1000);

	}

	/**
	 * METHOD-resets the array with the start being the last position added.
	 */
	public void reset() {
		GpsPosition v = route.get(route.size() - 1);
		route.removeAll(route);
		route.add(v);
	}
}
