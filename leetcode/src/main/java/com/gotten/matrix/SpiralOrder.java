package com.gotten.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/24 11:07
 * @description 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class SpiralOrder {

    public static void main(String[] args) {
        List<Integer> list = new SpiralOrder().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        System.out.println(list);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int i = 0;
        int j = 0;
        int turn = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int size = matrix.length * matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> rSet = new HashSet<>();
        Set<Integer> cSet = new HashSet<>();
        while (ans.size() != size) {
            switch (turn) {
                case 0:
                    while (j < n - 1 && !cSet.contains(j + 1)) {
                        ans.add(matrix[i][j]);
                        j++;
                    }
                    turn++;
                    rSet.add(i);
                    break;
                case 1:
                    while (i < m - 1 && !rSet.contains(i + 1)) {
                        ans.add(matrix[i][j]);
                        i++;
                    }
                    turn++;
                    cSet.add(j);
                    break;
                case 2:
                    while (j > 0 && !cSet.contains(j - 1)) {
                        ans.add(matrix[i][j]);
                        j--;
                    }
                    turn++;
                    rSet.add(i);
                    break;
                case 3:
                    while (i > 0 && !rSet.contains(i - 1)) {
                        ans.add(matrix[i][j]);
                        i--;
                    }
                    turn = 0;
                    cSet.add(j);
                    break;
                default:
            }
        }
        ans.add(matrix[i][j]);
        return ans;
    }
}
