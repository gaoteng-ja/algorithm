package com.gotten.slidingWindow;

import java.util.HashSet;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/7 14:02
 * @description 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        int ans = 0, rk = -1;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }

            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }

            ans = Math.max(ans, rk - i + 1);

        }
        return ans;
    }
}
