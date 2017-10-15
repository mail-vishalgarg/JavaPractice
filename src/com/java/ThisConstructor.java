package com.oracle;

public class ThisConstructor {
	public ThisConstructor(){
		this(5);
		System.out.println("Hello constructor");
	}

	public ThisConstructor(int i){
		//this();
		
		System.out.println("Int value of i:" + i);
	}
	
	public static void main(String[] args){
		ThisConstructor t = new ThisConstructor();
	}
}
