package com.java.array;

class ObjectArray{
	
	   public static void main(String args[]){
		Account1 obj[] = new Account1[2];
	    obj[0].setData(1,2);
	    obj[1].setData(3,4);
	    System.out.println("For Array Element 0");
	    obj[0].showData();
	    System.out.println("For Array Element 1");
	     obj[1].showData();
	  }
	}
class Account1{
	  static int a;
	  static int b;
	 public static void setData(int c,int d){
	   a=c;
	   b=d;
	 }
	 public static void showData(){
	   System.out.println("Value of a ="+a);
	   System.out.println("Value of b ="+b);
	 }
	}
