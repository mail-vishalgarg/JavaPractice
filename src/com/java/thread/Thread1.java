package com.oracle.thread;

public class Thread1 implements Runnable {
	@Override
	public void run(){
		System.out.println("this is the work i have done");
		
	}
	public static void main(String[] args) {
		Thread t1=new Thread("first");
		Thread t2 = new Thread("second");
		t1.start();
		t2.start();
		
		System.out.println("Thread names are:");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
	}
}
