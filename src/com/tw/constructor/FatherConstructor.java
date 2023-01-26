package com.tw.constructor;

public class FatherConstructor {

	private int id;
	private String name;
	
	
	public FatherConstructor() {
		this(5,"abc");
		System.out.println("no arg constructor");
	}


	public FatherConstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		System.out.println("parameterized constructor " +id);
	}
	
	public FatherConstructor(int salary,int a) {
		System.out.println("pa with one arg");
	}
	
}
