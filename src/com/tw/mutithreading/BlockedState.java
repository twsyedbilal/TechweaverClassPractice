package com.tw.mutithreading;

public class BlockedState implements Runnable {

	public void run() {
		try {
			add();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void add() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("running");

		Thread t = new Thread(new WaitingState());
		System.out.println(t.getState());

	}
}
