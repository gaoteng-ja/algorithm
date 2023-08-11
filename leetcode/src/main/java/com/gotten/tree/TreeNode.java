package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 15:14
 * @description
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
