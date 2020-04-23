package com.nayek.trees;

public class InorderTraversal {

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

	public void traverse(TreeNode root)

	{
		if (root == null)
			return;

		traverse(root.left);
		System.out.print(root.data + " ");
		traverse(root.right);

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(1);
		root.right = new TreeNode(10);

		root.left.left = new TreeNode(11);
		root.left.right = new TreeNode(12);

		root.right.left = new TreeNode(20);
		root.right.right = new TreeNode(2);

		InorderTraversal ob = new InorderTraversal();
		ob.traverse(root);

	}

}
