package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/11 9:59
 * @description
 */
public class DiameterOfBinaryTree {

    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        deep(root);
        return ans - 1;
    }

    private int deep(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int l = deep(root.left);
        int r = deep(root.right);
        ans = Math.max(ans, l + r + 1);
        return Math.max(l, r) + 1;
    }
}
