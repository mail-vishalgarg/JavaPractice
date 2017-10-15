package com.oracle.ctc;

public class SwapMinMax {
	//Page#80
	
	public static void swapMinMax(int[] array){
		int minIndex = 0;
		for (int i=1; i<array.length;i++){
			if (array[i]<array[minIndex]){
				minIndex = i;
			}
		}
		
		int maxIndex=0;
		for (int i=1; i<array.length;i++){
			if (array[i] > array[maxIndex]){
				maxIndex = i;
			}
		}
		
		int temp= array[minIndex];
		array[minIndex] = array[maxIndex];
		array[maxIndex] = temp;
		
		for(int i=0; i<array.length;i++){
			System.out.println("Element: " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] testArr = new int[] {22,12,1,4,44,11};
		swapMinMax(testArr);
	}

}
