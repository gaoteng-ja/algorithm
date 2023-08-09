package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/31 9:58
 * @description
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = add(l1, l2);
        ListNode next = node;
        while (null != next) {
            if (next.val > 9) {
                next.val = next.val - 10;
                if (next.next != null) {
                    next.next.val = next.next.val + 1;
                } else {
                    next.next = new ListNode(1);
                }
            }
            next = next.next;
        }
        return node;
    }

    private ListNode add(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        return new ListNode(l1.val + l2.val, add(l1.next, l2.next));
    }
}
