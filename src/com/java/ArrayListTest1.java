package com.oracle;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTest1 {
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("las angeles");
		list.add("cali");
		list.add("newyork");
		list.add("las vegas");
		
		//Traversing list through iterator
		/*Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		//traverse through foreach loop
		for(String obj:list)
			System.out.println(obj);
	}

}
