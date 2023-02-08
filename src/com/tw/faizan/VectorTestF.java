package com.tw.faizan;

import java.util.Vector;

import com.tw.collectionP.VectorTest;

public class VectorTestF {

	Vector<String> v = new Vector<>();

	void addOPonVector() {
		v.add("Cycle");
		v.add("Bike");
		v.add("Car");
		v.add("Bus");
		v.add("Plane");
	}

	void removeOPonVector() {
		v.remove(0);
	}

	void updateOPonVector() {
		v.set(0, "Bullet");
	}

	void clearOPonVector() {
		v.clear();
	}

	public static void main(String[] args) {
		VectorTestF f = new VectorTestF();
		f.addOPonVector();
		System.out.println(f.v);
		System.out.println();
		System.out.println("The size of vector is " + f.v.size());
		System.out.println();
		System.out.println("The clone vector is : " + f.v.clone());

		f.removeOPonVector();
		System.out.println(f.v);
		System.out.println();

		f.updateOPonVector();
		System.out.println(f.v);
		System.out.println();
		System.out.println("The last element is : " + f.v.lastElement());
		System.out.println();
		System.out.println(f.v.isEmpty());

		f.clearOPonVector();
		System.out.println(f.v);
		System.out.println();
		System.out.println(f.v.contains(f));

	}
}
