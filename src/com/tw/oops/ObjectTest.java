package com.tw.oops;

public class ObjectTest {
	String name;
	String color;
	double price;
	
	
	ObjectTest(){
		System.out.println("Default Constructor");
	}
	
	
	public ObjectTest(String cname, String ccolor, double cprice) {
		//super();
		this.name = cname;
		this.color = ccolor;
		this.price = cprice;
	}

	

	@Override
	public String toString() {
		return "ObjectTest name=" + name + ", color=" + color + ", price=" + price + "";
	}


	public static void main(String[] args) {
		ObjectTest obj=new ObjectTest("xyz","white",2.0);
		System.out.println(obj.toString());
	}
}
