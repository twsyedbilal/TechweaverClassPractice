package com.tw.faizan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.tw.map.Employee;

public class MapTestF {

	Map<Double, Bike> map = new HashMap<>();

	List<Bike> l1 = new ArrayList<>();
	List<Bike> l2 = new ArrayList<>();

	Map<Double, List<Bike>> map2 = new HashMap<>();

	void add() {
		Bike b1 = new Bike("ZMR", 210000);
		Bike b2 = new Bike("R15", 220000);
		Bike b3 = new Bike("Kawasaki Ninja", 350000);
		Bike b4 = new Bike("Bullet", 200000);

		map.put((double) 1, b1);
		map.put((double) 2, b2);
		map.put((double) 3, b3);
		map.put((double) 4, b4);

		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);

		Bike bb1 = new Bike("Hayabosa", 290000);
		Bike bb2 = new Bike("Y20", 280000);
		Bike bb3 = new Bike("HRX", 270000);

		l2.add(bb1);
		l2.add(bb2);
		l2.add(bb3);

		map2.put((double) 1, l1);
		map2.put((double) 2, l2);
	}

	public static void main(String[] args) {
		MapTestF f = new MapTestF();
		f.add();

		for (Map.Entry<Double, List<Bike>> e : f.map2.entrySet()) {
			Double key = e.getKey();
			List<Bike> val = e.getValue();

			for (Bike bike : val) {
				System.out.println(e.getKey() + "  " + bike.toString());
			}
		}
	}

}
