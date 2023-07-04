package com.gotten.array;

import java.util.Collection;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/16 9:35
 * @description
 */
public class Printer {

    public static void printf(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray2(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void printCollection(Collection<Integer> collection) {
        for (Integer integer : collection) {
            System.out.print(integer + " ");
        }
    }

}
