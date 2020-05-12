/*
	Assignment: LabjUnit
	Program:	MyTestRunner
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 4, 2019Sep 4, 2019
*/
/**
 * FILE MyTestRunner.java
 */
package labJUnit;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * @author Tysen
 *
 */
public class MyTestRunner {
	public static void main(String[] args) { 
		  Result result = JUnitCore.runClasses(MyClassTest.class); 
		  for (Failure failure : result.getFailures()) { 
		   System.out.println(failure.toString()); 
		  }
		//  System.out.println("Number of tests run:" + result.getRuncount);
		  
}
}