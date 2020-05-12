/*
	Assignment: LabJUnits
	Program:	MyTestRunner
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 9, 2019Sep 9, 2019
*/
/**
 * FILE MyTestRunner.java
 */
package test;

/**
 * @author Tysen
 *
 */
import org.junit.runner.JUnitCore; 
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure; 
 
public class MyTestRunner { 
 public static void main(String[] args) { 
  Result result = JUnitCore.runClasses(MyClassTest.class); 
  for (Failure failure : result.getFailures()) { 
   System.out.println(failure.toString()); 
   
  }
  System.out.println("Number of times tests Ran: "+result.getRunCount());
  System.out.println("Number of times test failed: "+result.getFailureCount());
  System.out.println("Number of times test passed: " + (result.getRunCount()-result.getFailureCount()));
 }

}
