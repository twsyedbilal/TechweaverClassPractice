package com.tw.taufeeq;

import java.util.SortedMap;
import java.util.TreeMap;
     
public class TreeMapPractice {
          int i=10;
          char c=20;
	public static void main(String[] args) {
     SortedMap<Integer, String> s=new TreeMap<>();
     
     s.put(7, "toffee's");
     s.put(5, "some");
     s.put(7, "have");
     s.put(7, "i");
     System.out.println(s);
     
	}

}
