package com.oracle.String;

import java.util.Arrays;

public class ReverserString {
	public static void main(String[] args) {
		String myStr = "abcdef";
		
		int i,len=myStr.length();
		
		StringBuilder sb=new StringBuilder(len);
		for(i=(len-1); i>=0; i--){
			sb.append(myStr.charAt(i));
		}
		System.out.println(sb);
		
		//reverse an array
		char[] ch = myStr.toCharArray();
		int begin = 0;
		int end = ch.length -1;
		char temp;
		while(end >begin){
			temp = ch[end];
			ch[end] = ch[begin];
			ch[begin]=temp;
			end--;
			begin++;
		}
		
		System.out.println(ch);
		System.out.println("\n");
		String a = "xyzfa";
		String reverse = new StringBuffer(a).reverse().toString();
		System.out.println(reverse);
	}
	
}
