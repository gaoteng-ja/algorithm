package com.gotten.backtracking;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/3 10:10
 * @description
 */
public class Queen {

    public int queenNum;

    public int count;

    public static void main(String[] args) {
        new Queen(20).findSolution();
    }

    public Queen(int queenNum) {
        this.queenNum = queenNum;
    }

    public void findSolution() {
        TimeInterval timer = DateUtil.timer();
        timer.start();
        int[][] map = new int[queenNum][queenNum];
        queen(map, 0);
        System.out.println("共有: " + count + " 种放置方法，耗时： " + timer.interval() + " 毫秒");
    }

    public void queen(int[][] map, int row) {
        if (row == map.length) {
            count++;
            printQueen(map);
            return;
        }
        for (int i = 0; i < map.length; i++) {
            if (isValid(map, row, i)) {
                map[row][i] = 1;
                queen(map, row + 1);
                map[row][i] = 0;
            }
        }
    }

    private boolean isValid(int[][] map, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (map[i][col] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (map[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < map.length; i--, j++) {
            if (map[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private void printQueen(int[][] maps) {
        for (int[] map : maps) {
            for (int j = 0; j < maps.length; j++) {
                System.out.print(map[j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }
}
