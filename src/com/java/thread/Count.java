package com.oracle.thread;

public class Count implements Runnable{
	Thread mythread;
	public void count(){
		mythread = new Thread(this,"my runnable thread");
		System.out.println("My thread created:" + mythread);
		mythread.start();
	}
	
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("print the count:" +i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("my thread interrupted");
		}
		System.out.println("my thread is over");
	}

}


