package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/14 13:50
 * @description
 */
public class PathSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        TreeNode l1 = new TreeNode(5);
        root.left = l1;

        TreeNode l1l1 = new TreeNode(3);
        l1.left = l1l1;
        l1l1.left = new TreeNode(3);
        l1l1.right = new TreeNode(-2);

        TreeNode l1r1 = new TreeNode(2);
        l1.right = l1r1;
        l1r1.right = new TreeNode(1);


        TreeNode r1 = new TreeNode(-3);
        root.right = r1;
        r1.right = new TreeNode(11);

        int i = new PathSum().pathSumStart(root, 18);
        System.out.println("i = " + i);


    }

    public int pathSum(TreeNode root, int targetSum) {
        if (null == root) {
            return 0;
        }
        return pathSumStart(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int pathSumStart(TreeNode node, int targetSum) {
        int ans = 0;
        if (null == node) {
            return 0;
        }
        if (node.val == targetSum) {
            ans += 1;
        }

        ans += pathSumStart(node.left, targetSum - node.val);
        ans += pathSumStart(node.right, targetSum - node.val);

        return ans;
    }
}
