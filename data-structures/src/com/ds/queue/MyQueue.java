package com.ds.queue;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 * @param <T>
 */
public class MyQueue<T> {

	/*
	 * *********************************************************************************
	 * 		Enqueue -------> front |	|	|	|	|	|	| rear ---------> Dequeue
	 * *********************************************************************************
	 */

	private ArrayList<T> arr;
	private int size;
	private int front;
	private int rear;

	public MyQueue() {
		this.arr = new ArrayList<>();
		size = 0;
		front = -1;
		rear = -1;
	}

	// Enqueue method to add the element in the queue
	public void enqueu(T data) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			this.arr.add(front, data);
		} else {
			front++;
			this.arr.add(front, data);
		}
		size++;
	}

	// Dequeue method to remove the element from the queue
	public T dequeue() {
		T element;
		if (rear == -1) {
			System.out.println("Queue is empty");
			return null;
		} else if (front == rear) {
			element = this.arr.get(rear);
			front = -1;
			rear = -1;
		} else {
			element = this.arr.get(rear++);
		}
		size--;
		return element;
	}

	// Front method to return the front element but does not remove it
	public T front() {
		if (front == -1) {
			System.out.println("Queue is empty");
			return null;
		} else {
			return this.arr.get(front);
		}
	}

	// Rear method to return the front element but does not remove it
	public T rear() {
		if (rear == -1) {
			System.out.println("Queue is empty");
			return null;
		} else {
			return this.arr.get(rear);
		}
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		ArrayList<T> temp = new ArrayList<>();
		if (rear != -1) {
			int i = front;
			int j = rear;
			while (j <= i) {
				temp.add(arr.get(j));
				j++;
			}
			Collections.reverse(temp);
		}
		return "MyQueue: front --> " + temp + " --> rear";
	}

}
