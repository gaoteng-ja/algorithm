package com.gotten.sort;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/16 9:36
 * @description 冒泡排序
 */
public class BubbleSort {

    public void bubbleSort(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println("第" + (i + 1) + "轮交换开始");
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            Printer.printf(nums);
        }
    }
}
