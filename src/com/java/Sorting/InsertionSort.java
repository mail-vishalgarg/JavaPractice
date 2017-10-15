package com.oracle.Sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		insertionSort(input);
	}
	
	private static void printNumbers(int[] input){
		for (int i=0; i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
	public static void insertionSort(int array[]){
		int n = array.length;
		for (int i=1; i<n; i++){
			int value= array[i];
			int hole= i;
			while(hole>0 && array[hole-1] > value){
				array[hole] = array[hole-1];
				hole = hole -1;
			}
			array[hole] = value;
		}
		printNumbers(array);
	}

}
