package com.tw.inheritance2301;

public class HJP_college implements SRTM_University {

	@Override
	public void registerclass(String cName, int sizeOfc) {
		System.out.println("Class name"+" : "+cName);
		System.out.println("size of class"+" : "+ sizeOfc);

	}

	@Override
	public void entryofstudent(String name, long adharnumber) {
		System.out.println("student name"+" : "+ name);
		System.out.println("student's adharnumber"+" : " +adharnumber);

	}

	@Override
	public void feesofstudent(double fees, double deposit) {
	System.out.println("Student fee"+" : " + fees);
	System.out.println("Student deposit ammount"+" : "+ deposit);
	}
}
