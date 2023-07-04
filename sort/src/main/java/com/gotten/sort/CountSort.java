package com.gotten.sort;

import static com.gotten.sort.Printer.printf;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/20 10:20
 * @description 计数排序
 */
public class CountSort {

    public void countSort(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int[] countNums = new int[max - min + 1];
        for (int num : nums) {
            countNums[num - min]++;
        }

        int sumNum = 0;
        for (int i = 0; i < countNums.length; i++) {
            sumNum += countNums[i];
            countNums[i] = sumNum;
        }

        int[] newNums = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            newNums[countNums[nums[i] - min] - 1] = nums[i];
            countNums[nums[i] - min]--;
        }
        printf(newNums);
    }

//    public void countSort(int[] nums) {
//        int max = nums[0];
//        int min = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        System.out.println("min:" + min + ",max:" + max);
//        int count = max - min;
//        int[] countNums = new int[count + 1];
//        for (int i = 0; i < nums.length; i++) {
//            countNums[nums[i] - min]++;
//        }
//        System.out.print("countNums: ");
//        printf(countNums);
//        int sum = 0;
//        // 后面的元素等于前面元素加上自身
//        for (int i = 0; i < count + 1; i++) {
//            sum += countNums[i];
//            countNums[i] = sum;
//        }
//        System.out.print("countNums: ");
//        printf(countNums);
//        int[] newNums = new int[nums.length];
//        for (int i = nums.length - 1; i >= 0; i--) {
//            /**
//             * nums[i] - min 表示原数组 nums 里面第i位置对应的数在统计数组里面的位置索引
//             */
//            newNums[countNums[nums[i] - min] - 1] = nums[i];
//            countNums[nums[i] - min]--;
//        }
//        printf(newNums);
//    }
}
