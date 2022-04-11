package com.ds.linkedlist;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);

		list.remove(20);
		list.remove(10);

		list.add(0, 50);
		list.add(1, 70);
		list.add(1, 40);

		System.out.println(list.toString());
	}
}
