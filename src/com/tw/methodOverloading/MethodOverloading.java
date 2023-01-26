package com.tw.methodOverloading;

public class MethodOverloading {

	int add(int a, int b) {
		return a + b;
	}

	//number of parameter 
	int add(int a, int b, int c) {
		return a + b + c;
	}

	//parameter type change
	int add(int a, int b, String c) {
		return a + b;
	}
	
	//parameter order change
	int add(String a, int b, int c) {
		return c + b;
	}
}
