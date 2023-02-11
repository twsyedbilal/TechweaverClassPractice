package com.tw.taufeeq;

import java.util.HashSet;
import java.util.Set;


public class HashSetPractice {
	
	Set<String> s=new HashSet<>();
	void add() {
		s.add("company");
		s.add("Boss");
		s.add("employees");
		s.add("workers");
		
	}
	public static void main(String[] args) {
		HashSetPractice t=new HashSetPractice();
		t.add();
		System.out.println(t.s);
		
	}
}