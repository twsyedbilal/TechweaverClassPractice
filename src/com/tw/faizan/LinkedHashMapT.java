package com.tw.faizan;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapT {

	int no;
	String shoe;
	String price;

	public LinkedHashMapT(int no, String shoe, String price) {
		super();
		this.no = no;
		this.shoe = shoe;
		this.price = price;
	}

	@Override
	public String toString() {
		return " [no=" + no + ", shoe=" + shoe + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		LinkedHashMapT l1 = new LinkedHashMapT(7, "HRX", "1500");

		Map<Integer, LinkedHashMapT> m = new LinkedHashMap<>();
		m.put(1, l1);

		for (Map.Entry<Integer, LinkedHashMapT> entry : m.entrySet()) {
			Integer key = entry.getKey();
			LinkedHashMapT val = entry.getValue();

			// System.out.println( +" " + entry.toString());

			System.out.println(entry.getKey() + "  " + l1.toString());
		}
	}
}
