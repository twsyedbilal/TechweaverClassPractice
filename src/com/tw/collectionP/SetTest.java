package com.tw.collectionP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	Set<Integer> setObj1=new HashSet<>();
	Set<Integer> setObj2=new HashSet<>();
	
	void add() {
		setObj1.add(1);
		setObj1.add(2);
		setObj1.add(7);
		setObj1.add(4);
		
		setObj2.add(5);
		setObj2.add(2);
		setObj2.add(6);
		setObj2.add(4);
		setObj2.add(7);
		
	}
	
	public static void main(String[] args) {
		SetTest t1=new SetTest();
		t1.add();
		
		System.out.println(t1.setObj1);
		System.out.println(t1.setObj2);
		
		//intersection
		t1.setObj1.retainAll(t1.setObj2);
		System.out.println(t1.setObj1);
		
		//Union
		t1.setObj1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,67,7}));
		System.out.println(t1.setObj1);
		
		//Difference
		t1.setObj1.removeAll(t1.setObj2);
		System.out.println(t1.setObj1);
	}
}
