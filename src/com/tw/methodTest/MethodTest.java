package com.tw.methodTest;

public class MethodTest {

	public int publicMemeber=20;
	private int privateMember=10;
	protected boolean protectedMember=true;
	String defaultMember="";
	
	// Void means return nothing
	// if we have return type then we have to return values
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int multi(int a, int b) {
		int c = a * b;
		return c;
	}
	
	protected int module(int a,int b) {
		return a%b;
	}
	
	String retMessage() {
		String s=retPrivateMessage();
		return s;
	}
	
	private String retPrivateMessage() {
		return "private";
	}
}
