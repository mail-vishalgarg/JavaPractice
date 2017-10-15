package com.oracle;

public class test1 {
	public static String a = System.getProperty("key");
	public static void main(String[] args) {
		System.out.println("AAAA:" + a);
		
			if(a.isEmpty()){
				System.out.println("it is empty");
			} 
				
	}

}
