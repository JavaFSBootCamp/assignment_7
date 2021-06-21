package com.java.bootcamp.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	private CustomList<String> customArrayList;
	
	@BeforeEach
	public void setUp(){
		customArrayList = new CustomArrayList<>();
		
		for(int i=0; i<=11; i++) {
			customArrayList.add("Element" + i);
		}
	}
	

	
	@Test
	public void should_add_elements_using_index(){
		
		customArrayList.add(0, "Element0");
		customArrayList.add(1, "Element1");
		customArrayList.add(2, "Element2");
		
		assertEquals("Element0", customArrayList.get(0));
		assertEquals("Element1", customArrayList.get(1));
		assertEquals("Element2", customArrayList.get(2));
		
	}
	
	@Test
	public void should_add_elements_in_last_index(){
		customArrayList.add(11, "Element11");
		assertEquals("Element11", customArrayList.get(11));
	}
	
	@Test
	public void should_add_elements_in_middle_index(){
		customArrayList.add(5, "Element5");
		assertEquals("Element5", customArrayList.get(5));
	}
	
	@Test
	public void should_throw_exception_while_adding_elements() {
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			customArrayList.add(13, "Element12");
		  });
	}
	
	@Test
	public void should_remove_elements_in_last_index(){
		String expectedElement = customArrayList.remove(10);
		assertEquals("Element11", expectedElement);
	}
	
	@Test
	public void should_remove_elements_in_middle_index(){
		String expectedElement = customArrayList.remove(5);
		assertEquals("Element6", expectedElement);
	}
	
	@Test
	public void should_throw_exception_while_removing_elements() {
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			customArrayList.remove(13);
		  });
	}
	
	@Test
	public void should_check_arraylist_size() {
		Integer expectedSize = customArrayList.getSize();
		
		assertEquals(expectedSize, customArrayList.getSize());
	}

}
