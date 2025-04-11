package com.kulsin.binarytree;

/**
 * 104. Maximum Depth of Binary Tree
 * <p>
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree">...</a>
 */
public class MaximumDepthOfBinaryTree {

    /**
     * Runtime: 0 ms
     * Memory Usage: 42.42 MB
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
