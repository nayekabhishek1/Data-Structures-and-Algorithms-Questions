package com.nayek.trees;

//This program is simply the opposite of level order traversal where we are printing 
//the right child before left one.
public class Mirror {

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

	public void traverseWholeTree(TreeNode root) {
		int height = height(root);
		for (int i = 1; i <= height; i++) {

			traverseWhenLevelGiven(root, i);
		}
	}

	public void traverseWhenLevelGiven(TreeNode root, int level) {
		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.println(" " + root.data);
		}

		traverseWhenLevelGiven(root.right, level - 1);
		traverseWhenLevelGiven(root.left, level - 1);

	}

	public int height(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int leftTreeHeight = height(root.left);
		int righTreeHeight = height(root.right);

		return leftTreeHeight > righTreeHeight ? leftTreeHeight + 1 : righTreeHeight + 1;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);

		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);

		/*
		 * root.right.left = new TreeNode(4); root.right.right = new TreeNode(5);
		 */

		Mirror obj = new Mirror();
		obj.traverseWholeTree(root);

	}

}
