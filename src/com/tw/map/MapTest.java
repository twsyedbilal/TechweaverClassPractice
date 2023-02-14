package com.tw.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	Map<Long, Employee> map=new HashMap<>();
	
	List<Employee> list1=new ArrayList<>();
	List<Employee> list2=new ArrayList<>();
	
	Map<Long, List<Employee>> mapli=new HashMap<>();
	
	void add(){
		
		Employee e1=new Employee(1L, "Taufeeq");
		Employee e2=new Employee(2L, "Sohel");
		Employee e3=new Employee(3L, "Faizan");
		map.put(1L, e1);
		map.put(2L, e2);
		map.put(3L, e3);
		
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		Employee ee1=new Employee(1L, "Taufeeq");
		Employee ee2=new Employee(2L, "Sohel");
		Employee ee3=new Employee(3L, "Faizan");
		list2.add(ee1);
		list2.add(ee2);
		list2.add(ee3);
		
		mapli.put(1L, list1);
		mapli.put(2L, list2);
		
	}
	
	public static void main(String[] args) {
		MapTest mt=new MapTest();
		mt.add();
		
		for (Entry<Long, Employee> st : mt.map.entrySet()) {
			//System.out.println(st.getValue().toString());
		}
		
		
		for (Entry<Long, List<Employee>> st : mt.mapli.entrySet()) {
			List<Employee> el=st.getValue();
			for (Employee string : el) {
				System.out.println(string.toString());
			}
		}
		
	}
}
