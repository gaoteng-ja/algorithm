package com.gotten.stack;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/6/28 10:16
 * @description
 */
public class MyStack<T> {

    static class Node<T> {
        private T val;
        private Node<T> next;
    }

    private Node<T> head;

    public MyStack() {
        head = null;
    }

    public void push(T t) {
        if (null == t) {
            throw new NullPointerException("参数不能为null");
        }
        if (head == null) {
            head = new Node<>();
            head.val = t;
            head.next = null;
        } else {
            Node<T> temp = head;
            head = new Node<>();
            head.val = t;
            head.next = temp;
        }
    }

    /**
     * 出栈
     * @return
     */
    public T pop() {
        if (head == null) {
            throw new NullPointerException("栈中没有元素");
        }
        T t = head.val;
        head = head.next;
        return t;
    }

    /**
     * 栈顶元素
     * @return
     */
    public T peek() {
        if (head == null) {
            throw new NullPointerException("栈中没有元素");
        }
        return head.val;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
