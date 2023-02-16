package com.tw.taufeeq;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	
	static HashMap<Integer, String > m=new HashMap<Integer, String >();
	void addMap() {
	m.put(1, "mango");
	m.put(2, "grapes");
	m.put(3, "Apple");
	m.put(4, "orange");
	}
	public static void main(String[] args) {
		HashMapPractice m1= new HashMapPractice();
	m1.addMap();
	System.out.println(m1.m);
		
		
	

	
}
}