package com.gotten.string;

import java.util.Scanner;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/21 9:25
 * @description
 */
public class CountOfNum {

    public int countOfNum(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) {
            if(c >= '0' && c <= '9') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountOfNum countOfNum = new CountOfNum();
        while (true) {
            System.out.println("请输入字符串： ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if ("q".equals(s)) {
                break;
            }
            System.out.println("含有 " + countOfNum.countOfNum(s) + " 个数字");
        }
    }
}
