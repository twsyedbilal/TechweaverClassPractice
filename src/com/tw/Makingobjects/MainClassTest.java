package com.tw.Makingobjects;

public class MainClassTest {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		SBI s=new SBI();
//		createObjFOrUs(h);
//		createObjFOrUs(s);
		
		MakingObj mo=new MakingObj();
		mo.setRbi(h);
		mo.callRBIMethods();
		mo.setRbi(s);
		mo.callRBIMethods();
	}

	public static void createObjFOrUs(RBI r) {
		r.deposit();
	}
}
