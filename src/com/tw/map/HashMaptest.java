package com.tw.map;

import java.util.HashMap;
import java.util.Map;

public class HashMaptest {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<>();

		m1.put(1, "a");
		m1.put(2, null);
		m1.put(2, "b");
		m1.put(3, null);

		for (Integer s : m1.keySet()) {
			System.out.println(s);
		}

		for (String s : m1.values()) {
			System.out.println(s);
		}

		for (Map.Entry<Integer, String> entry : m1.entrySet()) {
			Integer key = entry.getKey();
			if (key == 1) {
				entry.setValue("by");
			}
			System.out.println(entry.getValue());
		}
	}

}
