package com.oracle.String;

public class ReverseStringTest {
	public static String reverseString(String str){
		char[] ch = str.toCharArray();
		int len = str.length();
		int begin = 0;
		int end = len -1;
		
		while(begin < end){
			char tmp = ch[begin];
			ch[begin] = ch[end];
			ch[end] = tmp;
			begin++;
			end--;
			
		}
		String revStr = new String(ch);
		System.out.println("AAAA" + revStr);
		return revStr;
	}
	
	public static String revStrSecondMethod(String str){
		StringBuilder sb = new StringBuilder(str.length());
		for(int i= str.length()-1; i>0;i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "abcdef";
		System.out.println("Reverse String: " + reverseString(str).toString());
		
		System.out.println("Second Method: " + revStrSecondMethod(str));
	}

}
