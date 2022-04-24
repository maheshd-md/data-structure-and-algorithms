/**
 * 
 */
package com.algo.sorting;

import java.util.Arrays;

/**
 * @author Mahesh
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {3, 5, 4, 9, 1, 10, 100, 50, 45, 65, 33, 51, 11, 12, 2, 1};
		System.out.println("Unsorted Array: " +Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Sorted Array: " +Arrays.toString(arr));
	}

	/**
	 * @param arr
	 */
	private static void insertionSort(int[] arr) {
		int length = arr.length;
		for(int i=1; i<length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && temp < arr[j]) {
					arr[j+1] = arr[j];
					j--;
			}
			arr[j+1] = temp;
		}
	}

}
