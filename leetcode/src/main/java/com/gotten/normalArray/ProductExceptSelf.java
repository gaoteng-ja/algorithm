package com.gotten.normalArray;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/19 9:58
 * @description 给你一个整数数组 nums，返回 数组 answer ，
 * 其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];

        int[] la = new int[l];
        la[0] = 1;
        int[] ra = new int[l];
        ra[l - 1] = 1;
        for (int i = 1; i < l; i++) {
            la[i] = la[i - 1] * nums[i - 1];
        }
        for (int i = l - 2; i >= 0; i--) {
            ra[i] = ra[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < l; i++) {
            ans[i] = la[i] * ra[i];
        }
        return ans;
    }
}
