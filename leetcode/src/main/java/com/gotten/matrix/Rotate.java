package com.gotten.matrix;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/25 14:39
 * @description 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 */
public class Rotate {

    public void rotate(int[][] matrix) {
        int l = matrix.length;
        int c = l / 2;
        for (int i = 0; i < c; i++) {
            int max = l - 1 - i;

            for (int j = i; j < max; j++) {
                int m = i, n = j;
                int temp0 = matrix[m][n];

                for (int k = 0; k < 4; k++) {
                    int p = m;
                    m = n;
                    n = l - 1 - p;

                    int temp = temp0;
                    temp0 = matrix[m][n];
                    matrix[m][n] = temp;
                }

            }
        }
    }

    private int[] next(int[] cur, int min, int max) {
        int[] res = null;
        int dir = cur[2];
        switch (dir) {
            case 0:
                if (cur[1] < max) {
                    res = new int[]{cur[0], cur[1] + 1, 0};
                } else {
                    res = new int[]{cur[0] + 1, max, 1};
                }
                break;
            case 1:
                if (cur[0] < max) {
                    res = new int[]{cur[0] + 1, cur[1], 1};
                } else {
                    res = new int[]{max, max - 1, 2};
                }
                break;
            case 2:
                if (cur[1] > min) {
                    res = new int[]{cur[0], cur[1] - 1, 2};
                } else {
                    res = new int[]{cur[0] - 1, min, 3};
                }
                break;
            case 3:
                if (cur[0] > min) {
                    res = new int[]{cur[0] - 1, min, 3};
                }
                break;
            default:
        }
        return res;
    }
}
