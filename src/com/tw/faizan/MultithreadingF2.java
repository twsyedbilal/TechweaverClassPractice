package com.tw.faizan;

public class MultithreadingF2 extends Thread implements Runnable {

	private Thread t;
	private String name;

	void threadTest(String name) {
		System.out.println("Creating Thread : " + name);

	}

	public void run() {
		System.out.println("Runnig thread : " + name);
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Thread : " + name + "  " + i);
				Thread.sleep(50);

			}

		} catch (InterruptedException e) {
			System.out.println("Exception in Thread : " + name);

		}
	}
}
