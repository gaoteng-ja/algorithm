package com.gotten.linked;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/27 11:00
 * @description
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode list1= new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2= new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode listNode = new MergeTwoLists().mergeTwoLists(list1, list2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = null;

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while (list1 != null) {
            stack1.add(new ListNode(list1.val));
            list1 = list1.next;
        }
        while (list2 != null) {
            stack2.add(new ListNode(list2.val));
            list2 = list2.next;
        }

        while (!(stack1.isEmpty() && stack2.isEmpty())) {

            ListNode node;

            if (stack1.isEmpty()) {
                node = stack2.pop();
            } else if (stack2.isEmpty()) {
                node = stack1.pop();
            } else {
                node = stack1.peek().val > stack2.peek().val ? stack1.pop() : stack2.pop();
            }

            ListNode node0 = new ListNode(node.val);

            if (ans != null) {
                node0.next = new ListNode(ans.val, ans.next);
            } else {
                node0.next = null;
            }
            ans = node0;
        }

        return ans;
    }
}
