package junitConcept;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {

	@Test//positive test case
	public void positiveTest() {
		ColorEx ob=new ColorEx();
		ob.setColor("Red");
		assertTrue(ob.checkColor());
		
	}
	@Test//negative test case
	public void negativeTest() {
		ColorEx ob=new ColorEx();
		ob.setColor("blue");
		assertFalse(ob.checkColor());
		
	}
	


}
