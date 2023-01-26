package com.tw.inheritance;

public class MainClass {

	public static void main(String[] args) {
//		RBI sbi=new SBI();
//		System.out.println(sbi.checkBalance());
//		RBI icici=new ICICI();
//		System.out.println(icici.checkBalance());
		
		RBI r1=new AxixBank();
		System.out.println(r1.withdraw());
		System.out.println(r1.deposit());
		System.out.println(r1.checkBalance());
		System.out.println(r1.changePin());
		System.out.println(r1.mobileNum());
		
//		Calculations s=new CalculatorChild();
//		System.out.println(s.add(2, 2));
	}

}
