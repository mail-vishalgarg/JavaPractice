package com.oracle.String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountRepetitiveCharFromInput {
	public static void main(String[] args) {
		Scanner inputString = new Scanner(System.in);
		String token = inputString.nextLine();
		char arr[]=token.toCharArray();
		
		System.out.println(token);
		CountRepetitiveChar.charCount(token);
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char val:arr){          
            map.put(val,map.containsKey(val)?map.get(val)+1:1);         
        }
        
        for (Entry<Character, Integer> entry: map.entrySet()){
        	if(entry.getValue()>1){
        		Character key=entry.getKey();
        		Object value=entry.getValue();
        		
        		System.out.println("Key:" + key + " Value:" + value);
        	}
        }
		//convert a string to char array
		char[] ch= token.toCharArray();
		for(char c: ch){
			System.out.println(c);
		}
	}

}
