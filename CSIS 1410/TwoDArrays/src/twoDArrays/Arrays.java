/*
	Assignment: TwoDArrays
	Program:	Arrays
	Programmer: Tysen - Tysen Christensen
	Created:	Dec 8, 2019Dec 8, 2019
*/
/**
 * FILE Arrays.java
 */
package twoDArrays;

/**
 * @author Tysen
 *CLASS - Arrays
 */
public class Arrays {
	private int max_rows;
	private int max_colums;
	private int a[][];
	/**
	 * CONSTRUCTOR
	 *@param max_rows
	 *@param max_colums
	 */
	public Arrays(int max_rows, int max_colums) {
		super();
		this.max_rows = max_rows;
		this.max_colums = max_colums;
		a = new int[max_rows][max_colums];
		for(int x = 0; x<max_rows; x++){
			for(int y = 0; y<max_colums; y++){
				a[x][y] = 0;
			}
		}
	}
	
	public void Add_Number(int x, int y, int z) {
		a[x][y] = z;
		//System.out.printf("Added %d at position (%d,%d)%n", z,x,y);
	}
	
	public void PrintArray() {
		for(int x = 0; x<max_rows; x++){
			for(int y = 0; y<max_colums; y++){
				System.out.print(a[x][y]+"  ");
			}
			System.out.println();
		}

	}
}

