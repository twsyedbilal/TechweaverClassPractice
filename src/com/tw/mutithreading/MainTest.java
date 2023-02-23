package com.tw.mutithreading;

public class MainTest {

	public static void main(String[] args) {
		ByExtendingThreadClass be=new ByExtendingThreadClass();
		be.start();
		//be.run();
		ByRunnableInterface br=new ByRunnableInterface();
		br.run();
		Thread t1= new Thread(br);  
		t1.start();
	}
}
