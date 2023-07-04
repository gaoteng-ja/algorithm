package com.gotten.tree;

import java.util.LinkedList;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/27 15:10
 * @description
 */
public class LevelTree {

    public static void main(String[] args) {
        TreeNode root = TreeUtil.initTree();
        new LevelTree().levelTree(root);
    }

    public void levelTree(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            TreeNode node = list.pop();
            System.out.print(node.val + " ");
            if (null != node.left) {
                list.addLast(node.left);
            }
            if (null != node.right) {
                list.addLast(node.right);
            }
        }
    }
}
