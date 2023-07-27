package com.gotten.matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/24 9:46
 * @description
 */
public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        Set<Integer> rSet = new HashSet<>();
        Set<Integer> cSet = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rSet.add(i);
                    cSet.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rSet.contains(i) || cSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
