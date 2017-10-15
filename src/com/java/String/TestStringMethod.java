package com.oracle.String;

public class TestStringMethod {

	public static void main(String[] args) {
		String str = "aaaabbbbbbbbbcde";
		int count[] = new int[256];
		for (int  i=0; i<str.length();i++){
			System.out.println((int)(str.charAt(i)));
			count[str.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for(int j=0; j<str.length();j++){
			if(max < count[str.charAt(j)]){
				max = count[str.charAt(j)];
				result = str.charAt(j);
			}
		}
		System.out.println(max  +""+ result);
		System.out.println(Integer.MAX_VALUE);
		
		
		/*for (int i : count){
			System.out.println(i);
		}*/
	}
}
