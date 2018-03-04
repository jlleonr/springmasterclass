package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {

	//Arrange
	@SuppressWarnings("rawtypes")
	@Mock
	List listMock;
	
	@Test
	public void testSize() {
		
		//Act
		Mockito.when(listMock.size())
		.thenReturn(10)
		.thenReturn(20);
		
		//Assert
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	public void testGetWithSpecificParameter() {
		
		//Act
		Mockito.when(listMock.get(0))
		.thenReturn("Zero");
		
		//Assert
		assertEquals("Zero", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	public void testGetWithAnyParameter() {
		
		//Act
		Mockito.when(listMock.get(Mockito.anyInt()))
		.thenReturn("Input is an integer");
		
		//Assert
		assertEquals("Input is an integer", listMock.get(0));
		assertEquals("Input is an integer", listMock.get(100));
	}

}
