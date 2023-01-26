package com.tw.constructorSuperThis;

public class MainClass {

	public static void main(String[] args) {
		Charges c=new Charges(1,"tafeeq",10);
		System.out.println(c.getId()+" "+c.getName()+" "+c.getCharges());
		Charges c1=new Charges();
		
		ChildClass cc=new ChildClass();
	}

}
