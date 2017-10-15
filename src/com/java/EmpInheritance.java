package com.oracle;

public class EmpInheritance extends Address {
	String name;
	int id;
	Address address;
	public EmpInheritance(int id, String name){
		super(city, state, country);
		this.id = id;
		this.name =name;
	}
	public void display(int id, String name){
		System.out.println(id + " " + name);
		System.out.println(city + " "+state+" "+country);
	}

}
