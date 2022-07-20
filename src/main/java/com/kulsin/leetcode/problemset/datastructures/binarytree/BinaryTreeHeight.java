package com.kulsin.leetcode.problemset.datastructures.binarytree;

import java.util.*;

class Node2 {
	Node2 left;
	Node2 right;
	int data;

	Node2(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinaryTreeHeight {

	/*
	 * class Node int data; Node left; Node right;
	 */
	public static int height(Node2 root) {
		// Write your code here.
		return nodeHeight(root);
	}

	static int nodeHeight(Node2 n) {

		if(n==null)
			return -1;
		
		int lHeight = nodeHeight(n.left);
		int rHeight = nodeHeight(n.right);

		return lHeight > rHeight ? (1+lHeight) : (1+rHeight);
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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node2 root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println(height);
	}
}