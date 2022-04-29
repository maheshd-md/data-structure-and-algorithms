/**
 * 
 */
package com.algo.sorting;

import java.util.Arrays;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {3, 5, 4, 9, 1, 10, 100, 50, 45, 65, 33, 51, 11, 12, 2, 1};
		System.out.println("Unsorted Array: " +Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Sorted Array: " +Arrays.toString(arr));
	}

	/**
	 * @param arr
	 */
	private static void selectionSort(int[] arr) {
		int length = arr.length;
		for (int i=0; i<length-1; i++) {
			int minValueIndex = i;
			for (int j=i; j<length; j++) {
				if(arr[minValueIndex] > arr[j]) {
					minValueIndex = j;
				}
			}
			if(minValueIndex != i) {
				int temp = arr[minValueIndex];
				arr[minValueIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
