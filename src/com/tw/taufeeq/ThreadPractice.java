package com.tw.taufeeq;

public class ThreadPractice implements Runnable{

	@Override
	public void run() {
		try {
			add();
		
		}catch(InterruptedException e) {
			e.printStackTrace();

		}
		
       		
	}
   public void add() throws InterruptedException {
	    Thread.sleep(500);
	    System.out.println("run");
	    Thread  t=new Thread();
	    System.out.println(t.getState());
	    
   }
   public static void main(String[] args) throws  InterruptedException{
	   ThreadPractice tp=new ThreadPractice();
	   Thread t1=new Thread(tp);
	   t1.start();
	   
	
}
} 
