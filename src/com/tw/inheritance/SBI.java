package com.tw.inheritance;

public class SBI implements RBI {

	@Override
	public String withdraw() {
		String ret="SBI Amount has been withdran";
		return ret;
	}

	@Override
	public String deposit() {
		String ret="SBI Amount has been deposit";
		return ret;

	}

	@Override
	public String checkBalance() {
		String ret="SBI your balance is 200";
		return ret;

	}

	@Override
	public String changePin() {
		String ret="SBI can't change pin now";
		return ret;

	}
	public long mobileNum() {
		return 7853425612l;
	}

}
