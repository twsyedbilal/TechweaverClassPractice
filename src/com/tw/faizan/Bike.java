package com.tw.faizan;

public class Bike {
	private String bike;
	private double price;
	
	public Bike(String bike, double price) {
		super();
		this.bike = bike;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [bike=" + bike + ", price=" + price + "]";
	}
	
	

}
