package com.gotten.dp;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 14:35
 * @description
 */
public class Fibonacci {

    public static void main(String[] args) {
        int count = 40;
        TimeInterval timer = DateUtil.timer();
        timer.start();
        int i = fibonacci0(count);
        long l = timer.intervalRestart();
        System.out.println("递归：" + i + " , 耗时：" + l);

        int i1 = fibonacci1(count);
        long l1 = timer.intervalRestart();
        System.out.println("额外空间：" + i1 + " , 耗时：" + l1);

        int i2 = fibonacci2(count);
        long l2 = timer.intervalRestart();
        System.out.println("动态规划：" + i2 + " , 耗时：" + l2);
    }

    public static int fibonacci0(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci0(n - 1) + fibonacci0(n - 2);
        }
    }

    public static int fibonacci1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    public static int fibonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f0 = 0;
        int f1 = 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
    }
}
