package com.gotten.hash;

import java.util.HashSet;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/4 14:31
 * @description 最长连续序列
 *
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 */
public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {

                int currentStreak = 0;
                int currentNum = num;
                while (numSet.contains(currentNum)) {
                    currentStreak++;
                    currentNum++;
                }

                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            }
        }

        return longestStreak;

    }
}
