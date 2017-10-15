package com.oracle.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class expressionStringEx {
	
	public static void main(String[] args)
	{
	Stack<String> ops = new Stack<String>();
	Stack<Double> vals = new Stack<Double>();
	Scanner scan  = new Scanner(System.in);
	System.out.println("Please Enter the number:");
	String s = scan.next();
	while (!s.isEmpty())
	{ // Read token, push if operator.
	//String s = StdIn.readString();
	s = scan.next();	
	if (s.equals("(")) ;
	else if (s.equals("+")) ops.push(s);
	else if (s.equals("-")) ops.push(s);
	else if (s.equals("*")) ops.push(s);
	else if (s.equals("/")) ops.push(s);
	else if (s.equals("sqrt")) ops.push(s);
	else if (s.equals(")"))
	{ // Pop, evaluate, and push result if token is ")".
	String op = ops.pop();
	double v = vals.pop();
	if (op.equals("+")) v = vals.pop() + v;
	else if (op.equals("-")) v = vals.pop() - v;
	else if (op.equals("*")) v = vals.pop() * v;
	else if (op.equals("/")) v = vals.pop() / v;
	else if (op.equals("sqrt")) v = Math.sqrt(v);
	vals.push(v);
	} // Token not operator or paren: push double value.
	else vals.push(Double.parseDouble(s));
	}
	System.out.println(vals.pop());
	}

}
