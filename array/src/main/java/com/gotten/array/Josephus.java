package com.gotten.array;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/27 9:26
 * @description
 */
public class Josephus {

    public static void main(String[] args) {
        int josephus = new Josephus().josephus(5, 3);
        System.out.println(josephus);
    }

    public int josephus(int n, int m) {
        int retainNum = n;
        int k = 1;
        int index = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        while (retainNum > 1) {

            index++;
            if (index == n) {
                index = 0;
            }

            if (nums[index] != -1) {
                k++;
            }

            if (k == m) {
                k = 1;
                retainNum--;
                nums[index] = -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                return i;
            }
        }
        return -1;
    }
}
