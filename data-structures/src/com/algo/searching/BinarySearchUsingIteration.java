/**
 * 
 */
package com.algo.searching;

/**
 * @author Mahesh
 *
 */
public class BinarySearchUsingIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = { -1, 0, 5, 10, 14, 50, 100, 500, 600 };
		System.out.println(binarySearch(arr, 500));
	}
	
	public static int binarySearch(int[] arr, int key) {
		int minIndex = 0;
		int maxIndex = arr.length - 1;
		while(minIndex <= maxIndex) {
			int midIndex = (minIndex + maxIndex) / 2;
			if(key == arr[midIndex]) {
				return midIndex;
			} else if(key < arr[midIndex]) {
				maxIndex = midIndex - 1;
			} else {
				minIndex = midIndex + 1;
			}
		}
		return -1;
	}
}
