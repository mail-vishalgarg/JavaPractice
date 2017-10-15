package com.oracle;

class Employee{
	float salary=10000;
	
}
public class InheritanceTest1 extends Employee {
	int bonus=4000;

	public static void main(String args[]){
	  InheritanceTest1	obj = new InheritanceTest1();
	  System.out.println("SALARY:" + obj.salary);
	  System.out.println(obj.bonus);
	}
}
