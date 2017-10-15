package com.oracle.String;

public class StringBufferEx {
	public static void main(String[] args) {
		String s="test";
		String b= new StringBuffer(s).append(" only").toString();
		System.out.println(b);
		
		String c= new StringBuffer(b).delete(4, 8).toString();
		System.out.println(c);
		
		String d= new StringBuffer(c).insert(4, " onl").toString();
		System.out.println(d);
		
		String x= "bc";
		String input = x.substring(2);
		System.out.println("XXXX:" + input);
	}

}
