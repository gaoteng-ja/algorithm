package com.gotten.string;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/25 9:29
 * @description
 */
public class LongestPalindrome2 {

    public String longestPalindrome(String str) {
        if (null == str || str.length() <= 2) {
            return str;
        }
        int maxLength = 1;
        String result = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            String odd = getWithIndex(str, i, i);
            String even = getWithIndex(str, i, i + 1);
            String max = odd.length() > even.length() ? odd : even;
            if (max.length() > maxLength) {
                maxLength = max.length();
                result = max;
            }
        }
        return result;
    }

    private String getWithIndex(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) == str.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return str.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String s = new LongestPalindrome2().longestPalindrome("accasdfffds");
        System.out.println(s);
    }
}
