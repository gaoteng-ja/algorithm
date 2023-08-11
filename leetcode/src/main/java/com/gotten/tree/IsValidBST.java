package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/11 15:14
 * @description
 */
public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, long l, long r) {
        if (root == null) {
            return true;
        }
        if (root.val <= l || root.val >= r) {
            return false;
        }
        return isValid(root.left, l, root.val) && isValid(root.right, root.val, r);
    }
}
