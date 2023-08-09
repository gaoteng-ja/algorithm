package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/31 11:10
 * @description
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        ListNode node = new RemoveNthFromEnd().removeNthFromEnd(head, 1);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode du = new ListNode(0, head);
        ListNode lq = head;
        ListNode ls = du;

        for (int i = 0; i < n; i++) {
            lq = lq.next;
        }

        while (lq != null) {
            lq = lq.next;
            ls = ls.next;
        }

        ls.next = ls.next.next;

        return du.next;
    }
}
