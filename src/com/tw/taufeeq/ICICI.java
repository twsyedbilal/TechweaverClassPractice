package com.tw.taufeeq;

import com.tw.faizan.AbstractionTest;

public class ICICI extends AbstractionTest {

	public ICICI(String name, String add) {
		super(name, add);
	}

	@Override
	public String checkBalance() {
		System.out.println("100");
		return "you have 100 RS";
	}

	@Override
	public String withrawAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String depositAmount() {
		// TODO Auto-generated method stub
		return null;
	}

}
