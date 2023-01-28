package com.tw.faizan;

//this is abstract class
public abstract class AbstractionTest {

	String name;
	String add;

	// this abstract method
	public abstract String checkBalance();
	public abstract String withrawAmount();
	public abstract String changePin();
	public abstract String depositAmount();

	public AbstractionTest(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}

	public String SetBankDetails(){
		
		return "Added";
	}
	
}
