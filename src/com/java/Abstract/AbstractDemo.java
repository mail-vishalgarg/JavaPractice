package com.java.Abstract;

public class AbstractDemo {

	public static void main(String[] args) {
		Salary s = new Salary("vishal", "california", 1, 22112);
		Employee e = new Salary("summi", "cal",2, 222222);
		
		s.mailCheck();
		e.mailCheck();
		
		System.out.println(e.getAddress());
		System.out.println(e.getName());
		System.out.println(e.getNumber());
		
		System.out.println(s.getAddress());
		System.out.println(s.getName());
		System.out.println(s.getNumber());
		System.out.println(s.getClass());
	}

}
