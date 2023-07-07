package com.gotten.doublePointers;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/5 10:17
 * @description 盛最多水的容器
 * <p>
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * <p>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 返回容器可以储存的最大水量。
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, ma = 0;
        while (l < r) {
            ma = Math.max(ma, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ma;
    }
}
