package com.gotten.normalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/12 15:01
 * @description 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 */
public class Merge {

    public static void main(String[] args) {
        int[][] merge = new Merge().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == intervals.length - 1) {
                list.add(intervals[i]);
                break;
            }
            if (intervals[i][1] >= intervals[i + 1][0]) {
                int[] ints = new int[2];
                ints[0] = intervals[i][0];
                ints[1] = Math.max(intervals[i][1], intervals[i + 1][1]);
                intervals[i + 1] = ints;
            } else {
                list.add(intervals[i]);
            }
        }

        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
