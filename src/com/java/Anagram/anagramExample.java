package com.java.Anagram;

import java.util.Arrays;

public class anagramExample {
	public static void isAnagram(String s1, String s2){
		String copyS1 = s1.replaceAll("\\s", "");
		String copyS2 = s2.replaceAll("\\s", "");
		System.out.println("S1:" + copyS1 + " S2:" + copyS2);
		
		boolean status=true;
		if(copyS1.length() != copyS2.length()){
			status = false;
		} else{
			char[] s1Array = copyS1.toLowerCase().toCharArray();
			char[] s2Array = copyS1.toLowerCase().toCharArray();
			//Sort both the arrays
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			//check both the arrays are equal or not
			status = Arrays.equals(s1Array, s2Array);
		}
		if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
	}
	
	public static void isAnagramMethod2(String s1, String s2){
		String copyS1 = s1.replaceAll("\\s", "");
		String copyS2 = s2.replaceAll("\\s", "");
		System.out.println("Second Method :S1:" + copyS1 + " S2:" + copyS2);
		
		boolean status=true;
		if(copyS1.length() != copyS2.length()){
			status = false;
		} else{
			char[] s1CharArray = copyS1.toLowerCase().toCharArray();
			StringBuilder sb = new StringBuilder(copyS2);
			
			for(char c:s1CharArray){
				int index = sb.indexOf(""+c);
				System.out.println("index: " + index);
				if(index != -1){
					sb = sb.deleteCharAt(index);
				}else {
					status = false;
					break;
				}
				
			}
			if(status)
	        {
	            System.out.println("Second method: " + s1+" and "+s2+" are anagrams");
	        }
	        else
	        {
	            System.out.println("Second method: " + s1+" and "+s2+" are not anagrams");
	        }
			
		}
	}
	
	public static void main(String[] args) {
		isAnagram("abcd aaa", "aaa abcd");
		isAnagram("Keep", "peEk");
		isAnagram(" A AAA","AaA A");
		
		isAnagramMethod2("MMMMk", "k m m m M");
		isAnagramMethod2("MADAM", "DAMam");
		
	}

}
