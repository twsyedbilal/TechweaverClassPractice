package com.tw.collectionP;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	
	static SortedSet<Integer> s=new TreeSet<>();
	
	public static void main(String[] args) {
		add();
		System.out.println(s);
	}

	private static void add() {
		s.add(1);
		s.add(2);
		s.add(8);
		s.add(2);
		s.add(3);
		s.add(0);
	}
}
