package com.tw.methodOverloading;

public class MethodOverriding extends MethodOverloading {

	@Override
	int add(int a, int b) {
		return super.add(a, b);
	}

	@Override
	int add(int a, int b, int c) {
		return super.add(a, b, c);
	}

	@Override
	int add(int a, int b, String c) {
		return super.add(a, b, c);
	}

	@Override
	int add(String a, int b, int c) {
		return super.add(a, b, c);
	}
	
	int sub(int a,int b) {
		return a- b;
		
	}

}
