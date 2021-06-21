package com.java.bootcamp.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	private CustomList<String> customArrayList;
	
	@BeforeEach
	public void setUp(){
		customArrayList = new CustomArrayList<>();
	}
	
	@Test
	public void init() {
	}
	
	@Test
	public void testAddElements(){
		
		customArrayList.add(0, "Element0");
		customArrayList.add(1, "Element1");
		customArrayList.add(2, "Element2");
		
		assertEquals("Element0", customArrayList.get(0));
		assertEquals("Element1", customArrayList.get(1));
		assertEquals("Element2", customArrayList.get(2));
		
//		customArrayList.add(1, "Mariana");
//		
//		assertEquals("Karol", customArrayList.get(0));
//		assertEquals("Mariana", customArrayList.get(1));
//		assertEquals("Vanessa", customArrayList.get(2));
//		assertEquals("Amanda", customArrayList.get(3));	
		
		//assertTrue(customArrayList.getSize()==4);
	}

}
