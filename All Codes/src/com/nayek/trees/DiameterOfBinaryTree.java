package com.nayek.trees;

public class DiameterOfBinaryTree {

	static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public int findDiameter(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);

		return left + right + 1;
	}

	public int height(TreeNode node) {

		if (node == null) {
			return 0;
		}
		int leftTree = height(node.left);
		int rightTree = height(node.right);

		return leftTree > rightTree ? leftTree + 1 : rightTree + 1;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);

		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);

		root.right.left = new TreeNode(70);
		root.right.right = new TreeNode(80);

		root.right.right.right = new TreeNode(100);

		DiameterOfBinaryTree dt = new DiameterOfBinaryTree();
		System.out.println(dt.findDiameter(root));

	}

}
