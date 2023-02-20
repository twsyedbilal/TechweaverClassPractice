package com.tw.faizan;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MultiThreadingF extends Thread {

	Map<Integer, String> m = new TreeMap<>();

	public void run() {
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "C");
		m.put(4, "D");

		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();

			System.out.println(key + "  " + val);

		}
	}

}
