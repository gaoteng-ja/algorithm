package com.gotten.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 15:14
 * @description
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(inorderTraversal(root.left));
            list.add(root.val);
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }
}
