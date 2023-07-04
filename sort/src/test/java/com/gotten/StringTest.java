package com.gotten;

import com.gotten.string.CountOfNum;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/21 9:28
 * @description
 */
public class StringTest {

    @Test
    public void testCountOfNum() {
        CountOfNum countOfNum = new CountOfNum();
        while (true) {
            System.out.println("请输入字符串： ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if (s.equals("q")) {
                break;
            }
            System.out.println("含有 " + countOfNum.countOfNum(s) + " 个数字");
        }

    }
}
