package com.tw.mutithreading;

public class WaitingState implements Runnable{

	@Override
	public void run() {
		Thread t1=new Thread(new BlockedState());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
