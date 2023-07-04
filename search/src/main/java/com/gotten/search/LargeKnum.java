package com.gotten.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 13:34
 * @description
 */
public class LargeKnum {

    public static void main(String[] args) {
        List<Integer> list = topK(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4);
        Printer.printCollection(list);
    }

    public static List<Integer> topK(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return new ArrayList<>(queue);
    }
}
