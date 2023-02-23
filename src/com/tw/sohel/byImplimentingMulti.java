package com.tw.sohel;

import java.util.HashMap;
import java.util.Map;

public class byImplimentingMulti implements Runnable{

	Map<Integer, String> m1 = new HashMap<>();
	public void run() {
		m1.put(1, "sohel");
		m1.put(2, "Bilal Sir");
		m1.put(3, "Faizan");
		m1.put(4, "Parvej");
		m1.put(5, "Taufeeq");
	}
	public static void main(String[] args) {
		byImplimentingMulti m2 = new byImplimentingMulti();
		// we don't call to start method in runnable interface because there have only one method in runnable interface
		m2.run();	
		for (Map.Entry<Integer, String> entry : m2.m1.entrySet()) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}

	}

}
