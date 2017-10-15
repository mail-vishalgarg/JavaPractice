package com.oracle;

public class StringExample {
	public static void main(String args[]){
		String s1= "Hello How are you";
		char ch[]={'N','e','x','t'};
		String s2= new String(ch);
		String s3= new String("third String");
		String s4="";
		String s5;
		
		System.out.println(s1 + " " + s2 + " "+s3);
		System.out.println(s1.length() + " " + s1.charAt(2) + " " + s1.substring(1,8));
		if (s1.contains("Ho")){
			System.out.println("String Contains How");
		}
		if (s4.isEmpty()){
			System.out.println("s4 is an empty string");
		}
//		if (s5.equalsIgnoreCase("Null")){
//			System.out.println("its is a null string");
//		}
		
		System.out.println(s1.indexOf('H',2));
		System.out.println(s1.split(s1));
		String[] x=s1.split("");
		for (int i=0; i<x.length;i++){
			System.out.print(x[i]);
		}
		
	}

}
