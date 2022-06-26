package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.BeanProperty;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class aserttest {
	@Test
	void test() {
		System.out.println("test1");
		boolean cond = true;
		assertEquals(3, 3);
//		assertTrue(cond);
//		assertFalse(!cond);
//		assertNotNull(cond);
	}
	
	@Test
	void test2() {
		System.out.println("test2");
		boolean cond = true;
		assertNotNull(cond);
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static  void beforeClass() {
		System.out.println("before calss");
	}
	
	@AfterClass
	public static  void afterClass() {
		System.out.println("After calss");
	}
	

	

}
