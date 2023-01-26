package com.tw.oops;

import com.tw.dto.Employee;

public class ClassTest {
	
	public static void main(String[] args) {
		//Class is the blue print by using class we can create objects
		Employee e=new Employee();
		e.setId(12345);
		e.setName("xyz");
		System.out.println(e.getId()+" "+e.getName());
		
		ClassTest t=new ClassTest();
		String ret=t.giveSomeValue();
		System.out.println(ret);
	}
	
	public String giveSomeValue() {
		return "sssssssss";
	}
}
