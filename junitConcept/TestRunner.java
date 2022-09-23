package junitConcept;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Result r=JUnitCore.runClasses(SquareTest.class,CountTest.class);
		//Result r=JUnitCore.runClasses(ColorTest.class);
		//Result r=JUnitCore.runClasses(AgeTest.class);
		Result r=JUnitCore.runClasses(TestEmployee.class);
		for (Failure f : r.getFailures()) {
			System.out.println(f);
			
		}
		System.out.println(r.wasSuccessful());

	}

}
