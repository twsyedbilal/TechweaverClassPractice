package com.tw.sohel;

public class MultiThreding_sleep_Method {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
