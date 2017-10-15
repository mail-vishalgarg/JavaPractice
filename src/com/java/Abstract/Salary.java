package com.java.Abstract;

public class Salary extends Employee {
	private double salary;
	
	public Salary(String name, String address, int number, double salary){
		super(name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck(){
		System.out.println("Within mailCheck of salary class");
		System.out.println("mailing check to "+ getName() + " With salary "+ salary );
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double newSalary){
		this.salary=newSalary;
	}
	
}
