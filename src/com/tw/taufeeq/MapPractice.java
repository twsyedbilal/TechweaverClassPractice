package com.tw.taufeeq;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	Map<Long, String> m = new HashMap<>();

	void add() {
		m.put(1L, "Abc");
		m.put(2L, "mno");
		m.put(3L, "xyz");

	}

	public static void main(String[] args) {
		MapPractice mp = new MapPractice();

		mp.add();
		System.out.println(mp.m.toString());
	}

}
