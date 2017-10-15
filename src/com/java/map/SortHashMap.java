package com.oracle.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void IntSortHashMap(){
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(67, "aaa");
		map.put(99,"bbbb");
		map.put(14, "sasdfasdf");
		map.put(34,"aasdfas");
		map.put(19,"nmnmm");
		map.put(1, "aaa");
		
		/*for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.println("Key: "+ entry.getKey() + " Value: " + entry.getValue());
		}*/
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(map);
		for(Map.Entry<Integer, String> entry:tm.entrySet()){
			System.out.println("key: " + entry.getKey() + " Value:" + entry.getValue());
		}
		System.out.println("******************************************************************");
	}
	
	public static void charSortHashMap(){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('x',4);
		hm.put('l', 7);
		hm.put('A',99);
		hm.put('p',18);
		
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>(hm);
		for(Map.Entry<Character, Integer> entry:tm.entrySet()){
			System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
		}
		
	}
	public static void main(String[] args) {
		IntSortHashMap();
		charSortHashMap();
		
	}
}
