package com.tw.faizan;

public class SBI extends AbstractionTest {

	public SBI(String name, String add) {
		super(name, add);
	}

	@Override
	public String checkBalance() {
		System.out.println("50");
		return "50";
	}

	@Override
	public String withrawAmount() {
		System.out.println("550");
		return "550";
	}

	@Override
	public String changePin() {
		System.out.println("123");
		return "success";
	}

	@Override
	public String depositAmount() {
		System.out.println("1000");
		return "deposited";
	}

}
