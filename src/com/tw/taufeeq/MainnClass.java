package com.tw.taufeeq;

import java.util.ArrayList;
import java.util.List;

public class MainnClass {

	public static void main(String[] args ) {
		Mobile m=new Mobile(1,"sohel","One+",12000);
		Mobile n=new Mobile(2,"faizan","Samsung",10000);
		Mobile o=new Mobile(3,"muqeet","Vivo",15000);
		Mobile p=new Mobile(4,"taufeeq","Iphone",11500);
		List<Mobile> t=new ArrayList<>();
         t.add(m);
         t.add(n);
         t.add(o);
         t.add(p);
		
		for(Mobile obj: t) {
		System.out.println(obj.toString());
		
	}

	}
	}
