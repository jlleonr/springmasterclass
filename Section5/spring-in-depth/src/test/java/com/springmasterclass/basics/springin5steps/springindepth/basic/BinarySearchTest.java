package com.springmasterclass.basics.springin5steps.springindepth.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springmasterclass.basics.springin5steps.springindepth.SpringInDepthBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class BinarySearchTest {

	// Arrange
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {

		// Act
		int result = binarySearch.binarySearch(new int[] { 1, 2, 3 }, 5);

		// Assert
		assertEquals(3, result);
	}

}
