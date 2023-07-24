package com.gotten.normalArray;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/19 10:26
 * @description 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        int i = new FirstMissingPositive().firstMissingPositive(new int[]{1, 2, 0});
    }

    public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] <= 0) {
                nums[i] = l + 1;
            }
        }

        for (int i = 0; i < l; i++) {
            int n = nums[i] > 0 ? nums[i] : -nums[i];
            if (n <= l && nums[n - 1] > 0) {
                nums[n - 1] = -nums[n - 1];
            }
        }

        for (int i = 0; i < l; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return l + 1;
    }
}
