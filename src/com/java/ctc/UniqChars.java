package com.oracle.ctc;

//Page# 192 Array and Strings
public class UniqChars {

	public static boolean isUniqueChars(String str){
		if (str.length() > 128) {
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		/*for(boolean x:char_set)
			System.out.println(x);
		*/
		
		for (int i=0; i<str.length();i++){
			int val = str.charAt(i);
			//System.out.println(val);
			/*char charVal = str.charAt(i);
			System.out.println("CCC:" + charVal);*/
			if(char_set[val]){
				System.out.println("CCCC: "+char_set[val]);
				return false;
			}
			char_set[val] = true;
			System.out.println((char)str.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(isUniqueChars(str));
	}
}
