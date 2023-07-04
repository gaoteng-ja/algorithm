package com.gotten.dp;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 15:51
 * @description
 */
public class MatchPattern {

    public static void main(String[] args) {
        boolean match = match0("aaa", "a*a");
        System.out.println("match = " + match);
    }

    public static boolean match(String source, String pattern) {
        if (pattern.length() == 0) {
            return source.length() == 0;
        }
        if (pattern.length() > 1 && pattern.charAt(1) == '*') {
            return match(source, pattern.substring(2))
                    || (source.length() > 0 && firstSame(source, pattern) && match(source.substring(1), pattern));
        } else {
            return source.length() > 0 && firstSame(source, pattern) && match(source.substring(1), pattern.substring(1));
        }
    }

    private static boolean firstSame(String source, String pattern) {
        return source.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.';
    }

    public static boolean match0(String source, String pattern) {
        if (pattern.length() == 0) {
            return source.length() == 0;
        }
        int n = source.length() + 1;
        int m = pattern.length() + 1;
        boolean[][] dp = new boolean[n][m];
        //初始化
        dp[0][0] = true;
        for (int i = 2; i < m; i += 2) {
            if (dp[0][i - 2] && pattern.charAt(i - 1) == '*') {
                dp[0][i] = true;
            }
        }
        //动态规划
        for (int j = 1; j < n; j++) {
            for (int k = 1; k < m; k++) {
                if (pattern.charAt(k - 1) == '*') {
                    dp[j][k] =
                            dp[j][k - 2] ||
                                    dp[j - 1][k] &&
                                            (source.charAt(j - 1) == pattern.charAt(k - 2) ||
                                                    pattern.charAt(k - 2) == '.');
                } else {
                    dp[j][k] = dp[j - 1][k - 1] && (source.charAt(j - 1) == pattern.charAt(k - 1) || pattern.charAt(j - 1) == '.');
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
