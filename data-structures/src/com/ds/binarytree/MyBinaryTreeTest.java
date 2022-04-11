/**
 * 
 */
package com.ds.binarytree;

/**
 * @author Mahesh D (dhavalshankh.md@gmail.com)
 *
 */
public class MyBinaryTreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] dataArr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

		MyBinaryTree binaryTree = new MyBinaryTree();
		Node rootNode = binaryTree.buildTree(dataArr);
		System.out.println("Root node: " + rootNode.data);
		System.out.println("Pre-order traversal: " +binaryTree.preOrderTraverse(rootNode));
		System.out.println("In-order traversal: " +binaryTree.inOrderTraverse(rootNode));
		System.out.println("Post-order traversal: " +binaryTree.postOrderTraverse(rootNode));

	}

}
