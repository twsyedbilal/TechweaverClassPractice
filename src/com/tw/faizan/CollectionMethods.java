package com.tw.faizan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionMethods {
	public CollectionMethods(int id, String name , String address) {}

	public static void main(String[] args) {
		
		List<String> name=new LinkedList<String>();
		name.add("Faizan");
		name.add("A Raheman");
		name.add("A Muqeed");
		System.out.println(name);
		name.clear();
		System.out.println(name);
		System.out.println(name.equals(name));
		System.out.println(name.size());
		System.out.println(name.toArray());
		System.out.println(name.stream());
		System.out.println(name.spliterator());
		System.out.println(name.contains(name));
		System.out.println(name.contains("r"));
		
		CollectionMethods c1=new CollectionMethods(1, "Faizan","Himayatnager");
		CollectionMethods c2=new CollectionMethods(2, "A Raheman","Himayatnager");
		CollectionMethods c3=new CollectionMethods(3, " Sohel","Dhanki");
		List<CollectionMethods> l=new ArrayList<>();
		l.add(c1);
		l.add(c2);
		l.add(c3);

		
		System.out.println(name.equals(c2));
		System.out.println("isEmpty "+name.isEmpty());
	}

}
