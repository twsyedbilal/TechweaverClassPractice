package com.tw.collectionP;

import java.util.Hashtable;
import java.util.Vector;

public class BeforeCollection {

	public static void main(String[] args) {
		//Array used to store homogeneous data
		int a[] = { 1, 2, 3, 4, 5, 6 };
		
		Vector<Integer> v = new Vector<>();
		v.addElement(1);
		v.addElement(2);
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Taufeeq");
		ht.put(2, "Sohel");
		ht.put(3, "Faizan");
		
		System.out.println(a);
		System.out.println(v);
		System.out.println(ht);
	}

}
