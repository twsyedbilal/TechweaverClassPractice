package com.tw.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> m1=new LinkedHashMap<>();
		m1.put(1, "z");
		m1.put(2, "A");
		m1.put(3, "a");
		System.out.println(m1);
		
		Map<Integer, String> m2=new HashMap<>();
		m2.put(1, "z");
		m2.put(2, "A");
		m2.put(3, "a");
		System.out.println(m2);
	}
}
