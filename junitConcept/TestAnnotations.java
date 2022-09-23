package junitConcept;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotations {

	
	@Test
	public void test() {
		System.out.println("In test");
	}
	@BeforeClass
	public  static void beforclassTest() {
		System.out.println("befor class  test");
	}
	@Before
	public void beforTest() {
		System.out.println("before test");
	}
	@AfterClass
	public  static void afterClassTest() {
		System.out.println("After class test");
	}
	@After
	public void aftertest() {
		System.out.println("after test");
	}
	@Ignore
	public void ignoreTest() {
		System.out.println("ignore");
	}

}
