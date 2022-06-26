package com.mockito;
//Mockito 
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class springBusinessMockAnootation {

	@Mock
	DataService  dataServicemockk;

	@InjectMocks
	springBusineesImpl business;
	
	@Test
	public void testfindGreatest() {
	
	when(dataServicemockk.retriveAllData()).thenReturn(new int[] {23,24,25});
		int res = business.findGreatest();
		assertEquals(25, res);
	}
	
	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServicemockk.retriveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, business.findGreatest());
	}
}

//can create mock for classes and interfaces and make them return what we want ////////