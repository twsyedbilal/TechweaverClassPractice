package com.tw.Makingobjects;

public class MakingObj {
	private RBI rbi;

	public void setRbi(RBI rbi) {
		this.rbi = rbi;
	}
	
	public void callRBIMethods() {
		this.rbi.deposit();
	}
}
