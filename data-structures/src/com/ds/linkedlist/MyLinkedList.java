package com.ds.linkedlist;

public class MyLinkedList<T> {

	Node<T> head;
	int size = 0;

	/**
	 * Adds the node at the last of LinkedList
	 * 
	 * @param data
	 */
	public void add(T data) {
		Node<T> node = new Node<>();
		node.data = data;
		node.next = null;

		if (null == head) {
			head = node;
		} else {
			Node<T> n = head;
			while (null != n.next) {
				n = n.next;
			}
			n.next = node;
		}
		size++;
	}

	/**
	 * Adds the node at the specific index
	 * 
	 * @param index
	 * @param data
	 */
	public void add(int index, T data) {
		if (index <= size) {
			Node<T> node = new Node<>();
			node.data = data;

			if (index == 0) {
				node.next = head;
				head = node;
			} else {
				Node<T> n = head;
				for (int i = 0; i < index; i++) {
					n = n.next;
				}
				node.next = n.next;
				n.next = node;
			}
			size++;
		}
	}

	/**
	 * Remove the node matching with the data
	 * 
	 * @param data
	 */
	public void remove(T data) {
		if (null != head) {
			if (data == head.data) {
				if (null != head.next) {
					head = head.next;
				} else {
					head = null;
				}
				size--;
			} else {
				// The node whose next address will be changed to next of removed node
				Node<T> currentNode = head;
				// Node to be removed
				Node<T> nextNode = head.next;
				while (null != nextNode && data != nextNode.data) {
					currentNode = nextNode;
					nextNode = nextNode.next;
				}
				// If we get the node to be removed
				if (null != nextNode) {
					currentNode.next = nextNode.next;
					nextNode = null;
					size--;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", size=" + size + "]";
	}
}
