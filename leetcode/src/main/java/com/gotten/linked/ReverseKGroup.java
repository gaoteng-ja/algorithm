package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 10:03
 * @description
 */
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (getLength(head) < k) {
            return head;
        }
        ListNode last = head;
        for (int i = 0; i < k - 1; i++) {
            last = last.next;
        }
        ListNode next = last.next;
        last.next = null;

        head = reverseK(head);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = reverseKGroup(next, k);
        return head;
    }

    private int getLength(ListNode head) {
        int l = 0;
        ListNode node = head;
        while (node != null) {
            l++;
            node = node.next;
        }
        return l;
    }

    private ListNode reverseK(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = reverseK(head.next);
        ListNode temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        head.next = null;
        temp.next = head;
        return node;
    }
}
