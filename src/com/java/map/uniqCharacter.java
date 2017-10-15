package com.oracle.map;

import java.util.ArrayList;
import java.util.HashMap;

public class uniqCharacter {

	public static void uniqChar(String s){
		ArrayList<Character> uniq = new ArrayList<Character>();
		for(int i=0; i<s.length();i++){
			char charKey = s.toLowerCase().charAt(i);
			System.out.println(charKey);
			if (!uniq.contains(charKey)){
				uniq.add(charKey);
			}
		}
		
		for (char x:uniq){
			System.out.println("UNIQ:" + x);
		}
	}
	
	public static void uniqMethod2(String s){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int value = 0;
		for (int i=0; i<s.length(); i++){
			char charKey = (char) s.charAt(i);
			System.out.println("KKKK:" + charKey);
			if (!map.containsKey(charKey)){
				value = 1;
				map.put(charKey, 1);
			}
		}
		
		for(Character key: map.keySet()){
			System.out.println("key:" + key + " value: "+map.get(key));
		}
	}
	
	public static void main(String[] args) {
		uniqChar("AAbbCCaabbcc");
		uniqMethod2("aabbcc");
	}
}
