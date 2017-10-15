package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class AddArrayList {

	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(11);
		al.add(13);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(12);
		al2.add(200);
		//al2.addAll(al);
		//al.removeAll(al2);
		al.retainAll(al2);
		/*for(int i:al2)
			System.out.println(i);*/
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
