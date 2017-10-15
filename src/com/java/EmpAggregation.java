package com.oracle;

public class EmpAggregation {
	int id;
	String name;
	Address address;
	
	public EmpAggregation(int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address = address;
	}
	public void display(){
		System.out.println(id +" "+name);
		System.out.println(address.city + " "+address.state + " "+address.country);
	}
	
	public static void main(String main[]){
		Address address1=new Address("cal","CA","USA");
		Address address2= new Address("New jersy","New york","USA");
		
		EmpAggregation e =new EmpAggregation(1, "Vishal", address1);
		EmpAggregation e1 = new EmpAggregation(2, "bob", address2);
		e.display();
		e1.display();
		
	}
}
