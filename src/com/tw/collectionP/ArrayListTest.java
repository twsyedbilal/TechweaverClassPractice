package com.tw.collectionP;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		Laptop l1=new Laptop(1, "HP", "001", 10000, "i5");
		Laptop l2=new Laptop(2, "HP", "002", 11000, "i7");
		Laptop l3=new Laptop(3, "Dell", "003", 110001, "i7");
		Laptop l4=new Laptop(4, "lenovo", "004", 110021, "i7");
		Laptop l5=new Laptop(5, "Lenovo", "004", 43800, "i5");
		
		List<Laptop> list=new ArrayList<>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		
		for (Laptop obj : list) {
			System.out.println(obj.toString());
		}
	}

}
