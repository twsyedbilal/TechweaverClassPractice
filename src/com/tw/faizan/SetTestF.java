package com.tw.faizan;

import java.util.HashSet;
import java.util.Set;

public class SetTestF {
	Set<Integer> s1 = new HashSet<>();
	Set<Integer> s2 = new HashSet<>();

	void addInSet() {
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);

		s2.add(1);
		s2.add(3);
		s2.add(5);
		s2.add(7);
		s2.add(9);

	}

	public static <E> void main(String[] args) {
		SetTestF sf = new SetTestF();

		sf.addInSet();
		System.out.println(sf.s1);
		System.out.println(sf.s2);

		// Intersection
		sf.s1.retainAll(sf.s2);
		System.out.println(sf.s1);

		// Union
		sf.s1.addAll(sf.s2);
		System.out.println(sf.s1);

		// Difference
		sf.s1.removeAll(sf.s2);
		System.out.println(sf.s1);
		
		HashSet<E>h=new HashSet<>();
		
		h.add((E) "g");
		h.add((E) "o");
		System.out.println(h);
	}

}
