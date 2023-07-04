package com.gotten.search;

import java.util.Scanner;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/30 15:23
 * @description
 */
public class ChangeArray {
    static int[] nums = new int[100010];

    static int[] changes = new int[1000010];
    static int n;

    public static int find(int index) {
        if (changes[index] != index) {
            changes[index] = find(changes[index]);
        }
        return changes[index];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 1; i <= 1000003; i++) {
            changes[i] = i;
        }
        for (int i = 1; i <= n; i++) {
            // 修改数组当前值
            nums[i] = find(nums[i]);
            // 计算下次需要替换成为的值
            changes[nums[i]] = find(nums[i] + 1);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
