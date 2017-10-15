package com.oracle;

public class ProvingThis {
	public void m(){
		System.out.println(this);
	}
	
	public static void main(String args[]){
		ProvingThis obj=new ProvingThis();
		System.out.println("OBJ:" +obj);
		obj.m();
	}

}
