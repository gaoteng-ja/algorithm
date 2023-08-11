package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 15:26
 * @description
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode node1 = invertTree(root.left);
        TreeNode node2 = invertTree(root.right);

        root.left = node2;
        root.right = node1;

        return root;
    }
}
