package com.tw.collectionP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	Set<String> s = new HashSet<>();
	List<String> l = new ArrayList<>();

	void add() {
		s.add(null);
		s.add("xyz");
		s.add("Abc");

		l.add(null);
		l.add("xyz");
		l.add("Abc");

		s.addAll(l);
		l.addAll(s);
	}

	public static void main(String[] args) {
		HashSetTest t = new HashSetTest();
		t.add();
		System.out.println(t.s);
		System.out.println(t.l);
		//t.s.clear();
		System.out.println(t.s.stream().toString());
	}
}
