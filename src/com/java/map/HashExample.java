package com.oracle.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1,"abc");
		m.put(2, "xyz");
		m.put(0,"xxx");
		
		for (Integer key: m.keySet()){
			System.out.println("key:" + key + " values: " + m.get(key));
		}
		
		m.put(9,"");
		m.put(10,"");
		//Iterating Hashmap using KeySet iterator
		System.out.println("Second Method\n");
		Set<Integer> keySet = m.keySet();
		Iterator<Integer> itr = keySet.iterator();
		
		while(itr.hasNext()){
			int key = itr.next();
			String value = m.get(key);
			System.out.println("Key: " + key + " value:" + value);
		}
		
		//remove element using key
		m.remove(0);
		System.out.println("Elements after remove by keys\n");
		for (Integer key: m.keySet()){
			System.out.println("key:" + key + " values: " + m.get(key));
		}
		
		//Remove element using value
		m.values().remove("");
		System.out.println("Elements after remove by valuse\n");
		//Iterating Hash using EntrySet
		Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry: entrySet){
			System.out.println("key: " + entry.getKey() + " Value:" + entry.getValue());
		}
	}
}
