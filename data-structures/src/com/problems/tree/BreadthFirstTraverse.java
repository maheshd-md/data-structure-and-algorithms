package com.problems.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstTraverse {

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

		breadthFirstTraversing(n1);
	}

	private static void breadthFirstTraversing(Node root) {

		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.data);
			if(null != node.left)
				queue.add(node.left);
			if(null != node.right)
				queue.add(node.right);
			
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
