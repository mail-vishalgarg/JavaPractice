package com.oracle.IO;

import java.io.IOException;

public class StandardInput {
	public static void main(String[] args) throws IOException {
		/*System.out.println("Enter any character");
		int y=System.in.read();
		System.out.println((char)y);*/
		
		char[] ary={'a','b','j'};
		for(int i=0; i<ary.length;i++){
			System.out.println((char)ary[i]);
		}
		
		int x=65;
		System.out.println((char)x);
	}

}
