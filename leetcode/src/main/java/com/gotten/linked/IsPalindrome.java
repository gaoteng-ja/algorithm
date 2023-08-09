package com.gotten.linked;

import java.util.ArrayList;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/7/27 10:19
 * @description 回文链表
 */
public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (list.get(left).val != list.get(right).val) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
