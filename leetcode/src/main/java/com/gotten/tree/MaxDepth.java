package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 15:23
 * @description
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
