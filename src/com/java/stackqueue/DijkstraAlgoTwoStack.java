package com.oracle.stackqueue;

import java.util.Scanner;
import java.util.Stack;

//program is not running

public class DijkstraAlgoTwoStack {
	public static void main(String[] args) {
		Stack<Character> ops = new Stack<Character>();
		Stack<Integer> vals = new Stack<Integer>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("Input String :" + s);
		for (int i=0; i <s.length();i++){
			char c = s.charAt(i);
			System.out.println("CCCC:"+ c);
		}
		for (int i=0; i <s.length();i++){
			char c = s.charAt(i);
			System.out.println("Chars:" + c);
			//if(Character.toString(c).equals('('))  System.out.println("ignore:" + c);
			 if(Character.toString(c).equals('+')){ ops.push(c);
			 System.out.println(ops);}
			else if(Character.toString(c).equals('-')) ops.push(c);
			else if(Character.toString(c).equals('-')) ops.push(c);
			else if(Character.toString(c).equals('/')) ops.push(c);
			else if(Character.toString(c).equals(')')){
				char op = ops.pop();
				double v = vals.pop();
				if (Character.toString(op).equals('+')) v = vals.pop() + v;
				else if (Character.toString(op).equals('-')) v = vals.pop() -v;
				else if (Character.toString(op).equals('*')) v = vals.pop() * v;
				else if (Character.toString(op).equals('/')) v = vals.pop() / v;
				vals.push((int) v);
			} else {
				vals.push(Integer.parseInt(s));
			}
		}
		System.out.println(vals.pop());
	}

}
