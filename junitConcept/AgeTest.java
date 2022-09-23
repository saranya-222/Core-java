package junitConcept;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class AgeTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test

		public void positiveTest() {
			Age ob=new Age();
			ob.setAge(18);
			assertTrue(ob.checkAge());
			
		}
		@Test
		public void NegativeTest() {
			Age ob=new Age();
			ob.setAge(16);
			assertFalse(ob.checkAge());
			
		}
	}


