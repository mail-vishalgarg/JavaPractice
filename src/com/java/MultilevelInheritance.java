package com.oracle;

class Animal{
	public void eat(){System.out.println("eating..");}
}
	

class Dog extends Animal{
	public void barking(){System.out.println("Barking...");}
}
	
class BabyDog extends Dog{  
	void weep(){System.out.println("weeping...");}
}  		 
	
	public class MultilevelInheritance{
		public static void main(String args[]){
			BabyDog d = new BabyDog();
			d.eat();
			d.barking();
			d.weep();
	}
}
