package com.gotten.dp;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 10:18
 * @description
 */
public class LCS {

    public static void main(String[] args) {
        System.out.println(findLCS("abdbcabd", "abbcdd"));
    }

    public static int findLCS(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
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
