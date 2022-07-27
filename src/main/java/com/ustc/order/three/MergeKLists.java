package com.ustc.order.three;

import com.ustc.utils.ListNode;

import java.util.PriorityQueue;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 22:22
 */
//23.合并K个升序链表
public class MergeKLists {
    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists){
        if (lists.length == 0)
            return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1,o2)-> o1.val-o2.val);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (ListNode list : lists) {
            if (list != null)
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
