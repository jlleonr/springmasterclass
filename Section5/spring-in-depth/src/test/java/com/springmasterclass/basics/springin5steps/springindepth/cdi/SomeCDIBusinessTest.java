package com.springmasterclass.basics.springin5steps.springindepth.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {
	
	@Mock
	CDI_DAO daoMock;
	
	@InjectMocks
	CDI_Business business;

	@Test
	public void testBasicScenario() {

		//Arrange
		Mockito.when(daoMock.getData())
		.thenReturn(new int[] {2, 25, 100});
			
		// Act +		
		// Assert
		assertEquals(100, business.findGreatest());
	}
	
	@Test
	public void testBasicScenario2() {

		//Arrange
		Mockito.when(daoMock.getData())
		.thenReturn(new int[] {2, 25});
			
		// Act +		
		// Assert
		assertEquals(25, business.findGreatest());
	}

}
