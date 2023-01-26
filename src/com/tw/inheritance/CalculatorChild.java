package com.tw.inheritance;

public class CalculatorChild extends Calculations {

	@Override
	int add(int i, int j) {
		return i + j;
	}

	@Override
	int sub(int i, int j) {
		return i - j;
	}

	@Override
	int mul(int i, int j) {
		return i * j;
	}

	@Override
	int div(int i, int j) {
		return i / j;
	}

}
