package com.gotten.linked;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/27 10:56
 * @description
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
