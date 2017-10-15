package com.oracle.String;

public class SecondFrequentChar {
	
	public static void main(String[] args) {
		String str = "aaabbaabbaaaa";
		
		int count[] = new int[256];
		for (int i=0; i<str.length();i++){
			count[str.charAt(i)]++;
		}
		
		int first = 0;
		int second = 0;
		for (int j=0; j<str.length();j++){
			if(count[str.charAt(j)] > count[str.charAt(first)]){
				second = str.charAt(first);
				first = str.charAt(j);
			} 
//			else if (count[str.charAt(j)] > count[str.charAt(second)] && count[str.charAt(j)] != count[str.charAt(first)]){
//				second = j;
//			}
		}
		System.out.println(str.charAt(second));
		System.out.println(str.charAt(first));
	}

}
