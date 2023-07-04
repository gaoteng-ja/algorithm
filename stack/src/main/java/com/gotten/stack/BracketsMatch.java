package com.gotten.stack;

import java.util.Stack;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 11:05
 * @description
 */
public class BracketsMatch {

    public static void main(String[] args) {
        boolean match = new BracketsMatch().isMatch("([]((){}))");
        System.out.println("match = " + match);
    }

    public boolean isMatch(String brackets) {
        Stack<Character> stack = new Stack<>();
        char[] chars = brackets.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
