package com.tw.map;

public class Employee {

	private Long id;
	private String name;

	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
