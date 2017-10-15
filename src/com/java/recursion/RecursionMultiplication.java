package com.oracle.recursion;

public class RecursionMultiplication {
	public static int multiplication(int a , int b){
		if (b==1){
			return a;
		}else {
			return a + multiplication(a,b-1);
		}
		 
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		int result = RecursionMultiplication.multiplication(a, b);
		System.out.println(result);
	}

}
