package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();

	// @Before :
	// Runs the method with the annotation before every JUnit test
	@Before
	public void before() {
		System.out.println("Before");
	}

	// @BeforeClass :
	// Runs the method with the annotation before any JUnit test
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}

	// @After :
	// Runs the method with the annotation after every JUnit test
	@After
	public void after() {
		System.out.println("After");
	}

	// @AfterClass :
	// Runs the method with the annotation after all JUnit tests
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}

	// Test1
	// Call MyMath.sum(1,2,3) and check that result == 6

	// Test2
	// Call MyMath.sum(3) and check that result == 3

	@Test
	public void sumWith3Numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));

	}

	@Test
	public void sumWith1Number() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] { 3 }));

	}

}
