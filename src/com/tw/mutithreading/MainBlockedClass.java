package com.tw.mutithreading;

public class MainBlockedClass {

	public static void main(String[] args) throws InterruptedException {
		BlockedState b=new BlockedState();
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		
		System.out.println(t2.getState());
		System.exit(0);
	}
}
