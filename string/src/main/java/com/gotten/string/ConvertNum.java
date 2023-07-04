package com.gotten.string;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/25 10:05
 * @description
 */
public class ConvertNum {

    public int convertNum(String str) {
        if (null == str) {
            return 0;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i == str.length()) {
            return 0;
        }
        char c = str.charAt(i);
        if (c != '+' && c != '-' && !(c >= '0' && c <= '9')) {
            return 0;
        }
        int sign = 1;
        if (c == '+' || c == '-') {
            sign = c == '-' ? -1 : 1;
            i++;
        }
        int sum = 0;
        for (; i < str.length(); i++) {
            char at = str.charAt(i);
            if (at >= '0' && at <= '9') {
                if (sign == 1) {
                    if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && at > '7')) {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && at > '8')) {
                        return Integer.MIN_VALUE;
                    }
                }
                sum = sum * 10 + (at - '0');
            } else {
                return sum * sign;
            }
        }
        return sum * sign;
    }

    public static void main(String[] args) {
        int i = new ConvertNum().convertNum("-251234567");
        System.out.println(i);
    }
}
