package com.tw.methodTest;

public class MainClass {

	public static void main(String[] args) {
		MethodTest t=new MethodTest();
		int ret=t.add(5, 5);
		System.out.println(ret); //10
		
		ret =t.sub(5, 5);
		System.out.println(ret); //0
		
		ret =t.multi(5, 5);
		System.out.println(ret); //25
		
		ret =t.module(5, 5);
		System.out.println(ret);	
		
		System.out.println(t.retMessage());
		
		System.out.println(t.protectedMember);
	}

}
