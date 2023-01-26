package com.tw.inheritance;

public class ICICI implements RBI {

	@Override
	public String withdraw() {
		return "ICICI withdraw";
	}

	@Override
	public String deposit() {
		return "ICICI deposit";
	}

	@Override
	public String checkBalance() {
		return "ICICI 0 amount";
	}

	@Override
	public String changePin() {
		return "ICICI can't change";
	}
	public long mobileNum() {
		return 7853425612l;
	}

}
