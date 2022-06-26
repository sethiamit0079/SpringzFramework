package com.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class listTest {

	@Test
	void test() {
		
	List listmock = 	mock(List.class);
	
	when(listmock.size()).thenReturn(10);
	
	assertEquals(10, listmock.size());
}
	
	@Test
	void test_multiplereturn() {
		
	List listmock = 	mock(List.class);
	
	when(listmock.size()).thenReturn(10).thenReturn(20);
	
	assertEquals(10, listmock.size());
	assertEquals(20, listmock.size());
}
	
	@Test
	void tesget() {
		
	List listmock = 	mock(List.class);
	
	when(listmock.get(0)).thenReturn("some string");
	
	assertEquals("some string", listmock.get(0));
}
	
}
