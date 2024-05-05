package com.problems.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(getNthFibonacciNumber(10, new HashMap<>()));
	}
	
	public static int getNthFibonacciNumber(int n, Map<Integer, Integer> memory) {
		if(memory.containsKey(n)) {
			return memory.get(n);
		}
		if(n == 1) {
			// 1st fibonacci number is 0
			return 0;
		}
		if(n == 2) {
			// 2nd fibonacci number is 1
			return 1;
		}
		int fib = getNthFibonacciNumber(n-1, memory) + getNthFibonacciNumber(n-2, memory);
		memory.put(n, fib);
		return fib;
	}
}
