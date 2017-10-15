package com.oracle.thread;

public class RunnableExample {
	public static void main(String[] args) {
		Count cnt = new Count();
		try{
			while(cnt.mythread.isAlive()){
				System.out.println("Main thread will be alive till the child thread is alive");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread is over");
	}
}

