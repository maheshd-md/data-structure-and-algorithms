package com.ds.linkedlist;

public class Node<T> {

	int index;
	T data;
	Node<T> next;
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}
