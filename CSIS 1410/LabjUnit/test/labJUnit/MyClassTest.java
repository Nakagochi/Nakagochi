/*
	Assignment: LabjUnit
	Program:	MyClassTest
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 4, 2019Sep 4, 2019
*/
/**
 * FILE MyClassTest.java
 */
package labJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test; 
/**
 * @author Tysen
 *
 */
public class MyClassTest {

	/**
	 * Test method for {@link labJUnit.MyClass#multiply(int, int)}.
	 */
	@Test
	public final void testMultiply() {
		MyClass tester = new MyClass(); 
		  assertEquals("Result", 50, tester.multiply(10, 5));
	}
@Test
	public final void testMultiply2() {
		MyClass tester = new MyClass(); 
		  assertEquals("Result", 500, tester.multiply(100, 5));
	}
@Test
	public final void testMultiply3() {
		MyClass tester = new MyClass(); 
		  assertEquals("Result", 25, tester.multiply(5, 5));
	}
@Test
	public final void testMultiply4() {
		MyClass tester = new MyClass(); 
		  assertEquals("Result", 40, tester.multiply(10, 5));
	}
}




 
