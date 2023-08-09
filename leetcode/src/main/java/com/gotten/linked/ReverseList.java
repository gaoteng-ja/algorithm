package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/27 10:06
 * @description 翻转链表
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
