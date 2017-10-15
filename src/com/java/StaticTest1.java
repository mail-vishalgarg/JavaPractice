package com.oracle;

public class StaticTest1 {
	static{System.out.println("Static blocked is invoked");
	System.exit(0);
	}
	public static void main(String[] args){
		System.out.println("invoke main");
	}
}
