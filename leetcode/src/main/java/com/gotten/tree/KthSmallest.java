package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/11 16:11
 * @description
 */
public class KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        TreeNode p = root;
        while (true) {
            int count = getCount(p.left) + 1;
            if (count == k) {
                return p.val;
            } else if (count > k) {
                p = p.left;
            } else {
                return kthSmallest(p.right, k - count);
            }
        }
    }

    private int getCount(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return getCount(root.left) + getCount(root.right) + 1;
    }
}
