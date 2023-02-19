package com.tw.mutithreading;

public class MainTest {

	public static void main(String[] args) {
		ByExtendingThreadClass be=new ByExtendingThreadClass();
		//be.start();
		be.run();
	}
}
