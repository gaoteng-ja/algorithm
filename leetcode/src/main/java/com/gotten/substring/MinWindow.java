package com.gotten.substring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/11 13:28
 * @description 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。
 * 如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 */
public class MinWindow {

    public static void main(String[] args) {
        String s = new MinWindow().minWindow("ADOBECODEBANC", "ABC");
        System.out.println("s = " + s);
    }

    public String minWindow(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tl; i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        windowMap.put(s.charAt(0), 1);
        int l = 0;
        int r = 0;
        String ans = "";
        int min = 0;
        while (l < sl && r < sl) {
            if (contains(windowMap, map)) {
                char c = s.charAt(l);
                windowMap.put(c, windowMap.get(c) - 1);
                if (windowMap.get(c) == 0) {
                    windowMap.remove(c);
                }
                if (min == 0 || r - l + 1 < min) {
                    min = r - l + 1;
                    ans = s.substring(l, r + 1);
                }
                l++;
            } else {
                r++;
                if (r == sl) {
                    break;
                }
                char c = s.charAt(r);
                if (windowMap.containsKey(c)) {
                    windowMap.put(c, windowMap.get(c) + 1);
                } else {
                    windowMap.put(c, 1);
                }
            }
        }
        return ans;
    }

    private boolean contains(Map<Character, Integer> windowMap, Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (!windowMap.containsKey(entry.getKey()) || windowMap.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
