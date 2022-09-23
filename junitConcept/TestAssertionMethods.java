package junitConcept;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestAssertionMethods {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAssertion() {
		String str1=new String("HelloWorld");
		String str2=new String("HelloWorld");
		String str3="Hello";
		String str4="Hello";
		String str5=null;
		int a=10;
		int b=10;
		
		assertEquals(str1,str2);
		assertTrue(a==b);
		assertSame(str3, str4);
		assertNotSame(str1,str2);
		assertNull(str5);
		assertNotNull(str4);
		
		String arr1[]= {"one","two","three"};
		String arr2[]= {"one","two","three"};
		assertArrayEquals(arr1,arr2);
		
	}

}
