package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 11:18
 * @description
 */
public class SortList {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(5);
        new SortList().sortList(head);
    }

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode ans = head;
        ListNode p = head;

        while (p.next != null) {
            ListNode next = p.next;
            ListNode t = ans;

            if (next.val < t.val) {
                p.next = next.next;
                next.next = ans;
                ans = next;
                continue;
            }

            if (next.val >= p.val) {
                p = next;
                continue;
            }

            p.next = next.next;
            while (t != p) {
                if (next.val >= t.val && next.val <= t.next.val) {
                    next.next = t.next;
                    t.next = next;
                    break;
                }
                t = t.next;
            }
        }
        return ans;
    }
}
