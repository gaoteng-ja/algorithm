package com.gotten.doublePointers;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/7 10:14
 * @description
 */
public class Trap {

    public int trapDp(int[] height) {
        int n = height.length;

        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(height[i], lMax[i-1]);
        }

        rMax[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            rMax[i] = Math.max(height[i], rMax[i+1]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (Math.min(lMax[i], rMax[i]) - height[i]);
        }

        return ans;
    }

    public int trap(int[] height) {

        int ans = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            int l = i - 1, r = i + 1, lMax = 0, rMax = 0;
            while (l >= 0) {
                if (height[l] > lMax) {
                    lMax = height[l];
                }
                l--;
            }
            while (r < n) {
                if (height[r] > rMax) {
                    rMax = height[r];
                }
                r++;
            }
            int min = Math.min(lMax, rMax);
            if (min > height[i]) {
                ans += (min - height[i]);
            }
        }

        return ans;
    }
}
