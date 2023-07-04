package com.gotten.dp;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 10:30
 * @description
 */
public class Tower {

    public static void main(String[] args) {
        System.out.println(tower(
                new int[][]{
                        {1},
                        {3, 5},
                        {7, 5, 2},
                        {9, 3, 4, 11},
                        {11, 1, 2, 5, 7},
                }
        ));
    }

    public static int tower(int[][] data) {
        int[][] dp = new int[data.length][data.length];
        dp[0][0] = data[0][0];
        for (int i = 1; i < data.length; i++) {
            dp[i][0] = dp[i - 1][0] + data[i][0];
        }
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + data[i][j];
            }
        }
        Printer.printArray2(dp);
        int res = 0;
        for (int[] ints : dp) {
            for (int anInt : ints) {
                if (anInt > res) {
                    res = anInt;
                }
            }
        }
        return res;
    }
}
