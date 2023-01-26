package com.tw.polymorphisam;

public class MainClass {

	public static void main(String[] args) {
		CompileTimePoly c=new CompileTimePoly();
		System.out.println(c.add(1, 1));
		System.out.println(c.add(2.0, 2.0));
		System.out.println(c.add(3, 3,3));
		
		RuntimePoly r=new RuntimePoly();
		System.out.println(r.add(1, 1));
	}

}
