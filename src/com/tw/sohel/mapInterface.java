package com.tw.sohel;

import java.util.HashMap;
import java.util.Map;

public class mapInterface {
	Map<Integer, String> m1 = new HashMap<>();

	public void addMap() {
		m1.put(1, "Sohel");
		m1.put(2, "Mukid");
		m1.put(3, "Faizan");
		m1.put(4, "Taufeeq");
		m1.put(5, "Bilal Sir");

	}

	public static void main(String[] args) {
		mapInterface m2 = new mapInterface();
		m2.addMap();
		for (Map.Entry<Integer, String> entry : m2.m1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
