package com.java.array;

import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	char[] arrChar = {'x', 'p','b','a','s'};
	Arrays.sort(arrChar);
	for(char c:arrChar){
		System.out.println(c);
	}
	}
}
