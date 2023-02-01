package com.tw.faizan;

import java.util.ArrayList;
import java.util.List;

public class MainCars {

	public static void main(String[] args) {
		CarsCollection c1 = new CarsCollection("Ferrari-750", "Ferrari", "Red", "750 hp", 20000000);
		CarsCollection c2 = new CarsCollection("Martin-650", "BMW", "White", "650 hp", 17000000);
		CarsCollection c3 = new CarsCollection("Trivea ", "BBT", "Black", "850 hp", 25000000);
		CarsCollection c4 = new CarsCollection("Rolls Royce", "RR", "Cream", "1000 hp", 40000000);

		List<CarsCollection> car = new ArrayList<>();
		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);

		for (CarsCollection c : car) {
			System.out.println(c.toString());

		}
	}

}
