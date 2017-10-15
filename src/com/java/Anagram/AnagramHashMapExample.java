package com.java.Anagram;

import java.util.HashMap;

public class AnagramHashMapExample {
	public static void isAnagram(String str1, String str2){
		String s1 = str1.replaceAll("\\s", "").toLowerCase();
		 
        String s2 = str2.replaceAll("\\s", "").toLowerCase();
        System.out.println(s1 + " " + s2);
 
        //Initially setting status as true
 
        boolean status = true;
        if(s1.length() != s2.length()){
            status = false;	
        }else{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s1.length(); i++){
			char charAsKey = s1.charAt(i);
			System.out.println("Key: " + charAsKey);
			int charCountAsValue = 0;
			if (map.containsKey(charAsKey)){
				charCountAsValue = map.get(charAsKey);
			}
			map.put(charAsKey, ++charCountAsValue);
			
			charAsKey = s2.charAt(i);
			charCountAsValue = 0;
			if (map.containsKey(charAsKey)){
				charCountAsValue = map.get(charAsKey);
			}
			map.put(charAsKey, --charCountAsValue);
		}
		
		for (Character key: map.keySet()){
			System.out.println("key:" + key + " values: " + map.get(key));
		}
		
		for (int i:map.values()){
			if (i != 0){
				status = false;
			}
		}
		
		if(status){
            System.out.println(s1+" and "+s2+" are anagrams");
        }else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
		
        }
	}

	public static void main(String[] args) {
		isAnagram("AAAaas", "saaaaa");
	}

}
