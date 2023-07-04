package com.gotten.string;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/21 10:56
 * @description
 */
public class LongestPalindrome {

    public String longestPalindrome(String str) {
        int l = str.length();
        char[] chars = str.toCharArray();
        int maxL = 0;
        String longestP = "";
        for (int i = 0; i < l; i++) {
            for (int j = 0; j <= l - i; j++) {
                String s = new String(chars, i, j);
                if (isMatch(s) && s.length() > maxL) {
                    maxL = s.length();
                    longestP = s;
                }
            }
        }
        return longestP;
    }

    private boolean isMatch(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = new LongestPalindrome().longestPalindrome("accasdffds");
        System.out.println(s);
    }
}
