package com.tw.faizan;

public class CarsCollection {
	String CarName;
	String Brand;
	String colour;
	String engine;
	double price;
	String a;

	public CarsCollection(String carName, String brand, String colour, String engine, double price) {
		super();
		CarName = carName;
		Brand = brand;
		this.colour = colour;
		this.engine = engine;
		this.price = price;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarsCollection [CarName=" + CarName + ", Brand=" + Brand + ", colour=" + colour + ", engine=" + engine
				+ ", price=" + price + "]";
	}

}
