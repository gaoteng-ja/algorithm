package com.gotten.tree;

import cn.hutool.core.bean.BeanUtil;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/15 13:58
 * @description
 */
public class LowestCommonAncestor {

    private TreeNode ans;

    public LowestCommonAncestor() {
        this.ans = null;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root == p || root == q) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }


}
