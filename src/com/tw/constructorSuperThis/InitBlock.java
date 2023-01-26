package com.tw.constructorSuperThis;

public class InitBlock {

	public InitBlock() {
		System.out.println("no ");
	}

	{
		System.out.println("this first init block");
	}
	{
		System.out.println("this second init block");
	}

	public static void main(String[] args) {
		InitBlock i = new InitBlock();
	}
}
