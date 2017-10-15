package com.oracle.leetCode;

public class reverseInteger {

	public static void main(String[] args) {
		int n = 123;
		int reverseNum=0;
		
		while (n > 0 ){
			reverseNum = reverseNum*10 + n%10;
			n = n/10;
		}
		System.out.println("REV: " + reverseNum);
	}
}
