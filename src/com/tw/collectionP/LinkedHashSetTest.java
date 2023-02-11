package com.tw.collectionP;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	LinkedHashSet<String> hs = new LinkedHashSet<>();

	HashSet<String> h = new HashSet<>();

	void add() {
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add(null);

		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("E");
		h.add(null);
	}

	public static void main(String[] args) {
		LinkedHashSetTest t = new LinkedHashSetTest();
		t.add();

		for (String s : t.hs) {
			System.out.println(s);
		}

		System.out.println();

		for (String s : t.h) {
			System.out.println(s);
		}
	}

}
