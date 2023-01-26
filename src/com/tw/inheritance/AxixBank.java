package com.tw.inheritance;

public class AxixBank implements RBI {
	
	public String withdraw() {
		String ret = "Withdraw succesfully";
		return ret;
	}
	
	public String deposit() {
		return "Deposited";
	}
	public String checkBalance() {
		return "Balance is 1200";
	}
	
	public String changePin() {
		return "Can't change pin";
	}
	public long mobileNum() {
		return 7853425612l;
	}
}
