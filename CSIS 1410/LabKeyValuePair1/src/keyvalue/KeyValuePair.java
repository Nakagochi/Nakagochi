/*
	Assignment: LabKeyValuePair1
	Program:	KeyValuePair
	Programmer: Tysen - Tysen Christensen
	Created:	Oct 28, 2019Oct 28, 2019
*/
/**
 * FILE KeyValuePair.java
 */
package keyvalue;

/**
 * @author Tysen CLASS - KeyValuePair
 */
public class KeyValuePair<K, V> {

	private K key;
	private V value;
	/**
	 * CONSTRUCTOR
	 *@param key
	 *@param value
	 */
	public KeyValuePair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	/**
	*@see java.lang.Object#hashCode()
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		KeyValuePair other = (KeyValuePair) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	/**
	*@see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return String.format("(%s, %s)", key, value);
	}

	

}
