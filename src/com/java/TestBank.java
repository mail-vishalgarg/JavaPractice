package com.oracle;

public class TestBank {
	public static void main(String args[]){
		Bank b;
		b = new SBI();
		System.out.println("SBI:" + b.getRateOfInterest());
		
		b= new PNB();
		System.out.println("PNB:" + b.getRateOfInterest());
	} 
}
