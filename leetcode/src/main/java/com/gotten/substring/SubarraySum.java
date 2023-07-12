package com.gotten.substring;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/11 9:02
 * @description
 *
 * 给你一个整数数组 nums 和一个整数 k ，
 * 请你统计并返回 该数组中和为 k 的连续子数组的个数 。
 *
 */
public class SubarraySum {

    public int subarraySum(int[] nums, int k) {
        int l = nums.length;
        int count = 0;

        for (int i = 0; i < l; i++) {
            int sum = nums[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < l; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
