package com.oracle.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer, String>();
		hm.put(1,"vmit");
		hm.put(2,"aimal");
		hm.put(3,"John");
		hm.put(null,"");
		hm.put(4,"ximal");
		
		for(Integer key:hm.keySet()){
			System.out.println("Key: "+key + " value:" + hm.get(key));
		}
	}

}
