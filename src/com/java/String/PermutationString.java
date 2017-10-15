package com.oracle.String;

import java.util.HashSet;
import java.util.Set;

public class PermutationString {
	public static Set<String> genPerm(String input){
		Set<String> set= new HashSet<String>();
		
		if (input == ""){
			return set;
		}
		Character a = input.charAt(0);
		
		if(input.length()>1){
			input=input.substring(1);
			Set<String> permSet= genPerm(input);
			for(String x:permSet){
				for(int i=0;i<=x.length();i++){
					set.add(x.substring(0, i) +a +x.substring(i));
				}
			}
		} else {
			set.add(a + "");
		}
		return set;
	}
	
	public static void main(String[] args) {
		Set<String> result=PermutationString.genPerm("abc");
		System.out.println(result);
		
		String y="abc";
		Character begin = y.charAt(0);
		String rest = y.substring(1);
		System.out.println("Length:" + rest.length());
		
		Set<String> set=new HashSet<String>();
		for(int i=0;i<=rest.length();i++){
			System.out.println(rest.substring(0,i) + " " + begin + " " + rest.substring(i));
			set.add(rest.substring(0, i) + begin + rest.substring(i));
		}
		System.out.println(set);
		
		String nextRest=rest.substring(1);
		System.out.println("NEXT:"+nextRest);
		begin = rest.charAt(0);
		Set<String> set1=new HashSet<String>();
		for(int i=0;i<=nextRest.length();i++){
			System.out.println(nextRest.substring(0,i) + " " + begin + " " + nextRest.substring(i));
			set1.add(nextRest.substring(0, i) + begin + nextRest.substring(i));
		}
		System.out.println(set1);
		
		
	}

}
