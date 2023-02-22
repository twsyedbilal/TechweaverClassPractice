package com.tw.mutithreading;

public class LifecycleOfThread extends Thread{
	
	public void run() {
		System.out.println("called");
	}
	
	public static void main(String[] args) {
		LifecycleOfThread l=new LifecycleOfThread();
		LifecycleOfThread l2=new LifecycleOfThread();
		l.start();
		l2.start();
		//Returns the state of this thread.
		System.out.println("l1 "+l.getState());
		System.out.println("l2 "+l2.getState());
	}

}
