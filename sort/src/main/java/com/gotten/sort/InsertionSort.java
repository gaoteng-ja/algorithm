package com.gotten.sort;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/16 9:50
 * @description 插入排序
 */
public class InsertionSort {

    public void insertionSort(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            System.out.println("第" + i + "轮排序");

            int index = i - 1;
            int temp = nums[i];
            while (index >= 0 && nums[index] > temp) {
                nums[index + 1] = nums[index];
                index--;
            }
            nums[index + 1] = temp;
            Printer.printf(nums);
        }
    }
}
