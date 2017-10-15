package com.oracle;

public class TestC {

	int id;
	String result;

	public void cResults(int id, String result){
		this.id=id;
		this.result=result;
		TestB.bResult(this.id, this.result);
	}
	
	public static void main(String args[]){
		String result= TestB.bResult(100,"PASS");
		System.out.println(result);
	}
	
	
}
