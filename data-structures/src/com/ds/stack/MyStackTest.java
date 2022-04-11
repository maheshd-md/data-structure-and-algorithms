package com.ds.stack;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack<Integer> stack = new MyStack<>(5);
		
		System.out.println("Pushing element: " + 10);
		stack.push(10);
		System.out.println(stack.toString());
		
		System.out.println("Pushing element: " + 20);
		stack.push(20);
		System.out.println(stack.toString());
		
		System.out.println("Popped element: " + stack.pop());
		System.out.println(stack.toString());

		System.out.println("Pushing element: " + 30);
		stack.push(30);
		System.out.println(stack.toString());
		
		System.out.println("Pushing element: " + 40);
		stack.push(40);
		System.out.println(stack.toString());
		
		System.out.println("Pushing element: " + 50);
		stack.push(50);
		System.out.println(stack.toString());
		
		System.out.println("Popped element: " + stack.pop());
		System.out.println(stack.toString());

		System.out.println("Popped element: " + stack.pop());
		System.out.println(stack.toString());

		System.out.println("Pushing element: " + 60);
		stack.push(60);	
		System.out.println(stack.toString());
		
		System.out.println("Peak element: " + stack.peak());
		System.out.println(stack.toString());

		System.out.println("Popped element: " + stack.pop());
		System.out.println(stack.toString());

		System.out.println("Popped element: " + stack.pop());
		System.out.println(stack.toString());

		System.out.println("Popped element: " + stack.pop());	
		System.out.println(stack.toString());
	}
}
