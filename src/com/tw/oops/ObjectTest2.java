package com.tw.oops;

import java.util.ArrayList;
import java.util.List;

import com.tw.dto.Car;

public class ObjectTest2 {

	public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		//Car c=new Car("BMW","WHITE",2.0);
		
		List<Car> cList=new ArrayList<Car>();
		
		Car c1=new Car();
		c1.setName("BMW");
		c1.setColor("White");
		c1.setPrice(2.0);
		cList.add(c1);
		
		Car c2=new Car();
		c2.setName("Swift");
		c2.setColor("black");
		c2.setPrice(3.0);
		cList.add(c2);
		for (Car c : cList) {
			System.out.println(c.getName());
		}
		
		Class<?> c3=Class.forName("com.tw.dto.Car");
		System.out.println(c3.getName());
		System.out.println(c3.getPackageName());
		
		Car c4=(Car)c1.clone();
		System.out.println(c4.getName());
	}

}
