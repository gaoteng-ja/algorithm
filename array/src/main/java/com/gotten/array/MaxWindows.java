package com.gotten.array;

import java.util.LinkedList;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/27 10:32
 * @description
 */
public class MaxWindows {

    public static void main(String[] args) {
        int[] nums = new MaxWindows().maxWindows(new int[]{3, 5, -1, 3, 2, 5, 1, 6}, 3);
        Printer.printf(nums);
        int[] nums0 = new MaxWindows().maxSlidingWindow(new int[]{3, 5, -1, 3, 2, 5, 1, 6}, 3);
        Printer.printf(nums0);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] < nums[i]) {
                list.removeLast();
            }
            list.addLast(i);
            if (list.peekFirst() <= i - k) {
                list.removeFirst();
            }
            if (i >= k - 1) {
                result[i - k + 1] = nums[list.peekFirst()];
            }
        }
        return result;
    }

    public int[] maxWindows(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            result[i] = maxNum(nums, i, k);
        }
        return result;
    }

    private int maxNum(int[] nums, int start, int offset) {
        int max = nums[start];
        int end = start + offset;
        for (int i = start; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
