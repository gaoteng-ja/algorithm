package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/14 11:17
 * @description
 */
public class BuildTree {

    public static void main(String[] args) {
        TreeNode treeNode = new BuildTree().buildTree(new int[]{1,2}, new int[]{2,1});
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] a1, int l1, int l2, int[] a2, int r1, int r2) {
        TreeNode root = new TreeNode(a1[l1]);
        if (l1 == l2) {
            return root;
        }
        for (int i = r1; i <= r2; i++) {
            if (a2[i] == a1[l1]) {
                if (i > r1) {
                    root.left = build(a1, l1 + 1, l1 + i - r1, a2, r1, i - 1);
                }
                if (i < r2) {
                    root.right = build(a1, l1 + i - r1 + 1, l2, a2, i + 1, r2);
                }
                break;
            }
        }
        return root;
    }
}
