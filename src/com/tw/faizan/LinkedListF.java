package com.tw.faizan;

import java.util.LinkedList;

public class LinkedListF<E> {
	LinkedList<E> lk = new LinkedList<>();

	void addInLinkedlist() {
		lk.add((E) "Cycle ");
		lk.add((E) "Bike ");
		lk.add((E) "Car ");
		lk.add((E) "Toyota ");
		lk.add((E) "Truck ");

	}

	void removeLinked() {
		lk.remove();

	}

	public static void main(String[] args) {
		LinkedListF f = new LinkedListF<>();

		f.addInLinkedlist();
		System.out.println(f.lk);
		System.out.println();

		f.removeLinked();
		System.out.println(f.lk);
		System.out.println();

		f.lk.add("Bus");
		System.out.println(f.lk);
		System.out.println();

		System.out.println(f.lk.contains("h"));
		System.out.println(f.lk.get(0));
		System.out.println(f.lk.get(1));
		System.out.println(f.lk.get(2));
		System.out.println(f.lk.get(3));
		System.out.println(f.lk.isEmpty());
		System.out.println(f.lk.peek());
	}

}
