package com.java.ctc;

public class IdenticalCharCount {

	public static boolean permutations(String s, String t){
		if (s.length() != t.length()){
			return false;
		}
		int[] letters = new int[128];
		char[] s_array = s.toCharArray();
		for(char c:s_array){
			letters[c] = letters[c] + 1;
		}
		
		for (int i=0; i<t.length();i++){
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c] <0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "abcd";
		String t = "bcda";
		System.out.println(permutations(s, t));
	}

}
