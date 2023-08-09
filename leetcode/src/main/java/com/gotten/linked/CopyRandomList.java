package com.gotten.linked;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author gaoteng
 * @version v1.0
 * @date 2023/8/9 10:53
 * @description
 */
public class CopyRandomList {

    Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        } else {
            if (map.containsKey(head)) {
                return map.get(head);
            } else {
                Node node = new Node(head.val);
                map.put(head, node);
                node.next = copyRandomList(head.next);
                node.random = copyRandomList(head.random);
                return node;
            }
        }
    }
}
