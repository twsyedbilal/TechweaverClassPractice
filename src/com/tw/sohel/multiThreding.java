package com.tw.sohel;

import java.util.HashMap;
import java.util.Map;

public class multiThreding extends Thread {
	Map< Integer, String> m1 =new HashMap<>();
	
	public void run() {
		m1.put(1, "sohel");
		m1.put(2, "Rahman");
		m1.put(3, "Bilal sir");
		m1.put(4, "Faizan");
		m1.put(5, "Taufeeq");
		for (Map.Entry<Integer, String> entry : m1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
	}
}
