package com.gotten.sort;

import static com.gotten.sort.Printer.printf;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/19 16:47
 * @description 归并排序
 */
public class MergeSort {

    public void mergeSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    public void sort(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        System.out.println("left:" + left + " , right:" + right);
        sort(nums, left, mid);
        sort(nums, mid + 1, right);
        merge0(nums, left, mid, right);
        printf(nums);
    }

    public void merge0(int[] nums, int left, int mid, int right) {
        int[] tempNums = new int[right - left + 1];
        int index1 = left;
        int index2 = mid + 1;
        int i = 0;
        while (index1 <= mid && index2 <= right) {
            if (nums[index1] < nums[index2]) {
                tempNums[i++] = nums[index1++];
            } else {
                tempNums[i++] = nums[index2++];
            }
        }
        while (index1 <= mid) {
            tempNums[i++] = nums[index1++];
        }
        while (index2 <= right) {
            tempNums[i++] = nums[index2++];
        }
        System.arraycopy(tempNums, 0, nums, left, tempNums.length);
    }


}
