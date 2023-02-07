package com.tw.faizan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tw.multipleInh.C;

public class MainCompany {

	public static void main(String[] args) {
		Company c1=new Company(1, "S Sohel", "Java Developer", "2 years", 50000);
		Company c2=new Company(1, "S Faizan", "Java Developer", "1 years", 40000);
		Company c3=new Company(1, "A Raheman", "Java Developer", "2 years", 55000);
		
		List<Company> s=new ArrayList<>();
 		s.add(c1);
 		s.add(c2);
 		s.add(c3);
 		
 		for (int i = 0; i < s.size(); i++) {
 			System.out.println(s.toString());
			
		}
			
		}
	}
