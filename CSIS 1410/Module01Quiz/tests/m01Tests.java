import static org.junit.Assert.*;

import org.junit.Test;

/*
	Assignment: Module01Quiz
	Program:	m01Tests
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 11, 2019Sep 11, 2019
*/
/**
 * FILE m01Tests.java
 */

/**
 * @author Tysen
 *CLASS - m01Tests testing class.
 */
public class m01Tests {

	/**
	 * Test method for {@link m01.Module01#transform(java.lang.String)}.
	 */
	/**
	 * METHOD-testTransform() tests the method Transform within the Module01 Class.
	 */
	@Test
	public void testTransform() {
		m01.Module01 tester = new m01.Module01();
		
		 assertEquals("rebraB_Barber", tester.transform("barber"));
		 assertEquals("abuyA_Ayuba", tester.transform("Ayuba"));
		 assertEquals("Yalc_claY",tester.transform("Clay"));
		 assertEquals("ZzuB_BuzZ",tester.transform("buzz"));
		 assertEquals("null",tester.transform("null"));
		 
	}

}
