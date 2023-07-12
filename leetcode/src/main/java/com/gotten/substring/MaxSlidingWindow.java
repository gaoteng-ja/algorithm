package com.gotten.substring;

import java.util.PriorityQueue;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/11 10:22
 * @description
 *
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回 滑动窗口中的最大值 。
 *
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = nums.length;
        int[] ans = new int[l - k + 1];

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        PriorityQueue<Integer> delQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);


        for (int i = 0; i < l - k + 1; i++) {

            if (i == 0) {
                for (int j = i; j < i + k; j++) {
                    queue.add(nums[j]);
                }
            } else {
                if (queue.peek() == nums[i - 1]) {
                    queue.poll();
                    while (!queue.isEmpty() && !delQueue.isEmpty() && queue.peek().equals(delQueue.peek())) {
                        queue.poll();
                        delQueue.poll();
                    }
                } else {
                    delQueue.add(nums[i-1]);
                }
                queue.add(nums[i + k - 1]);
            }
            ans[i] = queue.peek();
        }
        return ans;
    }
}
