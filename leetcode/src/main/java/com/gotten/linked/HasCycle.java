package com.gotten.linked;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/27 10:44
 * @description
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
