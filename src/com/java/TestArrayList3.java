package com.oracle;

import java.util.ArrayList;

public class TestArrayList3 {
	public static void main(String args[]){
		Student s1=new Student(1,"xyz",11);
		Student s2=new Student(2,"LKY",12);
		Student s3=new Student(3,"ABC",13);
		
		//Creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student obj:al)
			System.out.println(obj.name + " "+ obj.age + " " +  obj.rollno);
	}
}
