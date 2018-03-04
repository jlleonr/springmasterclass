package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockWithAnnotationsTest {	
	
	//Arrange
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void testFindGreatest() {
		
		//Act
		Mockito.when(dataServiceMock.retrieveAllDAta())
		.thenReturn(new int[] {24, 6, 15});
		
		//Assert
		assertEquals(24, businessImpl.findGreatest());
	}
	
	@Test
	public void testFindGreatestNoValue() {
		
		//Act
		Mockito.when(dataServiceMock.retrieveAllDAta())
		.thenReturn(new int[] { });
		
		//Assert
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatest());
	}

}
