package com.gotten.search;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 10:50
 * @description
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] data = { 1, 23, 43, 56, 67, 69, 75, 81, 94 };
        int i = binarySearch(data, 75);
        System.out.println(i);
    }

    public static int binarySearch(int[] data, int target) {
        int left = 0, right = data.length - 1, mid;
        while (left <= right) {
            mid = left +  (right - left) / 2;
            if (data[mid] == target) {
                return mid;
            } else if (data[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
