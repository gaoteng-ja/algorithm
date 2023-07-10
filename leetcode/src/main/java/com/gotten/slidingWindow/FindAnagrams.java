package com.gotten.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/7 16:16
 * @description
 */
public class FindAnagrams {

    public static void main(String[] args) {
        List<Integer> anagrams = new FindAnagrams().findAnagrams("baa", "aa");
        System.out.println("anagrams = " + anagrams);
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int sl = s.length();
        int pl = p.length();

        if (sl < pl) {
            return ans;
        }

        Map<Character, Integer> pMap = new HashMap<>(pl);
        for (int i = 0; i < pl; i++) {
            char c = p.charAt(i);
            if (pMap.containsKey(c)) {
                pMap.put(c, pMap.get(c) + 1);
            } else {
                pMap.put(c, 1);
            }
        }

        Map<Character, Integer> differMap = new HashMap<>(pMap);


        for (int i = 0; i <= sl - pl; i++) {

            if (i == 0) {
                for (int j = 0; j < pl; j++) {
                    char c = s.charAt(j);
                    if (differMap.containsKey(c)) {
                        differMap.put(c, differMap.get(c) - 1);
                    } else {
                        differMap.put(c, -1);
                    }
                    if (differMap.get(c) == 0) {
                        differMap.remove(c);
                    }
                }
            } else {
                char pre = s.charAt(i - 1);
                char next = s.charAt(i + pl - 1);

                if (differMap.containsKey(pre)) {
                    differMap.put(pre, differMap.get(pre) + 1);
                } else {
                    differMap.put(pre, 1);
                }
                if (differMap.get(pre) == 0) {
                    differMap.remove(pre);
                }
                if (differMap.containsKey(next)) {
                    differMap.put(next, differMap.get(next) - 1);
                } else {
                    differMap.put(next, -1);
                }
                if (differMap.get(next) == 0) {
                    differMap.remove(next);
                }
            }


            if (differMap.isEmpty()) {
                ans.add(i);
            }
        }

        return ans;
    }
}
