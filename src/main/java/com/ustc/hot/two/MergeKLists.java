package com.ustc.hot.two;

import com.ustc.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/1 10:28
 */

public class MergeKLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] lists){
        if (lists.length == 0)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode list : lists) {
            if (lists == null){
                continue;
            }
            pq.add(list);
        }
        while (!pq.isEmpty()){
            ListNode nextNode = pq.poll();
            curr.next = nextNode;
            curr = curr.next;
            if (nextNode.next != null)
                pq.add(nextNode.next);
        }
        return dummy.next;
    }
}
