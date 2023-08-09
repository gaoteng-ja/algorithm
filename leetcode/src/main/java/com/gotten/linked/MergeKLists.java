package com.gotten.linked;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 14:12
 * @description
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list = new ArrayList<>();
        for (ListNode listNode : lists) {
            while (listNode != null) {
                list.add(listNode);
                listNode = listNode.next;
            }
        }
        list.sort(Comparator.comparingInt(o -> o.val));
        ListNode ans = new ListNode();
        ListNode t = ans;
        for (ListNode node : list) {
            t.next = node;
            t = node;
        }
        return ans.next;
    }


}
