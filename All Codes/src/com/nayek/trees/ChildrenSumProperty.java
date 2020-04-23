package com.nayek.trees;

public class ChildrenSumProperty {

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

	public int isProperty(TreeNode root) {

		int left = 0;
		int right = 0;

		if (root == null || (root.left == null && root.right == null)) {
			return 1;
		}

		else {
			if (root.left != null) {
				left = root.left.data;
			}
			if (root.right != null) {
				right = root.right.data;
			}

			if (root.data == left + right && isProperty(root.left) != 0 && isProperty(root.right) != 0) {
				return 1;
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(1);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(0);

		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(0);

		ChildrenSumProperty ob = new ChildrenSumProperty();
		System.out.println(ob.isProperty(root));
	}

}
