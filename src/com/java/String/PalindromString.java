package com.oracle.String;

public class PalindromString {

	public static void main(String[] args) {
		String mystr = "abcbac";
		char[] ch = mystr.toCharArray();
		int i1 = 0;
		int i2 = ch.length -1;
		
		while(i1 <= i2){
			if (ch[i1] != ch[i2]){
				System.out.println("FALSE");
			}else {
				System.out.println("true");
			}
			i1++;
			i2--;
		}
		
		System.out.println("Second method");
		String reverse=new StringBuffer(mystr).reverse().toString();
		if (mystr.equals(reverse)){
			System.out.println("true");
		}else{
			System.out.println("FALSE");
		}
		
		//Third method
		System.out.println("third method");
		System.out.println(mystr.equals(new StringBuffer(mystr).reverse().toString())?true:false);
		
				
	}
}
