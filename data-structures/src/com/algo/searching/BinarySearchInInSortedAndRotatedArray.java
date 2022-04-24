/**
 * 
 */
package com.algo.searching;

/**
 * @author Mahesh
 *
 */
public class BinarySearchInInSortedAndRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { -1, 0, 5, 10, 14, 50, 51, 52, 55, 60, 70, 75, 90, 91, 93, 95, 97, 99, 100 };
		System.out.println(searchInInfiniteSortedArray(arr, 97));
	}

	/**
	 * @param arr
	 * @param key
	 * @return
	 */
	private static int searchInInfiniteSortedArray(int[] arr, int key) {
		int low = 0;
		int high = 1;
		while (key > arr[high]) {
			low = high;
			high = 2 * high;
		}
		return binarySearch(arr, key, low, high);
	}

	public static int binarySearch(int[] arr, int key, int low, int high) {
		int midIndex = (low + high) / 2;
		if(low > high) {
			return -1;
		}
		if (key == arr[midIndex]) {
			return midIndex;
		}
		if (key < arr[midIndex]) {
			return binarySearch(arr, key, low, midIndex - 1);
		}
		return binarySearch(arr, key, low + 1, high);
	}
}
