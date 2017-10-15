package com.java.array;

public class ArrayDemo {
	
	public static void paasByReference(String a[]){
		a[0] = "changed";
	}
	public static void main(String[] args) {
		int array[] = new int[7];
		for (int count=0;count<7;count++){
			array[count] = count+1;
		}
	
		for(int count=0; count<7; count++){
			System.out.println("array["+count+"] = "+array[count]);
		}
		
		String []b={"apple","orange","cherry"};
		System.out.println("Befor function call:" + b[0]);
		ArrayDemo.paasByReference(b);
		System.out.println("After fucntion call" + b[0]);
	}
}
