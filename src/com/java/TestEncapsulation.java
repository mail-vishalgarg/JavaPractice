package com.oracle;

public class TestEncapsulation {
	public static void main(String args[]){
		EncapsulationTest e = new EncapsulationTest();
		e.setName("Krishna");
		String name = e.getName();
		System.out.println(name);
	}

}
