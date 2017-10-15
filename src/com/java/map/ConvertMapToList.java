package com.oracle.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertMapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        
        System.out.println("elements of hash:");
        System.out.println(map);
        
       
     // more elegant way, this should be the standard way, recommend!
     		System.out.println("\nExample 2...");
     		for (Entry<Integer, String> entry : map.entrySet()) {
     			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
     		}

        System.out.println("\n1. Export Map Key to List...");
        List<Integer> result = new ArrayList<Integer>(map.keySet());
        result.forEach(System.out::println);
        
        System.out.println("\n2. Export map value to List");
        List<String> result2 = new ArrayList<String>(map.values());
        result2.forEach(System.out::println);

	}

}
