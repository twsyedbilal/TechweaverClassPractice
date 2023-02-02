package com.tw.taufeeq;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {

	public static void main(String[] args) {
		CollectionPractice c=new CollectionPractice (1,"Taufeeq","Rolex",50000);
		CollectionPractice d=new CollectionPractice (2,"Faizan","Timex",50001);
		CollectionPractice e=new CollectionPractice (3,"Sohel","Sonata",50020);
		CollectionPractice f=new CollectionPractice (4,"Muqeet","Fastrack",50010);
		
		List<CollectionPractice> t=new ArrayList<>();
		t.add(c);
		t.add(d);
		t.add(e);
		t.add(f);
		for(CollectionPractice obj: t) {
			System.out.println(obj.toString());
		}
		
	}

}
