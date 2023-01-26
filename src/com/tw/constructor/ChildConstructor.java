package com.tw.constructor;

public class ChildConstructor extends FatherConstructor{
	
	//Object is class which is a super class for all classes
	public ChildConstructor() {
		super();
	}
	
	public static void main(String[] args) {
		new ChildConstructor(); 
	}
}
