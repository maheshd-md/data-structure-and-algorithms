package com.problems.tree;

import com.problems.tree.BreadthFirstTraverse.Node;

public class CheckSymmetry {

	public static void main(String[] args) {
		Node n1 = new Node(110);
		Node n2 = new Node(20);
		Node n3 = new Node(20);
		Node n4 = new Node(24);
		Node n5 = new Node(50);
		Node n6 = new Node(24);
		Node n7 = new Node(50);
		
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		n3.left = n7;
		
		//			110
		//			/	\
		//		20		20
		//		/\		/	\
		//	24		50	50	24


		boolean isSymmetric = isSymmetric(n1);
		System.out.println(isSymmetric);
}

	private static boolean isSymmetric(Node root) {
		
		if(null == root)
			return true;
		
		return areSymmetic(root.left, root.right);
	}

	private static boolean areSymmetic(Node n1, Node n2) {
		if(null == n1 && null == n2) {
			return true;
		}
		if((n1 != null && n2 == null) 
				|| (n2 != null && n1 == null)
				|| n1.data != n2.data) {
			return false;
		}
		return areSymmetic(n1.left, n2.right) && areSymmetic(n1.right, n2.left);
	}

}