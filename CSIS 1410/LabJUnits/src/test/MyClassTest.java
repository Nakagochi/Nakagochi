/*
	Assignment: LabJUnits
	Program:	MyClassTest
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 9, 2019Sep 9, 2019
*/
/**
 * FILE MyClassTest.java
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import labJUnits.MyClass;

/**
 * @author Tysen
 *
 */
public class MyClassTest {

	/**
	 * Test method for {@link labJUnits.MyClass#multiply(int, int)}.
	 */
	@Test
	 
	 public void testMultiply() { 
	  MyClass tester = new MyClass(); 
	  assertEquals("Result", 50, tester.multiply(10, 5)); 
	 }

}
