package com.gotten.dp;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 9:37
 * @description
 */
public class BagValue {

    public static void main(String[] args) {
        Printer.printArray2(bagValue(10, 5, new int[]{3, 4, 5, 7, 2}, new int[]{3, 5, 4, 6, 1}));
    }

    public static int[][] bagValue(int maxWeight, int bagNum, int[] bagWeights, int[] values) {

        int[][] dp = new int[bagNum + 1][maxWeight + 1];
        for (int i = 0; i < bagNum; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < maxWeight; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= bagNum; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if (bagWeights[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - bagWeights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp;
    }
}
