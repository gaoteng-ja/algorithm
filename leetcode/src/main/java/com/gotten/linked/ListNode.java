package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/27 9:45
 * @description Definition for singly-linked list.
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
