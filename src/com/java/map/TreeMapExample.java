package com.oracle.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(14, "vvvv");
		tm.put(8,"AAAA");
		tm.put(10,"xxxx");
		tm.put(91,"zzzz");
		tm.put(1,"pp");
		
		for(Integer key:tm.keySet()){
			System.out.println("Key:" + key +" val:" + tm.get(key));
		}
		
		System.out.println("*************************************************************************");
		for(Map.Entry<Integer, String> entry:tm.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + " value:" + value);
		}
		
	}
}
