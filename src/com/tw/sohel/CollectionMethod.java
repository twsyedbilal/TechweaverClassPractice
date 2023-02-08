package com.tw.sohel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {

	public static void main(String[] args) {
		
		
		// First collection
		List<String> studendName = new ArrayList<>();
		studendName.add("Sohel");
		studendName.add("Faizan");
		studendName.add("Taufeeq");
		studendName.add("Rahaman");
		studendName.add("Mukeed");
		
		
		// second collection
		List<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		
		System.out.println(number);
		Collections.reverse(number);
		System.out.println(number);
		
		

		// addAll
		Collections.addAll(studendName, "Suleman","Asif");
		System.out.println(studendName);
		
		// reverse
		Collections.reverse(studendName);
		System.out.println(studendName);
		
		//sort
		Collections.sort(number);
		System.out.println(number);
		
		
		// sort 
		Collections.sort(studendName);
		System.out.println(studendName);
		
		// binarySearch
		System.out.println(Collections.binarySearch(studendName, "Sohel"));
		System.out.println(Collections.binarySearch(studendName, "hello"));

		
	}

}
