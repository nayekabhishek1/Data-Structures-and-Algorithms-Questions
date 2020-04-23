package com.nayek.trees;

public class HeightOfBinaryTree {

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

	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		}

		else {
			int heightLeft = height(root.left);
			int heighRight = height(root.right);
			return heightLeft > heighRight ? heightLeft + 1 : heighRight + 1;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(1);
		root.right = new TreeNode(10);

		root.left.left = new TreeNode(11);
		root.left.right = new TreeNode(12);

		root.right.left = new TreeNode(20);
		root.right.right = new TreeNode(2);

		HeightOfBinaryTree ob = new HeightOfBinaryTree();
		System.out.println(ob.height(root));

	}

}
