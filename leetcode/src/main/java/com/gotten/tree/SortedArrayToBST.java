package com.gotten.tree;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/11 15:01
 * @description
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return toTree(nums, 0, nums.length - 1);
    }

    private TreeNode toTree(int[] nums, int start, int end) {
        int d = end - start;
        switch (d) {
            case 0:
                return new TreeNode(nums[start]);
            case 1:
                return new TreeNode(nums[end], new TreeNode(nums[start]), null);
            case 2:
                return new TreeNode(nums[start + 1], new TreeNode(nums[start]), new TreeNode(nums[end]));
            default:
                int mid = (start + end) / 2;
                return new TreeNode(nums[mid], toTree(nums, start, mid - 1), toTree(nums, mid + 1, end));
        }
    }
}
