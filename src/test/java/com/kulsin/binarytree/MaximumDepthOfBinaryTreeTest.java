package com.kulsin.binarytree;

import com.kulsin.binarytree.MaximumDepthOfBinaryTree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    public void testMaxDepth1() {
        // Constructing the binary tree based on [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9); // Left child of root
        root.right = new TreeNode(20); // Right child of root
        root.right.left = new TreeNode(15); // Left child of node 20
        root.right.right = new TreeNode(7); // Right child of node 20

        int result = solution.maxDepth(root);

        Assertions.assertEquals(3, result, "Test failed! Expected depth is 3.");
    }

    @Test
    public void testMaxDepth2() {
        // Constructing the binary tree based on [1,null,2]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2); // Right child of root

        int result = solution.maxDepth(root);

        Assertions.assertEquals(2, result, "Test failed! Expected depth is 2.");
    }


}