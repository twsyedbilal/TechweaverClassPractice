package com.tw.sohel;

import com.tw.faizan.AbstractionTest;

public class HDFC extends AbstractionTest {

	public HDFC(String name, String add) {
		super(name, add);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String checkBalance() {
		System.out.println("200");
		return "Done";
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
