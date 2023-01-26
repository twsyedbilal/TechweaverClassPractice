package com.tw.constructorSuperThis;

public class Charges {

	private long id;
	private String name;
	private double charges;

	//parameterized constructor
	public Charges(long id, String name, double charges) {
		//Object class is a super class for all classes
		super();
		this.id = id;
		this.name = name;
		this.charges = charges;
	}
	
	//no argument constructors 
	public Charges() {
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

}
