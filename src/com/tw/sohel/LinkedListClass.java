package com.tw.sohel;

import java.util.LinkedList;

public class LinkedListClass {
	
	LinkedList<String> l1 = new LinkedList<>();
	
	LinkedList<String> linkedAdd(){
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		return l1;
	}
	
	LinkedList<String> linkedRemove(){
		l1.removeFirstOccurrence(l1);
		return l1;
	}
	
	public static void main(String[] args) {

		LinkedListClass l2 = new LinkedListClass();
		
		// Adding
		
		l2.linkedAdd();
		System.out.println(l2.l1);
		
		// Removing
		System.out.println(l2.l1.removeFirstOccurrence("A"));
		
		
		
	}
}
