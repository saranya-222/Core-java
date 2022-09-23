package junitConcept;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalesPerson {

	@Test
	public void test() {
		SalesPerson ob=new SalesPerson();
		ob.setSalary(20000);
		ob.setCommission(90);
		long s=ob.commission();
		assertEquals(24000, s);;
		
	
	}

}
