package com.nayek.trees;

public class BalancedTrees {

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

	public boolean isBalanced(TreeNode root) {

		if (root == null) {
			return false;
		}

		int heightLeft = height(root.left);
		int heightRight = height(root.right);

		int diff = Math.abs((heightLeft + 1) - (heightRight + 1));

		if (diff == 0 || diff == 1) {
			return true;
		}

		return false;
	}

	public int height(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int hLeft = height(root.left);
		int hRight = height(root.right);

		return hLeft > hRight ? hLeft + 1 : hRight + 1;

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);

		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);

		root.left.left.left = new TreeNode(70);
		root.left.left.right = new TreeNode(80);

		BalancedTrees bt = new BalancedTrees();
		System.out.println(bt.isBalanced(root));

	}

}
