package com.oracle.leetCode;

public class DivideTwoInteger {

	public static int divide(int dividend, int divisor) {
		int reminder = 0;
		int quotient = 0;
		
		if(divisor==0) return Integer.MAX_VALUE;
        if(divisor==-1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
		
		while (dividend >= divisor){
			dividend = dividend - divisor;
			quotient += 1;
			
			if (dividend < divisor){
				reminder = dividend;
			}
		}
		//System.out.println("Reminder : " + reminder);
		//System.out.println("quotient: " + quotient);
        return quotient;
    }
    public static void main(String[] args){
        int result = divide(5,2);
        System.out.println(result);
    }
}
