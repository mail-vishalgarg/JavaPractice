package com.oracle.leetCode;

public class PalindromInteger {
	public static void main(String[] args) {
		int n = 121;
		int org = n;
		int revInt=0;
		while(n > 0){
			revInt = revInt * 10 + n%10;
			n = n/10;
		}
		System.out.println("REV:" +n + " " + revInt);
		System.out.println(org==revInt);
	}
}
