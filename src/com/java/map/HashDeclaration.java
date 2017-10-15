package com.oracle.map;

import java.util.HashMap;

public class HashDeclaration {
	public static void main(String[] args) {
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		dict.put("left", 1);
		dict.put("right", 2);
		dict.put("Up",3);
		
		for (String key: dict.keySet()){
			System.out.println("Key: " + key + " Value: "+dict.get(key));
			
		}
		
		@SuppressWarnings("serial")
		HashMap<String,Integer> dict2 = new HashMap<String,Integer>(){{
			put("AAA",1);
			put("BBB",2);
		}};
		for(String key:dict2.keySet()){
			System.out.println("Dict2 Key: " + key + " Value: "+dict2.get(key));
		}
	}

}
