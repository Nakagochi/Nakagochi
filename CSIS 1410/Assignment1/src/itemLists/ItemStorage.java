/*
	Assignment: Assignment1
	Program:	ItemStorage
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 6, 2019Sep 6, 2019
*/
/**
 * FILE ItemStorage.java
 */

package itemLists;

/**
 * CLASS FILE - Concert.java
 */

/**
 * @author Tysen CLASS - ItemStorage generates the information to store.
 */
public class ItemStorage {
	/**
	 * FIELDS - int size is the size of the gem.
	 */
	private int size;
	/**
	 * FIELDS - String shape is the shape of the gem.
	 */
	private String shape;
	/**
	 * FIELDS - String type is the type of gem.
	 */
	private String type;
	/**
	 * FIELDS - String color is the color of the gem.
	 */
	private String color;
	/**
	 * FIELDS - int id is the location of the gem in storage.
	 */
	private int id;
	/**
	 * FIELDS - int count is a static field that counts how many items have been
	 * added.
	 */
	private int count = 0;

	/**
	 * CONSTRUCTOR - ItemStorage() is an constructor that constructs the class.
	 */
	public ItemStorage() {
	}

	/**
	 * CONSTRUCTOR - ItemStorage is a parameterized constructor that sets the
	 * variables with information.
	 * 
	 * @param size - int size of gem
	 * @param shape - String the shape of gem
	 * @param type - String the type of gem
	 * @param color - String the color of gem
	 */
	public ItemStorage(int size, String shape, String type, String color) {
		super();
		this.size = size;
		this.shape = shape;
		this.type = type;
		this.color = color;
		id = 21958929 + count++;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * OverrideMethod toString()- overrode and increases ID.
	 */
	@Override
	public String toString() {
		id = 21958929 + count++;
		return String.format("Type of Gem: %s Size in Milimeters: %s Shape: %s  Color: %s ID: %s", type, size, shape,
				color, id);
	}

}
