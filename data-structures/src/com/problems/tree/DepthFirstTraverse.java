package com.problems.tree;

import java.util.Stack;

public class DepthFirstTraverse {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;

		depthFirstTraversing(n1);
		System.out.println("-----------------");
		depthFirstTraversingRecursive(n1);
	}

	public static void depthFirstTraversing(Node root) {

		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node node = stack.pop();

			System.out.println(node.data);

			if (null != node.right)
				stack.push(node.right);

			if (null != node.left)
				stack.push(node.left);

		}
	}

	public static void depthFirstTraversingRecursive(Node root) {

		if(null != root) {
			System.out.println(root.data);
			depthFirstTraversingRecursive(root.left);
			depthFirstTraversingRecursive(root.right);
		}
	}

	static class Node {
		
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
}

