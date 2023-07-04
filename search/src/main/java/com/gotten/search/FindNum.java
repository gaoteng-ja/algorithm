package com.gotten.search;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 11:06
 * @description
 */
public class FindNum {

    public static void main(String[] args) {
        int[][] array = {{1, 4, 6, 28}, {2, 7, 32, 34}, {10, 11, 67, 79}};
        int[] num = findNum(array, 32);
        Printer.printf(num);
        System.out.println(array[num[0]][num[1]]);
    }

    public static int[] findNum(int[][] data, int target) {
        int i = data.length - 1;
        int j = 0;
        while (data[i][j] != target) {
            if (i == 0 || j == data[i].length) {
                return new int[]{-1, -1};
            }
            if (data[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return new int[]{i, j};
    }
}
