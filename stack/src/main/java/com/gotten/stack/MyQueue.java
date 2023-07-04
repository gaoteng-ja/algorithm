package com.gotten.stack;

import java.util.Stack;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 10:42
 * @description
 */
public class MyQueue {

    Stack<String> in = new Stack<>();
    Stack<String> out = new Stack<>();

    public void push(String e) {
        in.push(e);
    }

    public String pop() {
        if (!out.isEmpty()) {
            return out.pop();
        } else {
            if (in.isEmpty()) {
                throw new NullPointerException("无元素");
            }
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }
}
