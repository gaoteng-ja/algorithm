package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/27 14:41
 * @description
 */
public class TreeNode {

    /**
     * 结点的值
     */
    public int val;

    /**
     * 左结点的引用
     */
    public TreeNode left;

    /**
     * 右结点的引用
     */
    public TreeNode right;

    /**
     * 构造方法
     * @param x
     */
    public TreeNode(int x) {
        val = x;
    }
}
