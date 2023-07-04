package com.gotten.string;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/21 9:35
 * @description
 */
public class ReplaceSpace {
    
    public String replaceSpace(String str, String replace) {
        char[] chars = str.toCharArray();
        int spaceCount = 0;
        for (char c : chars) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        char[] newChars = new char[chars.length + spaceCount * (replace.length() - 1)];
        int index = 0;
        for (char c : chars) {
            if (c == ' ') {
                for (int i = 0; i < replace.length(); i++) {
                    newChars[index++] = replace.charAt(i);
                }
            } else {
                newChars[index++] = c;
            }
        }
        return new String(newChars);
    }

    public static void main(String[] args) {
        ReplaceSpace replaceSpace = new ReplaceSpace();
        String s = replaceSpace.replaceSpace("abcd ef g", "SPACE");
        System.out.println(s);
    }
}
