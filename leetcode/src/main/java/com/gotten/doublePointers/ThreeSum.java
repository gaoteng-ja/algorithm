package com.gotten.doublePointers;

import java.util.*;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/5 13:36
 * @description 三数之和
 * <p>
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
 * <p>
 * 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。
 * <p>
 * 请你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {

    public static void main(String[] args) {
        new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Map<Integer, Integer> subMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            subMap.put(-nums[i], i);
        }

        List<List<Integer>> list = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {

                Integer key = nums[i] + nums[j];
                if (subMap.containsKey(key)) {
                    int index = subMap.get(key);
                    if (index != i && index != j) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[index]);
                        Collections.sort(list1);

                        String mapKey = String.valueOf(list1.get(0)) + list1.get(1) + list1.get(2);
                        if (!map.containsKey(mapKey)) {
                            map.put(mapKey, list1);
                            list.add(list1);
                        }
                    }
                }
            }
        }

        return list;
    }
}
