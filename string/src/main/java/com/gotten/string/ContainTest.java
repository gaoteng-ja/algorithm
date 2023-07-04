package com.gotten.string;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/25 11:08
 * @description
 */
public class ContainTest {

    public static void main(String[] args) {
        boolean contain = new ContainTest().isContain("abcdefg", "bcd");
        System.out.println(contain);
    }

    public boolean isContain(String source, String pattern) {
        char[] sourceChars = source.toCharArray();
        char[] patternChars = pattern.toCharArray();
        int i = 0, j = 0;
        while (i < sourceChars.length && j < patternChars.length) {
            if (sourceChars[i] == patternChars[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == patternChars.length;
    }
}
