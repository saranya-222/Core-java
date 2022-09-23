package junitConcept;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountTest {

	@Test
	public void test() {
		JunitEx1 ob=new JunitEx1();
		int a=ob.count("Saranya");
		assertEquals(3, a);
	}

}
