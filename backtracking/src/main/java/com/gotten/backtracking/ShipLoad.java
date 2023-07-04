package com.gotten.backtracking;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/3 16:07
 * @description
 */
public class ShipLoad {

    public int[] nums;
    public boolean[] visited;
    public int result;
    public int weight;

    public void find(int sum, int i) {
        for (; i < nums.length; i++) {
            if (!visited[i]) {
                int s = sum + nums[i];
                if (s <= weight) {
                    if (s > result) {
                        result = s;
                    }
                } else {
                    return;
                }
                visited[i] = true;
                find(s, i + 1);
                visited[i] = false;
            }
        }
    }
}
