package com.problems.tree;

import com.problems.tree.BreadthFirstTraverse.Node;

public class MinValue {

	public static void main(String[] args) {
		Node n1 = new Node(110);
		Node n2 = new Node(20);
		Node n3 = new Node(13);
		Node n4 = new Node(24);
		Node n5 = new Node(50);
		Node n6 = new Node(16);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;

		int min = findMinValue(n1);
		System.out.println(min);
	}

	private static int findMinValue(Node n1) {
		
		if(n1 == null) 
			return Integer.MAX_VALUE;
		
		int leftMin = findMinValue(n1.left);
		int rightMin = findMinValue(n1.right);
		int min = Math.min(n1.data, leftMin);
		min = Math.min(min, rightMin);
		
		return min;
	}
}
