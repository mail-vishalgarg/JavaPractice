package com.oracle.recursion;

import java.util.HashMap;
import java.util.Map;

public class FibbonacciTest {

	public static int fibArray[] = new int[26];
	
	public static int fib(int n, Map<Integer, Integer> map){
		if (n == 0){
			return n;
		}
		if (n == 1){
			return 1;
		}
		
		//System.out.println(n);
		if(map.containsKey(n)){
			return map.get(n);
		}
		map.put(n, fib(n-1, map) + fib(n-1, map));
		
		return fib(n-1,map) + fib(n-2,map); 
	}
	
	public static int fib2(int n){
		int fibValue = 0;
		if (n == 0){
			return 0;
		}else if (n == 1){
			return 1;
		}else if (fibArray[n] != 0){
			return fibArray[n];
		}else {
			fibValue = fib2(n -1) + fib2(n-2);
			fibArray[n] = fibValue;
			return fibValue;
		}
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(fib(4,map));
		
		System.out.println("second methode\n");
		int n = 5;
		fibArray[0]=1;
		fibArray[1]=1;
		System.out.println(fib2(n));
	}
}
