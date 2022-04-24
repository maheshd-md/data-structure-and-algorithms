/**
 * 
 */
package com.algo.searching;

/**
 * @author Mahesh
 *
 */
public class BinarySearchUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { -1, 0, 5, 10, 14, 50, 100, 500, 600 };
		System.out.println(binarySearch(arr, 500, 0, arr.length - 1));
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
