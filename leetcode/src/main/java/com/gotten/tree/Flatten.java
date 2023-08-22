package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/14 10:32
 * @description
 */
public class Flatten {

    public void flatten(TreeNode root) {
        if (null == root) {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        flatten(left);
        flatten(right);

        root.left = null;
        if (left == null) {
            root.right = right;
        } else {
            root.right = left;

            TreeNode p = left;
            while (p.right != null) {
                p = p.right;
            }
            p.right = right;
        }
    }
}
