package com.gotten.normalArray;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/12 15:44
 * @description 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class Rotate {

    public static void main(String[] args) {
        new Rotate().rotate(new int[]{1, 2, 3, 4, 5, 6}, 4);
    }

    public void rotate(int[] nums, int k) {
        if(k >= nums.length) {
            k = k % nums.length;
        }
        if(k == 0) {
            return;
        }

        int l = nums.length;
        int[] temp = new int[k];
        System.arraycopy(nums, l - k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, l - k);
        System.arraycopy(temp, 0, nums, 0, k);

        System.out.println("==================");

    }
}
