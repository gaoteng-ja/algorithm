package com.gotten.search;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 10:58
 * @description
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[]{5, 12, 43, 34, 6, 23}, 35);
        Printer.printf(twoSum);
    }

    public static int[] twoSum(int[] data, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(target - data[i])) {
                return new int[]{map.get(target - data[i]), i};
            } else {
                map.put(data[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
