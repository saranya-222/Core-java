package junitConcept;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JunitEx1 ob=new JunitEx1();
		int a=ob.square(8);
		assertEquals(64, a);
	}

}
