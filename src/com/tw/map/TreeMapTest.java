package com.tw.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		// natural ordering of its keys
		SortedMap<Integer, String> sm = new TreeMap<>();
		sm.put(1, null);
		sm.put(3, "Z");
		sm.put(2, null);
		sm.put(4, "a");
		sm.put(5, "A");
		sm.put(0, "ww");
		System.out.println(sm);
		for (Map.Entry<Integer, String> s : sm.entrySet()) {
			Integer key = s.getKey();
			String val = s.getValue();
			System.out.println(key + " " + val);
		}

		// insertion-ordered LinkedHashMap
		Map<Integer, String> lm = new LinkedHashMap<>();
		lm.put(1, null);
		lm.put(3, "Z");
		lm.put(2, null);
		lm.put(4, "a");
		lm.put(5, "A");
		lm.put(0, "ww");
		System.out.println(lm);

		// Note that HashMap due to lookup optimizations does not preserve order
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, null);
		hm.put(3, "Z");
		hm.put(2, null);
		hm.put(4, "a");
		hm.put(5, "A");
		hm.put(9, "ww");
		hm.put(0, "ww");
		System.out.println(hm);

	}
}
