package com.nayek.trees;

public class LeftView {

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

	public void leftViewTraversal(TreeNode root) {
		if (root == null) {
			return;
		}

		if (root.left == null && root.right != null) {
			System.out.print(" " + root.right.data);
		}
		if (root.left != null && root.right == null) {
			System.out.print(" " + root.left.data);
		}

		System.out.print(" " + root.data);
		leftViewTraversal(root.left);
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

		LeftView lv = new LeftView();
		lv.leftViewTraversal(root);

	}

}
