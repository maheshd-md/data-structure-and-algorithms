/**
 * 
 */
package com.algo.sorting;

import java.util.Arrays;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 5, 4, 9, 1, 10, 100, 50, 45, 65, 33, 51, 11, 12, 2, 1, -7, 1000 };
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	/**
	 * @param arr
	 */
	private static void mergeSort(int[] arr) {
		divide(arr, 0, arr.length - 1);
	}

	/**
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void divide(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;
		divide(arr, low, mid);
		divide(arr, mid + 1, high);

		conquer(arr, mid, low, high);
	}

	/**
	 * @param arr
	 * @param mid
	 * @param low
	 * @param high
	 */
	private static void conquer(int[] arr, int mid, int low, int high) {
		int merged[] = new int[high - low + 1];
		int mergedArrIndex = 0;

		int index1 = low;
		int index2 = mid + 1;

		while (index1 <= mid && index2 <= high) {
			merged[mergedArrIndex++] = arr[index1] < arr[index2] ? arr[index1++] : arr[index2++];
		}

		while (index1 <= mid) {
			merged[mergedArrIndex++] = arr[index1++];
		}

		while (index2 <= high) {
			merged[mergedArrIndex++] = arr[index2++];
		}

		for (int i = 0, j = low; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

}
