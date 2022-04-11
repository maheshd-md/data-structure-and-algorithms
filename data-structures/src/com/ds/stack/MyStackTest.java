package com.ds.stack;

public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack<Integer> stack = new MyStack<>(5);
		
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);	// Stack should overflow at this statement
		
		System.out.println(stack.toString());
		
		System.out.println("Peak element: " + stack.peak());

		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());	// Stack should underflow at this statemnet
	}
}
