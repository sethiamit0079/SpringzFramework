package com.mockito;
//use stub class to test
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class springBusinesstest {

	@Test
	public void testfindGreatest() {		
		springBusineesImpl business = new springBusineesImpl(new DataServicestub());
		int res = business.findGreatest();
		assertEquals(6, res);
	}

}



//need to create completely new stuff 
//need to create completely new vversions for diff test cases
class DataServicestub implements DataService{
	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {4,6,5};
	}
	
}