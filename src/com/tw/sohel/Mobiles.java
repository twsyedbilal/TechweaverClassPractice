package com.tw.sohel;

public class Mobiles {
				
	private String brand;
	private String model;
	private double price;
	private String color;
	private double screenSize;
	
	// Constructor
	
	public Mobiles(String brand,String model,double price,String color,double screenSize) {
		super();
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.color=color;
		this.screenSize=screenSize;
		
	}
	
	// getter and setter
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String getColor() {
		return color;		
	}
	public void setColor(String color) {
		this.color=color;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize=screenSize;
		
	}
	
	// toString

	@Override
	public String toString() {
		return brand + " "+  model + " " + price + " " + color + " "
				+ screenSize+"inch";
	}
	
	
	
}
















