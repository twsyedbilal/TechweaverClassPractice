package com.tw.dto;

public class Car implements Cloneable {

	String name;
	String color;
	double price;

	/*
	 * public Car(String a, String b, double c) { this.name = a; this.color = b;
	 * this.price = c; }
	 * 
	 * public Car(double c,String a, String b) { this.name = a; this.color = b;
	 * this.price=c; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
