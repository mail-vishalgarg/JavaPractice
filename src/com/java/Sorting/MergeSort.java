package com.oracle.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
/*		
		BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
		int arraysize = Integer.parseInt(R.readLine());
		int[] inputArray = new int[arraysize];
		
		for (int i=0; i<arraysize; i++){
			inputArray[i]=Integer.parseInt(R.readLine());
		}*/
		int[] inputArray= {42,24,1,44,12,9,8,11};
		mergesort(inputArray);
	}
	
	public static void mergesort(int[] A){
		if (A.length > 1) {
			int low = 0;
			int high = A.length - 1;
			int middle = (low + high) / 2;
			//System.out.println(low + " " + high + " " + middle);
			int[] leftArray = Arrays.copyOfRange(A, 0, middle);
			int[] rightArray = Arrays.copyOfRange(A, middle + 1, A.length - 1);
			mergesort(leftArray);
			mergesort(rightArray);
			A = merge(leftArray, rightArray);
			for(int x :A){
				System.out.println(x);
			}
		}
	}
		
	public static int[] merge(int[] left, int[] right){
		int totalEle = left.length + right.length;
		int[] a = new int[totalEle];
		
		int l=0, r=0,k=0;
		
		while(k < totalEle){
			 if ( l < left.length && r<right.length){
				 if(left[l] < right[r]){
					 a[k] = left[l];
					 l++;
					 k++;
				 }else {
					 a[k] = right[r];
					 r++;
					 k++;
				 }
			 } else {
				 if(l >=left.length){
					 while(r<right.length){
						 a[k] = right[r];
						 r++;
						 k++;
					 }
				 }
				 
				 if( r >= right.length){
					 while(l <left.length){
						 a[k]=left[l];
						 l++;
						 k++;
					 }
				 }
			 }
		}
		return a;	
	}
}
