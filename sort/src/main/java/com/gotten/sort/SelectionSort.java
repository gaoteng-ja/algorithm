package com.gotten.sort;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/16 9:37
 * @description 选择排序
 */
public class SelectionSort {

    public void selectionSort(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println("第" + (i + 1) + "轮选择开始");
            int minIndex = -1;
            int minNum = nums[i];
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < minNum) {
                    minIndex = j;
                    minNum = nums[j];
                }
            }
            System.out.println("最小值是 " + minNum);
            if (minIndex != -1) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
            Printer.printf(nums);
        }
    }
}
