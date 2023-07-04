package com.gotten;

import com.gotten.sort.*;
import org.junit.Test;

import static com.gotten.sort.Printer.printf;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/16 9:38
 * @description
 */
public class MyTest {

    public int[] nums = new int[]{98, 90, 34, 56, 21};
    public int[] nums0 = new int[]{61, 90, 34, 56, 21, 11, 43, 68};

    @Test
    public void testBubbleSort() {
        printf(nums);
        new BubbleSort().bubbleSort(nums);
    }

    @Test
    public void testSelectionSort() {
        printf(nums);
        new SelectionSort().selectionSort(nums);
    }

    @Test
    public void testInsertionSort() {
        printf(nums);
        new InsertionSort().insertionSort(nums);
    }

    @Test
    public void testShellSort() {
        printf(nums0);
        new ShellSort().shellSort(nums0);
    }

    @Test
    public void testQuickSort() {
        new QuickSort().quickSort(nums0);
    }

    @Test
    public void testMergeSort() {
        new MergeSort().mergeSort(nums0);
    }

    @Test
    public void testCountSort() {
        new CountSort().countSort(new int[]{11, 9, 11, 13, 12, 14, 15, 13});
        new CountSort().countSort(nums0);
    }
}
