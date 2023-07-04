package com.gotten.search;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 14:07
 * @description
 */
public class SearchTree {

    public static void main(String[] args) {
        TreeNode treeNode = initTree();
        boolean b = searchTree(treeNode, 2);
        System.out.println(b);
    }

    public static boolean searchTree(TreeNode node, int target) {
        if (null == node) {
            return false;
        }
        if (node.val == target) {
            return true;
        } else if (node.val < target) {
            return searchTree(node.right, target);
        } else {
            return searchTree(node.left, target);
        }
    }

    public static TreeNode initTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        return root;
    }
}
