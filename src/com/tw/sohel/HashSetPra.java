package com.tw.sohel;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetPra {
	Set<String> s1 = new HashSet<>();

	void HashSetAdd() {
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");
		s1.add("E");
	}
	
	void HashSetRemove() {
		s1.remove("A");
	}
	public static void main(String[] args) {
		HashSetPra s2 = new HashSetPra();
		s2.HashSetAdd();
		System.out.println(s2.s1);
		s2.HashSetRemove();
		System.out.println(s2.s1);
		
		
	}
}
