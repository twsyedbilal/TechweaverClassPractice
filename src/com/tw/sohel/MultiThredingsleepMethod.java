package com.tw.sohel;

public class MultiThredingsleepMethod extends Thread{
	public void run() {
		for(int i = 1;i<=10;i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println("plz check status");
			}
		}
	}
	
	public static void main(String[] args) {
		MultiThredingsleepMethod s1 = new MultiThredingsleepMethod();
		s1.start();
	}
}
