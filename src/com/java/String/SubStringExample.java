package com.oracle.String;

public class SubStringExample {

	public static void main(String[] args) {
		String sid = "TESTE";
		if (sid.length() > 5){
			sid = sid.substring(0, 4);
		}
		
		System.out.println("SID:" +sid);
	}
}
