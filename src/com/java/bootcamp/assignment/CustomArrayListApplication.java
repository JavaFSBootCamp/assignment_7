package com.java.bootcamp.assignment;


public class CustomArrayListApplication {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();
		for(int i=0; i< 15; i++) {
			myCustomList.add("element "+ (i+1)); 
		}
		myCustomList.add(10, "Sanjaya");
		myCustomList.add("Element0");
		myCustomList.add("Element1");
		myCustomList.add("Element3");

		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}
		System.out.println("==============================");
		myCustomList.remove(16);
		
		myCustomList.add(11, "Element_11");
		
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}
	}

}
