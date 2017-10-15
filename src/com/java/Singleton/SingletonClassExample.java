package com.oracle.Singleton;

public class SingletonClassExample {
	private static SingletonClassExample obj=null;
	private SingletonClassExample(){};
	
	public static SingletonClassExample objectCreationMethod(){
		if (obj==null){
			obj=new SingletonClassExample();
		}
		return obj;
	}
	public void display(){
		System.out.println("singleton class example");
	}
	
	public static void main(String[] args){
		SingletonClassExample myExample = new SingletonClassExample();
		myExample.display();
		
		SingletonClassExample s1 =  new SingletonClassExample();
		s1.display();
		
		SingletonClassExample myObj=SingletonClassExample.objectCreationMethod();
		myObj.display();
	}

}
