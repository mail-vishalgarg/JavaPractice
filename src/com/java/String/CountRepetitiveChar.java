package com.oracle.String;

import java.util.HashMap;
import java.util.Map;

public class CountRepetitiveChar {
	public static void charCount(String myStr) {
		//String myStr = "aaabbcccssaf";

		for (int i = 0; i < myStr.length(); i++) {
			System.out.println(myStr.charAt(i));
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int y=0; y<myStr.length();y++){
			if(!map.containsKey(myStr.charAt(y))){
				map.put(myStr.charAt(y), (Integer)1);
			} else{
				map.put(myStr.charAt(y),map.get(myStr.charAt(y))+1);
			}
		}
		System.out.println(map);
	
	}


}
