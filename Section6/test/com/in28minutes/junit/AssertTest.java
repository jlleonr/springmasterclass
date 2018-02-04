package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		
		assertEquals(1, 1);
		
		boolean condition = true;
		assertTrue(condition);
		
		/**
		 * Different assert options:
		 
			assertNull(object);
			
			assertNotNull(object);
					
			assertNotEquals(unexpected, actual);
		*/
	}

}
