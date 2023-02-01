package com.tw.collectionP;

public class Laptop {
	private int id;
	private String brand;
	private String model;
	private double price;
	private String processor;

	public Laptop(int id, String brand, String model, double price, String processor) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.processor = processor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", processor="
				+ processor + "]";
	}

	
}
