package com.ds.stack;

import java.util.ArrayList;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 * @param <T>
 */
public class MyStack<T> {

	private ArrayList<T> arr;
	private int top = -1;
	private int size = 0;
	
	// Constructor
	public MyStack(int size) {
		this.arr = new ArrayList<>(size);
		this.size = size;
	}
	
	// Push method to add the element to the stack
	public void push(T data) {
		if(top+1 > size-1) {
			System.out.println("Stack Overflow!!!");
		} else {
			this.arr.add(++top, data);
		}
	}
	
	// Pop method to return and remove the top element from the stack
	public T pop() {
		if(top >= 0) {
			T element = this.arr.get(top);
			this.arr.remove(top);
			top--;
			return element;
		} else {
			System.out.println("Stack Underflow!!!");
			return null;
		}
	}
	
	// Peak method to return the top element but doesn't remove from the stack
	public T peak() {
		if(top >= 0) {
			return this.arr.get(top);
		} else {
			System.out.println("Stack Underflow!!!");
			return null;
		}
	}

	@Override
	public String toString() {
		return "MyStack " + arr;
	}
}
