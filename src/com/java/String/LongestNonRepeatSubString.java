package com.oracle.String;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatSubString {
	    public static int lengthOfLongestSubstring(String s) {
	    	int n = s.length();
	    	int start=0;
	    	int max=0;
	    	Map<Character, Integer> m = new HashMap<Character, Integer>();
	    	
	    	for(int i=0; i<n; i++){
	    		char c = s.charAt(i);
	    		if (m.containsKey(c) && m.get(c) >= start){
	    			start = m.get(c) +1;
	    			System.out.println("START:" + start);
	    		}
	    		m.put(c,i);
	    		for(Character x:m.keySet()){
	    			System.out.println("Key:" + x + ":" + m.get(x));
	    		}
	    		max = Math.max(max,i-start +1);
	    		System.out.println("Max:" + max);
	    	}
	    	
	    	return max;
	    	
	    }
	    public static void main(String[] args){
	        String s = "bbb";
	        System.out.println(lengthOfLongestSubstring(s));
	    }
	}


