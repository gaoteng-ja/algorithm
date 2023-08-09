package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 10:53
 * @description
 */
public class Node {

    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
