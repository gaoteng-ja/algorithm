package com.gotten.sort;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/16 10:41
 * @description 希尔排序
 */
public class ShellSort {

    public void shellSort(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return;
        }
        int times = 0;
        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            System.out.print("第" + (++times) + "次希尔排序 gap=" + gap + "  ");
            for (int i = gap; i < n; i++) {
                int index = i;
                int temp = nums[index];
                while (index - gap >= 0 && nums[index - gap] > temp) {
                    nums[index] = nums[index - gap];
                    index -= gap;
                }
                nums[index] = temp;
            }
            Printer.printf(nums);
        }
    }
}
