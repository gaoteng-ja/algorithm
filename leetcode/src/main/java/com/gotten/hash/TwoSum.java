package com.gotten.hash;

import java.util.HashMap;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/4 14:13
 * @description 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target  的那 两个 整数，
 * 并返回它们的数组下标。
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(target - nums[i], i);
            } else{
                return new int[]{map.get(nums[i]), i};
            }
        }
        return null;
    }
}
