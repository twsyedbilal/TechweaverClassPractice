package com.tw.sohel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetHashSet {

	Set<Integer> s = new HashSet<Integer>();
	Set<Integer> s2 = new HashSet<>();

	void addInt() {
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
	}

	void addStr() {
		s2.add(6);
		s2.add(2);
		s2.add(7);
		s2.add(4);
		s2.add(1);
	}

	public static void main(String[] args) {
		SetHashSet v = new SetHashSet();
		v.addInt();
		System.out.println(v.s);

		v.addStr();
		System.out.println(v.s2);

		// return duplicate elements
		v.s.retainAll(v.s2);
		System.out.println(v.s);

		v.s.addAll(Arrays.asList(new Integer []{1,3,4,5,6,7,8,2}));
		System.out.println(v.s);
		
		v.s.removeAll(v.s2);
		System.out.println(v.s);
	}

}
