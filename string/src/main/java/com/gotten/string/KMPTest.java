package com.gotten.string;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/26 9:32
 * @description
 */
public class KMPTest {

    public static void main(String[] args) {
        KMPTest kmpTest = new KMPTest();
        System.out.println(kmpTest.isMatch("1234", "3412"));
        System.out.println(kmpTest.isMatch("1234", "4312"));
        System.out.println(kmpTest.isMatch("ABCBD", "BDABC"));
    }

    int kmp(String A, String B) {
        // next 数组，保存已匹配的字符串的最长公共前后缀
        int[] next = new int[B.length()];
        getNext(next, B);
        int i = 0;
        int j = 0;
        while (i < A.length() && j < B.length()) {
            if (j == -1 || A.charAt(i) == B.charAt(j)) {
                i++;
                j++;
            } else {
                 // 模式串上的指针回溯到j位置
                j = next[j];
            }
        }
        if (j == B.length()) {
            return (i - j);
        } else {
            return -1;
        }
    }

    boolean isMatch(String strA, String strB) {
        int lenOfA = strA.length();
        int lenOfB = strB.length();
        if (lenOfA != lenOfB) {
            return false;
        }
        // 拼接成为主串
        String bigStr = strA + strA;
        // 判断主串中是否包含模式串
        return kmp(bigStr, strB) != -1;
    }

    void getNext(int[] next, String patterns) {
        int j = 0, k = -1;
        next[0] = -1;
        while (j < patterns.length() - 1) {
            if (k == -1 || patterns.charAt(j) == patterns.charAt(k)) {
                j++;
                k++;
                next[j] = k;
            } else {
                 // 不相等的时候，需要看前面已匹配的字符串的最长公共前后缀，也就是 next[k]
                k = next[k];
            }
        }
    }
}
