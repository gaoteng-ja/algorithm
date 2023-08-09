package com.gotten.linked;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/27 9:46
 * @description
 *
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null 。
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        while (l1 != null) {
            ListNode l2 = headB;
            while (l2 != null) {
                if (l1 == l2) {
                    return l1;
                } else {
                    l2 = l2.next;
                }
            }
            l1 = l1.next;
        }
        return null;
    }
}
