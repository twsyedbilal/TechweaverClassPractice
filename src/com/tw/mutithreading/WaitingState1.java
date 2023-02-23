package com.tw.mutithreading;

public class  WaitingState1 implements Runnable {

	    public static Thread t1;

	    public static void main(String[] args) {
	        t1 = new Thread(new WaitingState1());
	        t1.start();
	    }

	    public void run() {
	        Thread t2 = new Thread(new DemoWaitingStateRunnable());
	        t2.start();

	        try {
	            t2.join();
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            e.printStackTrace();
	        }
	    }
	}

	class DemoWaitingStateRunnable implements Runnable {
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
