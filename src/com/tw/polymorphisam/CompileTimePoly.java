package com.tw.polymorphisam;

public class CompileTimePoly {

	int add(int a, int b) {
		return a + b;
	}

	double add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}
}
