package com.oracle;

public class TestB {
	public static String bResult(int id, String result){
		if( id == 100){
			return TestA.result(result);
		}else {
			return "fail";
		}
	}
	
//	public static void main(String args[]){
//		TestB b = new TestB();
//		String result= b.bResult(100);
//		System.out.println(result);
//	}
}
