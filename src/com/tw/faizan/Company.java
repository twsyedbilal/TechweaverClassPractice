package com.tw.faizan;

public class Company {
	int id;
	String name;
	String designation;
	String exp;
	double salary;
	
	public Company(int id, String name, String designation, String exp, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.exp = exp;
		this.salary = salary;
		
		
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", designation=" + designation + ", exp=" + exp + ", salary="
				+ salary + "]";
	}
	
	

}
