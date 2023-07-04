package com.gotten.stack;

import java.util.Stack;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 10:52
 * @description
 */
public class MinStack {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(Integer e) {
        dataStack.push(e);
        if (minStack.isEmpty() || minStack.peek() >= e) {
            minStack.push(e);
        }
    }

    public Integer pop() {
        if (dataStack.isEmpty()) {
            throw new NullPointerException("无元素");
        }
        Integer e = dataStack.pop();
        if (!minStack.isEmpty() && minStack.peek().equals(e)) {
            minStack.pop();
        }
        return e;
    }

    public Integer min() {
        if (minStack.isEmpty()) {
            throw new NullPointerException("无元素");
        }
        return minStack.peek();
    }
}
