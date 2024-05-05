package com.problems.tree;

import com.problems.tree.BreadthFirstTraverse.Node;

public class RootToLeafMaxSum {

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
		
		//			110
		//			/	\
		//		20		13
		//		/\			\
		//	24		50		16


		int max = findMaxRootToLeafSum(n1);
		System.out.println(max);
	}

	private static int findMaxRootToLeafSum(Node node) {
		if(null == node) {
			return 0;
		}
		int leftMax = findMaxRootToLeafSum(node.left);
		int rightMax = findMaxRootToLeafSum(node.right);
		
		return node.data + Math.max(leftMax, rightMax);
	}
}
