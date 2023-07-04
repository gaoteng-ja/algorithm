package com.gotten.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/21 9:51
 * @description
 */
public class ReverseString {

    public String reverseString(String str) {
        List<String> list = new ArrayList<>();

        int spaceIndex = 0;
        int charIndex = 0;
        int l = str.length();

        while (charIndex < l) {
            if (str.charAt(charIndex) != ' ') {
                spaceIndex = charIndex;
                while (spaceIndex != l && str.charAt(spaceIndex) != ' ') {
                    spaceIndex++;
                }

                int start = charIndex;
                int end = spaceIndex == l ? l - 1 : spaceIndex - 1;
                char[] chars = new char[end - start + 1];
                int newIndex = 0;
                for (int i = end; i >= start; i--) {
                    chars[newIndex++] = str.charAt(i);
                }
                list.add(new String(chars));

                charIndex = spaceIndex;
            } else {
                charIndex++;
            }
        }

        int rl = 0;
        for (int i = 0; i < list.size(); i++) {
            rl += list.get(i).length();
            if (i != list.size() - 1) {
                rl += 1;
            }
        }
        char[] rc = new char[rl];
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                rc[index++] = list.get(i).charAt(j);
            }
            if (i != list.size() - 1) {
                rc[index++] = ' ';
            }
        }
        return new String(rc);
    }

    public static void main(String[] args) {
        String s = new ReverseString().reverseString("I love coding");
        System.out.println(s);
    }

}
