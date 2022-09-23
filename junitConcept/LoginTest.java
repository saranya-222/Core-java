package junitConcept;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest {



	@Test
	public void positiveTest() {
		LoginEx ob=new LoginEx();
		ob.setUsername("admin");
		ob.setPassword("admin123");
		assertTrue(ob.login());
		
	}
	@Test
	public void negativeTest() {
		LoginEx ob=new LoginEx();
		ob.setUsername("hello");
		ob.setPassword("hello123");
		assertFalse(ob.login());
	}

		}