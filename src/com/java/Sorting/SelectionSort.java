package com.oracle.Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] n = { 24, 2, 44, 12, 1, 5, 3 };
		for (int i : n) {
			System.out.println("Befor" + i);
		}

		for (int j = 0; j < n.length - 1; j++) {
			int min = j;
			for (int k = j+1; k < n.length; k++) {
				if (n[k] < n[min]) {
					min = k;					
				}
				int temp = n[min];
				n[min] = n[j];
				n[j] = temp;
				min = k;

			}
		}
		for (int ii : n) {
			System.out.println(ii);
		}
	}
}

