package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class SomeBusinessMockTest {
	
	private DataService dataServiceMock;
	private SomeBusinessImpl businessImpl;
	
	@Before
	public void initialization() {
		dataServiceMock = Mockito.mock(DataService.class);
		businessImpl = new SomeBusinessImpl(dataServiceMock);
	}

	@Test
	public void testFindGreatest() {
		Mockito.when(dataServiceMock.retrieveAllDAta()).thenReturn(new int[] {24, 6, 15});
		assertEquals(24, businessImpl.findGreatest());
	}

}
