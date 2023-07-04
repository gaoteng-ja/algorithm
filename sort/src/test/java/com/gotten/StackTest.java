package com.gotten;

import com.gotten.stack.MinStack;
import com.gotten.stack.MyQueue;
import com.gotten.stack.MyStack;
import org.junit.Test;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 10:37
 * @description
 */
public class StackTest {

    @Test
    public void testStack() {
        MyStack<String> stack = new MyStack<>();
        stack.push("JAVA");
        stack.push("PHP");
        stack.push("C++");

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        stack.push("PYTHON");
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }

    @Test
    public void testQueue() {
        MyQueue queue = new MyQueue();
        queue.push("JAVA");
        queue.push("PYTHON");
        System.out.println(queue.pop());
        queue.push("C++");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

    @Test
    public void testMinQueue() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(3);
        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.min());

        stack.push(7);
        stack.push(5);
        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.min());

        stack.push(0);
        System.out.println(stack.min());
    }
}
