package com.tw.faizan;

import com.tw.mutithreading.WaitingState1;

public class WaitingState implements Runnable {

	static Thread t1;

	public static void main(String[] args) {

		t1 = new Thread(new WaitingState());
		t1.start();
	}

	@Override
	public void run() {

		Thread t2 = new Thread(new Demo());
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			t1.currentThread().interrupt();
			e.printStackTrace();
		}
	
	}

}

class Demo implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}

		System.out.println(WaitingState1.t1.getState());
	}

}