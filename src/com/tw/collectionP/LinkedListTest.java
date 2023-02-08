package com.tw.collectionP;

import java.util.LinkedList;

public class LinkedListTest<E> {
	
	LinkedList<E> l=new LinkedList<>();
	
	void addElementsToLinkedList(E obj) {
		l.add(obj);
	}
	
	void removeElementsFromLinkedList(E obj) {
		l.remove();
	}
	
	public static void main(String[] args) {
		Laptop lap=new Laptop(1, "hp", "10", 10, "i5");
		
		LinkedListTest tt=new LinkedListTest<>();
		
		tt.addElementsToLinkedList(lap);
		System.out.println(tt.l);
		
		tt.addElementsToLinkedList("Superb");
		System.out.println(tt.l);
		
		tt.addElementsToLinkedList(10);
		System.out.println(tt.l);
		
		int [] ar= {1,2,3,4};
		tt.addElementsToLinkedList(ar.toString());
		System.out.println(tt.l);
		
		tt.removeElementsFromLinkedList(ar);
		System.out.println(tt.l);
		
		tt.removeElementsFromLinkedList(ar);
		System.out.println(tt.l);
	}
}
