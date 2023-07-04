package com.gotten.sort;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/19 10:15
 * @description 快速排序
 */
public class QuickSort {

    public void quickSort(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return;
        }
        intervalQuickSort(nums, 0, nums.length - 1);
    }

    private void intervalQuickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        Printer.printf(nums);
        int i = left, j = right, standardNum = nums[left];
        while (i < j) {
            while (i < j && nums[j] >= standardNum) {
                j--;
            }
            if (i < j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && nums[i] < standardNum) {
                i++;
            }
            if (i < j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = standardNum;
        intervalQuickSort(nums, left, i - 1);
        Printer.printf(nums);
        intervalQuickSort(nums, i + 1, right);
        Printer.printf(nums);
    }
}
