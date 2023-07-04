package com.gotten.dp;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/29 13:46
 * @description
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababacc"));
    }

    public static String longestPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        int size = str.length();
        int startIndex = 0;
        int max = 0;
        boolean[][] dp = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            dp[i][i] = true;
            if (i < size - 1 && str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i+1] = true;
                startIndex = i;
                max = 2;
            }
        }

        for (int length = 3; length <= size; length++) {
            for (int i = 0; i <= size - length; i++) {
                int j = i + length - 1;
                if (dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = true;
                    startIndex = i;
                    max = length;
                }
            }
        }

        return str.substring(startIndex, startIndex + max);
    }
}
