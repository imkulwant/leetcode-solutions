package com.kulsin.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node2 left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LevelOrderTraversal {

	static void levelOrder(Node2 root) {

		Queue<Node2> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node2 current = queue.remove();
			System.out.print(current.data + " ");

			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
		}

	}

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {

		// int[] nums = { 25, 39, 12, 19, 9, 23, 55, 31, 60, 35, 41, 70, 90 };
		int[] nums = { 20, 50, 35, 44, 9, 15, 62, 11, 13 };

		Node2 root = null;

		for (int i = 0; i < nums.length; i++) {
			int data = nums[i];
			root = insert(root, data);
		}

		levelOrder(root);
	}
}