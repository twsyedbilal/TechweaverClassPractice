package com.tw.taufeeq;

import java.util.SortedSet;
import java.util.TreeSet;

public class PracticeOnSortedSet {

	
	public static void main(String[] args) {
		 SortedSet<Integer> s=new TreeSet<>();	
		 s.add(4);
		 s.add(3);
		 s.add(2);
		 s.add(1);
		 s.add(0);
		 System.out.println(s.first());
		 System.out.println(s.last());
		 System.out.println(s);
	}
}
