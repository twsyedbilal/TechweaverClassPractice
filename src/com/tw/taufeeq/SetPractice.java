package com.tw.taufeeq;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
	Set<Integer> s1 = new HashSet<>();
	Set<String> s2 = new HashSet<>();

	void add() {
		s1.add(1000);
		s1.add(2000);
		s1.add(3000);
		s1.add(4000);

		s2.add("Bilal sir");
		s2.add("Faizan");
		s2.add("Sohel");
		s2.add("Taufeeq");

	}

	public static void main(String[] args) {
		SetPractice s = new SetPractice();
		s.add();
		System.out.println(s.s1);
		System.out.println(s.s2);
		
		// Intersecton
		s.s1.retainAll(s.s1);
		System.out.println(s.s2);
		
		// Union
		s.s2.addAll(Arrays.asList(new String[] { "RRR" }));
		System.out.println(s.s2);
		
		//Difference
		s.s1.removeAll(s.s1);
		System.out.println(s.s1);
		
	}

}
