package com.tw.collectionP;

import java.util.ArrayList;
import java.util.List;

public class ArrayList020523 {
	
	Laptop l1=new Laptop(1, "HP", "01",10, "i3");
	Laptop l2=new Laptop(1, "DELL", "01",10, "i3");
	Laptop l3=new Laptop(1, "Lenovo", "01",10, "i3");

	//Re-sizable-array implementation of the List interface
	List<Laptop> lap=new ArrayList<>();
	
	List<Laptop> adding(){
		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
		
		return lap;
	}
	
	public static void main(String[] args) {
		ArrayList020523 a=new ArrayList020523();
		
		Laptop l1=new Laptop(1, "HP", "01",10, "i3");
		
		List<Laptop> l =a.adding();
		l.add(null);
		l.add(l1);
		
		for (Laptop obj : l) {
			if(obj!=null)
				System.out.println(obj.getBrand());
		}
		
		System.out.println();
		l.set(3, l1);
		for (Laptop obj : l) {
			if(obj!=null)
				System.out.println("After set "+obj.getBrand());
		}
		
		System.out.println();
		l.add(1, l1);
		for (Laptop obj : l) {
			if(obj!=null)
				System.out.println("After adding "+obj.getBrand());
		}
		
		System.out.println();
		l.remove(1);
		for (Laptop obj : l) {
			if(obj!=null)
				System.out.println("After remove "+obj.getBrand());
		}
	}
}
