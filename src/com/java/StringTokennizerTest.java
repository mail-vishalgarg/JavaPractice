package com.oracle;

import java.util.StringTokenizer;

public class StringTokennizerTest {
	public static void main(String args[]){
		String str = "This is String , split by StringTokenizer, created by vishal";
		StringTokenizer  st = new StringTokenizer(str);
		System.out.println("-----------------------Split by space-------------------");
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
		
		System.out.println("----------split by commas----------------");
		StringTokenizer stcomma = new StringTokenizer(str, ",");
		while(stcomma.hasMoreElements()){
			System.out.println(stcomma.nextElement());
		}
	}
}
