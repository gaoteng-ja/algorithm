package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 9:48
 * @description
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
