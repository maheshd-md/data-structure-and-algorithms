/**
 * 
 */
package com.algo.searching;

/**
 * @author Mahesh
 *
 */
public class BinarySearchInInfiniteSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { -1, 0, 5, 10, 14, 50, 51, 52, 55, 60, 70, 75, 90, 91, 93, 95, 97, 99, 100 };
		System.out.println(searchInSortedAndRotatedArray(arr, 97, 0, arr.length - 1));
	}

	private static int searchInSortedAndRotatedArray(int[] arr, int key, int low, int high) {
		int mid = (low + high) / 2;
		if(arr[low] < arr[high]) {
			if(key <= arr[mid]) {
				return binarySearch(arr, key, low, mid);
			} else {
				return searchInSortedAndRotatedArray(arr, key, mid+1, high);
			}
		} else {
			if(key >= arr[mid]) {
				return binarySearch(arr, key, mid, high);
			} else {
				return searchInSortedAndRotatedArray(arr, key, low, mid-1);
			}
		}
	}

	public static int binarySearch(int[] arr, int key, int low, int high) {
		int midIndex = (low + high) / 2;
		if (low > high) {
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
