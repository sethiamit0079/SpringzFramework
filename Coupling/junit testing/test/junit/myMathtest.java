package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class myMathtest {
	mymath math = new mymath();
	//mymath sum
	//1 2 3 => 6
	
	@Test
	public void sumNumbers() {
		
		int res = math.sum(new int[] {1,2,3});
		assertEquals(6, res);
		
	}
	
	@Test
	public void sumNumbers2() {
		
		assertEquals(3, math.sum(new int[] {3}));
		
	}
	
	

//	@Test
//	void test() {
//		fail("Not yet implemented");
//		//fail("Not yet implemented");
//				//absence of failure is success  
//	}

}
