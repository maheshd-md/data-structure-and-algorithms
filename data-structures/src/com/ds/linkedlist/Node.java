package com.ds.linkedlist;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 * @param <T>
 */
public class Node<T> {

	int index;
	T data;
	Node<T> next;
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}
