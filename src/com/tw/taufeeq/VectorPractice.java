package com.tw.taufeeq;

import java.util.Vector;

public class VectorPractice {

	Vector<String> v=new Vector<>();
	void addOperation () {
		
		v.add("FAIZAN");
		v.add("TAUFEEQ");
		v.add("SOHEL");
	}
	void removeOperation() {
		v.remove(1);
	}
	void updateOperation() {
		v.set(1, "TAUFEEQ");
	}
	public static void main(String[] args) {
		VectorPractice p=new VectorPractice();
		p.addOperation();
		System.out.println(p.v);
		p.removeOperation();
		System.out.println(); 
		
		System.out.println(p.v);
		p.updateOperation();
		System.out.println();
		System.out.println(p.v);
	}
}
