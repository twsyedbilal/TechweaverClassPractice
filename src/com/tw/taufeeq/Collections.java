package com.tw.taufeeq;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	
	public static void main(String[] args) {
		List<String> r = new ArrayList<>();
		r.add("keyboard");
		r.add("key");
		
//		System.out.println(r);
//		for (int i = 0; i < r.size(); i++) {
//			System.out.println(i);

			r.remove("key");
			System.out.println(r);
		}
		
	}

