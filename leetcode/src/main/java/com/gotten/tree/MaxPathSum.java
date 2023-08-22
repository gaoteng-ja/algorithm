package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/21 13:52
 * @description
 */
public class MaxPathSum {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(-3);
        int i = new MaxPathSum().maxPathSum(treeNode);
        System.out.println(i);
    }

    public int maxPathSum(TreeNode root) {
        if (null == root) {
            return Integer.MIN_VALUE;
        }
        int maxL = maxPathSum(root.left);
        int maxR = maxPathSum(root.right);
        int maxS = Math.max(maxL, maxR);

        int maxRoot = root.val;
        if (null != root.left) {
            maxRoot += Math.max(0, maxWithNodeEnd(root.left));
        }
        if (null != root.right) {
            maxRoot += Math.max(0, maxWithNodeEnd(root.right));
        }
        return Math.max(maxRoot, maxS);
    }

    private int maxWithNodeEnd(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(root.val, Math.max(maxWithNodeEnd(root.left), maxWithNodeEnd(root.right)) + root.val);
    }
}
