package com.oracle.stackqueue;

import java.util.Stack;

public class BalancedParanthesis {
	public static void main(String args[]) {

        System.out.println(balancedParenthensies("{(a,b)}"));
        System.out.println(balancedParenthensies("{(a},b)"));
        System.out.println(balancedParenthensies("{)(a,b}"));
    }
	
	public static boolean balancedParenthensies(String s){
		Stack <Character> stack = new Stack<Character>();
		for(int i=0; i<s.length();i++){
			char c = s.charAt(i);
			//System.out.println("CHARS: " + c);
			if (c == '(' || c == '{'|| c == '['){
				stack.push(c);
			} else if (c == '}'){
				if (stack.isEmpty()) return false;
				if (stack.pop() != '{') return false;
			} else if (c == ')'){
				if (stack.isEmpty()) return false;
				if (stack.pop() != '(') return false;
			} else if (c == ']'){
				if (stack.isEmpty()) return false;
				if(stack.pop() != '[') return false;
			}
			
		}
		return stack.isEmpty();
	}
}
