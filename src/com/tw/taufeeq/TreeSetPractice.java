package com.tw.taufeeq;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice {
public static void main(String[] args) {
	
	SortedSet<String> s=new TreeSet<>();
	s.add("taufeeq");
	s.add("sohel");
	s.add("fAizan");
	s.add("SYEDBILAL");
	for (String obj : s) {
		System.out.println(obj.strip());
		
	}
}
}
