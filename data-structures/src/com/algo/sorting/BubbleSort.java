/**
 * 
 */
package com.algo.sorting;

import java.util.Arrays;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3, 5, 4, 9, 1, 10, 100, 50, 45, 65, 33, 51, 11, 12, 2, 1};
		System.out.println("Unsorted Array: " +Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted Array: " +Arrays.toString(arr));
	}
	
	/**
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		int length = arr.length;
		for(int i=0; i<length-1; i++) {
			for(int j=0; j<length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
