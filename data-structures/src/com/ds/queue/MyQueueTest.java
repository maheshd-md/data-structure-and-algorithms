package com.ds.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		
		MyQueue<Integer> queue = new MyQueue<>();
		
		System.out.println("Dequeued element: " + queue.dequeue());
		queue.enqueu(10);
		System.out.println(queue.toString());
		queue.enqueu(20);
		System.out.println(queue.toString());
		queue.enqueu(30);
		System.out.println(queue.toString());
		queue.enqueu(40);
		System.out.println(queue.toString());
		queue.enqueu(50);
		System.out.println(queue.toString());

		System.out.println("Front element: " + queue.front());
		System.out.println("Rear element: " + queue.rear());
		
		System.out.println(queue.toString());
		
		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println(queue.toString());
		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println(queue.toString());
		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println(queue.toString());
		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println(queue.toString());
		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println(queue.toString());

		
	}
}
