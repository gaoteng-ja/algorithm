package com.gotten.stack;

import java.util.Stack;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 14:11
 * @description
 */
public class EveryDayTemperatures {

    public static void main(String[] args) {
        int[] ints = new EveryDayTemperatures().everyDayTemperatures(new int[]{63, 54, 76, 56, 37, 89, 23, 74});
        Printer.printf(ints);
    }

    public int[] everyDayTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    Integer pop = stack.pop();
                    result[pop] = i - pop;
                }
            }
            stack.push(i);
        }
        return result;
    }
}
