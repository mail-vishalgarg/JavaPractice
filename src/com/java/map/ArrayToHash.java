package com.java.map;

import java.util.HashMap;

public class ArrayToHash {

	public static void main(String[] args) {
		char[] charArr = new char[] {'a','b','c','d','e'};
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int counter = 0;
		for (char c: charArr){
			if(map.containsKey(c)){
				counter = map.get(c);
			}
			map.put(c,++counter);
		}
		
		for(Character key: map.keySet()){
			System.out.println("key:" + key + " value" + map.get(key));
		}
	}
}
