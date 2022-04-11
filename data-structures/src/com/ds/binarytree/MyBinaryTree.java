/**
 * 
 */
package com.ds.binarytree;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class MyBinaryTree {

	int index = -1;
	String preOrderTraversal = "";
	String inOrderTraversal = "";
	String postOrderTraversal = "";

	/**
	 * If dataArr[index] = +ve number, it means there is a node and add it to the
	 * tree, if it dataArr[index] = -1, there is node.
	 * 
	 * @param dataArr
	 * @return
	 */
	public Node buildTree(int[] dataArr) {
		index++;
		if (-1 == dataArr[index]) {
			return null;
		}
		int data = dataArr[index];
		Node node = new Node(data);
		node.left = buildTree(dataArr);
		node.right = buildTree(dataArr);
		return node;
	}
	
	public String preOrderTraverse(Node node) {
		if(null == node) {
			return "";
		}
		preOrderTraversal = preOrderTraversal + node.data + " ";
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
		return preOrderTraversal;
	}
	
	public String inOrderTraverse(Node node) {
		if(null == node) {
			return "";
		}
		inOrderTraverse(node.left);
		inOrderTraversal = inOrderTraversal + node.data + " ";
		inOrderTraverse(node.right);
		return inOrderTraversal;
	}
	
	public String postOrderTraverse(Node node) {
		if(null == node) {
			return "";
		}
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		postOrderTraversal = postOrderTraversal + node.data + " ";
		return postOrderTraversal;
	}
}
