package com.oracle;

public class TestInterface1 implements Showable{
	public void print (){System.out.println("This is the class print");}
	public void show(){System.out.println("This is show");}

	public static void main(String args[]){
		Showable s;
		
		s=new TestInterface1();
		s.print();
		s.show();
	}
}
