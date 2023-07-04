package com.gotten.tree;

import java.util.Stack;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/27 14:50
 * @description
 */
public class TreeUtil {

    public static void main(String[] args) {
        TreeNode treeNode = initTree();
//        preOrder(treeNode);
//        preOrderWithStack(treeNode);
        inOrder(treeNode);
    }

    /**
     * 构造初始化树
     * @return tree
     */
    public static TreeNode initTree(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        return treeNode;
    }

    /**
     * 递归前序遍历
     * @param node
     */
    public static void preOrder(TreeNode node) {
        if (null == node) {
            return;
        }
        System.out.print(node.val);
        System.out.print(" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 栈前序遍历
     * @param root
     */
    public static void preOrderWithStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val);
            System.out.print(" ");
            if (null != node.right) {
                stack.push(node.right);
            }
            if (null != node.left) {
                stack.push(node.left);
            }
        }
    }

    public static void inOrder(TreeNode root) {
        if (null == root) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val);
        System.out.print(" ");
        inOrder(root.right);
    }
}
