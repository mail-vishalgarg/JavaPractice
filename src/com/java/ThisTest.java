package com.oracle;

public class ThisTest {

	void m(){
		System.out.println("hello there");
	}
	
	void n(){
		this.m();
	}
	
	public static void main(String args[]){
		new ThisTest().n();
	}
}
