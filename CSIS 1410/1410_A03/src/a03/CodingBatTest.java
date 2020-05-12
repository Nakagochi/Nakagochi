/*
	Assignment: 1410_A03
	Program:	CodingBatTest
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 15, 2019Sep 15, 2019
*/
/**
 * FILE CodingBatTest.java
 */
package a03;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Tysen
 *CLASS - CodingBatTest
 */
public class CodingBatTest {

	/**
	 * Test method for {@link a03.CodingBat#zipZap(java.lang.String)}.
	 */
	/**
	 * METHOD-testZipZap tests the method ZipZap with a set of tests.
	 */
	@Test
	public void testZipZap() {
		CodingBat tester = new CodingBat();
		assertEquals("zpXzp", tester.zipZap("zipXzap"));
		assertEquals("zpzp", tester.zipZap("zopzop"));
		assertEquals("zzzpzp", tester.zipZap("zzzopzop"));
		assertEquals("zibzp", tester.zipZap("zibzap"));
		assertEquals("zp", tester.zipZap("zip"));
		assertEquals("zi", tester.zipZap("zi"));
		assertEquals("z", tester.zipZap("z"));
		assertEquals("", tester.zipZap(""));
		assertEquals("zp", tester.zipZap("zzp"));
		assertEquals("abcppp", tester.zipZap("abcppp"));
		assertEquals("azbcppp", tester.zipZap("azbcppp"));
		assertEquals("azbcpzp", tester.zipZap("azbcpzpp"));
		
	}

}
