package com.ds.linkedlist;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node node2 = new Node(2);
		head.next = node2;
		Node node3 = new Node(3);
		node2.next = node3;
		Node node4 = new Node(3);
		node3.next = node4;
		Node node5 = new Node(2);
		node4.next = node5;
		Node node6 = new Node(1);
		node5.next = node6;
		
		printList(head);
		System.out.println();
		
		boolean isPalindrome = isPalindrome(head);
		System.out.println(isPalindrome);
		
		
	}
	
	private static boolean isPalindrome(Node head) {
		Node middle = findMiddle(head);
		Node reversedSecondHalfOfList = reverse(middle);
		Node left = head;
		Node right = reversedSecondHalfOfList;
		
		while(left != middle) {
			if(left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
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
	
	static Node reverse(Node head) {
		if(null == head || null == head.next) {
			return head;
		}
		if(null == head.next.next) {
			Node next = head.next;
			next.next = head;
			head.next = null;
			return next;
		}
		Node prev = head;
		Node curr = head.next;
		Node next = head.next.next;
		head.next = null;
		while(null != curr.next) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = curr.next;
		}
		curr.next = prev;
		return curr;
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
