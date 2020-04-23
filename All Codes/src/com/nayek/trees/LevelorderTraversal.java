package com.nayek.trees;

//This is also know as breadth first traversal
//Algorithm

/*Function to print level order traversal of tree
traverse(tree)
for d = 1 to height(tree)
   printGivenLevel(tree, d);

Function to print all nodes at a given level
traverseGivelLevel(tree, level)
if tree is NULL then return;
if level is 1, then
    print(tree->data);
else if level greater than 1, then
    traverseGivelLevel(tree->left, level-1);
    traverseGivelLevel(tree->right, level-1);*/


public class LevelorderTraversal {

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

	public void traverse(TreeNode root) {
		int height = height(root);
		for (int i = 1; i <= height; i++) {
			traverseGivenLevel(root, i);
		}
	}

	public void traverseGivenLevel(TreeNode root, int level) {
		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root.data + " ");
		} else {
			traverseGivenLevel(root.left, level - 1);
			traverseGivenLevel(root.right, level - 1);
		}
	}

	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		}

		else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);

			return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
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

		LevelorderTraversal ob = new LevelorderTraversal();
		ob.traverse(root);

	}

}
