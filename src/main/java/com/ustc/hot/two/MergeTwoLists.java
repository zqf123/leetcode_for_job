package com.ustc.hot.two;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/1 9:50
 */
//21.合并两个有序链表
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(l1, l2));
        System.out.println(mergeTwoLists(l1, l2).next);
        System.out.println(mergeTwoLists(l1, l2).next.next);
        System.out.println(mergeTwoLists(l1, l2).next.next.next);

    }
    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            }else{
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        if (list1 != null){
            curr.next = list1;
        }
        if (list2 != null){
            curr.next = list2;
        }
        return dummy.next;
    }

}
