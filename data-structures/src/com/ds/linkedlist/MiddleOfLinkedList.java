package com.ds.linkedlist;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node node2 = new Node(2);
		head.next = node2;
		Node node3 = new Node(3);
		node2.next = node3;
		Node node4 = new Node(4);
		node3.next = node4;
		Node node5 = new Node(5);
		node4.next = node5;
		Node node6 = new Node(6);
		node5.next = node6;
		
		printList(head);
		System.out.println();
		
		Node middle = findMiddle(head);
		System.out.println(middle.data);
		
	}
	
	private static Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast.next == null) 
			return slow;
		else
			return slow.next;
	}

	static void printList(Node head) {
		System.out.print(head.data + " ");
		if(null != head.next) {
			printList(head.next);
		}
	}
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
}
