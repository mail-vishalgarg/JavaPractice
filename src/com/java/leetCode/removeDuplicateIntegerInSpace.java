package com.oracle.leetCode;

public class removeDuplicateIntegerInSpace {
	public static void main(String[] args) {
		int[] n = {1,1,2};
		int length = n.length;
		System.out.println("Lenght: "+ length);
		int i=0;
		while(i<length-1){
			if (n[i] == n[i+1]){
				i = i+1;
			}
			System.out.println(n[i]);
			i++;
		}
	}
}
