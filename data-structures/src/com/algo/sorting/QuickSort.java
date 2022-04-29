/**
 * 
 */
package com.algo.sorting;

import java.util.Arrays;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 5, 4, 9, 1, 10, 100, 50, 45, 65, 33, 51, 11, 12, 2, 1, -7, 1000 };
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	/**
	 * @param arr
	 * @param h 
	 * @param l 
	 */
	private static void quickSort(int[] arr, int l, int h) {
		
		if(l < h) {
			int pivotIndex = partition(arr, l, h);
			quickSort(arr, l, pivotIndex-1);
			quickSort(arr, pivotIndex+1, h);
			
		}
	}

	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[l];
		int i = l;
		int j = h;
		while (i < j) {
			while (arr[i] <= pivot && i <= h-1)
				i++;
			while (arr[j] > pivot && j >= l)
				j--;
			if (i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, j, l);
		return j;
	}

	private static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
