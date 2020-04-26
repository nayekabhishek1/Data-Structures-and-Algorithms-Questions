package com.nayek.trees;

public class LowestCommonAncestor {

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

	public int findLCA(TreeNode root, int n1, int n2) {
		if (root == null || (root.left == null && root.right == null) || root.left == null || root.right == null) {
			return 0;
		}

		else if (root.left.data == n1 && root.right.data == n2) {
			return root.data;
		}

		else
			return (findLCA(root.left, n1, n2) == 0 && findLCA(root.right, n1, n2) == 0) ? 0
					: findLCA(root.left, n1, n2) + findLCA(root.right, n1, n2);

	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);

		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(10);

		int n1 = 10;
		int n2 = 10;

		LowestCommonAncestor lca = new LowestCommonAncestor();
		System.out.println(lca.findLCA(root, n1, n2));
	}

}
