package junitConcept;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployee {

	@Test
	public void test() {
		Employee ob=new Employee();
		ob.setSalary(30000);
		long s=ob.yearlySalary();
		assertEquals(360000,s);
	}
	@Test
	public void test1() {
		Employee ob=new Employee();
		long s=ob.calculateAppraisal();
		assertEquals(362000,s);
	}
	
	
	
}
