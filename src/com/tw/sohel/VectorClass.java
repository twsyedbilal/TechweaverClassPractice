package com.tw.sohel;

import java.util.Vector;

public class VectorClass {
	
	Vector<String> v1=new Vector<>();
	
	void addingVector() {
		
		v1.add("Shaikh sohel");
		v1.add("Java Developr");
		v1.add("Experiance");
		
	}
	
	void removingVector() {
		v1.remove(0);
		v1.remove(0);
	}
	
	void updatingVector() {
		v1.set(0, "Updated");
	}
	
	
	public static void main(String[] args) {
		VectorClass v2 = new VectorClass();
		
		// adding
		v2.addingVector();
		System.out.println(v2.v1);
		
		
		//removing
		v2.removingVector();
		System.out.println(v2.v1);
		
		
		//updating
		v2.updatingVector();
		System.out.println(v2.v1);
		
		
		// capacity
		System.out.println(v2.v1.capacity());
		
		// firstElement
		System.out.println(v2.v1.firstElement());
		
		// clone
		System.out.println(v2.v1.clone());
		
		// Contains
		System.out.println(v2.v1.contains(v2.v1));
		
		// elementAt
		System.out.println(v2.v1.elementAt(0));
		
		
		// get
		System.out.println(v2.v1.get(0));
		
	}

}
