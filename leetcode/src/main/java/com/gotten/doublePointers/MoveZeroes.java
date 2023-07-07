package com.gotten.doublePointers;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/5 9:13
 * @description 移动零
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZeroes {

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        for (; i < n; i++) {
            if (nums[i] == 0) {
                for (j = Math.max(j, i + 1); j < n; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
