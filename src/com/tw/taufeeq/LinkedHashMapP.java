package com.tw.taufeeq;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapP {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<>();
		m.put(1, "i");
		m.put(2, "like");
		m.put(3, "to");
		m.put(4, "play football");
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			//Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(val);

		}
	}
}
