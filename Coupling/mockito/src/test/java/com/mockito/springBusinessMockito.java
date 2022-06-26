package com.mockito;
//Mockito 
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class springBusinessMockito {

	@Test
	public void testfindGreatest() {
		
	DataService  dataServicemock =  mock(DataService.class);
	//dataServicemock.retriveAllData() => new int[] {23,24,25};
		
	when(dataServicemock.retriveAllData()).thenReturn(new int[] {23,24,25});
	
	//using contructor injection to pass the mock 
	//need to make dependency available to the class 
		springBusineesImpl business = new springBusineesImpl(dataServicemock);
		int res = business.findGreatest();
		assertEquals(25, res);
	}
	
	@Test
	public void testfindGreatest_onevalue() {
		
	DataService  dataServicemock =  mock(DataService.class);
	//dataServicemock.retriveAllData() => new int[] {23,24,25};
		
	when(dataServicemock.retriveAllData()).thenReturn(new int[] {15});
	
		springBusineesImpl business = new springBusineesImpl(dataServicemock);
		int res = business.findGreatest();
		assertEquals(15, res);
	}
}

//can create mock for classes and interfaces and make them return what we want ////////