package com.tw.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTestwithObj {

	private final static String manager1 = "Asif";
	private final static String manager2 = "Latif";

	public static void main(String[] args) {

		List<Employee> l1 = new ArrayList<>();
		Employee e1 = new Employee(1L, "A");
		Employee e2 = new Employee(2L, "B");
		Employee e3 = new Employee(3L, "C");
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);

		List<Employee> l2 = new ArrayList<>();
		Employee ee1 = new Employee(1L, "X");
		Employee ee2 = new Employee(2L, "Y");
		Employee ee3 = new Employee(3L, "Z");
		l2.add(ee1);
		l2.add(ee2);
		l2.add(ee3);

		Map<String, List<Employee>> m1 = new HashMap<>();
		m1.put(manager1, l1);

		for (Map.Entry<String, List<Employee>> entry : m1.entrySet()) {
			List<Employee> val = entry.getValue();
			for (Employee employee : val) {
				System.out.println(entry.getKey() + " is Manager of " + employee.toString());
			}
		}

		Map<String, List<Employee>> m2 = new HashMap<>();
		m2.put(manager2, l2);
		for (Map.Entry<String, List<Employee>> entry : m2.entrySet()) {
			String key = entry.getKey();
			List<Employee> val = entry.getValue();

			System.out.println(key + " is manager of " + val);

		}

	}
}
